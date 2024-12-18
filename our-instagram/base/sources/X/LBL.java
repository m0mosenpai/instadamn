package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public abstract class LBL {
    public static final int A00(C011504d c011504d) {
        C14360o3.A0B(c011504d, 0);
        C011304b c011304b = c011504d.A00;
        int i = c011304b.A05(8).A00 - c011304b.A05(2).A00;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static final void A01(View view, int i) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
        }
        AbstractC13880nE.A0U(view, i2 + i);
    }
}
