package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* renamed from: X.MeR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50896MeR extends AbstractC52922bZ {
    public C0UO A00;
    public final UserSession A01;
    public final LimitsPlusRepository A02;

    public C50896MeR(UserSession userSession, LimitsPlusRepository limitsPlusRepository) {
        AbstractC167017dG.A1P(limitsPlusRepository, userSession);
        this.A02 = limitsPlusRepository;
        this.A01 = userSession;
        C007802s A01 = AnonymousClass111.A01(new C57154PYy(this, null, 8), limitsPlusRepository.A01);
        this.A00 = AbstractC208910l.A01(new OUV(null, null, null, null, null, null, null, false, false, false), AbstractC141776au.A00(this), A01, C10I.A01);
    }
}
