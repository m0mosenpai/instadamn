package X;

import android.view.animation.AlphaAnimation;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.PPm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56971PPm implements Runnable {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ IgdsMediaButton A01;

    public RunnableC56971PPm(AlphaAnimation alphaAnimation, IgdsMediaButton igdsMediaButton) {
        this.A01 = igdsMediaButton;
        this.A00 = alphaAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgdsMediaButton igdsMediaButton = this.A01;
        igdsMediaButton.startAnimation(this.A00);
        igdsMediaButton.setVisibility(4);
    }
}
