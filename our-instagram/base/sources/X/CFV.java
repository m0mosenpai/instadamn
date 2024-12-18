package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public abstract class CFV {
    public static final void A00(Context context, CTJ ctj, UserSession userSession, InterfaceC60442pS interfaceC60442pS, User user, String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16600sD interfaceC16600sD, long j) {
        String str2;
        AbstractC167017dG.A1U(userSession, interfaceC60442pS);
        ctj.A00.setVisibility(0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = ctj.A0D;
        C14360o3.A0B(gradientSpinnerAvatarView, 1);
        if (user == null) {
            gradientSpinnerAvatarView.setVisibility(4);
        } else {
            C1OU c1ou = C1OU.$redex_init_class;
            Reel A02 = C75653aW.A02(userSession, user);
            boolean A1W = AbstractC167007dF.A1W(A02);
            gradientSpinnerAvatarView.setVisibility(0);
            gradientSpinnerAvatarView.A0F(null, interfaceC60442pS, user.Bhu());
            gradientSpinnerAvatarView.setGradientSpinnerVisible(A1W);
            Context context2 = gradientSpinnerAvatarView.getContext();
            int i = 2131963268;
            if (A1W) {
                i = 2131976894;
            }
            gradientSpinnerAvatarView.setContentDescription(AbstractC167007dF.A0f(context2, user.getUsername(), i));
            if (!user.A2N()) {
                C0fQ.A00(new WMm(0, userSession, A02, gradientSpinnerAvatarView, user, interfaceC16620sF, interfaceC16600sD), gradientSpinnerAvatarView);
            } else {
                gradientSpinnerAvatarView.setOnClickListener(null);
            }
            AbstractC56952jT.A01(gradientSpinnerAvatarView);
            if (A02 != null) {
                C3PP.A02(userSession, A02, gradientSpinnerAvatarView.A0O);
                GradientSpinner gradientSpinner = gradientSpinnerAvatarView.A0P;
                if (gradientSpinner != null) {
                    C3PP.A02(userSession, A02, gradientSpinner);
                }
                gradientSpinnerAvatarView.setGradientSpinnerActivated(!A02.A16(userSession));
            }
        }
        IgTextView igTextView = ctj.A0B;
        if (user != null) {
            str2 = user.getUsername();
        } else {
            str2 = null;
        }
        igTextView.setText(str2);
        ctj.A0A.setText(C23831Eq.A07(context, j));
        if (str != null && str.length() != 0) {
            IgTextView igTextView2 = ctj.A08;
            igTextView2.setVisibility(0);
            igTextView2.setText(str);
            return;
        }
        ctj.A08.setVisibility(8);
    }
}
