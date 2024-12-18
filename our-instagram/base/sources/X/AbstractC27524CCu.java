package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;

/* renamed from: X.CCu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27524CCu {
    public static final void A00(C5Tl c5Tl, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        Object c26179Bi4;
        C14360o3.A0B(str, 0);
        AbstractC167007dF.A1E(str2, 2, interfaceC16660sJ);
        c5Tl.Enr(-1540499588);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2108599800, "com.instagram.aistudio.editor.CustomAiCreationScreen (CustomAiCreationScreen.kt:34)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -819062277);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C15370ps A1F = AbstractC25225BEi.A1F();
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -819060324);
            if (A0q2 == obj) {
                if (str.length() <= i) {
                    c26179Bi4 = C29183Cto.A00;
                } else {
                    c26179Bi4 = new C26179Bi4(str2);
                }
                A0q2 = AbstractC25232BEp.A0w(c5Tl, c26179Bi4);
            }
            C117505Tk.A0L(A0K, false);
            A1F.A00 = A0q2;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC28285CdX.A02(c5Tl, C30711Df9.A00(c1130158n, C5XU.A00, 0)), 0.0f, 0.0f, 0.0f, 40.0f);
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
            AbstractC28504Chx.A0A(c5Tl, EnumC27362C5r.A03, null, C5YD.A00(c5Tl, 2131964732), 384, 4090);
            String A002 = C5YD.A00(c5Tl, 2131964731);
            Modifier A0X = AbstractC25230BEn.A0X(AbstractC118175Wb.A0E(c1130158n, 0.0f, 24.0f, 0.0f, 0.0f), c25338BJh);
            int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(A0u), A0u, 36605486574015766L);
            int A072 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(A0u), A0u, 36605486574015766L);
            AbstractC28505Chy.A04(c5Tl, A0X, (InterfaceC30801Dgc) AbstractC25226BEj.A1A(A1F.A00), true, Integer.valueOf(i), str, A002, new C43815JZc(A1F, interfaceC16660sJ, str2, i, 2), A07, A072, i3 & 14, ((i3 << 3) & 896) | 48, 59264);
            c5Tl.ASW();
            c5Tl.Eno(-819010164);
            boolean A1R = AbstractC25232BEp.A1R(i3 & 57344);
            Object EEc = c5Tl.EEc();
            if (A1R || EEc == obj) {
                EEc = new PYw(c25338BJh, null, 5, z);
                c5Tl.FBy(EEc);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc, true, false)) {
                C0fH.A00(329029263);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT8(str, str2, interfaceC16660sJ, i, i2, z);
        }
    }
}
