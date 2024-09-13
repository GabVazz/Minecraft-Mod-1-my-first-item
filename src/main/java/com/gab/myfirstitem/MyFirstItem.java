package com.gab.myfirstitem;

import com.gab.myfirstitem.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyFirstItem implements ModInitializer {
	public static final String MOD_ID = "my-first-item";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Istanza di gioco parita");
		//chiamata del metodo per inizializzare la classe
		//automaticamente considera ed esegue tutto quello dichiarato static
		ModItems.registraModItems();
	}
}