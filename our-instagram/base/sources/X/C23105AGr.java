package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.AGr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23105AGr {
    public View A00;
    public View A01;
    public Animation A02;
    public Animation A03;
    public C4ZF A04;
    public SlideInAndOutIconView A05;

    public static void A00(Drawable drawable, C23105AGr c23105AGr, C30R c30r, String str) {
        SlideInAndOutIconView slideInAndOutIconView = c23105AGr.A05;
        if (slideInAndOutIconView != null) {
            slideInAndOutIconView.setIcon(drawable);
            c23105AGr.A05.setText(str);
        }
        C4ZF c4zf = c23105AGr.A04;
        if (c4zf != null) {
            c4zf.A02(c30r);
        }
    }

    public final void A01(View view) {
        this.A00 = view;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A02 = alphaAnimation;
        alphaAnimation.setDuration(250L);
        this.A02.setFillAfter(true);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A03 = alphaAnimation2;
        alphaAnimation2.setDuration(250L);
        this.A03.setFillAfter(true);
    }
}
