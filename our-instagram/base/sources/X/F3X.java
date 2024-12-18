package X;

import android.view.View;

/* loaded from: classes6.dex */
public abstract class F3X {
    public static final void A00(View view) {
        view.requestFocus();
        if (view.hasWindowFocus()) {
            if (view.isFocused()) {
                AbstractC13880nE.A0R(view);
                return;
            }
            return;
        }
        view.getViewTreeObserver().addOnWindowFocusChangeListener(new LR5(view, 2));
    }
}
