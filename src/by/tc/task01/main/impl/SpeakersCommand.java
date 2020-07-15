package by.tc.task01.main.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.main.Command;

public class SpeakersCommand implements Command {

	@Override
	public String execute(Appliance appliance) {
		Speakers speaker = (Speakers) appliance;
		String speakerInfo = "Name : " + speaker.getName() + ", power consumption = " + speaker.getPowerConsumption()
				+ ", number of speakers = " + speaker.getNumberOfSpeakers() + ", frequency range = "
				+ speaker.getFrequencyRange() + ", cord lenth = " + speaker.getCordLenth();
		return speakerInfo;

	}
}