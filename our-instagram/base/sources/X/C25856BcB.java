package X;

import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolSettingsRepository;
import java.util.Collection;

/* renamed from: X.BcB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25856BcB extends AbstractC52922bZ {
    public final SchoolSettingsRepository A00;
    public final C05A A01;
    public final C0UO A02;
    public final UserSession A03;

    public C25856BcB(UserSession userSession, SchoolSettingsRepository schoolSettingsRepository) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = schoolSettingsRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C26084BgD());
        this.A01 = A1H;
        this.A02 = AbstractC208910l.A02(A1H);
        C141796aw A00 = AbstractC141776au.A00(this);
        PZC pzc = new PZC(this, null, 16);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new PZC(this, null, 17), AbstractC25235BEs.A0W(this, anonymousClass191, pzc, A00));
    }

    public static final void A00(C25856BcB c25856BcB) {
        Object value;
        C26084BgD c26084BgD;
        C05A c05a = c25856BcB.A01;
        do {
            value = c05a.getValue();
            c26084BgD = (C26084BgD) value;
        } while (!c05a.AIi(value, C26084BgD.A00((C51759Mti) c26084BgD.A02, AbstractC001800i.A0T(C28134Cah.A00, (Collection) c26084BgD.A03), c26084BgD.A01)));
    }
}
