package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class T4U implements InterfaceC96424Va {
    public final UserSession A00;

    @Override // X.InterfaceC96424Va
    public final InterfaceC92354Bq ALy() {
        InterfaceC92354Bq t4y;
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36318861933812384L)) {
            LJJ ljj = C48517LdF.A08;
            t4y = new T4W(userSession, new T4Z(new T4X(userSession), LJJ.A01(userSession).A02()), new T4Y(userSession));
        } else {
            t4y = new T4Y(userSession);
        }
        return t4y;
    }

    public T4U(UserSession userSession) {
        this.A00 = userSession;
    }
}
