package com.facebook.superpack;

import X.C09170dP;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class SuperpackFile implements Closeable {
    public int mFd;
    public int mLength;
    public boolean mOwnsFilePtr;
    public long mPtr;

    public SuperpackFile(long j, int i) {
        if (j != 0) {
            this.mPtr = j;
            this.mOwnsFilePtr = true;
            this.mLength = getLengthNative(j);
            this.mFd = -1;
            return;
        }
        throw null;
    }

    public static native void closeMemfdNative(long j);

    public static native void closeNative(long j);

    public static native long createSuperpackFileNative(String str, InputStream inputStream);

    public static native long createSuperpackFileNative(String str, byte[] bArr);

    public static native int getLengthNative(long j);

    public static native String getNameNative(long j);

    public static native void readBytesNative(long j, int i, int i2, byte[] bArr, int i3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j = this.mPtr;
        if (j != 0) {
            if (this.mFd >= 0) {
                closeMemfdNative(j);
            } else if (this.mOwnsFilePtr) {
                closeNative(j);
            }
            this.mPtr = 0L;
        } else {
            throw new IllegalStateException();
        }
    }

    public void finalize() {
        long j = this.mPtr;
        if (j == 0) {
            return;
        }
        if (this.mOwnsFilePtr) {
            closeNative(j);
        }
        this.mPtr = 0L;
        throw new IllegalStateException();
    }

    static {
        C09170dP.A0C("superpack-jni");
    }
}
