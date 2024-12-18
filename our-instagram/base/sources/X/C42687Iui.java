package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Iui, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42687Iui implements InterfaceC199918sv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C120985dq A01;
    public final /* synthetic */ C37628GhN A02;
    public final /* synthetic */ EnumC37736GjB A03;

    public C42687Iui(C120985dq c120985dq, C37628GhN c37628GhN, EnumC37736GjB enumC37736GjB, int i) {
        this.A02 = c37628GhN;
        this.A03 = enumC37736GjB;
        this.A01 = c120985dq;
        this.A00 = i;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        C38321qM c38321qM;
        User user;
        C3DO c3do = C3DN.A00;
        C37628GhN c37628GhN = this.A02;
        FragmentActivity fragmentActivity = c37628GhN.A0D;
        C3DN A00 = c3do.A00(fragmentActivity);
        if (A00 != null && ((C3DP) A00).A0h) {
            AbstractC167017dG.A0y(fragmentActivity, c3do);
        }
        UserSession userSession = c37628GhN.A0G;
        EnumC37736GjB enumC37736GjB = this.A03;
        C116875Qr c116875Qr = new C116875Qr(enumC37736GjB.A02, userSession);
        c116875Qr.A07 = EnumC120795dP.A0e;
        AbstractC31173DnH.A1J(fragmentActivity, c116875Qr, userSession);
        C37540Gfw c37540Gfw = c37628GhN.A0J;
        C37522Gfe c37522Gfe = c37540Gfw.A19;
        C120985dq c120985dq = this.A01;
        if (c120985dq != null) {
            c38321qM = c120985dq.A02;
        } else {
            c38321qM = null;
        }
        C37604Ggz c37604Ggz = c37540Gfw.A1D;
        int i = this.A00;
        EnumC37738GjD enumC37738GjD = enumC37736GjB.A01;
        AbstractC167007dF.A1E(c37522Gfe, 0, c37604Ggz);
        if (c38321qM != null) {
            user = AbstractC25226BEj.A14(c38321qM);
        } else {
            user = null;
        }
        if (enumC37738GjD != null && c38321qM != null && user != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, userSession), "instagram_clips_viewer_lane_button_tap");
            if (A0f.isSampled()) {
                AbstractC25225BEi.A1O(A0f, c37522Gfe.getModuleName());
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    AbstractC25236BEt.A0r(A0f, A2u);
                    AbstractC25230BEn.A1D(A0f, Long.parseLong(user.getId()));
                    AbstractC25229BEm.A19(A0f, i);
                    AbstractC25225BEi.A1P(A0f, c37604Ggz.A01);
                    A0f.A8R(enumC37738GjD, "lane_type");
                    AbstractC37302Gc3.A0y(A0f, c38321qM);
                    AbstractC25233BEq.A17(A0f, "chaining_session_id", c37604Ggz.A00);
                    A0f.Cht();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        if (enumC37736GjB == EnumC37736GjB.A0C) {
            C85013qp A002 = AbstractC84973ql.A00(userSession);
            C84993qn c84993qn = A002.A06;
            int i2 = A002.A00;
            InterfaceC19610xo A0w = AbstractC166987dD.A0w((C23031Ai) c84993qn.A07.getValue());
            A0w.E7D("content_note_content_lane_nux_shown_count", i2);
            A0w.apply();
        }
    }
}
