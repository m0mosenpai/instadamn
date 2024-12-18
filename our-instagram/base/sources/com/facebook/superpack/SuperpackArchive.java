package com.facebook.superpack;

import X.C09170dP;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class SuperpackArchive implements Iterator, Closeable {
    public static final String TAG;
    public int mDecompressedFiles = 0;
    public long mPtr;

    public static native void appendAnonNative(long j, long j2);

    public static native void appendNative(long j, long j2);

    public static native void closeNative(long j);

    public static native long createNative();

    public static native long extractNextNative(long j, String[] strArr);

    public static native long getThreadNumOption(int i);

    public static native boolean isEmptyNative(long j);

    public static native long[] nextMemfdNative(long j, String str);

    public static native long nextNative(long j);

    public static native long readNative(InputStream inputStream, String str, long j);

    public static native long readNative(String str, String str2, long j);

    public static native void setPackingOptionsNative(long j, boolean z, boolean z2);

    public static native void setStorageNative(long j, String str, int i);

    public static native void writeNative(long j, OutputStream outputStream);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j = this.mPtr;
        if (j != 0) {
            closeNative(j);
            this.mPtr = 0L;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean isEmptyNative;
        synchronized (this) {
            long j = this.mPtr;
            if (j != 0) {
                isEmptyNative = isEmptyNative(j);
            } else {
                throw new IllegalStateException();
            }
        }
        return !isEmptyNative;
    }

    @Override // java.util.Iterator
    public synchronized SuperpackFile next() {
        long nextNative;
        long j = this.mPtr;
        if (j != 0) {
            nextNative = nextNative(j);
            if (nextNative != 0) {
                this.mDecompressedFiles++;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            throw new IllegalStateException();
        }
        return new SuperpackFile(nextNative, -1);
    }

    public void finalize() {
        long j = this.mPtr;
        if (j == 0) {
            return;
        }
        closeNative(j);
        this.mPtr = 0L;
        throw new IllegalStateException();
    }

    static {
        C09170dP.A0C("superpack-jni");
        TAG = "SuperpackArchive";
    }

    public SuperpackArchive(long j, String[] strArr) {
        if (j != 0) {
            this.mPtr = j;
            return;
        }
        throw new IllegalArgumentException();
    }
}
