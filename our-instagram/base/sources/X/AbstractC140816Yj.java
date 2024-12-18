package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;

/* renamed from: X.6Yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140816Yj {
    public static int A00;
    public static int A01;
    public static Drawable A02;
    public static Interpolator A03;
    public static boolean A04;

    public static Animator A00(Fragment fragment, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        View view = fragment.mView;
        Context context = fragment.getContext();
        if (i != 0 && z2 && context != null) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (A04) {
                Interpolator interpolator = A03;
                if (interpolator != null) {
                    loadAnimator.setInterpolator(interpolator);
                }
                if (z3) {
                    i2 = A00;
                } else {
                    i2 = A01;
                }
                loadAnimator.setDuration(i2);
                A04 = false;
            }
            loadAnimator.addListener(new C35283FhI(context, view, fragment, z));
            return loadAnimator;
        }
        return null;
    }
}
