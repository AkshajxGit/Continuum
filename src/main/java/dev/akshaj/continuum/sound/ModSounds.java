package dev.akshaj.continuum.sound;

import dev.akshaj.continuum.Continuum;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent NICKEL_BREAK1 = registerSoundEvent("nickel_break1");
    public static final SoundEvent NICKEL_BREAK2 = registerSoundEvent("nickel_break2");
    public static final SoundEvent NICKEL_BREAK3 = registerSoundEvent("nickel_break3");
    public static final SoundEvent NICKEL_BREAK4 = registerSoundEvent("nickel_break4");
    public static final SoundEvent NICKEL_STEP1 = registerSoundEvent("nickel_step1");

    public static final BlockSoundGroup NICKEL_SOUNDS = new BlockSoundGroup(1f, 1f, NICKEL_BREAK1, NICKEL_BREAK2, NICKEL_BREAK3, NICKEL_BREAK4, NICKEL_STEP1);

    public static final SoundEvent SILVER_BREAK1 = registerSoundEvent("silver_break1");
    public static final SoundEvent SILVER_BREAK2 = registerSoundEvent("silver_break2");
    public static final SoundEvent SILVER_BREAK3 = registerSoundEvent("silver_break3");
    public static final SoundEvent SILVER_BREAK4 = registerSoundEvent("silver_break4");
    public static final SoundEvent SILVER_STEP1 = registerSoundEvent("silver_step1");

    public static final BlockSoundGroup SILVER_SOUNDS = new BlockSoundGroup(1f, 1f, SILVER_BREAK1, SILVER_BREAK2, SILVER_BREAK3, SILVER_BREAK4, SILVER_STEP1);

    public static final SoundEvent SULPHUR_BREAK1 = registerSoundEvent("sulphur_break1");
    public static final SoundEvent SULPHUR_BREAK2 = registerSoundEvent("sulphur_break2");
    public static final SoundEvent SULPHUR_BREAK3 = registerSoundEvent("sulphur_break3");
    public static final SoundEvent SULPHUR_BREAK4 = registerSoundEvent("sulphur_break4");
    public static final SoundEvent SULPHUR_STEP1 = registerSoundEvent("sulphur_step1");

    public static final BlockSoundGroup SULPHUR_SOUNDS = new BlockSoundGroup(1f, 1f, SULPHUR_BREAK1, SULPHUR_BREAK2, SULPHUR_BREAK3, SULPHUR_BREAK4, SULPHUR_STEP1);



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Continuum.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Continuum.LOGGER.info("Registering Mod Sounds for Continuum!");
    }
}
