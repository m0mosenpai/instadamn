package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93034Fc {
    public static final void A00(ViewGroup viewGroup, View view, int i) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(view, 2);
        View findViewById = viewGroup.findViewById(i);
        viewGroup.addView(view, viewGroup.indexOfChild(findViewById));
        int i2 = view.getLayoutParams().height;
        C9EL c9el = new C9EL(findViewById, 44);
        if (i2 != -1 && i2 != -2) {
            c9el.invoke(Integer.valueOf(i2));
        }
        int i3 = view.getLayoutParams().width;
        C9EL c9el2 = new C9EL(findViewById, 45);
        if (i3 != -1 && i3 != -2) {
            c9el2.invoke(Integer.valueOf(i3));
        }
        view.setId(findViewById.getId());
        view.setLayoutParams(findViewById.getLayoutParams());
        viewGroup.removeView(findViewById);
    }
}
