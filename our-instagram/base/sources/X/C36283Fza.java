package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fza, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36283Fza implements InterfaceC13000lm {
    public final C18920wW A00;
    public final UserSession A01;

    public final void A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        C25531Mh A0F = C25531Mh.A0F(this.A00);
        if (AbstractC25226BEj.A1Z(A0F)) {
            AbstractC31178DnM.A1F(A0F, this.A01);
            AbstractC31174DnI.A1I(A0F, "jcs_accept_chat_limits");
            AbstractC31179DnN.A1E(A0F, "jcs_group_limit", str, str2);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C36283Fza.class);
    }

    public C36283Fza(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC31177DnL.A0P(userSession).A00();
    }
}
