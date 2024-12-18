package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.audience.SelectAccountsUseCase$uiState$1;

/* renamed from: X.Btu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26893Btu extends C3r5 {
    public AnonymousClass195 A00;
    public final UserSession A01;
    public final AudienceRepository A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C0UO A0C;
    public final C0UO A0D;

    public C26893Btu(UserSession userSession, AudienceRepository audienceRepository, String str, C05A c05a, C05A c05a2) {
        C14360o3.A0B(str, 1);
        AbstractC25233BEq.A0x(2, userSession, c05a, c05a2);
        this.A03 = str;
        this.A01 = userSession;
        this.A02 = audienceRepository;
        this.A08 = c05a;
        this.A09 = c05a2;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A0A = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A07 = A002;
        C008002u A1H = AbstractC25225BEi.A1H(C6R.A04);
        this.A06 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(C6R.A03);
        this.A0B = A1H2;
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29908DGw(this, 1));
        C008002u A003 = C10E.A00(C28230Cca.A00);
        this.A05 = A003;
        this.A0C = AbstractC208910l.A02(A003);
        C15180pY A02 = C10Q.A02(new SelectAccountsUseCase$uiState$1(null), c05a, A00, A002, A1H, A1H2);
        this.A0D = AbstractC208910l.A01(new C26082BgB(null, null, null, null, null, null, 31, 2), A03(), A02, C10I.A01);
    }
}
