package X;

import android.animation.ValueAnimator;
import java.util.List;

/* loaded from: classes10.dex */
public final class SX3 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final List A04 = AbstractC166987dD.A1E();
    public final /* synthetic */ C62607SIn A05;

    public static final void A00(SX3 sx3, float f, float f2, float f3, float f4) {
        float f5 = sx3.A02;
        float f6 = sx3.A03;
        float f7 = f5 + f3;
        float f8 = f6 + f4;
        sx3.A02 = f7;
        sx3.A03 = f8;
        float f9 = sx3.A00;
        float f10 = sx3.A01;
        float f11 = f9 + f;
        float f12 = f10 + f2;
        sx3.A00 = f11;
        sx3.A01 = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new C63411Sjp(sx3, sx3.A05, f9, f11, f10, f12, f5, f7, f6, f8));
        sx3.A04.add(ofFloat);
    }

    public SX3(C62607SIn c62607SIn) {
        this.A05 = c62607SIn;
    }
}
