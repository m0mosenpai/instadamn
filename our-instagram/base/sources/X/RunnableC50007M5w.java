package X;

import android.view.animation.AlphaAnimation;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.M5w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50007M5w implements Runnable {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ IgSimpleImageView A01;
    public final /* synthetic */ boolean A02;

    public RunnableC50007M5w(AlphaAnimation alphaAnimation, IgSimpleImageView igSimpleImageView, boolean z) {
        this.A01 = igSimpleImageView;
        this.A00 = alphaAnimation;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgSimpleImageView igSimpleImageView = this.A01;
        igSimpleImageView.startAnimation(this.A00);
        igSimpleImageView.setVisibility(AbstractC167007dF.A05(this.A02 ? 1 : 0));
    }
}
