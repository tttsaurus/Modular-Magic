package fr.frinn.modularmagic.common.proxy;

import fr.frinn.modularmagic.ModularMagic;
import fr.frinn.modularmagic.common.block.ModularMagicBlocks;
import fr.frinn.modularmagic.client.gui.GuiHandler;
import fr.frinn.modularmagic.common.item.ModularMagicItems;
import fr.frinn.modularmagic.common.tile.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit() {
        ModularMagicBlocks.initBlocks();
        ModularMagicItems.initItems();

        if(ModularMagic.bloodmagicLoaded) {
            GameRegistry.registerTileEntity(TileWillProvider.Input.class, new ResourceLocation(ModularMagic.MODID, "tilewillproviderinput"));
            GameRegistry.registerTileEntity(TileWillProvider.Output.class, new ResourceLocation(ModularMagic.MODID, "tilewillprovideroutput"));
            GameRegistry.registerTileEntity(TileLifeEssenceProvider.Input.class, new ResourceLocation(ModularMagic.MODID, "tilelifeessenceproviderinput"));
            GameRegistry.registerTileEntity(TileLifeEssenceProvider.Output.class, new ResourceLocation(ModularMagic.MODID, "tilelifeessenceprovideroutput"));
        }
        if(ModularMagic.thaumcraftLoaded) {
            GameRegistry.registerTileEntity(TileAspectProvider.Input.class, new ResourceLocation(ModularMagic.MODID, "tileaspectproviderinput"));
            GameRegistry.registerTileEntity(TileAspectProvider.Output.class, new ResourceLocation(ModularMagic.MODID, "tileaspectprovideroutput"));
        }
        if(ModularMagic.extraUtils2Loaded) {
            GameRegistry.registerTileEntity(TileGridProvider.Input.class, new ResourceLocation(ModularMagic.MODID, "tilegridproviderinput"));
            GameRegistry.registerTileEntity(TileGridProvider.Output.class, new ResourceLocation(ModularMagic.MODID, "tilegridprovideroutput"));
        }
        if(ModularMagic.astralLoaded) {
            GameRegistry.registerTileEntity(TileStarlightInput.class, new ResourceLocation(ModularMagic.MODID, "tilestarlightinput"));
            GameRegistry.registerTileEntity(TileStarlightOutput.class, new ResourceLocation(ModularMagic.MODID, "tilestarlightoutput"));
            GameRegistry.registerTileEntity(TileConstellationProvider.class, new ResourceLocation(ModularMagic.MODID, "tileconstellationprovider"));
        }
        NetworkRegistry.INSTANCE.registerGuiHandler(ModularMagic.INSTANCE, new GuiHandler());
    }

    public void init() {

    }

    public void postInit() {

    }
}