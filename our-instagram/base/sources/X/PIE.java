package X;

import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;

/* loaded from: classes9.dex */
public final class PIE implements InterfaceC58000Pnk {
    public final /* synthetic */ ProgressAnchorContainer A00;

    public PIE(ProgressAnchorContainer progressAnchorContainer) {
        this.A00 = progressAnchorContainer;
    }

    @Override // X.InterfaceC58000Pnk
    public final void Eb7(float f, float f2, float f3) {
        float max;
        float min;
        float f4;
        ProgressAnchorContainer progressAnchorContainer = this.A00;
        AbstractC50787Mbx abstractC50787Mbx = progressAnchorContainer.A00;
        if (abstractC50787Mbx != null) {
            float translationX = progressAnchorContainer.A01.getTranslationX();
            float f5 = f + translationX;
            float f6 = f2 + translationX;
            float f7 = f3 + translationX;
            float A07 = AbstractC166987dD.A07(abstractC50787Mbx);
            if (progressAnchorContainer.A02) {
                float f8 = A07 / 2.0f;
                min = Math.min(0.0f, (-progressAnchorContainer.getWidth()) + f7 + f8);
                max = Math.max((-progressAnchorContainer.getWidth()) + A07, (-progressAnchorContainer.getWidth()) + f6 + f8);
                f4 = (-progressAnchorContainer.getWidth()) + f5 + f8;
            } else {
                float f9 = A07 / 2.0f;
                max = Math.max(0.0f, f6 - f9);
                min = Math.min(AbstractC166987dD.A07(progressAnchorContainer) - A07, f7 - f9);
                f4 = f5 - f9;
            }
            abstractC50787Mbx.setTranslationX(Math.max(max, Math.min(min, f4)));
        }
    }
}
