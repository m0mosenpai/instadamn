package X;

import com.facebook.common.dextricks.Constants;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.RdY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61005RdY extends FilterInputStream {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final C63361SiK A04;
    public volatile byte[] A05;

    public final synchronized void A01() {
        if (this.A05 != null) {
            this.A04.A05(this.A05);
            this.A05 = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.A05 != null && inputStream != null) {
        } else {
            throw MSW.A0y("BufferedInputStream is closed");
        }
        return (this.A02 - this.A03) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.A00 = Math.max(this.A00, i);
        this.A01 = this.A03;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0066, code lost:
    
        if (r2 == r9) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0068, code lost:
    
        r5 = r9 - r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[Catch: all -> 0x0077, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x000a, B:12:0x000e, B:14:0x0014, B:17:0x0018, B:19:0x0022, B:21:0x0028, B:23:0x002d, B:25:0x0032, B:27:0x0035, B:43:0x0068, B:29:0x005a, B:31:0x005d, B:33:0x0064, B:44:0x003c, B:46:0x0042, B:48:0x0046, B:51:0x004a, B:54:0x0052, B:59:0x0070, B:60:0x0076), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[EDGE_INSN: B:39:0x006e->B:37:0x006e BREAK  A[LOOP:0: B:23:0x002d->B:33:0x0064], SYNTHETIC] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r4 = r6.A05     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L70
            if (r9 != 0) goto La
            r5 = 0
        L8:
            monitor-exit(r6)
            return r5
        La:
            java.io.InputStream r3 = r6.in     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L70
            int r0 = r6.A03     // Catch: java.lang.Throwable -> L77
            int r1 = r6.A02     // Catch: java.lang.Throwable -> L77
            if (r0 >= r1) goto L2c
            int r1 = r1 - r0
            if (r1 < r9) goto L18
            r1 = r9
        L18:
            java.lang.System.arraycopy(r4, r0, r7, r8, r1)     // Catch: java.lang.Throwable -> L77
            int r0 = r6.A03     // Catch: java.lang.Throwable -> L77
            int r0 = r0 + r1
            r6.A03 = r0     // Catch: java.lang.Throwable -> L77
            if (r1 == r9) goto L6b
            int r0 = r3.available()     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L6b
            int r8 = r8 + r1
            int r2 = r9 - r1
            goto L2d
        L2c:
            r2 = r9
        L2d:
            int r0 = r6.A01     // Catch: java.lang.Throwable -> L77
            r5 = -1
            if (r0 != r5) goto L3c
            int r0 = r4.length     // Catch: java.lang.Throwable -> L77
            if (r2 < r0) goto L3c
            int r1 = r3.read(r7, r8, r2)     // Catch: java.lang.Throwable -> L77
            if (r1 != r5) goto L5a
            goto L66
        L3c:
            int r0 = r6.A00(r3, r4)     // Catch: java.lang.Throwable -> L77
            if (r0 == r5) goto L66
            byte[] r0 = r6.A05     // Catch: java.lang.Throwable -> L77
            if (r4 == r0) goto L4a
            byte[] r4 = r6.A05     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L70
        L4a:
            int r1 = r6.A02     // Catch: java.lang.Throwable -> L77
            int r0 = r6.A03     // Catch: java.lang.Throwable -> L77
            int r1 = r1 - r0
            if (r1 < r2) goto L52
            r1 = r2
        L52:
            java.lang.System.arraycopy(r4, r0, r7, r8, r1)     // Catch: java.lang.Throwable -> L77
            int r0 = r6.A03     // Catch: java.lang.Throwable -> L77
            int r0 = r0 + r1
            r6.A03 = r0     // Catch: java.lang.Throwable -> L77
        L5a:
            int r2 = r2 - r1
            if (r2 == 0) goto L6e
            int r0 = r3.available()     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L64
            goto L6d
        L64:
            int r8 = r8 + r1
            goto L2d
        L66:
            if (r2 == r9) goto L8
            int r5 = r9 - r2
            goto L8
        L6b:
            monitor-exit(r6)
            return r1
        L6d:
            int r9 = r9 - r2
        L6e:
            monitor-exit(r6)
            return r9
        L70:
            java.lang.String r0 = "BufferedInputStream is closed"
            java.io.IOException r0 = X.MSW.A0y(r0)     // Catch: java.lang.Throwable -> L77
            throw r0     // Catch: java.lang.Throwable -> L77
        L77:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61005RdY.read(byte[], int, int):int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.A05 != null) {
            int i = this.A01;
            if (-1 != i) {
                this.A03 = i;
            } else {
                throw new IOException(AnonymousClass001.A02(this.A03, this.A00, "Mark has been invalidated, pos: ", " markLimit: "));
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        InputStream inputStream;
        long j2;
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.A05;
        if (bArr != null && (inputStream = ((FilterInputStream) this).in) != null) {
            int i = this.A02;
            int i2 = this.A03;
            if (i - i2 >= j) {
                j2 = i2 + j;
            } else {
                long j3 = i - i2;
                this.A03 = i;
                if (this.A01 != -1 && j <= this.A00) {
                    if (A00(inputStream, bArr) != -1) {
                        int i3 = this.A02;
                        int i4 = this.A03;
                        if (i3 - i4 >= j - j3) {
                            j2 = (i4 + j) - j3;
                        } else {
                            j3 = (j3 + i3) - i4;
                            this.A03 = i3;
                        }
                    }
                } else {
                    long skip = inputStream.skip(j - j3);
                    if (skip > 0) {
                        this.A01 = -1;
                    }
                    j3 += skip;
                }
                return j3;
            }
            this.A03 = (int) j2;
            return j;
        }
        throw MSW.A0y("BufferedInputStream is closed");
    }

    public C61005RdY(C63361SiK c63361SiK, InputStream inputStream) {
        super(inputStream);
        this.A01 = -1;
        this.A04 = c63361SiK;
        this.A05 = (byte[]) c63361SiK.A04(Constants.LOAD_RESULT_PGO_ATTEMPTED, byte[].class);
    }

    private int A00(InputStream inputStream, byte[] bArr) {
        int read;
        int i = this.A01;
        if (i != -1) {
            int i2 = this.A03 - i;
            int i3 = this.A00;
            if (i2 < i3) {
                if (i == 0) {
                    int length = bArr.length;
                    if (i3 > length && this.A02 == length) {
                        int i4 = length * 2;
                        if (i4 <= i3) {
                            i3 = i4;
                        }
                        C63361SiK c63361SiK = this.A04;
                        byte[] bArr2 = (byte[]) c63361SiK.A04(i3, byte[].class);
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                        this.A05 = bArr2;
                        c63361SiK.A05(bArr);
                        bArr = bArr2;
                    }
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i5 = this.A03 - this.A01;
                this.A03 = i5;
                this.A01 = 0;
                this.A02 = 0;
                read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.A03;
                if (read > 0) {
                    i6 += read;
                }
                this.A02 = i6;
                return read;
            }
        }
        read = inputStream.read(bArr);
        if (read > 0) {
            this.A01 = -1;
            this.A03 = 0;
            this.A02 = read;
            return read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A05 != null) {
            this.A04.A05(this.A05);
            this.A05 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.A05;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.A03 < this.A02 || A00(inputStream, bArr) != -1) {
                if (bArr == this.A05 || (bArr = this.A05) != null) {
                    int i = this.A02;
                    int i2 = this.A03;
                    if (i - i2 > 0) {
                        this.A03 = i2 + 1;
                        return bArr[i2] & 255;
                    }
                }
            }
            return -1;
        }
        throw MSW.A0y("BufferedInputStream is closed");
    }
}
