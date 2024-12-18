package com.facebook.minscript.compiler.interfaces;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class MinsCompilerResult {
    public ByteBuffer byteBuffer;
    public HashMap lispyOffsetMap;

    public MinsCompilerResult(ByteBuffer byteBuffer, HashMap hashMap) {
        this.byteBuffer = byteBuffer;
        this.lispyOffsetMap = hashMap;
    }
}
