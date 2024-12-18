package X;

import android.view.View;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import com.instagram.video.live.mvvm.view.likes.customviews.MixedReactionsView;

/* renamed from: X.Lw6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49613Lw6 implements InterfaceC150976qx {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49613Lw6(IgImageView igImageView, MixedReactionsView mixedReactionsView) {
        this.A00 = 2;
        this.A01 = igImageView;
        this.A02 = mixedReactionsView;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        switch (this.A00) {
            case 0:
                RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) this.A01;
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A02;
                roundedCornerMediaFrameLayout.setRadius((int) AbstractC70163Da.A03(f, 20.0d, AbstractC13880nE.A04(directVisualMessageViewerController.A0e, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS)));
                DirectVisualMessageViewerController.A0J(directVisualMessageViewerController, 1.0f - f);
                return;
            case 1:
                RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout2 = (RoundedCornerMediaFrameLayout) this.A01;
                DirectVisualMessageViewerController directVisualMessageViewerController2 = (DirectVisualMessageViewerController) this.A02;
                roundedCornerMediaFrameLayout2.setRadius((int) AbstractC70163Da.A03(f, AbstractC13880nE.A04(directVisualMessageViewerController2.A0e, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), 20.0d));
                L22 l22 = directVisualMessageViewerController2.reelViewerShadowAnimator;
                if (l22 != null) {
                    l22.A00 = f;
                    l22.A02.A00(l22.A01, f);
                }
                DirectVisualMessageViewerController.A0J(directVisualMessageViewerController2, f);
                return;
            default:
                C14360o3.A0B(abstractC125325le, 0);
                if (f > 0.98f) {
                    abstractC125325le.A0G();
                    View view = (View) this.A01;
                    AbstractC125325le A0E = AbstractC43592JPx.A0o(view, 0).A0E(C55942hf.A02(1.0d));
                    A0E.A0V(1.0f, 0.0f, AbstractC166987dD.A08(view) / 4.0f);
                    A0E.A0U(1.0f, 0.0f, AbstractC166987dD.A07(view) / 4.0f);
                    A0E.A0M(1.0f, 0.0f);
                    A0E.A05 = new C49602Lvv(5, view, this.A02);
                    A0E.A0H();
                    return;
                }
                return;
        }
    }

    public C49613Lw6(DirectVisualMessageViewerController directVisualMessageViewerController, RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout, int i) {
        this.A00 = i;
        this.A01 = roundedCornerMediaFrameLayout;
        this.A02 = directVisualMessageViewerController;
    }
}
