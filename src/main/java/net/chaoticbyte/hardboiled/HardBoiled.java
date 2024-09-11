package net.chaoticbyte.hardboiled;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardBoiled implements ModInitializer {
	public static final String MOD_ID = "hardboiled";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		HardBoiledItems.init();
	}
}