package com.facebook.common.dextricks;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class SocketLock implements Closeable {
    public final LocalSocketAddress mAddr;
    public LocalSocket mSocket;

    public void release() {
        Fs.safeClose(this.mSocket);
        this.mSocket = null;
    }

    public boolean tryAcquire() {
        LocalSocket localSocket = new LocalSocket();
        try {
            try {
                localSocket.bind(this.mAddr);
                this.mSocket = localSocket;
                return true;
            } catch (IOException e) {
                String message = e.getMessage();
                if (message != null && (message.contains(": EADDRINUSE (") || message.contains(": errno 98 ("))) {
                    Fs.safeClose(localSocket);
                    return false;
                }
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            Fs.safeClose(localSocket);
            throw th;
        }
    }

    public SocketLock(String str) {
        this.mAddr = new LocalSocketAddress(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }
}
