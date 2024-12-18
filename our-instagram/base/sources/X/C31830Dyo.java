package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dyo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31830Dyo extends AbstractC52922bZ {
    public User A00;
    public final UserSession A01;
    public final List A02;
    public final C05A A03;
    public final C0UO A04;
    public final C33087Eik A05;

    public C31830Dyo(UserSession userSession, C33087Eik c33087Eik) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A05 = c33087Eik;
        C008002u A00 = C10E.A00(C36756GIe.A00);
        this.A03 = A00;
        this.A04 = AbstractC208910l.A02(A00);
        this.A02 = AbstractC166987dD.A1E();
    }

    public final void A00(C31543DtT c31543DtT, String str, String str2) {
        if (str != null && str2 != null) {
            c31543DtT.A02 = true;
            AbstractC166987dD.A1Z(new C50125MBz(this, c31543DtT, str2, str, null, 18), AbstractC141776au.A00(this));
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A05.onUserSessionWillEnd(false);
    }
}
