package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes8.dex */
public final class M63 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L8E A01;
    public final /* synthetic */ Runnable A02;

    public M63(L8E l8e, Runnable runnable, int i) {
        this.A01 = l8e;
        this.A00 = i;
        this.A02 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L8E l8e = this.A01;
        View view = l8e.A03;
        int width = view.getWidth();
        int height = view.getHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (this.A00 * width) / 100);
        C14360o3.A07(ofInt);
        ofInt.addUpdateListener(new LM2(l8e, height, 6));
        Runnable runnable = this.A02;
        if (runnable != null) {
            JX2.A00(ofInt, runnable, 12);
        }
        ofInt.setDuration(400L);
        ofInt.start();
    }
}
