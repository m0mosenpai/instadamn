package X;

import android.content.Context;
import android.view.View;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;

/* renamed from: X.6Wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140416Wv {
    public static boolean A00;

    public static final void A00(final UserSession userSession, final Reel reel, final C41181vS c41181vS, final C6b8 c6b8, final InterfaceC144656fl interfaceC144656fl) {
        InterfaceC56392iX interfaceC56392iX;
        View view;
        InterfaceC56392iX interfaceC56392iX2;
        if (c41181vS.A0e == EnumC41231vY.A09 && !AbstractC144976gH.A00(userSession)) {
            LikeActionView likeActionView = c6b8.A03;
            if (likeActionView != null) {
                likeActionView.A00();
            }
            final C57852ky A002 = AbstractC57842kx.A00(userSession);
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            boolean A0M = A002.A0M(c38321qM);
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = c6b8.A04;
            igBouncyUfiButtonImageView.A05();
            Context context = igBouncyUfiButtonImageView.getContext();
            igBouncyUfiButtonImageView.setSelected(A0M);
            int i = 2131965099;
            if (A0M) {
                i = 2131965112;
            }
            igBouncyUfiButtonImageView.setContentDescription(context.getString(i));
            C0fQ.A00(new View.OnClickListener() { // from class: X.6Ww
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EnumC77173d3 enumC77173d3;
                    String str;
                    int A05 = C0f9.A05(-936070631);
                    C57852ky c57852ky = A002;
                    C41181vS c41181vS2 = c41181vS;
                    C38321qM c38321qM2 = c41181vS2.A0b;
                    c38321qM2.getClass();
                    boolean A0M2 = c57852ky.A0M(c38321qM2);
                    if (A0M2) {
                        enumC77173d3 = EnumC77173d3.A03;
                    } else {
                        enumC77173d3 = EnumC77173d3.A02;
                    }
                    C1QT A003 = C1QS.A00(userSession);
                    A003.flowStartIfNotOngoing(18943093L, new UserFlowConfig("story_viewer_like_button", false));
                    EnumC77173d3 enumC77173d32 = EnumC77173d3.A02;
                    if (enumC77173d3 == enumC77173d32) {
                        str = "story_like_button_tapped";
                    } else {
                        str = "story_unlike_button_tapped";
                    }
                    A003.flowMarkPoint(18943093L, str);
                    C6b8 c6b82 = c6b8;
                    if (!AbstractC144976gH.A00(c6b82.A01)) {
                        c6b82.A05.A02(A0M2, false, false);
                    }
                    if (enumC77173d3 == enumC77173d32) {
                        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView2 = c6b82.A04;
                        igBouncyUfiButtonImageView2.setHapticFeedbackEnabled(true);
                        igBouncyUfiButtonImageView2.performHapticFeedback(1);
                    }
                    interfaceC144656fl.DOv(enumC77173d3, reel, c41181vS2);
                    C0f9.A0C(-84150288, A05);
                }
            }, igBouncyUfiButtonImageView);
            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
            int i2 = interfaceC19630xq.getInt("current_story_owner_story_index", 0);
            int i3 = interfaceC19630xq.getInt("session_count", 0);
            User A003 = C08730cb.A00(userSession).A00();
            if (!A003.A2I() || !A003.A1u()) {
                if (i2 == 1 && !A0M && C18U.A06(C06090Tz.A05, userSession, 36324861999591966L) && i3 == 1) {
                    c6b8.A00();
                    return;
                }
                if (!A00 && !A0M && i2 == 1) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if ((C18U.A06(c06090Tz, userSession, 36324861999591966L) && i3 > 1) || C18U.A06(c06090Tz, userSession, 36324861999723040L)) {
                        c6b8.A00();
                        A00 = true;
                        return;
                    }
                }
            }
            igBouncyUfiButtonImageView.setVisibility(0);
            if ((!AbstractC25351Lp.A00(c6b8.A01).A01() || ((interfaceC56392iX2 = c6b8.A02) != null && interfaceC56392iX2.CWW())) && (interfaceC56392iX = c6b8.A02) != null && (view = interfaceC56392iX.getView()) != null) {
                view.setVisibility(8);
            }
        }
    }
}
