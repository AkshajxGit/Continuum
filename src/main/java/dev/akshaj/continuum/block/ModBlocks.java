package dev.akshaj.continuum.block;

import java.util.function.Function;

import dev.akshaj.continuum.Continuum;
import dev.akshaj.continuum.block.custom.SulphurTorchBlock;
import dev.akshaj.continuum.block.custom.SulphurWallTorchBlock;
import dev.akshaj.continuum.item.ModItemGroups;
import dev.akshaj.continuum.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.DoorBlock;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;



// :::1
public class ModBlocks {
	// :::1

	// :::2
	public static final Block SULPHUR_ORE = register(
			"sulphur_ore",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.IRON_ORE),
			true
	);

	public static final Block DEEPSLATE_SULPHUR_ORE = register(
			"deepslate_sulphur_ore",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE),
			true
	);

	public static final Block BASALT_SULPHUR_ORE = register(
			"basalt_sulphur_ore",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.IRON_ORE)
					.sounds(BlockSoundGroup.BASALT),
			true
	);

	public static final Block SULPHUR_BLOCK = register(
			"sulphur_block",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)
					.sounds(ModSounds.SULPHUR_SOUNDS),
			true
	);

	public static final Block NICKEL_ORE = register(
			"nickel_ore",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE),
			true
	);

	public static final Block NICKEL_BLOCK = register(
			"nickel_block",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
					.sounds(ModSounds.NICKEL_SOUNDS),
			true
	);

	public static final Block RAW_NICKEL_BLOCK = register(
			"raw_nickel_block",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK),
			true
	);

	public static final Block DEEPSLATE_NICKEL_ORE = register(
			"deepslate_nickel_ore",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE),
			true
	);

	public static final Block NICKEL_CHAIN = register(
			"nickel_chain",
			ChainBlock::new,
			AbstractBlock.Settings.copy(Blocks.IRON_CHAIN)
					.sounds(ModSounds.NICKEL_SOUNDS)
					.nonOpaque(),
			true
	);

    public static final Block NICKEL_BARS = register(
            "nickel_bars",
            PaneBlock::new,
            AbstractBlock.Settings.copy(Blocks.IRON_BARS)
					.sounds(ModSounds.NICKEL_SOUNDS)
					.nonOpaque(),
            true
    );

    public static final Block NICKEL_DOOR = register(
            "nickel_door",
            settings ->
                    new DoorBlock(BlockSetType.IRON, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_DOOR)
					.sounds(ModSounds.NICKEL_SOUNDS)
                    .nonOpaque().strength(6.0F),
            true
    );

    public static final Block NICKEL_TRAPDOOR = register(
            "nickel_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.IRON, settings),
            AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR)
					.sounds(ModSounds.NICKEL_SOUNDS)
                    .nonOpaque().strength(6.0F),
            true
    );

    public static final Block MEDIUM_WEIGHTED_PRESSURE_PLATE =  register(
            "medium_weighted_pressure_plate",
            settings -> new WeightedPressurePlateBlock(64, BlockSetType.IRON, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).noCollision().strength(0.5f).sounds(ModSounds.NICKEL_SOUNDS).pistonBehavior(PistonBehavior.DESTROY),
            true
    );

    public static final Block NICKEL_BUTTON = register(
            "nickel_button",
            settings -> new ButtonBlock(BlockSetType.IRON, 15, settings),
            AbstractBlock.Settings.create()
                    .sounds(ModSounds.NICKEL_SOUNDS),
            true
    );

	public static final Block SILVER_ORE = register(
			"silver_ore",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.GOLD_ORE),
			true
	);

	public static final Block DEEPSLATE_SILVER_ORE = register(
			"deepslate_silver_ore",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE),
			true
	);

	public static final Block SILVER_BLOCK = register(
			"silver_block",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
					.sounds(ModSounds.SILVER_SOUNDS),
			true
	);

	public static final Block RAW_SILVER_BLOCK = register(
	"raw_silver_block",
			Block::new,
			AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK),
			true
	);

	public static final Block ULTRALIGHT_WEIGHTED_PRESSURE_PLATE =  register(
			"ultralight_weighted_pressure_plate",
			settings -> new WeightedPressurePlateBlock(5, BlockSetType.GOLD, settings),
			AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).noCollision().strength(0.5f).sounds(ModSounds.SILVER_SOUNDS).pistonBehavior(PistonBehavior.DESTROY),
			true
	);

	public static final Block SILVER_BUTTON = register(
			"silver_button",
			settings -> new ButtonBlock(BlockSetType.IRON, 5, settings),
			AbstractBlock.Settings.create()
					.sounds(ModSounds.SILVER_SOUNDS),
			true
	);

	public static final Block SULPHUR_TORCH = register(
			"sulphur_torch",
			SulphurTorchBlock::new,
			AbstractBlock.Settings.copy(Blocks.TORCH),
			false
	);

	public static final Block WALL_SULPHUR_TORCH = register(
			"wall_sulphur_torch",
			SulphurWallTorchBlock::new,
			AbstractBlock.Settings.copy(Blocks.WALL_TORCH),
			false
	);

	public static void registerModBlocks() {

	}

	// :::1
	private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
		// Create a registry key for the block
		RegistryKey<Block> blockKey = keyOfBlock(name);
		// Create the block instance
		Block block = blockFactory.apply(settings.registryKey(blockKey));

		// Sometimes, you may not want to register an item for the block.
		// Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
		if (shouldRegisterItem) {
			// Items need to be registered with a different type of registry key, but the ID
			// can be the same.
			RegistryKey<Item> itemKey = keyOfItem(name);

			BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
			Registry.register(Registries.ITEM, itemKey, blockItem);
		}

		return Registry.register(Registries.BLOCK, blockKey, block);
	}

	private static RegistryKey<Block> keyOfBlock(String name) {
		return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Continuum.MOD_ID, name));
	}

	private static RegistryKey<Item> keyOfItem(String name) {
		return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Continuum.MOD_ID, name));
	}

	// :::1

	public static void initialize() {
		setupItemGroups();
		Continuum.LOGGER.info("Registering Blocks for Continuum!");

	}

	public static void setupItemGroups() {
		// :::6
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
			itemGroup.add(ModBlocks.SULPHUR_ORE.asItem());
			itemGroup.add(ModBlocks.DEEPSLATE_SULPHUR_ORE.asItem());
			itemGroup.add(ModBlocks.SULPHUR_BLOCK.asItem());
            itemGroup.add(ModBlocks.SULPHUR_TORCH.asItem());
            itemGroup.add(ModBlocks.BASALT_SULPHUR_ORE.asItem());
			itemGroup.add(ModBlocks.NICKEL_ORE.asItem());
			itemGroup.add(ModBlocks.DEEPSLATE_NICKEL_ORE.asItem());
			itemGroup.add(ModBlocks.NICKEL_BLOCK.asItem());
			itemGroup.add(ModBlocks.RAW_NICKEL_BLOCK.asItem());
            itemGroup.add(ModBlocks.NICKEL_CHAIN.asItem());
            itemGroup.add(ModBlocks.NICKEL_BARS.asItem());
            itemGroup.add(ModBlocks.NICKEL_DOOR.asItem());
            itemGroup.add(ModBlocks.NICKEL_TRAPDOOR.asItem());
            itemGroup.add(ModBlocks.NICKEL_BUTTON.asItem());
            itemGroup.add(ModBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.asItem());
			itemGroup.add(ModBlocks.SILVER_ORE.asItem());
			itemGroup.add(ModBlocks.DEEPSLATE_SILVER_ORE.asItem());
			itemGroup.add(ModBlocks.SILVER_BLOCK.asItem());
			itemGroup.add(ModBlocks.RAW_SILVER_BLOCK.asItem());
			itemGroup.add(ModBlocks.ULTRALIGHT_WEIGHTED_PRESSURE_PLATE.asItem());
			itemGroup.add(ModBlocks.SILVER_BUTTON.asItem());
		});
		// :::6

	}

	// :::1
}
// :::1
