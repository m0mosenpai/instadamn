package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public abstract class FV6 {
    public static void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C36005Fv3 c36005Fv3, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        Object obj;
        DirectShareTarget directShareTarget = c36005Fv3.A09;
        directShareTarget.getClass();
        C3AY A00 = AbstractC35060FcX.A00(userSession, directShareTarget);
        ImageUrl imageUrl = c36005Fv3.A07;
        ImageUrl A01 = AbstractC35060FcX.A01(userSession, directShareTarget);
        if (A01 == null) {
            if (imageUrl != null) {
                gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, imageUrl);
                return;
            }
            if ((c36005Fv3.A03() || !directShareTarget.A0R) && (obj = A00.A00) != null) {
                AbstractC31175DnJ.A0w(A00, interfaceC11380iw, gradientSpinnerAvatarView, obj);
                return;
            }
            Object obj2 = A00.A00;
            if (obj2 == null) {
                return;
            } else {
                A01 = (ImageUrl) obj2;
            }
        }
        gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, A01);
    }

    public static boolean A01(UserSession userSession, C36005Fv3 c36005Fv3) {
        if (AbstractC31174DnI.A1V(userSession) && c36005Fv3.A02 > 0 && !c36005Fv3.A03()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316010072051571L) || C18U.A06(c06090Tz, userSession, 36318209095440409L)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
