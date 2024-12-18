package X;

/* loaded from: classes11.dex */
public final class U4I {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final String A05;
    public final /* synthetic */ U3t A06;

    public U4I(U3t u3t, String str, long j) {
        this.A06 = u3t;
        if (j < 0) {
            U3t.A04(u3t, AnonymousClass001.A0R("Negative Cache Recency Threshold Entered For Query: ", str));
        }
        u3t.A0C.add(str);
        u3t.CnS(AnonymousClass001.A0R("recency_threshold_for_", str), j);
        this.A05 = str;
        this.A00 = C05F.A00;
        this.A04 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r5.A01 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.A00
            int r4 = r0.intValue()
            r0 = 3
            java.lang.String r3 = "CACHE"
            java.lang.String r2 = "ttrc_source_for_"
            if (r4 == r0) goto L36
            r0 = 2
            if (r4 == r0) goto L31
            X.U3t r2 = r5.A06
            java.lang.String r1 = "Unexpected call to addSourceAnnotation in state "
            if (r4 == 0) goto L2e
            java.lang.String r0 = "CACHE_NOT_APPLICABLE_NETWORK_PENDING"
        L18:
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            X.U3t.A04(r2, r0)
        L1f:
            X.U3t r2 = r5.A06
            java.lang.String r1 = "prefetched_data_for_"
            java.lang.String r0 = r5.A05
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            r0 = 0
            r2.CnU(r1, r0)
            return
        L2e:
            java.lang.String r0 = "CACHE_AND_NETWORK_PENDING"
            goto L18
        L31:
            boolean r0 = r5.A01
            if (r0 != 0) goto L1f
            goto L3e
        L36:
            boolean r0 = r5.A03
            if (r0 == 0) goto L4a
            boolean r0 = r5.A02
            if (r0 != 0) goto L4a
        L3e:
            X.U3t r1 = r5.A06
            java.lang.String r0 = r5.A05
            java.lang.String r0 = X.AnonymousClass001.A0R(r2, r0)
        L46:
            r1.CnT(r0, r3)
            goto L1f
        L4a:
            X.U3t r1 = r5.A06
            java.lang.String r0 = r5.A05
            java.lang.String r0 = X.AnonymousClass001.A0R(r2, r0)
            java.lang.String r3 = "NETWORK"
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U4I.A00():void");
    }

    public U4I(U3t u3t, String str) {
        this.A06 = u3t;
        this.A05 = str;
        this.A00 = C05F.A01;
        this.A04 = -1L;
        u3t.A0D.add(str);
    }
}
