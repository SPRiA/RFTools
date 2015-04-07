package mcjty.rftools.items.envmodules;

import mcjty.rftools.blocks.environmental.EnvModuleProvider;
import mcjty.rftools.blocks.environmental.modules.EnvironmentModule;
import mcjty.rftools.blocks.environmental.modules.FeatherFallingEModule;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class FeatherFallingEModuleItem extends Item implements EnvModuleProvider {

    public FeatherFallingEModuleItem() {
        setMaxStackSize(16);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean whatIsThis) {
        super.addInformation(itemStack, player, list, whatIsThis);
        list.add("This module gives feather falling bonus");
        list.add("when used in the environmental controller.");
        list.add(EnumChatFormatting.GREEN + "Uses " + FeatherFallingEModule.RFPERTICK + " RF/tick (per cubic block)");
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 1;
    }

    @Override
    public Class<? extends EnvironmentModule> getServerEnvironmentModule() {
        return FeatherFallingEModule.class;
    }

    @Override
    public String getName() {
        return "Feather";
    }
}