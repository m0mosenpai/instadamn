package com.facebook.zstd;

import X.AbstractC10130gS;
import X.C09270dc;
import X.C10140gU;
import X.C14360o3;
import com.facebook.jni.HybridData;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class ZstdOutputStream extends AbstractC10130gS {
    public static final C10140gU Companion = new Object();
    public final int bufferSize;
    public final byte[] inBuf;
    public final HybridData mHybridData;
    public final byte[] outBuf;

    private final native boolean canWrite();

    public static final native HybridData initHybrid(int i, int i2);

    private final native int nativeRead(byte[] bArr, int i, boolean z);

    private final native void nativeWrite(byte[] bArr, int i);

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (true) {
            int nativeRead = nativeRead(this.outBuf, this.bufferSize, true);
            if (nativeRead > 0) {
                ((FilterOutputStream) this).out.write(this.outBuf, 0, nativeRead);
            } else if (nativeRead == -1) {
                super.close();
                return;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0gU, java.lang.Object] */
    static {
        C09270dc.A03("zstdencoder");
    }

    public ZstdOutputStream(OutputStream outputStream) {
        this(outputStream, 4096, 13);
    }

    public ZstdOutputStream(OutputStream outputStream, int i, int i2) {
        super(outputStream);
        this.bufferSize = i;
        this.outBuf = new byte[i];
        this.inBuf = new byte[i];
        this.mHybridData = initHybrid(i, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        C14360o3.A0B(bArr, 0);
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0 && bArr.length - i3 >= 0) {
            if (i2 == 0) {
                return;
            }
            while (i < i3) {
                int min = (int) Math.min(this.bufferSize, i3 - i);
                System.arraycopy(bArr, i, this.inBuf, 0, min);
                byte[] bArr2 = this.inBuf;
                while (!canWrite()) {
                    int nativeRead = nativeRead(this.outBuf, this.bufferSize, false);
                    if (nativeRead > 0) {
                        ((FilterOutputStream) this).out.write(this.outBuf, 0, nativeRead);
                    }
                }
                nativeWrite(bArr2, min);
                i += this.bufferSize;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
