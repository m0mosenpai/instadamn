package X;

/* loaded from: classes5.dex */
public final class DX1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ InterfaceC30766Dg3 A01;
    public final /* synthetic */ InterfaceC74953Yl A02;
    public final /* synthetic */ InterfaceC74953Yl A03;
    public final /* synthetic */ InterfaceC74963Ym A04;
    public final /* synthetic */ InterfaceC74963Ym A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16620sF A08;
    public final /* synthetic */ InterfaceC16600sD A09;
    public final /* synthetic */ InterfaceC65696TsI A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX1(InterfaceC30766Dg3 interfaceC30766Dg3, InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, Object obj, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, InterfaceC16600sD interfaceC16600sD, InterfaceC65696TsI interfaceC65696TsI, float f, boolean z) {
        super(2);
        this.A01 = interfaceC30766Dg3;
        this.A06 = obj;
        this.A0B = z;
        this.A00 = f;
        this.A04 = interfaceC74963Ym;
        this.A0A = interfaceC65696TsI;
        this.A05 = interfaceC74963Ym2;
        this.A07 = interfaceC16820sZ;
        this.A08 = interfaceC16620sF;
        this.A09 = interfaceC16600sD;
        this.A03 = interfaceC74953Yl;
        this.A02 = interfaceC74953Yl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    @Override // X.InterfaceC16620sF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
        /*
            r24 = this;
            r11 = r25
            X.5Tl r11 = (X.C5Tl) r11
            int r1 = X.AbstractC25228BEl.A0C(r26)
            r0 = 2
            if (r1 != r0) goto L17
            boolean r0 = r11.Bxj()
            if (r0 == 0) goto L17
            r11.Em9()
        L14:
            X.0eB r0 = X.C0eB.A00
            return r0
        L17:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L25
            r1 = 958175472(0x391c98f0, float:1.4934293E-4)
            java.lang.String r0 = "com.instagram.archive.ui.gridItems.<anonymous>.<anonymous> (ArchiveReelComposeFragment.kt:1277)"
            X.C0fH.A01(r1, r0)
        L25:
            r9 = r24
            java.lang.Object r2 = r9.A06
            X.OJ8 r2 = (X.OJ8) r2
            r0 = -1720087696(0xffffffff99798b70, float:-1.29011575E-23)
            r11.Eno(r0)
            com.instagram.model.reels.Reel r10 = r2.A02
            X.1vS r0 = r2.A03
            r1 = 0
            if (r0 == 0) goto Ld5
            X.1qM r6 = r0.A0b
            java.lang.String r14 = r0.A0j
            if (r6 == 0) goto Ld7
            com.instagram.common.typedurl.ImageUrl r0 = r6.A1S()
            if (r0 == 0) goto Ld7
            com.instagram.common.typedurl.SimpleImageUrl r13 = new com.instagram.common.typedurl.SimpleImageUrl
            r13.<init>(r0)
        L49:
            int r8 = r2.A00
            long r0 = r2.A01
            r2 = -1163854827(0xffffffffbaa0fc15, float:-0.0012282158)
            boolean r2 = X.AbstractC25232BEp.A1Z(r11, r10, r14, r2)
            boolean r7 = r9.A0B
            boolean r2 = X.AbstractC25226BEj.A1Y(r11, r7, r2)
            java.lang.Object r15 = r11.EEc()
            if (r2 != 0) goto L64
            java.lang.Object r2 = X.C5UI.A00
            if (r15 != r2) goto L84
        L64:
            X.Pgl r15 = new X.Pgl
            X.3Ym r5 = r9.A05
            X.0sZ r4 = r9.A07
            X.0sF r3 = r9.A08
            X.0sD r2 = r9.A09
            r16 = r5
            r17 = r6
            r18 = r10
            r19 = r14
            r20 = r4
            r21 = r3
            r22 = r2
            r23 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r11.FBy(r15)
        L84:
            X.0sJ r15 = (X.InterfaceC16660sJ) r15
            r6 = r11
            X.5Tk r6 = (X.C117505Tk) r6
            r5 = 0
            X.58n r3 = X.AbstractC25225BEi.A0O(r6)
            float r2 = r9.A00
            androidx.compose.ui.Modifier r10 = X.AbstractC27468CAo.A00(r3, r2, r5)
            r2 = -1163818134(0xffffffffbaa18b6a, float:-0.0012324874)
            r11.Eno(r2)
            X.3Ym r4 = r9.A04
            boolean r2 = r11.AH4(r4)
            java.lang.Object r3 = r11.EEc()
            if (r2 != 0) goto Laa
            java.lang.Object r2 = X.C5UI.A00
            if (r3 != r2) goto Lb2
        Laa:
            X.3Yl r3 = r9.A03
            X.3Yl r2 = r9.A02
            X.DRc r3 = X.C30172DRc.A00(r11, r2, r3, r4, r5)
        Lb2:
            androidx.compose.ui.Modifier r12 = X.AbstractC25233BEq.A0B(r6, r10, r3)
            X.TsI r2 = r9.A0A
            r19 = r5
            r22 = r7
            r20 = r0
            r17 = r8
            r18 = r5
            r16 = r2
            X.AbstractC28499Chs.A06(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22)
            boolean r0 = X.AbstractC25227BEk.A1b(r6, r5)
            if (r0 == 0) goto L14
            r0 = -446909074(0xffffffffe55cb56e, float:-6.5141713E22)
            X.C0fH.A00(r0)
            goto L14
        Ld5:
            r6 = r1
            r14 = r1
        Ld7:
            com.instagram.common.typedurl.SimpleImageUrl r13 = X.AbstractC25225BEi.A0t(r1)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DX1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
