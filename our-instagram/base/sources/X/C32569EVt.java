package X;

import com.instagram.common.session.UserSession;
import com.instagram.hallpass.repository.HallPassMemberListRepository;

/* renamed from: X.EVt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32569EVt extends AbstractC61132qb {
    public final UserSession A00;

    public C32569EVt(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31828Dym(new HallPassMemberListRepository(this.A00));
    }
}
