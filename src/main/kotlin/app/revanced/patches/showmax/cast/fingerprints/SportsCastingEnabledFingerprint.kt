package app.revanced.patches.showmax.cast.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
internal object SportsCastingEnabledFingerprint: MethodFingerprint(
    accessFlags = AccessFlags.PUBLIC or AccessFlags.FINAL,
    customFingerprint = { methodDef, _ ->
        methodDef.definingClass == "Lcom/peacocktv/feature/chromecast/helpers/CastContentTypeValuesKt"
    }
)