package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CH1 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C60 c60, int i, int i2) {
        int i3;
        C1132359l[] c1132359lArr;
        long A0J;
        C14360o3.A0B(c60, 0);
        c5Tl.Enr(-824582938);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c60) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-2058807228, "com.instagram.creation.genai.common.ui.CreationGenAILegibilityGradient (CreationGenAIScreenLegibilityGradient.kt:28)");
            }
            int ordinal = c60.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    c5Tl.Eno(-1217193758);
                    c1132359lArr = new C1132359l[2];
                    c1132359lArr[0] = AbstractC25225BEi.A0S(AbstractC25226BEj.A0J(c5Tl));
                    A0J = C5XL.A00(c5Tl).A0X;
                } else {
                    throw AbstractC25233BEq.A0r(c5Tl, -1217202523);
                }
            } else {
                c5Tl.Eno(-1217199678);
                c1132359lArr = new C1132359l[2];
                c1132359lArr[0] = AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0X);
                A0J = AbstractC25226BEj.A0J(c5Tl);
            }
            c1132359lArr[1] = AbstractC25225BEi.A0S(A0J);
            C25766Ba5 A0L = AbstractC25236BEt.A0L(AbstractC16960so.A1Q(c1132359lArr));
            AbstractC25225BEi.A1V(c5Tl, false);
            if (AbstractC25227BEk.A1X(c5Tl, C6L3.A00(AbstractC25228BEl.A0W().Eq3(modifier), A0L, C5AF.A00))) {
                C0fH.A00(-1261660529);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(c60, modifier, i2, i, 29);
        }
    }
}
