package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.NSc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52679NSc extends C4A7 {
    public final UserSession A00;
    public final C99694dm A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final C05A A05;
    public final C0UO A06;

    public C52679NSc(UserSession userSession, User user, String str, String str2) {
        super("Profile", C4A8.A01(854803684, AbstractC25230BEn.A07(1, userSession, str)));
        this.A00 = userSession;
        this.A02 = user;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = AbstractC99684dl.A00(userSession);
        C008002u A1H = AbstractC25225BEi.A1H(new C51698MsT(1, user.A22(), user.A21(), user.A20(), user.A1z(), AbstractC167007dF.A1T(user.A03.CUP())));
        this.A05 = A1H;
        this.A06 = A1H;
    }

    public static final void A00(C52679NSc c52679NSc) {
        Object value;
        User user;
        C05A c05a = c52679NSc.A05;
        do {
            value = c05a.getValue();
            user = c52679NSc.A02;
        } while (!c05a.AIi(value, new C51698MsT(1, user.A22(), user.A21(), user.A20(), user.A1z(), AbstractC167007dF.A1T(user.A03.CUP()))));
    }

    public static final void A01(C52679NSc c52679NSc, String str) {
        UserSession userSession = c52679NSc.A00;
        C19270xB A0D = AbstractC31171DnF.A0D(c52679NSc.A04);
        User user = c52679NSc.A02;
        C1571673v.A06(A0D, userSession, C1571673v.A01(user.B7L()), str, user.getId(), c52679NSc.A03);
    }
}
