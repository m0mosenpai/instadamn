package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32832Eca extends AbstractC36418G4t {
    public final UserSession A00;
    public final C7U0 A01;

    public C32832Eca(FragmentActivity fragmentActivity, UserSession userSession, C7U0 c7u0) {
        super(fragmentActivity, userSession, c7u0, 28);
        this.A00 = userSession;
        this.A01 = c7u0;
    }

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        UserSession userSession = this.A00;
        if (C14360o3.A0K(userSession.userId, this.A01.C7r().Bj3()) && C18U.A06(C06090Tz.A05, userSession, 36322821890189998L)) {
            return true;
        }
        return false;
    }
}
