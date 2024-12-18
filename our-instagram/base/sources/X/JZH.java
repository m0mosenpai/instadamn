package X;

import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes8.dex */
public final class JZH {
    public final /* synthetic */ C70K A00;
    public final /* synthetic */ C70J A01;
    public final /* synthetic */ boolean A02;

    public JZH(C70K c70k, C70J c70j, boolean z) {
        this.A01 = c70j;
        this.A00 = c70k;
        this.A02 = z;
    }

    public final void A00() {
        C70K c70k = this.A00;
        IgSimpleImageView igSimpleImageView = c70k.A03;
        igSimpleImageView.getVisibility();
        if (igSimpleImageView.getVisibility() != 8) {
            AlphaAnimation A0I = AbstractC43594JPz.A0I(1.0f, 0.0f);
            A0I.setFillAfter(true);
            igSimpleImageView.post(new RunnableC50007M5w(A0I, igSimpleImageView, false));
        }
        ViewGroup viewGroup = c70k.A01;
        viewGroup.getVisibility();
        if (viewGroup.getVisibility() != 8) {
            AlphaAnimation A0I2 = AbstractC43594JPz.A0I(1.0f, 0.0f);
            A0I2.setFillAfter(true);
            viewGroup.post(new RunnableC50008M5x(viewGroup, A0I2, false));
        }
    }

    public final void A01() {
        if (this.A02) {
            C70K c70k = this.A00;
            IgSimpleImageView igSimpleImageView = c70k.A03;
            if (igSimpleImageView.getVisibility() != 0) {
                igSimpleImageView.getVisibility();
                AlphaAnimation A0I = AbstractC43594JPz.A0I(0.0f, 1.0f);
                A0I.setFillAfter(false);
                igSimpleImageView.post(new RunnableC50007M5w(A0I, igSimpleImageView, true));
            }
            ViewGroup viewGroup = c70k.A01;
            if (viewGroup.getVisibility() != 0) {
                viewGroup.getVisibility();
                AlphaAnimation A0I2 = AbstractC43594JPz.A0I(0.0f, 1.0f);
                A0I2.setFillAfter(false);
                viewGroup.post(new RunnableC50008M5x(viewGroup, A0I2, true));
            }
        }
    }
}
