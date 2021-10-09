package net.FwuffyPetsOwO.FastMath.mixin;

import net.FwuffyPetsOwO.FastMath.FastMath;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MathHelper.class)
public class MixinMathHelper {
    /**
     * @author JellySquid
     */
    @Overwrite
    public static float sin(float f) {
        return FastMath.sin(f);
    }

    /**
     * @author JellySquid
     */
    @Overwrite
    public static float cos(float f) {
        return FastMath.cos(f);
    }
}
