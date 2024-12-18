package X;

import android.view.animation.Interpolator;

/* renamed from: X.M4t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49978M4t implements Runnable {
    public final /* synthetic */ EnumC61156RgH A00;
    public final /* synthetic */ K5V A01;
    public final /* synthetic */ Integer A02;

    public RunnableC49978M4t(EnumC61156RgH enumC61156RgH, K5V k5v, Integer num) {
        this.A01 = k5v;
        this.A00 = enumC61156RgH;
        this.A02 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K5V k5v = this.A01;
        if (k5v.mLifecycleRegistry.A07().A00(C07S.RESUMED)) {
            Interpolator interpolator = K5V.A0Q;
            if (k5v.A0G) {
                K5V.A02(this.A00, k5v, this.A02);
            }
        }
    }
}
