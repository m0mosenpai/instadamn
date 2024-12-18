package X;

import android.view.animation.Animation;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Ol0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractAnimationAnimationListenerC55507Ol0 implements Animation.AnimationListener {
    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        PCQ pcq = ((NY1) this).A00;
        InterfaceC09390do interfaceC09390do = pcq.A09;
        if (((ViewPager2) interfaceC09390do.getValue()).A08.A02 == 0 || ((ViewPager2) interfaceC09390do.getValue()).A08.A02 == 2) {
            C51906Mwo c51906Mwo = pcq.A01;
            if (c51906Mwo == null) {
                C14360o3.A0F("boundViewModel");
                throw C00O.createAndThrow();
            }
            PCQ.A01(pcq, c51906Mwo, false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
