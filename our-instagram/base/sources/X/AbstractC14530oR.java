package X;

import com.instagram.common.util.gradient.BackgroundGradientColors;

/* renamed from: X.0oR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14530oR {
    public static BackgroundGradientColors parseFromJson(C16L c16l) {
        return (BackgroundGradientColors) C16V.A01(c16l, new C1EH() { // from class: X.0oQ
            @Override // X.C1EH
            public final /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors(0, 0);
                if (c16l2.A11() != C16R.A0D) {
                    c16l2.A0z();
                    return null;
                }
                while (c16l2.A1J() != C16R.A09) {
                    String A0q = c16l2.A0q();
                    c16l2.A1J();
                    if ("top_color".equals(A0q)) {
                        backgroundGradientColors.A01 = c16l2.A1D();
                    } else if ("bottom_color".equals(A0q)) {
                        backgroundGradientColors.A00 = c16l2.A1D();
                    }
                    c16l2.A0z();
                }
                return backgroundGradientColors;
            }
        });
    }
}
