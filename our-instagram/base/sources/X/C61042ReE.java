package X;

import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.ReE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61042ReE extends InputStream {
    public long A00;
    public C59722oF A01;
    public final long A04;
    public final long A05;
    public final C1O3 A06;
    public final int A03 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
    public final LinkedBlockingQueue A07 = new LinkedBlockingQueue(100);
    public ByteArrayInputStream A02 = new ByteArrayInputStream(new byte[0]);
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public final AtomicBoolean A09 = new AtomicBoolean(false);

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        if (!this.A08.get()) {
            long j = this.A00;
            long j2 = this.A05;
            if (1 <= j2 && j2 <= j) {
                close();
            } else {
                this.A00 = j + i2;
                return A00().read(bArr, i, i2);
            }
        }
        return -1;
    }

    public C61042ReE(C1O3 c1o3, long j, long j2) {
        this.A06 = c1o3;
        this.A04 = j;
        this.A05 = j2;
    }

    private final ByteArrayInputStream A00() {
        if ((!this.A09.get() || !this.A07.isEmpty()) && this.A02.available() <= 0) {
            Object obj = null;
            for (long j = 0; !this.A08.get() && obj == null && j < this.A04; j += 500) {
                try {
                    obj = this.A07.poll(500L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    close();
                    return this.A02;
                }
            }
            if (obj == null) {
                close();
            } else {
                C59722oF c59722oF = (C59722oF) obj;
                this.A02 = new ByteArrayInputStream(c59722oF.A02, 0, c59722oF.A00);
                synchronized (this) {
                    C59722oF c59722oF2 = this.A01;
                    if (c59722oF2 != null) {
                        c59722oF2.A01();
                    }
                    this.A01 = c59722oF;
                }
            }
        }
        return this.A02;
    }

    public final void A01(byte[] bArr, boolean z) {
        if (!this.A08.get()) {
            int i = 0;
            while (true) {
                int length = bArr.length;
                if (i < length) {
                    C59722oF A00 = this.A06.A00();
                    int i2 = length - i;
                    int i3 = this.A03;
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    A00.A03(ByteBuffer.wrap(bArr, i, i2));
                    try {
                        if (this.A07.offer(A00, this.A04, TimeUnit.MILLISECONDS)) {
                            i += i2;
                        } else {
                            close();
                            throw MSW.A0y("Time out trying to offer data");
                        }
                    } catch (InterruptedException unused) {
                        close();
                        throw MSW.A0y("Got interrupted waiting to offer data");
                    }
                } else {
                    this.A09.set(z);
                    return;
                }
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A07.drainTo(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            ((C59722oF) it.next()).A01();
        }
        synchronized (this) {
            C59722oF c59722oF = this.A01;
            if (c59722oF != null) {
                c59722oF.A01();
            }
            this.A01 = null;
        }
        this.A08.set(true);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.A08.get()) {
            long j = this.A00;
            long j2 = this.A05;
            if (1 <= j2 && j2 <= j) {
                close();
            } else {
                this.A00 = j + 1;
                return A00().read();
            }
        }
        return -1;
    }
}
