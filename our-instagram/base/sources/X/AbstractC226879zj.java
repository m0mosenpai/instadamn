package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.9zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226879zj {
    public static final void A00(View view, float f) {
        C14360o3.A0B(view, 0);
        float A08 = AbstractC166987dD.A08(view);
        Context context = view.getContext();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(TypedValue.applyDimension(0, A08, AbstractC167007dF.A0K(context)), TypedValue.applyDimension(0, f, AbstractC167007dF.A0K(context)));
        ofFloat.setDuration(300L);
        ANV.A00(ofFloat, view, 5);
        ofFloat.start();
    }
}
