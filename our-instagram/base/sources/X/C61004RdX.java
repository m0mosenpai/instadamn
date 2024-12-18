package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.RdX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61004RdX extends FilterInputStream {
    public static final byte[] A02 = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public int A00;
    public final byte A01;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 > 0) goto L6;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            int r3 = r4.A00
            r0 = 31
            if (r3 <= r0) goto L12
            int r1 = super.read(r5, r6, r7)
        La:
            if (r1 <= 0) goto L11
        Lc:
            int r0 = r4.A00
            int r0 = r0 + r1
            r4.A00 = r0
        L11:
            return r1
        L12:
            if (r3 != r0) goto L1a
            byte r0 = r4.A01
            r5[r6] = r0
            r1 = 1
            goto Lc
        L1a:
            r2 = 2
            if (r3 >= r2) goto L23
            int r2 = r2 - r3
            int r1 = super.read(r5, r6, r2)
            goto La
        L23:
            int r0 = r0 - r3
            int r1 = java.lang.Math.min(r0, r7)
            byte[] r0 = X.C61004RdX.A02
            int r3 = r3 - r2
            java.lang.System.arraycopy(r0, r3, r5, r6, r1)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61004RdX.read(byte[], int, int):int");
    }

    public C61004RdX(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.A01 = (byte) i;
            return;
        }
        throw AbstractC25230BEn.A0n("Cannot add invalid orientation: ", i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.A00 = (int) (this.A00 + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i = this.A00;
        if (i >= 2 && i <= 31) {
            if (i == 31) {
                read = this.A01;
            } else {
                read = A02[i - 2] & 255;
            }
        } else {
            read = super.read();
        }
        if (read != -1) {
            this.A00++;
        }
        return read;
    }
}
