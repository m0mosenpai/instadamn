package X;

/* loaded from: classes8.dex */
public final class MM1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C47976LIn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MM1(C47976LIn c47976LIn, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        super(2);
        this.A00 = c47976LIn;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00eb, code lost:
    
        if (r2.equals(r4) != false) goto L13;
     */
    @Override // X.InterfaceC16620sF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
        /*
            r25 = this;
            r0 = r26
            X.0ll r0 = (X.AbstractC12990ll) r0
            boolean r7 = X.AbstractC166987dD.A1a(r27)
            r9 = 0
            X.C14360o3.A0B(r0, r9)
            r8 = r25
            boolean r6 = r8.A06
            java.lang.String r5 = r8.A04
            java.lang.String r12 = r8.A03
            java.lang.String r4 = r8.A01
            boolean r11 = r8.A05
            X.60H r13 = new X.60H
            r13.<init>(r0)
            org.json.JSONObject r3 = X.AbstractC31171DnF.A0q()
            X.60I r2 = X.C60H.A02
            java.lang.String r0 = "is_vanish_mode"
            r2.A01(r0, r3, r6)
            java.lang.String r1 = "save_type"
            r3.put(r1, r5)     // Catch: org.json.JSONException -> L2e
            goto L3d
        L2e:
            r0 = 3500(0xdac, float:4.905E-42)
            java.lang.String r10 = X.AbstractC111324zv.A00(r0)
            r0 = 3619(0xe23, float:5.071E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C0K8.A0C(r10, r0)
        L3d:
            java.lang.Boolean r14 = X.AbstractC166997dE.A0b()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r11)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r6)
            java.lang.String r18 = "ARMADILLO_NOTIFICATIONS_MESSAGE_SAVED"
            r17 = 0
            java.lang.String r0 = "is_bg_account"
            r2.A01(r0, r3, r7)
            java.lang.String r10 = "skips_sync"
            r2.A01(r10, r3, r9)
            java.lang.String r21 = r3.toString()
            r19 = r17
            r20 = r17
            r22 = r17
            r23 = r4
            r24 = r12
            X.C60H.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.LIn r2 = r8.A00
            com.instagram.common.session.UserSession r2 = r2.A00
            X.5ya r9 = X.C60J.A00(r2)
            java.lang.String r8 = r8.A02
            r12 = r7 ^ 1
            java.lang.String r7 = X.C60J.A02(r11, r6)
            X.5yb r3 = r9.A02
            boolean r2 = r3.A06
            if (r2 == 0) goto L9f
            if (r4 == 0) goto L9f
            boolean r2 = r3.A03
            if (r2 == 0) goto L9f
            java.lang.String r2 = r3.A01
            if (r2 != 0) goto Le7
            r3.A01 = r4
        L8a:
            com.facebook.quicklog.reliability.UserFlowLogger r10 = r3.A05
            long r2 = r3.A04
            X.9C9 r6 = X.C132525yb.A0A
            java.lang.String r4 = r6.A01
            r10.flowMarkPoint(r2, r4)
            r10.flowAnnotate(r2, r1, r5)
            java.lang.String r6 = r6.A00
            java.lang.String r4 = "c"
            r10.flowAnnotateWithCrucialData(r2, r4, r6)
        L9f:
            X.5yd r4 = r9.A01
            boolean r2 = r4.A01
            if (r2 == 0) goto Le1
            if (r8 == 0) goto Le1
            java.lang.Long r2 = X.C132545yd.A00(r4, r8)
            if (r2 == 0) goto Le1
            long r2 = r2.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r6 = r4.A00
            X.9C9 r8 = X.C132545yd.A05
            java.lang.String r4 = r8.A01
            r6.flowMarkPoint(r2, r4)
            r4 = r12 ^ 1
            if (r4 == 0) goto Le4
            java.lang.String r4 = "1"
        Lc0:
            r6.flowAnnotateWithCrucialData(r2, r0, r4)
            java.lang.String r4 = "ae"
            java.lang.String r0 = "1"
            r6.flowAnnotateWithCrucialData(r2, r4, r0)
            if (r7 == 0) goto Ld7
            int r0 = r7.length()
            if (r0 == 0) goto Ld7
            java.lang.String r0 = "feature_tags"
            r6.flowAnnotate(r2, r0, r7)
        Ld7:
            r6.flowAnnotate(r2, r1, r5)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "c"
            r6.flowAnnotateWithCrucialData(r2, r0, r1)
        Le1:
            X.0eB r0 = X.C0eB.A00
            return r0
        Le4:
            java.lang.String r4 = "0"
            goto Lc0
        Le7:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L9f
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MM1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
