package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OCZ {
    public final UserSession A00;
    public final C40121td A01;
    public final Map A02;
    public final InterfaceC53852dP A03;

    public OCZ(UserSession userSession, C40121td c40121td) {
        AbstractC167017dG.A1P(userSession, c40121td);
        this.A00 = userSession;
        this.A01 = c40121td;
        this.A02 = AbstractC166987dD.A1I();
        C56486P6b c56486P6b = new C56486P6b(this, 1);
        this.A03 = c56486P6b;
        c40121td.A0H(c56486P6b);
    }
}
