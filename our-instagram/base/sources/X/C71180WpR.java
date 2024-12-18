package X;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: X.WpR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71180WpR implements Closeable {
    public int A00;
    public int A01;
    public byte[] A02;
    public final InputStream A03;
    public final Charset A04;

    public C71180WpR(InputStream inputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(AbstractC70064W0y.A00)) {
                this.A03 = inputStream;
                this.A04 = charset;
                this.A02 = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r4[r2] == 13) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00() {
        /*
            r8 = this;
            java.io.InputStream r3 = r8.A03
            monitor-enter(r3)
            byte[] r4 = r8.A02     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L8e
            int r6 = r8.A01     // Catch: java.lang.Throwable -> L9c
            int r2 = r8.A00     // Catch: java.lang.Throwable -> L9c
            if (r6 < r2) goto L1b
            int r0 = r4.length     // Catch: java.lang.Throwable -> L9c
            r1 = 0
            int r2 = r3.read(r4, r1, r0)     // Catch: java.lang.Throwable -> L9c
            r0 = -1
            if (r2 == r0) goto L96
            r8.A01 = r1     // Catch: java.lang.Throwable -> L9c
            r6 = 0
            r8.A00 = r2     // Catch: java.lang.Throwable -> L9c
        L1b:
            r5 = r6
        L1c:
            r7 = 10
            if (r5 == r2) goto L2d
            byte[] r4 = r8.A02     // Catch: java.lang.Throwable -> L9c
            r0 = r4[r5]     // Catch: java.lang.Throwable -> L9c
            if (r0 != r7) goto L27
            goto L2a
        L27:
            int r5 = r5 + 1
            goto L1c
        L2a:
            if (r5 == r6) goto L85
            goto L6b
        L2d:
            int r2 = r2 - r6
            int r0 = r2 + 80
            X.VCI r6 = new X.VCI     // Catch: java.lang.Throwable -> L9c
            r6.<init>(r8, r0)     // Catch: java.lang.Throwable -> L9c
        L35:
            byte[] r2 = r8.A02     // Catch: java.lang.Throwable -> L9c
            int r1 = r8.A01     // Catch: java.lang.Throwable -> L9c
            int r0 = r8.A00     // Catch: java.lang.Throwable -> L9c
            int r0 = r0 - r1
            r6.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L9c
            r2 = -1
            r8.A00 = r2     // Catch: java.lang.Throwable -> L9c
            byte[] r1 = r8.A02     // Catch: java.lang.Throwable -> L9c
            int r0 = r1.length     // Catch: java.lang.Throwable -> L9c
            r5 = 0
            int r4 = r3.read(r1, r5, r0)     // Catch: java.lang.Throwable -> L9c
            if (r4 == r2) goto L88
            r8.A01 = r5     // Catch: java.lang.Throwable -> L9c
            r8.A00 = r4     // Catch: java.lang.Throwable -> L9c
            r2 = 0
        L51:
            if (r2 == r4) goto L35
            byte[] r1 = r8.A02     // Catch: java.lang.Throwable -> L9c
            r0 = r1[r2]     // Catch: java.lang.Throwable -> L9c
            if (r0 != r7) goto L5a
            goto L5d
        L5a:
            int r2 = r2 + 1
            goto L51
        L5d:
            if (r2 == r5) goto L62
            r6.write(r1, r5, r2)     // Catch: java.lang.Throwable -> L9c
        L62:
            int r0 = r2 + 1
            r8.A01 = r0     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L9c
            goto L83
        L6b:
            int r2 = r5 + (-1)
            r1 = r4[r2]     // Catch: java.lang.Throwable -> L9c
            r0 = 13
            if (r1 != r0) goto L85
        L73:
            int r2 = r2 - r6
            java.nio.charset.Charset r0 = r8.A04     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r4, r6, r2, r0)     // Catch: java.lang.Throwable -> L9c
            int r0 = r5 + 1
            r8.A01 = r0     // Catch: java.lang.Throwable -> L9c
        L83:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9c
            goto L87
        L85:
            r2 = r5
            goto L73
        L87:
            return r1
        L88:
            java.io.EOFException r1 = new java.io.EOFException     // Catch: java.lang.Throwable -> L9c
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
            goto L9b
        L8e:
            java.lang.String r0 = "LineReader is closed"
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            goto L9b
        L96:
            java.io.EOFException r1 = new java.io.EOFException     // Catch: java.lang.Throwable -> L9c
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
        L9b:
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71180WpR.A00():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.A03;
        synchronized (inputStream) {
            if (this.A02 != null) {
                this.A02 = null;
                inputStream.close();
            }
        }
    }
}
