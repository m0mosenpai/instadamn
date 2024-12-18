package com.facebook.proxygen;

import X.AbstractC166987dD;
import com.facebook.jni.Countable;
import java.io.IOException;

/* loaded from: classes10.dex */
public class NativeReadBuffer extends Countable implements ReadBuffer {
    public boolean mClosed;
    public boolean mError;
    public boolean mInitialized;

    private native void nativeInit();

    private native int nativeRead(byte[] bArr, int i, int i2);

    private native int nativeSize();

    @Override // com.facebook.proxygen.ReadBuffer
    public void close() {
        try {
            dispose();
        } finally {
            this.mClosed = true;
        }
    }

    private void checkBufferInUsableState() {
        if (this.mInitialized) {
            if (!this.mClosed) {
                if (!this.mError) {
                    return;
                } else {
                    throw AbstractC166987dD.A14("Trying to read after error");
                }
            }
            throw AbstractC166987dD.A14("Buffer already closed");
        }
        throw AbstractC166987dD.A14("Buffer not initialized");
    }

    public void init() {
        if (!this.mInitialized) {
            nativeInit();
            this.mInitialized = true;
            return;
        }
        throw AbstractC166987dD.A14("Already initalized");
    }

    @Override // com.facebook.proxygen.ReadBuffer
    public int read(byte[] bArr, int i, int i2) {
        checkBufferInUsableState();
        if (i >= 0 && i2 >= 0) {
            if (bArr != null && bArr.length - i >= i2) {
                if (i2 == 0) {
                    return 0;
                }
                try {
                    return nativeRead(bArr, i, i2);
                } catch (IOException e) {
                    this.mError = true;
                    throw e;
                }
            }
            throw AbstractC166987dD.A12("Array null, or not large enough");
        }
        throw AbstractC166987dD.A12("Negative length or offset is not allowed");
    }

    @Override // com.facebook.proxygen.ReadBuffer
    public int size() {
        checkBufferInUsableState();
        return nativeSize();
    }
}
