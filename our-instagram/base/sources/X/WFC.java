package X;

/* loaded from: classes11.dex */
public final class WFC {
    public static final WFC A00 = new Object();

    public static final void A00(C50627MWo c50627MWo, C69285Vkt c69285Vkt, XA7 xa7) {
        AbstractC68953Ver abstractC68953Ver;
        C50525MSe c50525MSe = (C50525MSe) c50627MWo.A00;
        if (c50525MSe.A03) {
            C68952Veq c68952Veq = new C68952Veq(c69285Vkt, xa7);
            C69094Vhk c69094Vhk = c69285Vkt.A01;
            VRO.A00(c69094Vhk, c69094Vhk.A00, "promote_client_token_requested");
            C70187WFq.A00(c69285Vkt.A00, (AbstractC018607g) AbstractC166987dD.A17(c69285Vkt.A04), new C70657Wed(0, c68952Veq, c69285Vkt), c69285Vkt.A02);
            return;
        }
        if (c50525MSe.A00) {
            C14360o3.A0B(xa7, 0);
            abstractC68953Ver = new AbstractC68953Ver(C05F.A00, "");
        } else {
            abstractC68953Ver = V20.A00;
        }
        xa7.Dh1(abstractC68953Ver);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r7 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C50627MWo r8, X.C69285Vkt r9, X.XA7 r10) {
        /*
            X.0do r3 = r9.A03
            java.lang.Object r0 = r3.getValue()
            X.Vb4 r0 = (X.C68725Vb4) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L30
            com.instagram.common.session.UserSession r6 = r9.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317998641846029(0x8107070000170d, double:3.030986809721297E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L34
            r0 = 36317998641977102(0x8107070002170e, double:3.0309868098041883E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L34
            java.lang.Object r0 = r3.getValue()
            X.Vb4 r0 = (X.C68725Vb4) r0
            java.lang.String r7 = r0.A00
            if (r7 != 0) goto L36
        L30:
            A00(r8, r9, r10)
            return
        L34:
            java.lang.String r7 = ""
        L36:
            java.lang.Object r0 = r8.A00
            X.MSe r0 = (X.C50525MSe) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L58
            X.WeD r1 = new X.WeD
            r1.<init>(r8, r9, r10, r7)
            X.WFq r2 = X.C70187WFq.A00
            androidx.fragment.app.FragmentActivity r3 = r9.A00
            X.0do r0 = r9.A04
            java.lang.Object r4 = X.AbstractC166987dD.A17(r0)
            X.07g r4 = (X.AbstractC018607g) r4
            X.Wej r5 = new X.Wej
            r5.<init>(r1)
            r2.A04(r3, r4, r5, r6, r7)
            return
        L58:
            A02(r8, r10, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFC.A01(X.MWo, X.Vkt, X.XA7):void");
    }

    public static final void A02(C50627MWo c50627MWo, XA7 xa7, String str) {
        AbstractC68953Ver abstractC68953Ver;
        Number number = (Number) c50627MWo.A01;
        boolean A1R = AbstractC167007dF.A1R(0, number, str);
        int intValue = number.intValue();
        if (intValue != 0) {
            if (intValue == A1R) {
                abstractC68953Ver = V20.A00;
            } else {
                throw new RuntimeException();
            }
        } else {
            abstractC68953Ver = new AbstractC68953Ver(C05F.A00, str);
        }
        xa7.Dh1(abstractC68953Ver);
    }
}
