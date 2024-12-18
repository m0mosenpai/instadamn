package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.Lvx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49604Lvx implements InterfaceC125355lh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C49604Lvx(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        if (this.A00 != 0) {
            Animation animation = (Animation) this.A01;
            View view = (View) this.A03;
            animation.setAnimationListener(new WOU(3, this.A02, view));
            view.startAnimation(animation);
            return;
        }
        AbstractC125325le abstractC125325le = (AbstractC125325le) this.A01;
        View view2 = (View) this.A03;
        abstractC125325le.A0P(0.0f, AbstractC166987dD.A02(view2.getWidth()));
        abstractC125325le.A0Q(0.0f, AbstractC166987dD.A08(view2));
        abstractC125325le.A0I(0.0f);
        abstractC125325le.A05 = new C44065Jdq((InterfaceC16820sZ) this.A02, 2);
        abstractC125325le.A0H();
    }
}
