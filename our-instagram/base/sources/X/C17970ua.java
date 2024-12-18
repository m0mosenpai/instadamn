package X;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.0ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17970ua extends C03T {
    public final View A00;

    @Override // X.C03T
    public void A01() {
        View view = this.A00;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // X.C03T
    public void A02() {
        final View view = this.A00;
        if (view != null) {
            if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                view = view.getRootView().findFocus();
                if (view == null && (view = view.getRootView().findViewById(R.id.content)) == null) {
                    return;
                }
            } else {
                view.requestFocus();
            }
            if (view.hasWindowFocus()) {
                view.post(new Runnable() { // from class: X.03R
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = view;
                        ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                    }
                });
            }
        }
    }

    public C17970ua(View view) {
        this.A00 = view;
    }
}
