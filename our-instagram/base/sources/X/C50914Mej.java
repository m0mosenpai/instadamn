package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.Mej, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50914Mej extends AbstractC52922bZ {
    public final UserSession A00;
    public final MonetizationRepository A01;
    public final InterfaceC24731Iq A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;

    public C50914Mej(UserSession userSession, MonetizationRepository monetizationRepository) {
        AbstractC167017dG.A1P(userSession, monetizationRepository);
        this.A00 = userSession;
        this.A01 = monetizationRepository;
        this.A04 = AbstractC31171DnF.A0o();
        C24721Ip A0s = MSY.A0s();
        this.A02 = A0s;
        this.A03 = AbstractC07080Za.A03(A0s);
        UserSession userSession2 = this.A00;
        boolean A06 = C18U.A06(C06090Tz.A06, userSession2, 36319076678638501L);
        boolean A062 = C18U.A06(C06090Tz.A05, userSession2, 36315808210947664L);
        if (!A06 && !A062) {
            return;
        }
        AbstractC166987dD.A1Z(new PZ6(this, null, 3, A06, A062), AbstractC141776au.A00(this));
    }
}