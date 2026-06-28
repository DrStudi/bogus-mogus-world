package drsus.bmworld.items

import com.mojang.serialization.Codec
import net.minecraft.core.Registry
import net.minecraft.core.component.DataComponentType
import net.minecraft.core.component.DataComponents
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.codec.ByteBufCodecs
import java.util.function.UnaryOperator


object ItemComponents {
    private fun <T : Any> register(
        string: String,
        unaryOperator: UnaryOperator<DataComponentType.Builder<T>>
    ): DataComponentType<T> {
        return Registry.register<DataComponentType<T>>(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            string,
            (unaryOperator.apply(DataComponentType.builder<T>()).build())
        )
    }
    fun initialize() {}
    val FLINTFLAME_UPGRADE: DataComponentType<Boolean> = register<Boolean>(
        "flintflame_upgrade",
        UnaryOperator { builder: DataComponentType.Builder<Boolean>? ->
            builder!!.persistent(Codec.BOOL).networkSynchronized(ByteBufCodecs.BOOL)
        }

    )

}