package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.arlink.ui.NametagCardHintView;

/* renamed from: X.K4p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45336K4p extends C668630d {
    public final /* synthetic */ KFD A00;

    public C45336K4p(KFD kfd) {
        this.A00 = kfd;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float min = (float) Math.min(Math.max(c55982hj.A09.A00, 0.0d), 1.0d);
        float f = 1.0f - min;
        KFD kfd = this.A00;
        ImageView imageView = kfd.A0M;
        imageView.setAlpha(f);
        int i = 0;
        imageView.setVisibility(JQ0.A02((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        NametagCardHintView nametagCardHintView = kfd.A0Q;
        if (f <= 0.0f) {
            i = 8;
        }
        nametagCardHintView.setVisibility(i);
        nametagCardHintView.setAlpha(f);
        if (c55982hj.A0C()) {
            double d = c55982hj.A01;
            NametagController nametagController = kfd.A0P;
            if (d == 0.0d) {
                nametagController.A04 = true;
                nametagController.A0A.A06 = true;
                nametagController.mTopBarScanQRButton.setEnabled(true);
                nametagController.A05 = true;
            } else {
                nametagController.A04 = false;
                nametagController.A0A.A06 = false;
                nametagController.mTopBarScanQRButton.setEnabled(true);
            }
        }
        NametagController nametagController2 = kfd.A0P;
        if (nametagController2.A05) {
            nametagController2.mCardView.setAlpha(min);
            int i2 = 0;
            nametagController2.mCardView.setVisibility(JQ0.A02((min > 0.0f ? 1 : (min == 0.0f ? 0 : -1))));
            View view = nametagController2.mProfileShareCardView;
            if (view != null) {
                view.setAlpha(min);
                view.setVisibility(JQ0.A02((min > 0.0f ? 1 : (min == 0.0f ? 0 : -1))));
            }
            float f2 = 1.0f - min;
            nametagController2.mGradientOverlay.setAlpha(f2);
            View view2 = nametagController2.mGradientOverlay;
            if (f2 <= 0.0f) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            nametagController2.A09.A09(min);
        }
    }
}
