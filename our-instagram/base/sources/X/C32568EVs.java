package X;

import com.instagram.common.session.UserSession;
import com.instagram.hallpass.repository.HallPassRepository;

/* renamed from: X.EVs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32568EVs extends AbstractC61132qb {
    public final UserSession A00;

    public C32568EVs(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31821Dyf(new HallPassRepository(this.A00));
    }
}
