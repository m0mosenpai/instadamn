package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.MgE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51007MgE extends AbstractC52922bZ {
    public final Context A00;
    public final C2GT A01;
    public final IncentivePlatformApi A02;
    public final MonetizationRepository A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final UserSession A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final C0UO A0D;
    public final C0UO A0E;

    public C51007MgE(Context context, UserSession userSession, IncentivePlatformApi incentivePlatformApi, MonetizationRepository monetizationRepository) {
        AbstractC167027dH.A0a(1, context, userSession, monetizationRepository, incentivePlatformApi);
        this.A00 = context;
        this.A0A = userSession;
        this.A03 = monetizationRepository;
        this.A02 = incentivePlatformApi;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A07 = A1H;
        this.A0C = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A08 = A1H2;
        this.A0D = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(false);
        this.A09 = A1H3;
        this.A0E = A1H3;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A1H4 = AbstractC25225BEi.A1H(new C51776Mug(false, c16930sl, c16930sl, c16930sl));
        this.A06 = A1H4;
        this.A0B = A1H4;
        this.A01 = AbstractC31172DnG.A0E(C10Q.A02(new C57210Pau(this), A1H3, monetizationRepository.A0F, A1H, A1H2, A1H4));
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A04 = c24721Ip;
        this.A05 = AbstractC07080Za.A03(c24721Ip);
    }

    public static final void A00(C51007MgE c51007MgE, String str) {
        AbstractC166987dD.A1Z(new PXZ(c51007MgE, str, null, 10, false), AbstractC141776au.A00(c51007MgE));
    }
}
