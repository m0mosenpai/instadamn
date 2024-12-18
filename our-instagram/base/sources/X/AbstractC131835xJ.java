package X;

import android.view.View;

/* renamed from: X.5xJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC131835xJ {
    public static final void A00(C126555nq c126555nq) {
        C14360o3.A0B(c126555nq, 0);
        C12500ku c12500ku = new C12500ku(c126555nq);
        while (c12500ku.hasNext()) {
            View view = (View) c12500ku.next();
            if (view.isLayoutRequested()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(view.getHeight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            if (view instanceof C126555nq) {
                A00((C126555nq) view);
            }
        }
    }
}
