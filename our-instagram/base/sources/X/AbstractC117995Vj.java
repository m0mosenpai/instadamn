package X;

/* renamed from: X.5Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117995Vj {
    public static final void A00(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        C14360o3.A0B(interfaceC16620sF, 0);
        c5Tl.Enr(939159614);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-401990321, "com.instagram.compose.igds.theme.IgdsTheme (IgdsTheme.kt:26)");
            }
            A01(c5Tl, interfaceC16620sF, ((i2 << 3) & 112) | 6, false);
            if (C0fH.A02()) {
                C0fH.A00(-466918504);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30499Dbi(interfaceC16620sF, i, 34);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r10 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r7, X.InterfaceC16620sF r8, int r9, boolean r10) {
        /*
            r0 = 1
            X.C14360o3.A0B(r8, r0)
            r0 = 1606271130(0x5fbdc09a, float:2.7346196E19)
            r7.Enr(r0)
            r0 = r9 & 6
            if (r0 != 0) goto Lcc
            boolean r0 = r7.AH5(r10)
            r2 = 2
            if (r0 == 0) goto L16
            r2 = 4
        L16:
            r2 = r2 | r9
        L17:
            r0 = r9 & 48
            if (r0 != 0) goto L26
            boolean r1 = r7.AH6(r8)
            r0 = 16
            if (r1 == 0) goto L25
            r0 = 32
        L25:
            r2 = r2 | r0
        L26:
            r1 = r2 & 19
            r0 = 18
            if (r1 != r0) goto L43
            boolean r0 = r7.Bxj()
            if (r0 == 0) goto L43
            r7.Em9()
        L35:
            X.5UU r1 = r7.ASZ()
            if (r1 == 0) goto L42
            X.5Yw r0 = new X.5Yw
            r0.<init>(r8, r9, r10)
            r1.A06 = r0
        L42:
            return
        L43:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L51
            r1 = -57369537(0xfffffffffc949c3f, float:-6.173032E36)
            java.lang.String r0 = "com.instagram.compose.igds.theme.IgdsTheme (IgdsTheme.kt:29)"
            X.C0fH.A01(r1, r0)
        L51:
            boolean r0 = X.AbstractC118005Vk.A00(r7)
            if (r0 != 0) goto L5a
            r5 = 0
            if (r10 == 0) goto L5b
        L5a:
            r5 = 1
        L5b:
            boolean r0 = X.C14640oc.A07()
            if (r0 == 0) goto Lc4
            if (r5 == 0) goto Lc1
            X.5Vo r3 = X.AbstractC119555bD.A00
        L65:
            long r0 = r3.A0S
            X.5Vp r2 = new X.5Vp
            r2.<init>(r0)
            boolean r0 = X.C14640oc.A0F()
            if (r0 == 0) goto Lbe
            X.5W6 r1 = X.CMR.A00
        L74:
            X.5UP r0 = X.C5W7.A00
            X.5Ud r6 = r0.A02(r3)
            X.5UP r0 = X.C5W9.A00
            X.5Ud r4 = r0.A02(r1)
            X.5UP r1 = X.C5WB.A00
            X.5WL r0 = X.C5WD.A00
            X.5Ud r3 = r1.A02(r0)
            X.5UP r0 = X.C5WM.A00
            X.5Ud r2 = r0.A02(r2)
            X.5UP r1 = X.C5WO.A00
            X.5WQ r0 = new X.5WQ
            r0.<init>(r5)
            X.5Ud r0 = r1.A02(r0)
            X.5Ud[] r3 = new X.C117685Ud[]{r6, r4, r3, r2, r0}
            r2 = 401118554(0x17e8955a, float:1.503035E-24)
            r1 = 15
            X.9Ed r0 = new X.9Ed
            r0.<init>(r8, r1)
            X.5TR r1 = X.C5UA.A01(r7, r0, r2)
            r0 = 56
            X.AbstractC117695Ue.A01(r7, r1, r3, r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L35
            r0 = -1486050659(0xffffffffa76caa9d, float:-3.2844069E-15)
            X.C0fH.A00(r0)
            goto L35
        Lbe:
            X.5W6 r1 = X.AbstractC118085Vs.A00
            goto L74
        Lc1:
            X.5Vo r3 = X.AbstractC118015Vl.A00
            goto L65
        Lc4:
            if (r5 == 0) goto Lc9
            X.5Vo r3 = X.AbstractC121705fN.A00
            goto L65
        Lc9:
            X.5Vo r3 = X.BJN.A00
            goto L65
        Lcc:
            r2 = r9
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC117995Vj.A01(X.5Tl, X.0sF, int, boolean):void");
    }
}
