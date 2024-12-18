package X;

import android.view.animation.AlphaAnimation;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes8.dex */
public final class M4X implements Runnable {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ C44736JrJ A01;

    public M4X(AlphaAnimation alphaAnimation, C44736JrJ c44736JrJ) {
        this.A01 = c44736JrJ;
        this.A00 = alphaAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A01.A04;
        if (roundedCornerFrameLayout.getVisibility() == 8) {
            roundedCornerFrameLayout.setVisibility(0);
            roundedCornerFrameLayout.startAnimation(this.A00);
        }
    }
}
