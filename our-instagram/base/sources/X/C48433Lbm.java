package X;

/* renamed from: X.Lbm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48433Lbm implements C6D2 {
    public final /* synthetic */ C137766Ly A00;

    public /* synthetic */ C48433Lbm(C137766Ly c137766Ly) {
        this.A00 = c137766Ly;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0021, code lost:
    
        if (r10 != null) goto L9;
     */
    @Override // X.C6D2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r10) {
        /*
            r9 = this;
            X.6Ly r7 = r9.A00
            java.lang.String r10 = (java.lang.String) r10
            X.6In r8 = r7.A0G
            java.lang.String r2 = r8.A00(r10)
            if (r2 == 0) goto L21
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            java.util.HashMap r1 = r8.A00
            java.lang.String r0 = X.LHB.A01(r10)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L23
            X.1xC r0 = X.C42221xC.A09(r2)
            return r0
        L21:
            if (r10 == 0) goto L87
        L23:
            int r0 = r10.length()
            if (r0 == 0) goto L87
            r4 = 0
            android.net.Uri r3 = X.AbstractC25227BEk.A0B(r10)
            r2 = 0
            java.util.List r1 = r3.getPathSegments()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L46
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.NumberFormatException -> L46
            X.C14360o3.A07(r0)     // Catch: java.lang.NumberFormatException -> L46
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L46
            java.lang.Long r4 = X.AbstractC25228BEl.A13(r0)     // Catch: java.lang.NumberFormatException -> L46
        L46:
            java.util.List r0 = r3.getPathSegments()
            int r0 = r0.size()
            r6 = 2
            if (r0 >= r6) goto L7d
            r5 = 0
        L52:
            if (r4 == 0) goto L87
            if (r5 == 0) goto L87
            r8.A01(r10)
            long r2 = r4.longValue()
            X.1xC r4 = r7.A0B
            r1 = 1
            X.JRU r0 = new X.JRU
            r0.<init>(r2, r5, r1)
            X.1xC r1 = r4.A0L(r0)
            X.LaZ r0 = new X.LaZ
            r0.<init>(r10, r7, r6)
            X.1xC r1 = r1.A0J(r0)
            java.lang.String r0 = "rxmailbox_load_media_from_msys_media_cache"
            X.5Fn r0 = X.AbstractC137146It.A00(r0)
            X.1xC r0 = r1.A0N(r0)
            return r0
        L7d:
            java.util.List r1 = r3.getPathSegments()
            r0 = 1
            java.lang.String r5 = X.AbstractC25226BEj.A1I(r1, r0)
            goto L52
        L87:
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            java.util.HashMap r0 = r8.A01
            r0.remove(r10)
            java.lang.String r0 = ""
            X.1xC r0 = X.C42221xC.A09(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48433Lbm.apply(java.lang.Object):java.lang.Object");
    }

    public static C42221xC A00(C137766Ly c137766Ly, Object obj) {
        return C42221xC.A09(obj).A0J(new C48433Lbm(c137766Ly));
    }
}
