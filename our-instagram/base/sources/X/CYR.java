package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CYR {
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r12, androidx.compose.ui.Modifier r13, X.C50627MWo r14, X.BP5 r15, X.InterfaceC16620sF r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYR.A00(X.5Tl, androidx.compose.ui.Modifier, X.MWo, X.BP5, X.0sF, int, int):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, BP5 bp5, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1K(str, bp5);
        c5Tl.Enr(-96976710);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, bp5);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(365036361, "com.instagram.creator.agent.settings.content.sources.fragment.YourInstagramContent (YourInstagramContentScreen.kt:35)");
            }
            C27015Bvu c27015Bvu = new C27015Bvu(AbstractC25228BEl.A0u(c5Tl), str);
            InterfaceC018407e A0V = AbstractC25235BEs.A0V(c5Tl);
            if (A0V != null) {
                AbstractC52972be A0O = AbstractC25236BEt.A0O(A0V);
                c5Tl.Enp(-1439476281);
                AbstractC52922bZ A00 = AbstractC27490CBl.A00(c27015Bvu, A0V, A0O, C26908BuB.class, "content_view_model");
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                C117505Tk.A0L(A0K, false);
                C26908BuB c26908BuB = (C26908BuB) A00;
                C0eB c0eB = C0eB.A00;
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26908BuB, -522140811);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = AbstractC25235BEs.A0u(c5Tl, c26908BuB, 18);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc, c0eB, false);
                C50627MWo c50627MWo = (C50627MWo) AbstractC25235BEs.A0l(c5Tl, c26908BuB.A03, 0);
                boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c26908BuB, -522137098);
                Object EEc2 = c5Tl.EEc();
                if (A1Z2 || EEc2 == C5UI.A00) {
                    EEc2 = AbstractC25229BEm.A0s(c5Tl, c26908BuB, 28);
                }
                int i5 = i3 << 3;
                A00(c5Tl, modifier2, c50627MWo, bp5, AbstractC25235BEs.A0w(A0K, EEc2, false), (i5 & 896) | (i5 & 7168), 0);
                if (C0fH.A02()) {
                    C0fH.A00(1224156991);
                }
            } else {
                throw AbstractC25235BEs.A0i();
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30222DTb(bp5, modifier2, str, i2, i, 3);
        }
    }
}
