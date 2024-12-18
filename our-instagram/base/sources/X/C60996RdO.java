package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.RdO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60996RdO extends PJX {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C58877QEn A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C60996RdO(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C58877QEn c58877QEn, String str, String str2) {
        this.A02 = c58877QEn;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        String str2;
        C58877QEn c58877QEn = this.A02;
        String A00 = SVS.A00(c58877QEn);
        UserSession userSession = this.A01;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, A00);
        if (A0h != null) {
            str2 = A0h.CAR();
        } else {
            str2 = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A00, userSession), "iab_report_submit");
        A0f.AAP("iab_session_id", c58877QEn.A00.getString("Tracking.ARG_SESSION_ID"));
        A0f.AAP("target_url", this.A04);
        A0f.AAP("initial_url", this.A03);
        A0f.AAP("report_reason", str);
        AbstractC37300Gc1.A0o(A0f, str2);
        A0f.AAP("click_source", c58877QEn.A00.getString("Tracking.ARG_CLICK_SOURCE"));
        A0f.A8I("event_ts", Double.valueOf(System.currentTimeMillis()));
        A0f.Cht();
    }
}
