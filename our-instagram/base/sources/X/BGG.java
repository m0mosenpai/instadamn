package X;

import android.graphics.Color;

/* loaded from: classes5.dex */
public abstract class BGG {
    public static final C1132359l A00(C5Tl c5Tl, String str) {
        C117505Tk A0T;
        long j;
        if (AbstractC25227BEk.A1U(c5Tl, 1670646125)) {
            C0fH.A01(2016208652, "com.instagram.newsfeed.compose.ui.IconColorUtil.parseColorString (IconColorUtil.kt:40)");
        }
        C1132359l c1132359l = null;
        if (str != null) {
            c5Tl.Eno(1274904418);
            if (AbstractC001900j.A0W(str, '#')) {
                j = Color.parseColor(str) << 32;
            } else {
                C7Z c7z = (C7Z) C7Z.A01.get(str);
                if (c7z != null) {
                    if (AbstractC25227BEk.A1U(c5Tl, 1008458183)) {
                        C0fH.A01(1770197335, "com.instagram.newsfeed.compose.ui.SemanticColor.color (IconColorUtil.kt:20)");
                    }
                    CJH cjh = CJH.$redex_init_class;
                    int ordinal = c7z.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal == 4) {
                                        A0T = AbstractC25230BEn.A0T(c5Tl, 926653037);
                                        j = C1132359l.A09;
                                    } else {
                                        throw AbstractC25233BEq.A0r(c5Tl, 926645698);
                                    }
                                } else {
                                    j = AbstractC25227BEk.A0g(c5Tl, 926651923).A0n;
                                }
                            } else {
                                j = AbstractC25227BEk.A0g(c5Tl, 926650043).A0S;
                            }
                        } else {
                            j = AbstractC25227BEk.A0g(c5Tl, 926648116).A0J;
                        }
                        A0T = AbstractC25225BEi.A0K(c5Tl, false);
                    } else {
                        A0T = AbstractC25230BEn.A0T(c5Tl, 926646637);
                        j = C1132359l.A01;
                    }
                    if (C0fH.A02()) {
                        C0fH.A00(-603825353);
                    }
                    C117505Tk.A0L(A0T, false);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
            }
            c1132359l = AbstractC25225BEi.A0S(j);
            AbstractC25225BEi.A1V(c5Tl, false);
        }
        if (C0fH.A02()) {
            C0fH.A00(-1549553204);
        }
        AbstractC25225BEi.A1T(c5Tl);
        return c1132359l;
    }
}
