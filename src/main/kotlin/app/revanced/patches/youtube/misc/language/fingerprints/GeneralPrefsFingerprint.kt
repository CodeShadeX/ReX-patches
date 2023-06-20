package app.revanced.patches.youtube.misc.language.fingerprints

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import org.jf.dexlib2.Opcode

object GeneralPrefsFingerprint : MethodFingerprint(
    returnType = "V",
    parameters = listOf(),
    opcodes = listOf(
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT,
        Opcode.IF_NEZ,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT_OBJECT
    ),
    strings = listOf("bedtime_reminder_toggle"),
    customFingerprint = { it, _ -> it.definingClass.endsWith("GeneralPrefsFragment;") }
)