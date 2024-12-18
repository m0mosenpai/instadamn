package com.facebook.forker;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class UnsafeByteArrayOutputStream extends ByteArrayOutputStream {
    public byte[] getRawBuffer() {
        int i = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        if (i != bArr.length) {
            return toByteArray();
        }
        return bArr;
    }

    public UnsafeByteArrayOutputStream(int i) {
        super(i);
    }

    public UnsafeByteArrayOutputStream() {
    }
}
