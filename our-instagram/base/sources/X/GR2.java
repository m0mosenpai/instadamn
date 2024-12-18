package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class GR2 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C1VJ A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public GR2(UserSession userSession, C1VJ c1vj, User user, String str, String str2, String str3, String str4) {
        this.A00 = userSession;
        this.A02 = user;
        this.A01 = c1vj;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A03 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A00;
        InterfaceC02900Bo A00 = C0BQ.A00(userSession);
        if (A00.CLL()) {
            User BWy = A00.BWy(this.A02);
            if (BWy != null) {
                Context context = this.A01.A02;
                C17110t6 c17110t6 = (C17110t6) A00;
                AbstractC167017dG.A1N(context, userSession);
                if (c17110t6.A04) {
                    C17110t6.A01(context, userSession, c17110t6, BWy);
                } else {
                    User A0Y = AbstractC166997dE.A0Y(userSession);
                    C08S.A01(context, userSession, c17110t6.A03.A00);
                    C17110t6.A00(context, userSession, c17110t6, BWy);
                    C17110t6.A02(A0Y, BWy);
                }
                C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, userSession), "ig_account_switched"), 192);
                A0A.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "force_logout");
                A0A.A0R("to_pk", BWy.getId());
                A0A.A0R("from_pk", userSession.userId);
                A0A.Cht();
            }
        } else {
            Context context2 = this.A01.A02;
            String str = this.A05;
            String str2 = this.A04;
            C14360o3.A0B(context2, 0);
            C08S.A01(context2, userSession, userSession.endSessionManager.A00);
            C41451vu.A01.E4s(new C04070Jy(str, str2));
        }
        C1VJ c1vj = this.A01;
        synchronized (c1vj) {
            c1vj.A01 = false;
        }
        Context context3 = c1vj.A02;
        String str3 = this.A06;
        String str4 = this.A03;
        boolean A1R = AbstractC167007dF.A1R(0, context3, userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/perform_post_force_logout_actions/");
        AbstractC31179DnN.A0j(context3, A0c, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId);
        Pattern pattern = AbstractC13670mt.A01;
        if (str3 == null) {
            str3 = "";
        }
        A0c.A9s(AbstractC111324zv.A00(2684), str3);
        if (str4 == null) {
            str4 = "";
        }
        A0c.A9s("path", str4);
        C1GJ.A06(AbstractC31175DnJ.A0D(A0c, C40781ul.class, C55702hA.class, A1R), 152, 3, false, A1R);
    }
}
