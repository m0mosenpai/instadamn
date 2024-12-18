package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* renamed from: X.3L4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3L4 extends InputStream {
    public final /* synthetic */ C26581Qn A00;

    public C3L4(C26581Qn c26581Qn) {
        this.A00 = c26581Qn;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C26581Qn c26581Qn;
        while (true) {
            c26581Qn = this.A00;
            if (c26581Qn.A0A) {
                break;
            } else {
                C26581Qn.A00(c26581Qn);
            }
        }
        C18C.A0E(c26581Qn.A0A);
        c26581Qn.A01 = true;
        if (c26581Qn.A09 == null) {
        } else {
            throw new IOException(c26581Qn.A09);
        }
    }

    public final void finalize() {
        C26581Qn c26581Qn = this.A00;
        if (!c26581Qn.A01) {
            StringBuilder sb = new StringBuilder();
            sb.append("Input stream not closed for uri: ");
            sb.append(c26581Qn.A05);
            C0w9.A03("HttpEngine", sb.toString());
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C26581Qn c26581Qn = this.A00;
        ByteBuffer byteBuffer = c26581Qn.A06;
        if (byteBuffer.remaining() == 0 && !c26581Qn.A0A) {
            C26581Qn.A00(c26581Qn);
        }
        if (c26581Qn.A09 == null) {
            if (c26581Qn.A0A) {
                return -1;
            }
            Semaphore semaphore = c26581Qn.A07;
            if (semaphore.availablePermits() > 0) {
                C0w9.A03("HttpMessageExchange_concurrency", "HttpMessageExchange.mByteBuffer is now open to multiple threads read and write to it");
                semaphore.drainPermits();
            }
            int min = Math.min(Math.min(bArr.length - i, byteBuffer.remaining()), i2);
            System.arraycopy(byteBuffer.array(), byteBuffer.position(), bArr, i, min);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
        throw c26581Qn.A09;
    }

    @Override // java.io.InputStream
    public final int read() {
        C26581Qn c26581Qn = this.A00;
        ByteBuffer byteBuffer = c26581Qn.A06;
        if (byteBuffer.remaining() == 0 && !c26581Qn.A0A) {
            C26581Qn.A00(c26581Qn);
        }
        if (c26581Qn.A09 == null) {
            if (c26581Qn.A0A) {
                return -1;
            }
            return byteBuffer.get();
        }
        throw c26581Qn.A09;
    }
}
