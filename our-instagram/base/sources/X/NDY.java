package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDY extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public NDY(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(str, 3);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C17060sy A00 = C08730cb.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        String str = this.A04;
        if (str == null) {
            str = "";
        }
        String str2 = this.A02;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        OUK ouk = new OUK(interfaceC11380iw, userSession, str, str3, null);
        String str4 = this.A03;
        C146076i5 c146076i5 = new C146076i5(interfaceC11380iw, userSession, str4);
        if (str2 == null) {
            str2 = "";
        }
        return new C50940Mf9(A00, c146076i5, ouk, str4, str2);
    }
}
