package net.dillon.simplekeybinds.core;

import net.dillon.simplekeybinds.core.keybinds.ModKeybinds;
import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleKeybindsCore implements ClientModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Simple Keybinds");

	/**
	 * Initializes the {@code Simple Keybindings.}
	 */
	@Override
	public void onInitializeClient() {
		ModKeybinds.init();
	}
}