package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.F3a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34098F3a {
    public static final Reel A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC132405yL interfaceC132405yL, C31447Drr c31447Drr, DirectShareTarget directShareTarget, boolean z, boolean z2) {
        Reel A01;
        RingSpec ringSpec;
        AbstractC167007dF.A1E(context, 0, c31447Drr);
        C3AY A00 = AbstractC35060FcX.A00(userSession, directShareTarget);
        ImageUrl A02 = AbstractC35060FcX.A02(userSession, directShareTarget);
        ImageUrl A012 = AbstractC35060FcX.A01(userSession, directShareTarget);
        Drawable drawable = context.getDrawable(R.drawable.instagram_icons_exceptions_illo_subscriber_crown2_filled_68);
        if (A012 != null) {
            if ((directShareTarget.A05 != null || C4GR.A02(directShareTarget.A01)) && drawable != null) {
                if (A02 == null) {
                    A02 = A012;
                }
                AbstractC31179DnN.A1P(c31447Drr.A03);
                GradientSpinnerAvatarView gradientSpinnerAvatarView = c31447Drr.A04;
                gradientSpinnerAvatarView.setVisibility(0);
                gradientSpinnerAvatarView.A0E(drawable, interfaceC11380iw, A02);
            } else {
                c31447Drr.A02(null, interfaceC11380iw, A012);
            }
        } else if (A02 != null) {
            c31447Drr.A02(null, interfaceC11380iw, A02);
        } else if (!directShareTarget.A0M() && directShareTarget.A0R) {
            Object obj = A00.A00;
            if (obj != null) {
                c31447Drr.A02(null, interfaceC11380iw, (ImageUrl) obj);
                if (z) {
                    c31447Drr.A01(AbstractC31177DnL.A0A(context));
                } else {
                    c31447Drr.A01(null);
                }
            } else {
                throw AbstractC166987dD.A14("comes from NotNullable method");
            }
        } else if (C18U.A06(C06090Tz.A05, userSession, 36327576418925250L)) {
            c31447Drr.A04(AbstractC81683kd.A05(AbstractC166997dE.A0Y(userSession), AbstractC31172DnG.A18(directShareTarget), false), interfaceC11380iw);
        } else {
            Object obj2 = A00.A00;
            if (obj2 != null) {
                c31447Drr.A03(null, interfaceC11380iw, (ImageUrl) obj2, (ImageUrl) A00.A01);
            } else {
                throw AbstractC166987dD.A14("comes from NotNullable method");
            }
        }
        if (interfaceC132405yL != null) {
            directShareTarget.A01();
            if (z2) {
                C81663kb B3U = AbstractC28761aE.A00(userSession).B3U(directShareTarget.A00());
                if (directShareTarget.A0R() && B3U != null) {
                    A01 = C31226Do9.A01(userSession, C31226Do9.A00(userSession, B3U));
                } else if (directShareTarget.A04 != null && AbstractC31176DnK.A00(directShareTarget) > 0) {
                    Object obj3 = AbstractC31172DnG.A18(directShareTarget).get(0);
                    C14360o3.A07(obj3);
                    A01 = C31226Do9.A01(userSession, new C31229DoC(C4GO.A00(userSession, (PendingRecipient) obj3)));
                }
                if (A01 != null) {
                    GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c31447Drr.A04;
                    gradientSpinnerAvatarView2.setGradientSpinnerVisible(true);
                    gradientSpinnerAvatarView2.setGradientSpinnerActivated(!A01.A16(userSession));
                    if (!A01.A16(userSession)) {
                        ringSpec = C3PP.A00(userSession, A01);
                    } else {
                        ringSpec = (RingSpec) C3Oc.A0D.getValue();
                    }
                    C14360o3.A0B(ringSpec, 0);
                    gradientSpinnerAvatarView2.setGradientColor(ringSpec);
                    return A01;
                }
            }
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView3 = c31447Drr.A04;
        gradientSpinnerAvatarView3.setGradientSpinnerVisible(false);
        gradientSpinnerAvatarView3.setGradientSpinnerActivated(false);
        return null;
    }
}
