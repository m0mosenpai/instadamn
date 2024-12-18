package X;

import com.google.common.io.Closeables;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Os6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55914Os6 implements InterfaceC26481Qd, InterfaceC26491Qe {
    public InputStream A01;
    public final java.net.URI A04;
    public final InterfaceC24731Iq A02 = new C24721Ip(1);
    public final InterfaceC24731Iq A03 = new C24721Ip(1);
    public final InterfaceC24731Iq A05 = AbstractC25229BEm.A12();
    public long A00 = -1;

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        C14360o3.A0B(iOException, 0);
        InterfaceC24731Iq interfaceC24731Iq = this.A03;
        AbstractC129685tX.A00(new NAN(iOException), interfaceC24731Iq);
        interfaceC24731Iq.AID(iOException);
        this.A05.AID(iOException);
    }

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit());
        allocate.put(byteBuffer);
        allocate.rewind();
        AbstractC129685tX.A00(allocate, this.A05);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[Catch: InterruptedException -> 0x004a, TryCatch #0 {InterruptedException -> 0x004a, blocks: (B:3:0x0004, B:6:0x0036, B:9:0x003b, B:11:0x003f, B:12:0x0043, B:16:0x0046, B:23:0x0032, B:18:0x0025, B:20:0x0029), top: B:2:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[Catch: InterruptedException -> 0x004a, TryCatch #0 {InterruptedException -> 0x004a, blocks: (B:3:0x0004, B:6:0x0036, B:9:0x003b, B:11:0x003f, B:12:0x0043, B:16:0x0046, B:23:0x0032, B:18:0x0025, B:20:0x0029), top: B:2:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // X.InterfaceC26491Qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponseStarted(X.C3JQ r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            int r4 = r6.A01     // Catch: java.lang.InterruptedException -> L4a
            java.lang.String r3 = r6.A02     // Catch: java.lang.InterruptedException -> L4a
            int r2 = r6.A00     // Catch: java.lang.InterruptedException -> L4a
            java.util.List r0 = r6.A03     // Catch: java.lang.InterruptedException -> L4a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.InterruptedException -> L4a
            X.3JY r1 = new X.3JY     // Catch: java.lang.InterruptedException -> L4a
            r1.<init>(r3, r0, r4, r2)     // Catch: java.lang.InterruptedException -> L4a
            r1.A00 = r5     // Catch: java.lang.InterruptedException -> L4a
            X.1Iq r0 = r5.A02     // Catch: java.lang.InterruptedException -> L4a
            X.AbstractC129685tX.A00(r1, r0)     // Catch: java.lang.InterruptedException -> L4a
            java.lang.String r0 = "Content-Length"
            X.1El r0 = r6.A00(r0)     // Catch: java.lang.InterruptedException -> L4a
            r2 = 0
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.A01     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            java.lang.Long r1 = X.AbstractC166997dE.A0j(r0)     // Catch: java.lang.Throwable -> L2e
            goto L36
        L2e:
            r0 = move-exception
            goto L32
        L30:
            r1 = r2
            goto L36
        L32:
            X.0e5 r1 = X.MSW.A1D(r0)     // Catch: java.lang.InterruptedException -> L4a
        L36:
            boolean r0 = r1 instanceof X.C09540e5     // Catch: java.lang.InterruptedException -> L4a
            if (r0 != 0) goto L3b
            r2 = r1
        L3b:
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.InterruptedException -> L4a
            if (r2 == 0) goto L46
            long r0 = r2.longValue()     // Catch: java.lang.InterruptedException -> L4a
        L43:
            r5.A00 = r0     // Catch: java.lang.InterruptedException -> L4a
            goto L49
        L46:
            long r0 = r5.A00     // Catch: java.lang.InterruptedException -> L4a
            goto L43
        L49:
            return
        L4a:
            java.lang.String r0 = "Interrupted while receiving response."
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55914Os6.onResponseStarted(X.3JQ):void");
    }

    @Override // X.InterfaceC26481Qd
    public final void AIH() {
        Closeables.A01(this.A01);
    }

    @Override // X.InterfaceC26481Qd
    public final long AJp() {
        return this.A00;
    }

    @Override // X.InterfaceC26481Qd
    public final InputStream AjT() {
        InputStream inputStream = this.A01;
        if (inputStream == null) {
            C53096Ne9 c53096Ne9 = new C53096Ne9(this.A05);
            this.A01 = c53096Ne9;
            return c53096Ne9;
        }
        return inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        InterfaceC24731Iq interfaceC24731Iq = this.A03;
        AbstractC129685tX.A00(NAO.A00, interfaceC24731Iq);
        interfaceC24731Iq.AID(null);
        this.A05.AID(null);
    }

    public C55914Os6(java.net.URI uri) {
        this.A04 = uri;
    }
}
