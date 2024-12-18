package com.facebook.imagepipeline.memory;

import X.AnonymousClass001;
import X.C09270dc;
import android.util.Log;
import java.io.Closeable;

/* loaded from: classes11.dex */
public class NativeMemoryChunk implements Closeable {
    public boolean mIsClosed = true;

    public static native long nativeAllocate(int i);

    public static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeFree(long j);

    public static native void nativeMemcpy(long j, long j2, int i);

    public static native byte nativeReadByte(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(0L);
        }
    }

    public void finalize() {
        boolean z;
        synchronized (this) {
            z = this.mIsClosed;
        }
        if (!z) {
            Log.w("NativeMemoryChunk", AnonymousClass001.A0g("finalize: Chunk ", Integer.toHexString(System.identityHashCode(this)), " still active. "));
            close();
        }
    }

    static {
        C09270dc.A01("imagepipeline");
    }
}
