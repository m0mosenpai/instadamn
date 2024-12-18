package X;

/* renamed from: X.Cn8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28776Cn8 implements InterfaceC31064Dl6 {
    public final /* synthetic */ BXF A00;

    @Override // X.InterfaceC31064Dl6
    public final void DBe(long j) {
    }

    @Override // X.InterfaceC31064Dl6
    public final void Dwm() {
    }

    public C28776Cn8(BXF bxf) {
        this.A00 = bxf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (X.AbstractC28014CWm.A01(r6, false) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (X.AbstractC28014CWm.A01(r6, true) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r7 = this;
            X.BXF r6 = r7.A00
            r1 = 0
            X.3Yl r0 = r6.A0H
            r0.Egh(r1)
            X.3Yl r0 = r6.A0G
            r0.Egh(r1)
            r5 = 1
            X.BXF.A05(r6, r5)
            r6.A0B = r1
            X.3Yl r0 = r6.A0K
            long r0 = X.AbstractC25228BEl.A0G(r0)
            boolean r4 = X.C5C2.A03(r0)
            if (r4 == 0) goto L5f
            X.C5m r0 = X.EnumC27357C5m.Cursor
        L21:
            X.BXF.A01(r0, r6)
            X.CWQ r2 = r6.A03
            r3 = 0
            if (r2 == 0) goto L38
            if (r4 != 0) goto L32
            boolean r0 = X.AbstractC28014CWm.A01(r6, r5)
            r1 = 1
            if (r0 != 0) goto L33
        L32:
            r1 = 0
        L33:
            X.3Yl r0 = r2.A0I
            X.AbstractC25227BEk.A1A(r0, r1)
        L38:
            X.CWQ r2 = r6.A03
            if (r2 == 0) goto L4b
            if (r4 != 0) goto L45
            boolean r0 = X.AbstractC28014CWm.A01(r6, r3)
            r1 = 1
            if (r0 != 0) goto L46
        L45:
            r1 = 0
        L46:
            X.3Yl r0 = r2.A0H
            X.AbstractC25227BEk.A1A(r0, r1)
        L4b:
            X.CWQ r1 = r6.A03
            if (r1 == 0) goto L5c
            if (r4 == 0) goto L5d
            boolean r0 = X.AbstractC28014CWm.A01(r6, r5)
            if (r0 == 0) goto L5d
        L57:
            X.3Yl r0 = r1.A0F
            X.AbstractC25227BEk.A1A(r0, r5)
        L5c:
            return
        L5d:
            r5 = 0
            goto L57
        L5f:
            X.C5m r0 = X.EnumC27357C5m.Selection
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28776Cn8.A00():void");
    }

    @Override // X.InterfaceC31064Dl6
    public final void DBw(long j) {
        C28262Cd7 A00;
        int A01;
        C5C3 A0i;
        long A08;
        InterfaceC31099Dlh interfaceC31099Dlh;
        BXF bxf = this.A00;
        if (AbstractC25230BEn.A1X(bxf.A0J)) {
            InterfaceC74953Yl interfaceC74953Yl = bxf.A0K;
            if (AbstractC25233BEq.A03(interfaceC74953Yl) != 0) {
                bxf.A02 = C119365at.A07(bxf.A02, j);
                CWQ cwq = bxf.A03;
                if (cwq != null && (A00 = cwq.A00()) != null) {
                    C119365at A0R = AbstractC25225BEi.A0R(C119365at.A07(bxf.A01, bxf.A02));
                    InterfaceC74953Yl interfaceC74953Yl2 = bxf.A0G;
                    interfaceC74953Yl2.Egh(A0R);
                    if (bxf.A0B == null && !A00.A03(AbstractC25235BEs.A08(interfaceC74953Yl2))) {
                        if (bxf.A08.F8T(A00.A01(bxf.A01, true)) == bxf.A08.F8T(A00.A01(AbstractC25235BEs.A08(interfaceC74953Yl2), true))) {
                            interfaceC31099Dlh = C28157Cb4.A01;
                        } else {
                            interfaceC31099Dlh = C28157Cb4.A03;
                        }
                        A0i = AbstractC25226BEj.A0i(interfaceC74953Yl);
                        A08 = AbstractC25235BEs.A08(interfaceC74953Yl2);
                    } else {
                        Integer num = bxf.A0B;
                        if (num != null) {
                            A01 = num.intValue();
                        } else {
                            A01 = A00.A01(bxf.A01, false);
                        }
                        int A012 = A00.A01(AbstractC25235BEs.A08(interfaceC74953Yl2), false);
                        if (bxf.A0B == null && A01 == A012) {
                            return;
                        }
                        A0i = AbstractC25226BEj.A0i(interfaceC74953Yl);
                        A08 = AbstractC25235BEs.A08(interfaceC74953Yl2);
                        interfaceC31099Dlh = C28157Cb4.A03;
                    }
                    BXF.A00(interfaceC31099Dlh, bxf, A0i, A08, false, false, true);
                }
                BXF.A05(bxf, false);
            }
        }
    }

    @Override // X.InterfaceC31064Dl6
    public final void Dnv(long j) {
        C28262Cd7 A00;
        C28262Cd7 A002;
        BXF bxf = this.A00;
        if (AbstractC25230BEn.A1X(bxf.A0J)) {
            InterfaceC74953Yl interfaceC74953Yl = bxf.A0H;
            if (interfaceC74953Yl.getValue() == null) {
                interfaceC74953Yl.Egh(EnumC27356C5l.SelectionEnd);
                bxf.A00 = -1;
                bxf.A08();
                CWQ cwq = bxf.A03;
                if (cwq != null && (A002 = cwq.A00()) != null && A002.A03(j)) {
                    InterfaceC74953Yl interfaceC74953Yl2 = bxf.A0K;
                    if (AbstractC25233BEq.A03(interfaceC74953Yl2) != 0) {
                        bxf.A0E(false);
                        C5C3 A0i = AbstractC25226BEj.A0i(interfaceC74953Yl2);
                        bxf.A0B = Integer.valueOf(AbstractC25225BEi.A06(BXF.A00(C28157Cb4.A03, bxf, new C5C3(A0i.A01, A0i.A02, C5C2.A01), j, true, false, true)));
                    } else {
                        return;
                    }
                } else {
                    CWQ cwq2 = bxf.A03;
                    if (cwq2 != null && (A00 = cwq2.A00()) != null) {
                        int F8T = bxf.A08.F8T(A00.A01(j, true));
                        C5C3 c5c3 = new C5C3(AbstractC25226BEj.A0i(bxf.A0K).A01, null, C60Z.A00(F8T, F8T));
                        bxf.A0E(false);
                        C5DP c5dp = bxf.A05;
                        if (c5dp != null) {
                            ((C5DO) c5dp).A00.performHapticFeedback(9);
                        }
                        bxf.A0C.invoke(c5c3);
                    }
                }
                BXF.A01(EnumC27357C5m.None, bxf);
                BXF.A03(bxf, j);
            }
        }
    }

    @Override // X.InterfaceC31064Dl6
    public final void onCancel() {
        A00();
    }

    @Override // X.InterfaceC31064Dl6
    public final void onStop() {
        A00();
    }
}
