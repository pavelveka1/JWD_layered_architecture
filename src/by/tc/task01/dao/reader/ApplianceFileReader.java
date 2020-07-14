package by.tc.task01.dao.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import by.tc.task01.dao.ApplianceReader;
import by.tc.task01.dao.exception.DAOException;

public class ApplianceFileReader implements ApplianceReader {

	private final String RESOURCE_PATH = "resources/appliances_db.txt";
	private String line;
	private BufferedReader reader;

	public ApplianceFileReader() throws DAOException {
		File file;
		FileReader fileReader;
		try {
			file = new File(RESOURCE_PATH);
			fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			throw new DAOException("resource file is not found");
		} catch (IOException e) {
			throw new DAOException("input output error");
		}
	}

	@Override
	public String readLine() throws DAOException {
		try {
			return line = reader.readLine();
		} catch (IOException e) {
			throw new DAOException("input output error");
		}
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
}
