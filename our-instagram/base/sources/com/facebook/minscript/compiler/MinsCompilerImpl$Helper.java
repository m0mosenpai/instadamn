package com.facebook.minscript.compiler;

import X.C09170dP;
import com.facebook.minscript.compiler.interfaces.MinsCompilerResult;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class MinsCompilerImpl$Helper {
    public static native ByteBuffer doCompile(byte[] bArr, boolean z);

    public static native MinsCompilerResult doCompileWithLispyOffsets(byte[] bArr, boolean z, boolean z2);

    static {
        C09170dP.A0C("minscompiler-jni");
    }
}
