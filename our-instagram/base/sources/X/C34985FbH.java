package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.Map;

/* renamed from: X.FbH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34985FbH {
    public static final C34985FbH A00 = new Object();

    public final void A00(Activity activity, UserSession userSession, C2EC c2ec, String str, String str2, boolean z) {
        String str3;
        Map A0n;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C14360o3.A0B(userSession, 1);
        C36298Fzs A002 = AbstractC34063F1q.A00(userSession);
        String str9 = userSession.userId;
        int AdZ = c2ec.AdZ();
        C80693iy c80693iy = ((C81663kb) c2ec).A01;
        boolean A06 = C160857It.A06(c80693iy.A0t, str9, AdZ);
        boolean A05 = C160857It.A05(c80693iy.A0t, userSession.userId, c2ec.AdZ());
        if (!AbstractC166987dD.A0x(userSession).getBoolean("broadcast_channel_challenges_member_nux", false)) {
            AbstractC31177DnL.A1N(AbstractC166987dD.A0x(userSession), "broadcast_channel_challenges_member_nux", true);
            EKR A003 = FU8.A00(userSession, null, new G22(activity, userSession, A002, c2ec, str, str2, A06, A05), null, null, null, false);
            C189448aO A0X = AbstractC31177DnL.A0X(userSession, false);
            A0X.A0t = true;
            A0X.A0y = false;
            AbstractC31173DnH.A0w(activity, A003, A0X);
            return;
        }
        FUa.A01(activity, FUa.A00(userSession, c2ec, DirectPromptTypes.A05, null, str, str2, false), userSession, 4929);
        String C7I = c2ec.C7I();
        String C7q = c2ec.C7q();
        Integer valueOf = Integer.valueOf(c2ec.AdZ());
        if (z) {
            if (A06) {
                str8 = "MODERATOR";
            } else if (A05) {
                str8 = "COLLABORATOR";
            } else {
                str8 = "VIEWER";
            }
            A0n = AbstractC167007dF.A0n("user_type", str8);
            str4 = "challenge_submissions_creation_camera_rendered";
            str5 = "tap";
            str6 = "enter_to_win_button";
            str7 = "thread_view";
        } else {
            if (A06) {
                str3 = "MODERATOR";
            } else if (A05) {
                str3 = "COLLABORATOR";
            } else {
                str3 = "VIEWER";
            }
            A0n = AbstractC167007dF.A0n("user_type", str3);
            str4 = "challenge_submissions_creation_camera_rendered";
            str5 = "tap";
            str6 = "enter_to_win_button";
            str7 = "challenge_submissions_sheet";
        }
        C36298Fzs.A03(null, A002, valueOf, C7I, C7q, str4, str5, str6, str7, A0n);
    }
}
