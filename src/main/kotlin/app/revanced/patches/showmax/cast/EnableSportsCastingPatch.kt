package app.revanced.patches.showmax.cast

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.reddit.ad.comments.fingerprints.HideCommentAdsFingerprint
import app.revanced.patches.showmax.cast.fingerprints.SportsCastingEnabledFingerprint
import app.revanced.util.exception


@Patch(
    name = "Enable Sports Casting",
    description = "Enables Sports Casting To Devices",
    compatiblePackages = [CompatiblePackage("com.showmax.showmax.google")],
    use = false
)

object EnableSportsCastingPatch : BytecodePatch(
    setOf(SportsCastingEnabledFingerprint)
){

    override fun execute(context: BytecodeContext) {
        val result = SportsCastingEnabledFingerprint.result
            ?: throw PatchException("SportsCastingEnabledFingerprint not found")
        println(result.classDef)
    }
}