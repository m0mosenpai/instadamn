package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.077, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass077 {
    public static final AnonymousClass075 A00 = new Object();

    public static final void A00(View view, ViewGroup viewGroup, Integer num) {
        ViewGroup viewGroup2;
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    i = 4;
                    AbstractC10360h2.A0H(2);
                } else {
                    AbstractC10360h2.A0H(2);
                    i = 8;
                }
                view.setVisibility(i);
                return;
            }
            AbstractC10360h2.A0H(2);
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == null) {
                AbstractC10360h2.A0H(2);
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup2 = (ViewGroup) parent2) == null) {
            return;
        }
        AbstractC10360h2.A0H(2);
        viewGroup2.removeView(view);
    }
}
