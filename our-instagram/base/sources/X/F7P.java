package X;

import android.view.View;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes6.dex */
public abstract class F7P {
    public static final void A00(IgdsBottomButtonLayout igdsBottomButtonLayout, boolean z) {
        if (z) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
            return;
        }
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        C12500ku c12500ku = new C12500ku(igdsBottomButtonLayout);
        while (c12500ku.hasNext()) {
            View view = (View) c12500ku.next();
            view.setClickable(false);
            view.setFocusable(false);
        }
        C0fQ.A00(ViewOnClickListenerC35685FpK.A00(igdsBottomButtonLayout, 10), igdsBottomButtonLayout);
    }
}
