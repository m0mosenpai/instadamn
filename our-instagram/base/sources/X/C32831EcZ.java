package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EcZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32831EcZ extends AbstractC36418G4t {
    public final UserSession A00;
    public final C7U0 A01;

    public C32831EcZ(FragmentActivity fragmentActivity, UserSession userSession, C7U0 c7u0) {
        super(fragmentActivity, userSession, c7u0, 32);
        this.A00 = userSession;
        this.A01 = c7u0;
    }

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        C83693oE c83693oE;
        InterfaceC163837Ux C7r = this.A01.C7r();
        InterfaceC83733oI CCa = C7r.CCa();
        if (CCa != null) {
            c83693oE = AbstractC1345466e.A02(CCa);
        } else {
            c83693oE = null;
        }
        if (c83693oE == null) {
            return false;
        }
        C83693oE A01 = AbstractC1345466e.A01(CCa);
        UserSession userSession = this.A00;
        if ((!C14360o3.A0K(userSession.userId, C7r.Bj3()) || !C18U.A06(C06090Tz.A05, userSession, 36315859748720276L)) && !C98Q.A00(userSession).A00(A01, 24)) {
            return false;
        }
        return true;
    }
}
