package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.M5z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50010M5z implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ C45696KKz A01;
    public final /* synthetic */ boolean A02;

    public RunnableC50010M5z(IgSimpleImageView igSimpleImageView, C45696KKz c45696KKz, boolean z) {
        this.A01 = c45696KKz;
        this.A00 = igSimpleImageView;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        float f;
        View view;
        C45696KKz c45696KKz = this.A01;
        if (c45696KKz.A04) {
            IgSimpleImageView igSimpleImageView = this.A00;
            boolean A1P = AbstractC25230BEn.A1P((igSimpleImageView.getRotation() > 0.0f ? 1 : (igSimpleImageView.getRotation() == 0.0f ? 0 : -1)));
            C50168MDv c50168MDv = new C50168MDv(38, c45696KKz, this.A02);
            AbstractC43593JPy.A1A(igSimpleImageView);
            Object parent = igSimpleImageView.getParent();
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            igSimpleImageView.setVisibility(0);
            float A07 = AbstractC166987dD.A07(igSimpleImageView);
            float f2 = A07 / 2.0f;
            int i2 = 1;
            if (A1P) {
                i2 = -1;
            }
            igSimpleImageView.clearAnimation();
            ViewPropertyAnimator duration = igSimpleImageView.animate().rotation(i2 * 30.0f).setDuration(450L);
            if (A1P) {
                f = -f2;
            } else {
                f = i - f2;
            }
            JQ0.A0G(duration.x(f).y(-(A07 + f2)), 0.85f).withEndAction(new RunnableC49966M4h(igSimpleImageView, c50168MDv)).start();
        }
    }
}
