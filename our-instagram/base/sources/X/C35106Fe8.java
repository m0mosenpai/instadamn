package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.User;

/* renamed from: X.Fe8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35106Fe8 {
    public static final C35106Fe8 A00 = new Object();

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, FNY fny, InterfaceC37216GaR interfaceC37216GaR, C47P c47p, String str, int i, boolean z) {
        String username;
        TextView textView;
        String ByJ;
        String fullName;
        User CDj = c47p.CDj();
        GradientSpinnerAvatarView gradientSpinnerAvatarView = fny.A04;
        AbstractC31176DnK.A1U(interfaceC11380iw, gradientSpinnerAvatarView, CDj);
        TextView textView2 = fny.A02;
        String fullName2 = CDj.getFullName();
        if (fullName2 != null && fullName2.length() != 0) {
            username = CDj.getFullName();
        } else {
            username = CDj.getUsername();
        }
        textView2.setText(username);
        if (c47p.ByJ().length() == 0 && (fullName = CDj.getFullName()) != null && fullName.length() != 0) {
            textView = fny.A03;
            ByJ = CDj.getUsername();
        } else {
            textView = fny.A03;
            ByJ = c47p.ByJ();
        }
        textView.setText(ByJ);
        FollowButton followButton = fny.A05;
        ((FollowButtonBase) followButton).A0A = z;
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        viewOnAttachStateChangeListenerC110564yT.A08(new C33273EnU(interfaceC37216GaR, c47p, str, i, 0));
        viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, c47p.CDj());
        C0fQ.A00(new ViewOnClickListenerC55453Ok7(c47p, interfaceC37216GaR, str, i, 1), fny.A01);
        View.OnClickListener viewOnClickListenerC55453Ok7 = new ViewOnClickListenerC55453Ok7(c47p, interfaceC37216GaR, str, i, 2);
        C0fQ.A00(viewOnClickListenerC55453Ok7, fny.A00);
        Reel BlO = c47p.BlO(userSession);
        if (BlO != null) {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(!BlO.A16(userSession));
            viewOnClickListenerC55453Ok7 = new ViewOnClickListenerC35684FpJ(33, interfaceC37216GaR, BlO, fny);
        } else {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        }
        C0fQ.A00(viewOnClickListenerC55453Ok7, gradientSpinnerAvatarView);
    }
}
