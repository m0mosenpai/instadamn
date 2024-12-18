package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PHL implements InterfaceC125355lh {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CircularImageView A01;
    public final /* synthetic */ AbstractC125325le A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C54731OFi A04;

    public PHL(View view, CircularImageView circularImageView, AbstractC125325le abstractC125325le, User user, C54731OFi c54731OFi) {
        this.A04 = c54731OFi;
        this.A03 = user;
        this.A01 = circularImageView;
        this.A00 = view;
        this.A02 = abstractC125325le;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        C54731OFi c54731OFi = this.A04;
        User user = this.A03;
        CircularImageView circularImageView = this.A01;
        View view = this.A00;
        Animation animation = c54731OFi.A00;
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        Animation animation2 = c54731OFi.A00;
        if (animation2 != null) {
            animation2.cancel();
        }
        RotateAnimation A00 = AbstractC55163OdR.A00();
        A00.setAnimationListener(new AnimationAnimationListenerC55513Ol6(view, user, c54731OFi));
        circularImageView.startAnimation(A00);
        c54731OFi.A00 = A00;
        c54731OFi.A01.remove(this.A02);
    }
}
