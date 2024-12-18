package X;

/* loaded from: classes10.dex */
public final class TG6 implements InterfaceC25601Mq {
    public final int A00;
    public final Object A01;

    public TG6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (r7 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
    
        if (r7 == null) goto L46;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.TFD, java.lang.Object] */
    @Override // X.InterfaceC25601Mq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto Ld5;
                case 1: goto Ld1;
                case 2: goto L93;
                default: goto L5;
            }
        L5:
            X.3JY r9 = (X.C3JY) r9
            X.1Qd r7 = r9.A00()
            r7.getClass()
            X.2UZ r6 = X.C2UZ.A02     // Catch: java.lang.Throwable -> L91
            java.lang.Object r0 = r8.A01     // Catch: java.lang.Throwable -> L91
            X.RcW r0 = (X.RcW) r0     // Catch: java.lang.Throwable -> L91
            android.net.Uri r0 = r0.A00     // Catch: java.lang.Throwable -> L91
            java.io.InputStream r5 = r7.AjT()     // Catch: java.lang.Throwable -> L91
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8e
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = java.lang.Integer.toHexString(r0)     // Catch: java.lang.Throwable -> L8e
            X.1Gv r0 = X.C2UZ.A00(r6)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.CKd(r1)     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L83
            X.1Gv r0 = X.C2UZ.A00(r6)     // Catch: java.lang.Throwable -> L8e
            X.2oG r4 = r0.ARB(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r4.A00     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L83
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r0]     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
        L41:
            int r2 = r5.read(r3)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
            r0 = -1
            if (r2 == r0) goto L53
            java.lang.Object r1 = r4.A00()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
            X.3Ii r1 = (X.AbstractC71443Ii) r1     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
            r0 = 0
            r1.write(r3, r0, r2)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
            goto L41
        L53:
            r5.close()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
            java.lang.Object r0 = r4.A00()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
            X.3Ii r0 = (X.AbstractC71443Ii) r0     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
            r0.A03()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L78
            java.lang.Object r0 = r4.A00()     // Catch: java.lang.Throwable -> L8e
            X.3Ii r0 = (X.AbstractC71443Ii) r0     // Catch: java.lang.Throwable -> L8e
            goto L74
        L66:
            r2 = move-exception
            java.lang.String r1 = "IgVideoSubtitleCache"
            java.lang.String r0 = "failed to add subtitle to cache"
            X.C0w9.A06(r1, r0, r2)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.A00()     // Catch: java.lang.Throwable -> L8e
            X.3Ii r0 = (X.AbstractC71443Ii) r0     // Catch: java.lang.Throwable -> L8e
        L74:
            r0.A02()     // Catch: java.lang.Throwable -> L8e
            goto L83
        L78:
            r1 = move-exception
            java.lang.Object r0 = r4.A00()     // Catch: java.lang.Throwable -> L8e
            X.3Ii r0 = (X.AbstractC71443Ii) r0     // Catch: java.lang.Throwable -> L8e
            r0.A02()     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L83:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L91
            X.1um r2 = new X.1um     // Catch: java.lang.Throwable -> L91
            r2.<init>()     // Catch: java.lang.Throwable -> L91
            r0 = 200(0xc8, float:2.8E-43)
            r2.mStatusCode = r0     // Catch: java.lang.Throwable -> L91
            goto Lc1
        L8e:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L91
        L91:
            r1 = move-exception
            goto Lc8
        L93:
            X.3JY r9 = (X.C3JY) r9
            X.1Qd r7 = r9.A00()
            r0 = 0
            X.TFD r2 = new X.TFD     // Catch: java.lang.Throwable -> Lc5
            r2.<init>()     // Catch: java.lang.Throwable -> Lc5
            if (r7 == 0) goto La9
            java.io.InputStream r0 = r7.AjT()     // Catch: java.lang.Throwable -> Lc5
            byte[] r0 = com.instagram.react.modules.base.IgNetworkingModule.inputStreamToByteArray(r0)     // Catch: java.lang.Throwable -> Lc5
        La9:
            r2.A01 = r0     // Catch: java.lang.Throwable -> Lc5
            int r0 = r9.A02     // Catch: java.lang.Throwable -> Lc5
            r2.A00 = r0     // Catch: java.lang.Throwable -> Lc5
            java.util.List r1 = r9.A04     // Catch: java.lang.Throwable -> Lc5
            int r0 = r1.size()     // Catch: java.lang.Throwable -> Lc5
            X.1El[] r0 = new X.C23781El[r0]     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.Throwable -> Lc5
            X.1El[] r0 = (X.C23781El[]) r0     // Catch: java.lang.Throwable -> Lc5
            r2.A02 = r0     // Catch: java.lang.Throwable -> Lc5
            if (r7 == 0) goto Lc4
        Lc1:
            r7.close()
        Lc4:
            return r2
        Lc5:
            r1 = move-exception
            if (r7 == 0) goto Ld0
        Lc8:
            r7.close()     // Catch: java.lang.Throwable -> Lcc
            throw r1
        Lcc:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)
        Ld0:
            throw r1
        Ld1:
            X.C14360o3.A0A(r9)
            goto Ld9
        Ld5:
            r0 = 0
            X.C14360o3.A0B(r9, r0)
        Ld9:
            java.lang.Object r0 = r8.A01
            X.1OK r0 = (X.C1OK) r0
            X.1OL r1 = r0.A00
            X.1Ql r0 = new X.1Ql
            r0.<init>(r1)
            java.lang.Object r2 = r0.then(r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TG6.then(java.lang.Object):java.lang.Object");
    }
}
