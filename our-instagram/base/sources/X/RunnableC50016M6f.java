package X;

import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.M6f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50016M6f implements Runnable {
    public final /* synthetic */ C51688MsJ A00;
    public final /* synthetic */ IgSimpleImageView A01;
    public final /* synthetic */ IgSimpleImageView A02;
    public final /* synthetic */ L8P A03;
    public final /* synthetic */ IgBouncyUfiButtonImageView A04;

    public RunnableC50016M6f(C51688MsJ c51688MsJ, IgSimpleImageView igSimpleImageView, IgSimpleImageView igSimpleImageView2, L8P l8p, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView) {
        this.A02 = igSimpleImageView;
        this.A01 = igSimpleImageView2;
        this.A04 = igBouncyUfiButtonImageView;
        this.A03 = l8p;
        this.A00 = c51688MsJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator withEndAction = AbstractC43593JPy.A0E(this.A02.animate(), 0.0f).setInterpolator(new DecelerateInterpolator()).setDuration(200L).withEndAction(new M19(this.A01));
        C14360o3.A07(withEndAction);
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = this.A04;
        withEndAction.setUpdateListener(new LM6(1, withEndAction, this.A00, this.A03, igBouncyUfiButtonImageView)).start();
    }
}
