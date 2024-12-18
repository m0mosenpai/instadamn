package X;

import android.view.View;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.Lw1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49608Lw1 implements InterfaceC150976qx {
    public final int A00;
    public final Object A01;

    public C49608Lw1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        switch (this.A00) {
            case 2:
                View view = ((LIi) this.A01).A00;
                if (view == null) {
                    return;
                }
                view.setAlpha(f);
                return;
            case 3:
                View view2 = ((LIi) this.A01).A00;
                if (view2 == null) {
                    return;
                }
                view2.setAlpha(1.0f - f);
                return;
            case 4:
                DirectVisualMessageViewerController.A0J((DirectVisualMessageViewerController) this.A01, 1.0f - f);
                return;
            case 5:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                L22 l22 = directVisualMessageViewerController.reelViewerShadowAnimator;
                if (l22 != null) {
                    l22.A00 = f;
                    l22.A02.A00(l22.A01, f);
                }
                DirectVisualMessageViewerController.A0J(directVisualMessageViewerController, f);
                return;
            case 6:
                ((C51622Yk) this.A01).A0G.A00();
                return;
            default:
                if (f > 0.8d) {
                    AbstractC166987dD.A1Y(this.A01);
                    return;
                }
                return;
        }
    }
}
