package X;

import com.instagram.aistudio.home.repository.AiSearchRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bc2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25847Bc2 extends AbstractC52922bZ {
    public final AiSearchRepository A00;
    public final C7F6 A01;
    public final C05A A02;
    public final C0UO A03;
    public final UserSession A04;

    public C25847Bc2(AiSearchRepository aiSearchRepository, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = aiSearchRepository;
        this.A04 = userSession;
        C008002u A1H = AbstractC25225BEi.A1H(new C51734MtH(C18U.A06(C06090Tz.A05, userSession, 36325081042989752L)));
        this.A02 = A1H;
        this.A03 = A1H;
        this.A01 = C7F4.A00(userSession);
    }

    public final void A00() {
        Object value;
        C16930sl c16930sl;
        boolean z;
        C7F6 c7f6 = this.A01;
        c7f6.A08(C05F.A0C, c7f6.A00);
        C05A c05a = this.A02;
        do {
            value = c05a.getValue();
            c16930sl = C16930sl.A00;
            z = ((C51734MtH) value).A06;
            C14360o3.A0B(c16930sl, 3);
        } while (!c05a.AIi(value, new C51734MtH("", c16930sl, 0, false, false, false, z)));
    }
}
