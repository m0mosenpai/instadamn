package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LdB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48514LdB implements InterfaceC13000lm {
    public final C18920wW A00;
    public final UserSession A01;
    public final String A02 = AbstractC167017dG.A0j();

    public static final void A00(C48514LdB c48514LdB, String str, String str2, String str3, String str4, Map map) {
        C25531Mh A0F = C25531Mh.A0F(c48514LdB.A00);
        if (AbstractC25226BEj.A1Z(A0F)) {
            AbstractC31178DnM.A1F(A0F, c48514LdB.A01);
            A0F.A0k(str);
            A0F.A0j(str2);
            AbstractC43593JPy.A1N(A0F, str3);
            A0F.A0n("instagram");
            A0F.A0r(str4);
            A0F.A0u(c48514LdB.A02);
            A0F.A0v(map);
            A0F.Cht();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C48514LdB.class);
    }

    public C48514LdB(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC31177DnL.A0P(userSession).A00();
    }
}
