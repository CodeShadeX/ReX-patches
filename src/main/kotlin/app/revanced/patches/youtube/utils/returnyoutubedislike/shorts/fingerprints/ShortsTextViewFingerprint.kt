package app.revanced.patches.youtube.utils.returnyoutubedislike.shorts.fingerprints

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object ShortsTextViewFingerprint : MethodFingerprint(
    returnType = "V",
    parameters = listOf("L", "L"),
    opcodes = listOf(
        Opcode.INVOKE_SUPER,    // first instruction of method
        Opcode.IF_NEZ,
        Opcode.RETURN_VOID,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.CHECK_CAST,
        Opcode.SGET_OBJECT,     // insertion point, must be after constructor call to parent class
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT,
        Opcode.CONST_4,
        Opcode.IF_EQZ,
        Opcode.CONST_4,
        Opcode.IF_EQ,
        Opcode.CONST_4,
        Opcode.IF_EQ,
        Opcode.RETURN_VOID,
        Opcode.IGET_OBJECT,     // TextView field
        null,
        null,
        Opcode.IF_NEZ,
    )
)