package X;

import android.view.View;
import android.view.animation.Animation;
import com.instagram.user.model.User;

/* renamed from: X.Ol6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class AnimationAnimationListenerC55513Ol6 implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ C54731OFi A02;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC55513Ol6(View view, User user, C54731OFi c54731OFi) {
        this.A02 = c54731OFi;
        this.A01 = user;
        this.A00 = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C54731OFi c54731OFi = this.A02;
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(c54731OFi.A09);
        C57157PZb.A01(this.A01, A0Z, AbstractC141776au.A00(A0Z), 10);
        AbstractC125325le A0A = AbstractC43592JPx.A0n(this.A00).A0E(AbstractC55163OdR.A00).A0A();
        A0A.A0U(1.0f, 0.0f, -1.0f);
        A0A.A0V(1.0f, 0.0f, -1.0f);
        A0A.A0I(0.0f);
        A0A.A03 = 8;
        PHK phk = new PHK(1, A0A, c54731OFi);
        c54731OFi.A01.add(A0A);
        A0A.A05 = phk;
        A0A.A0H();
    }
}
