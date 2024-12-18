package X;

import com.google.common.io.Closeables;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.concurrent.Semaphore;

/* renamed from: X.1Qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26581Qn implements InterfaceC26481Qd, InterfaceC26491Qe {
    public C3JY A00;
    public boolean A01;
    public long A02 = -1;
    public InputStream A03;
    public boolean A04;
    public final java.net.URI A05;
    public final ByteBuffer A06;
    public final Semaphore A07;
    public final Semaphore A08;
    public volatile IOException A09;
    public volatile boolean A0A;

    public static void A00(C26581Qn c26581Qn) {
        c26581Qn.A07.release();
        try {
            c26581Qn.A08.acquire();
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted while waiting for byte stream.");
        }
    }

    @Override // X.InterfaceC26481Qd
    public final void AIH() {
        InputStream inputStream = this.A03;
        if (inputStream != null) {
            Closeables.A01(inputStream);
        } else {
            if (!this.A04) {
                return;
            }
            while (!this.A0A) {
                A00(this);
            }
        }
    }

    @Override // X.InterfaceC26481Qd
    public final long AJp() {
        return this.A02;
    }

    @Override // X.InterfaceC26481Qd
    public final InputStream AjT() {
        InputStream inputStream = this.A03;
        if (inputStream == null) {
            C3L4 c3l4 = new C3L4(this);
            this.A03 = c3l4;
            return c3l4;
        }
        return inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.A03;
        if (inputStream != null) {
            inputStream.close();
        } else {
            if (!this.A04) {
                return;
            }
            while (!this.A0A) {
                A00(this);
            }
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        try {
            this.A07.acquire();
            this.A0A = true;
            this.A08.release();
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted after onComplete.");
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        try {
            this.A07.acquire();
            this.A0A = true;
            this.A09 = iOException;
            this.A08.release();
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted after onFailed.");
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        try {
            this.A07.acquire();
            ByteBuffer byteBuffer2 = this.A06;
            byteBuffer2.clear();
            byteBuffer2.put(byteBuffer);
            byteBuffer2.flip();
            this.A08.release();
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted while waiting for read.");
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        try {
            this.A07.acquire();
            int i = c3jq.A01;
            this.A00 = new C3JY(c3jq.A02, Collections.unmodifiableList(c3jq.A03), i, c3jq.A00);
            this.A03 = new C3L4(this);
            this.A00.A00 = this;
            C23781El A00 = c3jq.A00("Content-Length");
            if (A00 != null) {
                try {
                    this.A02 = Long.parseLong(A00.A01);
                } catch (NumberFormatException unused) {
                }
            }
            this.A08.release();
        } catch (InterruptedException unused2) {
            throw new RuntimeException("Interrupted while receiving response.");
        }
    }

    public C26581Qn(java.net.URI uri, boolean z) {
        this.A05 = uri;
        ByteBuffer allocate = ByteBuffer.allocate(4096);
        this.A06 = allocate;
        allocate.limit(0);
        this.A08 = new Semaphore(0, true);
        this.A07 = new Semaphore(0, true);
        this.A04 = z;
    }
}
