package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TEd implements C1CF {
    public final int A00;
    public final UserSession A01;

    @Override // X.C1CF
    public final boolean EjH(int i) {
        return C21A.A02() || i % this.A00 == 0;
    }

    @Override // X.C1CF
    public final boolean isEnabled() {
        if (!AbstractC59092nA.A00(this.A01).A02 && !C21A.A02()) {
            return false;
        }
        return true;
    }

    public TEd(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36594762039494481L);
    }
}
