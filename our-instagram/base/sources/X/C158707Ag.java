package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

/* renamed from: X.7Ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158707Ag {
    public View A00;
    public ImageView A01;
    public C22842A5l A02;
    public Integer A03;
    public Runnable A04;
    public boolean A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public static final void A00(View view) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new AnimationAnimationListenerC55508Ol1(view));
            view.startAnimation(alphaAnimation);
        }
    }

    public static final void A01(View view) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new AnimationAnimationListenerC55509Ol2(view));
            view.startAnimation(alphaAnimation);
        }
    }

    public C158707Ag() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 36));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 35));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 37));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 38));
    }
}
