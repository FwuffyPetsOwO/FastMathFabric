package net.FwuffyPetsOwO.FastMath;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FastMathFabric implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("FastMathFabric");

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Initialized FastMathFabric");
    }
}
