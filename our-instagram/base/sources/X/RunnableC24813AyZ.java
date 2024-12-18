package X;

import android.view.TextureView;

/* renamed from: X.AyZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24813AyZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C8RB A02;

    public RunnableC24813AyZ(C8RB c8rb, int i, int i2) {
        this.A02 = c8rb;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int numberOfFittingFrames;
        C8RB c8rb = this.A02;
        C23689AeO c23689AeO = c8rb.A0B;
        if (c23689AeO != null) {
            float f = c8rb.A00 - c8rb.A04;
            c23689AeO.A00 = f;
            TextureView textureView = c23689AeO.A05;
            if (textureView != null) {
                textureView.setTranslationX(-f);
            }
            C23689AeO c23689AeO2 = c8rb.A0B;
            if (c23689AeO2 != null) {
                numberOfFittingFrames = c8rb.getNumberOfFittingFrames();
                c23689AeO2.FCa(numberOfFittingFrames, this.A01, this.A00);
            }
            c8rb.invalidate();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
