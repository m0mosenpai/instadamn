package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class NTM extends AbstractC55206OeJ {
    public int A00;
    public C45117Jxm A01;
    public final Activity A02;
    public final Activity A03;
    public final UserSession A04;
    public final PCL A05;
    public final C55177Odh A06;
    public final OJ2 A07;
    public final C55095Ob6 A08;

    public final void onClosedCaptionsOptionClicked$fbandroid_java_com_instagram_rtc_presentation_cowatch_options_options() {
        C45117Jxm c45117Jxm = this.A01;
        if (c45117Jxm != null && AbstractC25228BEl.A1X(c45117Jxm.A01)) {
            C189478aR A00 = this.A07.A00(C57427PeP.A00, 0.5f, 1.0f, false, false, true).A00();
            this.A06.A05(new C56657PDb(new EO7(this.A04, (List) c45117Jxm.A01, MSW.A1E(this, 43), this.A00), A00, false, false));
        }
    }

    public final void onReportClicked$fbandroid_java_com_instagram_rtc_presentation_cowatch_options_options() {
        String str;
        C45117Jxm c45117Jxm = this.A01;
        if (c45117Jxm != null && c45117Jxm.A05 && (str = c45117Jxm.A03) != null) {
            this.A06.A05(new PDT(c45117Jxm.A02, str));
        }
        C45117Jxm c45117Jxm2 = this.A01;
        if (c45117Jxm2 != null) {
            C55095Ob6 c55095Ob6 = this.A08;
            String str2 = c45117Jxm2.A02;
            C14360o3.A0B(str2, 0);
            c55095Ob6.A04.A00(new C56563P9j(str2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTM(Activity activity, UserSession userSession, C55177Odh c55177Odh, OJ2 oj2, C55095Ob6 c55095Ob6) {
        super(AbstractC25225BEi.A1D(C56623PBt.class));
        AbstractC167017dG.A1R(c55177Odh, oj2);
        C14360o3.A0B(c55095Ob6, 5);
        this.A02 = activity;
        this.A06 = c55177Odh;
        this.A07 = oj2;
        this.A04 = userSession;
        this.A08 = c55095Ob6;
        this.A03 = activity;
        this.A05 = PCL.A00;
    }
}
