package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.NDa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52311NDa extends AbstractC61132qb {
    public final long A00;
    public final UserSession A01;
    public final N2D A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    public C52311NDa(UserSession userSession, N2D n2d, Integer num, String str, long j, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A05 = z;
        this.A01 = userSession;
        this.A00 = j;
        this.A04 = str;
        this.A03 = num;
        this.A02 = n2d;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        if (this.A05) {
            UserSession userSession = this.A01;
            C54394O2a c54394O2a = new C54394O2a(AbstractC54041Nur.A00(userSession));
            C56135Ovv A00 = AbstractC54040Nuq.A00(userSession);
            MonetizationRepository A002 = AbstractC63302u8.A00(userSession);
            long j = this.A00;
            String str = this.A04;
            return new NJJ(userSession, this.A02, c54394O2a, A00, A002, AbstractC23021Ah.A00(userSession), this.A03, str, j);
        }
        return new NJI(new C54395O2b(this.A01), this.A00);
    }
}
