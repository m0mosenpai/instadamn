package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;

/* loaded from: classes6.dex */
public final class G22 implements GXS {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C36298Fzs A02;
    public final /* synthetic */ C2EC A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public G22(Activity activity, UserSession userSession, C36298Fzs c36298Fzs, C2EC c2ec, String str, String str2, boolean z, boolean z2) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = c2ec;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = c36298Fzs;
        this.A07 = z;
        this.A06 = z2;
    }

    @Override // X.GXS
    public final void DWJ() {
        String str;
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        C2EC c2ec = this.A03;
        FUa.A01(activity, FUa.A00(userSession, c2ec, DirectPromptTypes.A05, null, this.A04, this.A05, false), userSession, 4929);
        C36298Fzs c36298Fzs = this.A02;
        String C7I = c2ec.C7I();
        String C7q = c2ec.C7q();
        int AdZ = c2ec.AdZ();
        boolean z = this.A07;
        boolean z2 = this.A06;
        Integer valueOf = Integer.valueOf(AdZ);
        if (z) {
            str = "MODERATOR";
        } else if (z2) {
            str = "COLLABORATOR";
        } else {
            str = "VIEWER";
        }
        C36298Fzs.A03(null, c36298Fzs, valueOf, C7I, C7q, "challenge_submissions_creation_camera_rendered", "tap", "get_started_button", "challenge_submissions_nux_sheet", AbstractC167007dF.A0n("user_type", str));
    }
}
