package by.tc.task01.dao.util;

public class LineParser {
	public static String[] parseLine(String line) {
		int index = line.indexOf(":");
		line = line.substring(index + 1);
		String[] arrayParams = line.split(",");
		arrayParams = getOnlyParams(arrayParams);
		return arrayParams;
	}

	private static String[] getOnlyParams(String[] array) {
		String param;
		for (int i = 0; i < array.length; i++) {
			param = array[i].replaceAll(".*=", "");
			array[i] = param;
		}
		return array;
	}

}
