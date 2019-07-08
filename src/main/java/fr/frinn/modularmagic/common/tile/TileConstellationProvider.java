package fr.frinn.modularmagic.common.tile;

import fr.frinn.modularmagic.common.tile.machinecomponent.MachineComponentConstellationProvider;
import hellfirepvp.astralsorcery.common.constellation.IConstellation;
import hellfirepvp.astralsorcery.common.constellation.distribution.ConstellationSkyHandler;
import hellfirepvp.modularmachinery.common.machine.MachineComponent;
import hellfirepvp.modularmachinery.common.tiles.base.MachineComponentTile;
import net.minecraft.tileentity.TileEntity;

import javax.annotation.Nullable;

public class TileConstellationProvider extends TileEntity implements MachineComponentTile {

    public boolean isConstellationInSky(IConstellation constellation) {
        if(ConstellationSkyHandler.getInstance().getWorldHandler(world) == null)
            return false;

        return ConstellationSkyHandler.getInstance().getWorldHandler(world).isActive(constellation);
    }

    @Nullable
    @Override
    public MachineComponent provideComponent() {
        return new MachineComponentConstellationProvider(this, MachineComponent.IOType.INPUT);
    }
}