package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GGu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36725GGu implements InterfaceC1119153d {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C2EE A01;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C36725GGu(UserSession userSession, C2EE c2ee) {
        this.A00 = userSession;
        this.A01 = c2ee;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        UserSession userSession = this.A00;
        C2EE c2ee = this.A01;
        C36299Fzu A00 = AbstractC34060F1n.A00(userSession);
        String C7I = c2ee.C7I();
        String C7q = c2ee.C7q();
        C25531Mh A002 = C36299Fzu.A00(A00);
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC31171DnF.A1T("upsell", A1G);
        if (AbstractC25226BEj.A1Z(A002)) {
            C36299Fzu.A04(A002, A00);
            AbstractC31174DnI.A1I(A002, "exit_share_to_story_sheet");
            A002.A0o("back_button");
            A002.A0p("share_to_story_bottom_sheet");
            A002.A0h(AbstractC31179DnN.A0Z(A002, "instagram", C7I, C7q));
            A002.A0v(A1G);
            A002.A0u(A00.A00);
            A002.Cht();
        }
    }
}
