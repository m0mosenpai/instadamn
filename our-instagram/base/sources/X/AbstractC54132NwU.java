package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.NwU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54132NwU {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Reel reel, InterfaceC58059Pok interfaceC58059Pok, C51322Mlj c51322Mlj, boolean z) {
        AbstractC167017dG.A1Q(c51322Mlj, reel);
        User A0D = reel.A0D();
        if (A0D != null) {
            TextView textView = c51322Mlj.A01;
            AbstractC31173DnH.A1F(textView, A0D);
            C85963sQ.A0B(textView, A0D.isVerified());
            GradientSpinnerAvatarView gradientSpinnerAvatarView = c51322Mlj.A02;
            gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, A0D.Bhu());
            gradientSpinnerAvatarView.setGradientSpinnerActivated(AbstractC167007dF.A1N((C41661wG.A00(userSession).A02(reel) > 0L ? 1 : (C41661wG.A00(userSession).A02(reel) == 0L ? 0 : -1))));
            View view = c51322Mlj.A00;
            ViewOnClickListenerC55459OkE.A01(view, interfaceC58059Pok, reel, c51322Mlj, 27);
            if (reel.A1E) {
                gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                ViewOnClickListenerC55468OkN.A00(view, 7, interfaceC58059Pok, A0D);
            }
            if (z) {
                InterfaceC09390do interfaceC09390do = c51322Mlj.A03;
                Context context = AbstractC167017dG.A0V(interfaceC09390do).getContext();
                ImageView imageView = (ImageView) AbstractC167017dG.A0V(interfaceC09390do);
                C14360o3.A0A(context);
                imageView.setImageDrawable(new C180557zj(context, C05F.A0C, -1, R.drawable.instagram_templates_pano_filled_24));
                ((InterfaceC56392iX) interfaceC09390do.getValue()).setVisibility(0);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
