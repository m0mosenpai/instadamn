package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.RdU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61001RdU extends FilterInputStream {
    public long A00;
    public long A01;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int readLimit) {
        ((FilterInputStream) this).in.mark(readLimit);
        this.A01 = this.A00;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.A01 != -1) {
                ((FilterInputStream) this).in.reset();
                this.A00 = this.A01;
            }
        } else {
            throw MSW.A0y("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.A00);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] b, int off, int len) {
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(b, off, (int) Math.min(len, j));
        if (read != -1) {
            this.A00 -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long n) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(n, this.A00));
        this.A00 -= skip;
        return skip;
    }

    public C61001RdU(InputStream in, long limit) {
        super(in);
        this.A01 = -1L;
        C18C.A0G(MSY.A1R((limit > 0L ? 1 : (limit == 0L ? 0 : -1))), "limit must be non-negative");
        this.A00 = limit;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.A00--;
        }
        return read;
    }
}
