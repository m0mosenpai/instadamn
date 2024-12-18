package X;

/* renamed from: X.Lav, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48381Lav implements C6D2 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6JY A01;
    public final /* synthetic */ C2EY A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    public /* synthetic */ C48381Lav(C6JY c6jy, C2EY c2ey, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01 = c6jy;
        this.A02 = c2ey;
        this.A03 = num;
        this.A04 = num2;
        this.A00 = j;
        this.A0B = z;
        this.A06 = l;
        this.A09 = str;
        this.A0A = str2;
        this.A05 = l2;
        this.A07 = str3;
        this.A08 = str4;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        final C6JY c6jy = this.A01;
        final C2EY c2ey = this.A02;
        final Integer num = this.A03;
        final Integer num2 = this.A04;
        final long j = this.A00;
        final boolean z = this.A0B;
        final Long l = this.A06;
        final String str = this.A09;
        final String str2 = this.A0A;
        final Long l2 = this.A05;
        final String str3 = this.A07;
        final String str4 = this.A08;
        final C1345666g c1345666g = (C1345666g) obj;
        return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcS
            /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
            @Override // X.InterfaceC1345866i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void EpD(X.C1346766r r29) {
                /*
                    r28 = this;
                    r2 = r28
                    X.6JY r11 = r2
                    X.2EY r13 = r3
                    java.lang.Integer r4 = r4
                    java.lang.Integer r3 = r5
                    X.66g r15 = r1
                    long r0 = r12
                    r24 = 0
                    boolean r12 = r14
                    java.lang.Long r10 = r6
                    java.lang.String r8 = r8
                    java.lang.String r9 = r9
                    java.lang.Long r7 = r7
                    java.lang.String r6 = r10
                    java.lang.String r5 = r11
                    r2 = 0
                    X.KoD r14 = X.AbstractC46870KoD.$redex_init_class
                    int r14 = r13.ordinal()
                    switch(r14) {
                        case 15: goto Lb7;
                        case 18: goto Lb7;
                        case 19: goto Lb7;
                        case 28: goto Lba;
                        case 29: goto Lba;
                        case 46: goto Lbd;
                        case 49: goto Lbd;
                        default: goto L28;
                    }
                L28:
                    r19 = 0
                L2a:
                    switch(r14) {
                        case 15: goto Lb0;
                        case 18: goto Lb0;
                        case 19: goto Lb0;
                        case 28: goto Lb0;
                        case 29: goto Lb0;
                        case 46: goto Lb0;
                        case 49: goto Lb0;
                        default: goto L2d;
                    }
                L2d:
                    r17 = 0
                L2f:
                    if (r4 == 0) goto L38
                    int r4 = r4.intValue()
                    switch(r4) {
                        case 0: goto L98;
                        case 1: goto L9e;
                        case 2: goto L9b;
                        case 3: goto Lad;
                        case 4: goto Laa;
                        case 5: goto La7;
                        case 6: goto La4;
                        case 7: goto La1;
                        default: goto L38;
                    }
                L38:
                    X.KdV r4 = X.EnumC46253KdV.A0W
                L3a:
                    X.KdW r13 = X.EnumC46254KdW.A0d
                    if (r3 == 0) goto L4c
                    int r3 = r3.intValue()
                    if (r3 == r2) goto L95
                    r2 = 1
                    if (r3 == r2) goto L92
                    r2 = 2
                    if (r3 != r2) goto Lc5
                    X.KdW r13 = X.EnumC46254KdW.A05
                L4c:
                    com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r13)
                    X.C14360o3.A07(r2)
                    X.JuZ r2 = X.AbstractC46871KoE.A00(r4, r2)
                    com.instagram.common.session.UserSession r3 = r11.A03
                    r16 = r3
                    r18 = r24
                    r20 = r24
                    r21 = r10
                    r22 = r24
                    r23 = r12
                    java.lang.String r19 = X.AbstractC46872KoF.A00(r16, r17, r18, r19, r20, r21, r22, r23)
                    if (r9 == 0) goto L8f
                    java.lang.Long r17 = X.AbstractC25228BEl.A13(r9)
                L6f:
                    org.json.JSONObject r2 = r2.A00
                    java.lang.String r23 = r2.toString()
                    r3 = 3
                    X.JVL r2 = new X.JVL
                    r4 = r29
                    r2.<init>(r4, r3)
                    r25 = r0
                    r27 = r12
                    r20 = r8
                    r21 = r6
                    r22 = r5
                    r18 = r7
                    r16 = r2
                    r15.A02(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27)
                    return
                L8f:
                    r17 = 0
                    goto L6f
                L92:
                    X.KdW r13 = X.EnumC46254KdW.A0Q
                    goto L4c
                L95:
                    X.KdW r13 = X.EnumC46254KdW.A07
                    goto L4c
                L98:
                    X.KdV r4 = X.EnumC46253KdV.A0L
                    goto L3a
                L9b:
                    X.KdV r4 = X.EnumC46253KdV.A0H
                    goto L3a
                L9e:
                    X.KdV r4 = X.EnumC46253KdV.A0M
                    goto L3a
                La1:
                    X.KdV r4 = X.EnumC46253KdV.A0F
                    goto L3a
                La4:
                    X.KdV r4 = X.EnumC46253KdV.A0G
                    goto L3a
                La7:
                    X.KdV r4 = X.EnumC46253KdV.A0I
                    goto L3a
                Laa:
                    X.KdV r4 = X.EnumC46253KdV.A0J
                    goto L3a
                Lad:
                    X.KdV r4 = X.EnumC46253KdV.A0K
                    goto L3a
                Lb0:
                    r13 = 7
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r13)
                    goto L2f
                Lb7:
                    r13 = 1011(0x3f3, float:1.417E-42)
                    goto Lbf
                Lba:
                    r13 = 1007(0x3ef, float:1.411E-42)
                    goto Lbf
                Lbd:
                    r13 = 1005(0x3ed, float:1.408E-42)
                Lbf:
                    java.lang.Integer r19 = java.lang.Integer.valueOf(r13)
                    goto L2a
                Lc5:
                    X.B4Z r0 = X.B4Z.A00()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C48475LcS.EpD(X.66r):void");
            }
        }, AbstractC137146It.A00("rxmailbox_send_secure_text_message"));
    }
}
