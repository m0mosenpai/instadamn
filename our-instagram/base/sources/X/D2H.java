package X;

import android.animation.ValueAnimator;

/* loaded from: classes5.dex */
public final class D2H implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C28427CgZ A03;

    public D2H(C28427CgZ c28427CgZ, int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = c28427CgZ;
        this.A02 = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.A01, this.A00);
        C14360o3.A07(ofInt);
        ofInt.addUpdateListener(new LM2(this.A03, this.A02, 2));
        ofInt.setDuration(400L);
        ofInt.start();
    }
}
