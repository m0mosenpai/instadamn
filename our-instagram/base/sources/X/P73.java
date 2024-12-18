package X;

import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;

/* loaded from: classes9.dex */
public final class P73 implements InterfaceC55022g1 {
    public final int A00;
    public final Object A01;

    public P73(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC55022g1
    public final void DXC(C125715mI c125715mI) {
        C64742wY c64742wY;
        switch (this.A00) {
            case 0:
                c64742wY = ((P0J) this.A01).A02;
                c64742wY.A02 = c125715mI;
                return;
            case 1:
                c64742wY = ((P0K) this.A01).A01;
                c64742wY.A02 = c125715mI;
                return;
            case 2:
                c64742wY = ((C54685ODl) this.A01).A05;
                c64742wY.A02 = c125715mI;
                return;
            case 3:
                if (c125715mI == null) {
                    return;
                }
                c64742wY = (C64742wY) ((AbstractC52180N7p) this.A01).A05.getValue();
                c64742wY.A02 = c125715mI;
                return;
            case 4:
                c64742wY = ((AdsProductPageFragment) this.A01).A04;
                c64742wY.A02 = c125715mI;
                return;
            case 5:
                if (c125715mI == null) {
                    return;
                }
                c64742wY = (C64742wY) ((HCO) this.A01).A0L.getValue();
                c64742wY.A02 = c125715mI;
                return;
            case 6:
                c64742wY = ((C56049OuO) this.A01).A0K;
                c64742wY.A02 = c125715mI;
                return;
            default:
                c64742wY = ((C54801OJv) this.A01).A02;
                c64742wY.A02 = c125715mI;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // X.InterfaceC55022g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dtj(X.C125715mI r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L2e;
                case 2: goto L1d;
                case 3: goto L84;
                case 4: goto L7b;
                case 5: goto L56;
                case 6: goto L69;
                default: goto L5;
            }
        L5:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.OJv r0 = (X.C54801OJv) r0
            X.2wY r2 = r0.A02
            X.2wi r0 = r0.A01
            if (r0 != 0) goto L9c
            java.lang.String r0 = "quickPromotionDelegate"
        L15:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1d:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.ODl r0 = (X.C54685ODl) r0
            X.2wY r2 = r0.A05
            X.2wi r0 = r0.A01
            if (r0 != 0) goto L9c
            java.lang.String r0 = "quickPromotionPresenter"
            goto L15
        L2e:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.P0K r0 = (X.P0K) r0
            X.2wY r2 = r0.A01
            X.2wi r0 = r0.A00
            goto L51
        L3b:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.lang.Object r3 = r4.A01
            X.P0J r3 = (X.P0J) r3
            com.instagram.common.session.UserSession r1 = r3.A01
            X.Gl9 r0 = X.C37855Gl9.A00
            boolean r0 = r0.A0K(r1)
            if (r0 != 0) goto L9f
            X.2wY r2 = r3.A02
            X.2wi r0 = r3.A00
        L51:
            if (r0 != 0) goto L9c
            java.lang.String r0 = "qpFragmentPresenter"
            goto L15
        L56:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.lang.Object r1 = r4.A01
            X.HCO r1 = (X.HCO) r1
            X.0do r0 = r1.A0L
            java.lang.Object r2 = r0.getValue()
            X.2wY r2 = (X.C64742wY) r2
            X.0do r0 = r1.A0K
            goto L96
        L69:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.OuO r0 = (X.C56049OuO) r0
            X.2wi r1 = r0.A00
            if (r1 == 0) goto L9f
            X.2wY r0 = r0.A0K
            r0.A01(r1, r5)
            return
        L7b:
            java.lang.Object r0 = r4.A01
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = (com.instagram.shopping.fragment.pdp.AdsProductPageFragment) r0
            X.2wY r2 = r0.A04
            X.2wi r0 = r0.A03
            goto L9c
        L84:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.lang.Object r1 = r4.A01
            X.N7p r1 = (X.AbstractC52180N7p) r1
            X.0do r0 = r1.A05
            java.lang.Object r2 = r0.getValue()
            X.2wY r2 = (X.C64742wY) r2
            X.0do r0 = r1.A04
        L96:
            java.lang.Object r0 = r0.getValue()
            X.2ga r0 = (X.AbstractC55352ga) r0
        L9c:
            r2.A01(r0, r5)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P73.Dtj(X.5mI):void");
    }
}
