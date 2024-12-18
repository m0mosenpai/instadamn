package com.facebook.xzdecoder;

import X.C09270dc;
import com.facebook.common.dextricks.Constants;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class XzInputStream extends InputStream {
    public int clientOutPos;
    public InputStream inFile;
    public int inPos;
    public int inSize;
    public int outPos;
    public byte[] inBuf = new byte[Constants.LOAD_RESULT_PGO];
    public byte[] outBuf = new byte[Constants.LOAD_RESULT_PGO];
    public long state = initializeState();

    public static native long decompressStream(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native void end(long j);

    public static native void initializeLibrary();

    public static native long initializeState();

    private boolean readMoreInput() {
        this.inSize = 0;
        int i = 0;
        this.inPos = 0;
        do {
            InputStream inputStream = this.inFile;
            byte[] bArr = this.inBuf;
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (read == -1) {
                return this.inSize > 0;
            }
            i = this.inSize + read;
            this.inSize = i;
        } while (i < 32768);
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (i2 >= 0 && i >= 0 && i + i2 <= bArr.length) {
            if (this.state != 0) {
                int i4 = i2;
                while (i3 < i2) {
                    int i5 = this.clientOutPos;
                    int i6 = this.outPos;
                    if (i5 < i6) {
                        int min = Math.min(i4, i6 - i5);
                        System.arraycopy(this.outBuf, i5, bArr, i, min);
                        this.clientOutPos += min;
                        i4 -= min;
                        i += min;
                        i3 += min;
                    } else {
                        if (this.inPos == this.inSize && !readMoreInput()) {
                            if (i3 == 0) {
                                return -1;
                            }
                            return i3;
                        }
                        decodeMoreBytes();
                    }
                }
                return i3;
            }
            throw new IOException("Stream closed");
        }
        throw new IndexOutOfBoundsException(String.format("buf.length = %d, off = %d, len = %d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void decodeMoreBytes() {
        long j = this.state;
        byte[] bArr = this.inBuf;
        int i = this.inPos;
        int i2 = this.inSize;
        byte[] bArr2 = this.outBuf;
        long decompressStream = decompressStream(j, bArr, i, i2, bArr2, 0, bArr2.length);
        this.inPos = (int) (decompressStream >>> 32);
        this.outPos = (int) decompressStream;
        this.clientOutPos = 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inFile.close();
        long j = this.state;
        if (j != 0) {
            end(j);
            this.state = 0L;
        }
    }

    static {
        C09270dc.A03("fb_xzdecoder");
        initializeLibrary();
    }

    public XzInputStream(InputStream inputStream) {
        this.inFile = inputStream;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.state != 0) {
            if (this.clientOutPos == this.outPos) {
                if (this.inPos == this.inSize && !readMoreInput()) {
                    return -1;
                }
                decodeMoreBytes();
            }
            byte[] bArr = this.outBuf;
            int i = this.clientOutPos;
            this.clientOutPos = i + 1;
            return bArr[i];
        }
        throw new IOException("Stream closed");
    }
}
