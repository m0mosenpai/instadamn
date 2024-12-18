package X;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.0m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13160m2 {
    public static final ObjectAnimator A01(View view) {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.5f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.53f, 1.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator(0.5f));
        Keyframe ofFloat3 = Keyframe.ofFloat(0.67f, 1.0f);
        Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 0.5f);
        ofFloat4.setInterpolator(new AccelerateInterpolator(0.5f));
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.SCALE_X, ofFloat, ofFloat2, ofFloat3, ofFloat4), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, ofFloat, ofFloat2, ofFloat3, ofFloat4));
        C14360o3.A07(ofPropertyValuesHolder);
        ofPropertyValuesHolder.setDuration(1500L);
        ofPropertyValuesHolder.setRepeatCount(-1);
        return ofPropertyValuesHolder;
    }

    public static final void A02(final View view, final InterfaceC16820sZ interfaceC16820sZ, final int i, long j) {
        C14360o3.A0B(interfaceC16820sZ, 3);
        if (view != null) {
            view.animate().cancel();
            if (i == 0 && view.getVisibility() != 0) {
                view.setAlpha(0.0f);
                view.setVisibility(i);
                view.animate().setDuration(j).withEndAction(new Runnable() { // from class: X.0m1
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        InterfaceC16820sZ.this.invoke();
                    }
                }).alpha(1.0f);
            } else {
                if (view.getVisibility() != 0) {
                    return;
                }
                view.animate().setDuration(j).alpha(0.0f).withEndAction(new Runnable() { // from class: X.0m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = view;
                        view2.setVisibility(i);
                        view2.setAlpha(1.0f);
                        interfaceC16820sZ.invoke();
                    }
                }).start();
            }
        }
    }

    public static final ObjectAnimator A00(Drawable drawable, int i, int i2, long j) {
        drawable.mutate();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", i, i2));
        C14360o3.A07(ofPropertyValuesHolder);
        ofPropertyValuesHolder.setTarget(drawable);
        ofPropertyValuesHolder.setDuration(j);
        ofPropertyValuesHolder.start();
        return ofPropertyValuesHolder;
    }
}
