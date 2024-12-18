package X;

import android.animation.ValueAnimator;

/* renamed from: X.If1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41785If1 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C41785If1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj;
        int i = this.A00;
        C14360o3.A0B(valueAnimator, 0);
        Object obj2 = this.A01;
        if (i != 0) {
            obj = ((C39163HLr) obj2).A03;
        } else {
            obj = ((C39164HLs) obj2).A04;
        }
        ((C110644yc) obj).A00(AbstractC167017dG.A00(valueAnimator));
    }
}
