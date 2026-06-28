package drsus.bmworld.blocks.state

import net.minecraft.util.StringRepresentable
import net.minecraft.world.level.block.state.properties.RailShape

enum class AttachedCrop(val string: String) : StringRepresentable {
    BARE("bare"),
    TOMATO("tomato"),
    GRAPEVINE("grapevine"),
    PEA("pea"),
    IVY("ivy"),
    SEA_MOSS("sea_moss");

    override fun toString(): String {
        return this.string
    }
    override fun getSerializedName(): String {
        return this.string
    }
}
