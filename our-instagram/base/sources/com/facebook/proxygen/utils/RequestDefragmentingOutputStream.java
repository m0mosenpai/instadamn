package com.facebook.proxygen.utils;

import X.AbstractC58319PtB;
import X.MSW;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntityEnclosingRequest;

/* loaded from: classes10.dex */
public class RequestDefragmentingOutputStream extends OutputStream {
    public static final int BODY_BUFFER_SIZE = 4096;
    public final byte[] mBuffer;
    public boolean mClosed;
    public OutputStream mFallbackOutputStream;
    public final HandlerInterface mHandlerInterface;
    public boolean mHeadersSent;
    public int mPosition;
    public final HttpEntityEnclosingRequest mRequest;
    public boolean mSkipBufferedOutputStream;
    public final int mStreamingBufferSize;

    /* loaded from: classes10.dex */
    public interface HandlerInterface {
        boolean sendBody(byte[] bArr, int i, int i2);

        boolean sendEOM();

        boolean sendHeaders(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

        boolean sendRequestWithBodyAndEom(HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, int i2);
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        checkStreamIsNotClosed();
        if (this.mSkipBufferedOutputStream) {
            write(new byte[]{(byte) i});
        } else {
            OutputStream outputStream = this.mFallbackOutputStream;
            if (outputStream != null) {
                outputStream.write(i);
            } else if (!canBufferMoreBytes(1)) {
                fallbackToStreaming(new byte[]{(byte) i}, 0, 1);
            } else {
                byte[] bArr = this.mBuffer;
                int i2 = this.mPosition;
                bArr[i2] = (byte) i;
                this.mPosition = i2 + 1;
            }
        }
    }

    public synchronized void writeEomIfNecessary() {
        checkStreamIsNotClosed();
        this.mClosed = true;
        if (this.mSkipBufferedOutputStream) {
            flushBuffer();
            if (!this.mHandlerInterface.sendEOM()) {
                throw new IOException();
            }
        } else {
            OutputStream outputStream = this.mFallbackOutputStream;
            if (outputStream != null) {
                outputStream.flush();
                if (!this.mHandlerInterface.sendEOM()) {
                }
            } else if (!this.mHandlerInterface.sendRequestWithBodyAndEom(this.mRequest, this.mBuffer, 0, this.mPosition)) {
            }
        }
    }

    private boolean canBufferMoreBytes(int i) {
        return AbstractC58319PtB.A1P(i, this.mBuffer.length - this.mPosition);
    }

    private void checkStreamIsNotClosed() {
        if (!this.mClosed) {
        } else {
            throw MSW.A0y("writeEomIfNecessary was already called on the stream");
        }
    }

    private void fallbackToStreaming(byte[] bArr, int i, int i2) {
        if (this.mHandlerInterface.sendHeaders(this.mRequest)) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FallbackOutputStream(), this.mStreamingBufferSize);
            this.mFallbackOutputStream = bufferedOutputStream;
            bufferedOutputStream.write(this.mBuffer, 0, this.mPosition);
            this.mFallbackOutputStream.write(bArr, i, i2);
            return;
        }
        throw new IOException();
    }

    private void flushBuffer() {
        int i = this.mPosition;
        if (i > 0 && !this.mHandlerInterface.sendBody(this.mBuffer, 0, i)) {
            throw new IOException();
        }
    }

    private void flushBufferIfNeeded() {
        if (this.mPosition == 4096) {
            flushBuffer();
            this.mPosition = 0;
        }
    }

    private void sendHeadersIfNotSent() {
        if (!this.mHeadersSent) {
            if (this.mHandlerInterface.sendHeaders(this.mRequest)) {
                this.mHeadersSent = true;
                return;
            }
            throw new IOException();
        }
    }

    public RequestDefragmentingOutputStream(HandlerInterface handlerInterface, HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, boolean z) {
        this.mHandlerInterface = handlerInterface;
        this.mRequest = httpEntityEnclosingRequest;
        this.mBuffer = bArr;
        this.mStreamingBufferSize = i;
        this.mSkipBufferedOutputStream = z;
    }

    /* loaded from: classes10.dex */
    public class FallbackOutputStream extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) {
            if (RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(new byte[]{(byte) i}, 0, 1)) {
            } else {
                throw new IOException();
            }
        }

        public FallbackOutputStream() {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            if (RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(bArr, i, i2)) {
            } else {
                throw new IOException();
            }
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        checkStreamIsNotClosed();
        if (this.mSkipBufferedOutputStream) {
            sendHeadersIfNotSent();
            while (i2 > 0) {
                flushBufferIfNeeded();
                int i3 = this.mPosition;
                int min = Math.min(4096 - i3, i2);
                System.arraycopy(bArr, i, this.mBuffer, i3, min);
                this.mPosition += min;
                i += min;
                i2 -= min;
            }
        } else {
            OutputStream outputStream = this.mFallbackOutputStream;
            if (outputStream != null) {
                outputStream.write(bArr, i, i2);
            } else if (!canBufferMoreBytes(i2)) {
                fallbackToStreaming(bArr, i, i2);
            } else {
                System.arraycopy(bArr, i, this.mBuffer, this.mPosition, i2);
                this.mPosition += i2;
            }
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) {
        checkStreamIsNotClosed();
        write(bArr, 0, bArr.length);
    }
}
