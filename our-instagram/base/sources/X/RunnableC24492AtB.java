package X;

import com.instagram.ui.widget.drawing.EffectSlider;

/* renamed from: X.AtB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24492AtB implements Runnable {
    public final /* synthetic */ EffectSlider A00;

    public RunnableC24492AtB(EffectSlider effectSlider) {
        this.A00 = effectSlider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EffectSlider effectSlider = this.A00;
        effectSlider.A0H = true;
        effectSlider.invalidate();
    }
}
