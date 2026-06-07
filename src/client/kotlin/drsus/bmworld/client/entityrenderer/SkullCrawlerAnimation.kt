package drsus.bmworld.client.entityrenderer

import net.minecraft.client.animation.AnimationChannel
import net.minecraft.client.animation.AnimationDefinition
import net.minecraft.client.animation.Keyframe
import net.minecraft.client.animation.KeyframeAnimations
import net.minecraft.client.model.geom.PartNames



object SkullCrawlerAnimation {



     val walk: AnimationDefinition = AnimationDefinition.Builder.withLength(1.0f).looping()
        .addAnimation(
            "skullcrabby", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(0.0f, -0.25f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, -0.25f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(-5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(-5.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(0.0f, -0.25f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, -0.25f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "arm_rechts", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 7.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 7.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_rechts", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(-2.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(-2.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, -10.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.125f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.375f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.625f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.875f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, -10.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, -10.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.125f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.375f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.625f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.875f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, -10.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .build()


    val lie_down: AnimationDefinition = AnimationDefinition.Builder.withLength(1.0417f)
        .addAnimation(
            "skullcrabby", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0417f,
                    KeyframeAnimations.degreeVec(25.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "skullcrabby", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    1.0417f,
                    KeyframeAnimations.posVec(0.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(37.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_rechts", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0417f,
                    KeyframeAnimations.degreeVec(2.5f, 17.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(-4.216f, 4.9866f, -0.3671f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(-8.4504f, -6.4806f, 1.2136f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(-12.6071f, 1.3899f, -0.4386f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0417f,
                    KeyframeAnimations.degreeVec(-17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, -37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0417f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -20.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, -37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, -37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0417f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 20.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 37.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "skull", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0417f,
                    KeyframeAnimations.degreeVec(-17.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .build()


    val attack: AnimationDefinition = AnimationDefinition.Builder.withLength(0.5f)
        .addAnimation(
            "skullcrabby", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 15.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "skullcrabby", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -1.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(-44.3221f, -10.2435f, -1.9018f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -1.75f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.SCALE,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.scaleVec(1.0, 1.0, 1.0),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.scaleVec(1.0, 1.0, 1.0),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_rechts", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.125f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.2917f,
                    KeyframeAnimations.degreeVec(0.0f, -15.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_rechts", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(
                    0.125f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.2917f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, -1.75f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(-2.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -15.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -20.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -22.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -17.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "skull", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, -5.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "skull", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(0.0f, 0.75f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .build()


    val dance: AnimationDefinition = AnimationDefinition.Builder.withLength(1.0f).looping()
        .addAnimation(
            "skullcrabby", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 15.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -15.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "skullcrabby", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.posVec(0.0f, -1.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(0.0f, 2.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.posVec(0.0f, -1.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(0.0f, 2.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, -1.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-87.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(-87.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(-87.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(1.0f, 4.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "arm_rechts", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(-75.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "arm_rechts", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.posVec(-1.0f, 6.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(-15.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leg_left_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 52.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 52.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 52.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -52.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -52.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.25f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -52.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.5f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 5.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    0.75f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 12.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "skull", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.3333f,
                    KeyframeAnimations.posVec(0.0f, 2.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(0.5f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    0.8333f,
                    KeyframeAnimations.posVec(0.0f, 2.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(1.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .build()


    val idle: AnimationDefinition = AnimationDefinition.Builder.withLength(2.0f).looping()
        .addAnimation(
            "arm_links", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.posVec(0.0f, 0.25f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "arm_rechts", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.posVec(0.0f, 0.25f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(-2.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(1.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(-2.5f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.POSITION,
                Keyframe(0.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.posVec(0.0f, 0.25f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(2.0f, KeyframeAnimations.posVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "leg_left_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 2.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 2.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_left_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, -2.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_1", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, -2.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_2", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, -2.5f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .addAnimation(
            "leg_right_3", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(
                    0.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    1.0f,
                    KeyframeAnimations.degreeVec(0.0f, 2.5f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                ),
                Keyframe(
                    2.0f,
                    KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f),
                    AnimationChannel.Interpolations.CATMULLROM
                )
            )
        )
        .build()

}
