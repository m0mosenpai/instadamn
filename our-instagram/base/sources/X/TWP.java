package X;

/* loaded from: classes10.dex */
public final class TWP implements InterfaceC65461TkX {
    public final TIY A00;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r6 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A00(java.io.IOException r4, X.C63026Saw r5, boolean r6) {
        /*
            r3 = this;
            X.TIY r0 = r3.A00
            boolean r0 = r0.A0P
            r2 = 0
            if (r0 == 0) goto Ld
            if (r6 == 0) goto Le
            boolean r0 = r4 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto Le
        Ld:
            return r2
        Le:
            boolean r0 = r4 instanceof java.net.ProtocolException
            if (r0 != 0) goto Ld
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L22
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto Ld
            if (r6 != 0) goto Ld
        L1c:
            X.SOD r0 = r5.A03
            X.SZ7 r1 = r0.A07
            monitor-enter(r1)
            goto L34
        L22:
            boolean r0 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L2f
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L2f
            return r2
        L2f:
            boolean r0 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L1c
            return r2
        L34:
            boolean r0 = r0.A03     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto Ld
            X.SOD r0 = r5.A03
            boolean r0 = r0.A01()
            if (r0 == 0) goto Ld
            r2 = 1
            return r2
        L43:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWP.A00(java.io.IOException, X.Saw, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r13.A03.A01() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        throw X.AbstractC58320PtC.A0l("method ", r6, " must have a request body.");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0077. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC65461TkX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.THP COo(X.C62709SMx r32) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWP.COo(X.SMx):X.THP");
    }

    public TWP(TIY tiy) {
        this.A00 = tiy;
    }
}
