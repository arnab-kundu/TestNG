package com.arnab.testng.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesParser {

	private static Properties testData = null;
	private static Properties config = null;
	private static PropertiesParser instance = null;

	/**
	 * Make the constructor private to prevent any instance to be created outside
	 * the class
	 */
	private PropertiesParser() {

	}

	/**
	 * Always returns a static instance of the class, making the class as singleton
	 * 
	 * @return: Static instance of this class
	 */
	public static PropertiesParser getInstance() {
		if (instance == null) {
			try {
				instance = new PropertiesParser();

				FileInputStream configFile = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
				config = new Properties();
				config.load(configFile);

				FileInputStream testDataFile = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\testData.properties");
				testData = new Properties();
				testData.load(testDataFile);
			} catch (IOException e) {
				System.out.println("Error occurred while locating config files : " + e.getMessage());
			}
		}
		return instance;
	}

	/**
	 * Getter method to return instance of testdata property file
	 * 
	 * @return: Instance of testdata property file
	 */
	public Properties getTestDataProperties() {
		return testData;
	}

	/**
	 * Getter method to return instance of config property file
	 * 
	 * @return: Instance of config property file
	 */
	public Properties getConfigProperties() {
		return config;
	}

}
