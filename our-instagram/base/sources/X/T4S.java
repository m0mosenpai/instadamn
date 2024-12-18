package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public final class T4S implements C4JB {
    public long A00;
    public long A01;
    public long A02;
    public C4C7 A03;
    public File A04;
    public OutputStream A05;
    public final long A06;
    public final C2QE A07;

    private void A00() {
        if (this.A05 != null) {
            try {
                AbstractC460729r.A01("cacheDataSinkSync");
                this.A05.flush();
                AbstractC460729r.A00();
                OutputStream outputStream = this.A05;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.A05 = null;
                File file = this.A04;
                this.A04 = null;
                this.A07.AId(file, this.A02);
            } catch (Throwable th) {
                AbstractC460729r.A00();
                OutputStream outputStream2 = this.A05;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A05 = null;
                File file2 = this.A04;
                this.A04 = null;
                file2.delete();
                throw th;
            }
        }
    }

    private void A01(C4C7 c4c7) {
        long j = c4c7.A03;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.A00, this.A01);
        }
        File EnK = this.A07.EnK(c4c7.A08, c4c7.A04 + this.A00, j2);
        this.A04 = EnK;
        this.A05 = new FileOutputStream(EnK);
        this.A02 = 0L;
    }

    @Override // X.C4JB
    public final void E2L(C4C7 c4c7) {
        long j;
        c4c7.A08.getClass();
        if (c4c7.A03 == -1 && (c4c7.A00 & 2) == 2) {
            this.A03 = null;
            return;
        }
        this.A03 = c4c7;
        if ((c4c7.A00 & 4) == 4) {
            j = this.A06;
        } else {
            j = Long.MAX_VALUE;
        }
        this.A01 = j;
        this.A00 = 0L;
        try {
            try {
                AbstractC460729r.A01("exo-opencachedatasink");
                A01(c4c7);
            } catch (IOException e) {
                throw new IOException(e);
            }
        } finally {
            AbstractC460729r.A00();
        }
    }

    @Override // X.C4JB
    public final void close() {
        if (this.A03 != null) {
            try {
                A00();
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
    }

    @Override // X.C4JB
    public final void write(byte[] bArr, int i, int i2) {
        C4C7 c4c7 = this.A03;
        if (c4c7 != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.A02 == this.A01) {
                        A00();
                        A01(c4c7);
                    }
                    int min = (int) Math.min(i2 - i3, this.A01 - this.A02);
                    this.A05.write(bArr, i + i3, min);
                    i3 += min;
                    long j = min;
                    this.A02 += j;
                    this.A00 += j;
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r7 == (-1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T4S(X.C2QE r6, long r7) {
        /*
            r5 = this;
            r5.<init>()
            r3 = -1
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L10
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L11
        L10:
            r1 = 1
        L11:
            java.lang.String r0 = "fragmentSize must be positive or C.LENGTH_UNSET."
            if (r1 == 0) goto L38
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L27
            r1 = 2097152(0x200000, double:1.036131E-317)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L27
            java.lang.String r1 = "CacheDataSinkV2"
            java.lang.String r0 = "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance."
            X.AbstractC46512Bo.A04(r1, r0)
        L27:
            r6.getClass()
            r5.A07 = r6
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L35
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L35:
            r5.A06 = r7
            return
        L38:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T4S.<init>(X.2QE, long):void");
    }
}
