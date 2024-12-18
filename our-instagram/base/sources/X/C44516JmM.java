package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JmM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44516JmM extends AbstractC52922bZ {
    public final C05A A00;
    public final C0UO A01;
    public final boolean A02;
    public final UserSession A03;

    public C44516JmM(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = z;
        C008002u A1H = AbstractC25225BEi.A1H(new C51733MtG(C05F.A00, false, z, z, z, false));
        this.A00 = A1H;
        this.A01 = A1H;
    }

    public final boolean A00() {
        UserSession userSession = this.A03;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36328491247091266L) && !C18U.A06(c06090Tz, userSession, 36328491247287877L)) {
            return false;
        }
        return true;
    }
}
