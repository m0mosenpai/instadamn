package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.LxK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49689LxK implements InterfaceC71987XDy {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LKh A02;
    public final /* synthetic */ K2J A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ C189478aR A05;
    public final /* synthetic */ WEz A06;

    @Override // X.InterfaceC71987XDy
    public final void Dgv() {
    }

    @Override // X.InterfaceC71987XDy
    public final void Dwj() {
    }

    public C49689LxK(Activity activity, UserSession userSession, LKh lKh, K2J k2j, InterfaceC60442pS interfaceC60442pS, C189478aR c189478aR, WEz wEz) {
        this.A02 = lKh;
        this.A03 = k2j;
        this.A06 = wEz;
        this.A05 = c189478aR;
        this.A01 = userSession;
        this.A00 = activity;
        this.A04 = interfaceC60442pS;
    }

    @Override // X.InterfaceC71987XDy
    public final void Czj() {
        C81543kP A0g;
        String str;
        LKh lKh = this.A02;
        K2J k2j = this.A03;
        boolean A1W = AbstractC167007dF.A1W(k2j.A06);
        User user = k2j.A00;
        String id = user.getId();
        C2EC A00 = LKh.A00(lKh);
        if (A00 != null && (A0g = AbstractC31172DnG.A0g(A00)) != null) {
            C142846ck A0d = AbstractC31172DnG.A0d(lKh.A04);
            int AdZ = A00.AdZ();
            String C7I = A00.C7I();
            String C7q = A00.C7q();
            String A002 = lKh.A01.A00();
            String A01 = LKh.A01(lKh, A0g, A00);
            C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
            if (AbstractC25226BEj.A1Z(A0I)) {
                C09530e4 A1L = AbstractC166987dD.A1L("message_client_context_id", A002);
                C09530e4 A1L2 = AbstractC166987dD.A1L("user_type", A01);
                if (A1W) {
                    str = "True";
                } else {
                    str = "False";
                }
                LinkedHashMap A07 = AbstractC06930Yk.A07(A1L, A1L2, AbstractC166987dD.A1L("is_reply", str), AbstractC166987dD.A1L("blocked_user_id", id));
                AbstractC31175DnJ.A1B(A0I, A0d);
                AbstractC31174DnI.A1I(A0I, "block_user");
                A0I.A0o("block_user_button");
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0a(A0I, "report_comment_sheet", C7I, C7q, AdZ), A07);
            }
        }
        if (user.B7L() == FollowStatus.A08) {
            AbstractC129875tr.A00(this.A01).A0G(user, false);
        }
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C189478aR c189478aR = this.A05;
        String str2 = k2j.A04;
        JSONObject jSONObject = k2j.A08;
        C14360o3.A0B(jSONObject, 0);
        FYZ.A01(activity, interfaceC60442pS, userSession, c189478aR, user, null, str2, jSONObject);
    }

    @Override // X.InterfaceC71987XDy
    public final void Dfg() {
        C81543kP A0g;
        String str;
        LKh lKh = this.A02;
        boolean A1W = AbstractC167007dF.A1W(this.A03.A06);
        C2EC A00 = LKh.A00(lKh);
        if (A00 != null && (A0g = AbstractC31172DnG.A0g(A00)) != null) {
            C142846ck A0d = AbstractC31172DnG.A0d(lKh.A04);
            int AdZ = A00.AdZ();
            String C7I = A00.C7I();
            String C7q = A00.C7q();
            String A002 = lKh.A01.A00();
            String A01 = LKh.A01(lKh, A0g, A00);
            C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
            if (AbstractC25226BEj.A1Z(A0I)) {
                C09530e4 A1L = AbstractC166987dD.A1L("message_client_context_id", A002);
                C09530e4 A1L2 = AbstractC166987dD.A1L("user_type", A01);
                if (A1W) {
                    str = "True";
                } else {
                    str = "False";
                }
                LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC167007dF.A1b("is_reply", str, A1L, A1L2));
                AbstractC31175DnJ.A1B(A0I, A0d);
                AbstractC31174DnI.A1I(A0I, "report_comment");
                A0I.A0o("report_comment_button");
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0a(A0I, "report_comment_sheet", C7I, C7q, AdZ), A07);
            }
        }
        WEz.A00(this.A05, this.A06);
    }
}
