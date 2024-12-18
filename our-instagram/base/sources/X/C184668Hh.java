package X;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.8Hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184668Hh {
    public ObjectAnimator A00;

    public final void A01(View view) {
        Window A00;
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        view.setVisibility(8);
        if (view.isAttachedToWindow() && (A00 = A00(view)) != null) {
            WindowManager.LayoutParams attributes = A00.getAttributes();
            attributes.screenBrightness = -1.0f;
            A00.setAttributes(attributes);
        }
    }

    public static Window A00(View view) {
        View findViewById;
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(R.id.content)) == null || (activity = (Activity) AbstractC13320mI.A00(findViewById.getContext(), Activity.class)) == null) {
            return null;
        }
        return activity.getWindow();
    }
}
