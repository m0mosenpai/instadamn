package X;

import android.animation.ObjectAnimator;

/* renamed from: X.Vrc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69573Vrc {
    public C67758UxZ A00;
    public final float[] A01;
    public final int[] A02;

    public final void A00() {
        ObjectAnimator objectAnimator;
        if (this instanceof C67764Uxf) {
            objectAnimator = ((C67764Uxf) this).A03;
        } else if (this instanceof C67763Uxe) {
            objectAnimator = ((C67763Uxe) this).A02;
        } else {
            objectAnimator = ((C67762Uxd) this).A02;
        }
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public AbstractC69573Vrc(int i) {
        this.A01 = new float[i * 2];
        this.A02 = new int[i];
    }
}
