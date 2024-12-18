package X;

import com.instagram.common.session.UserSession;
import com.instagram.hallpass.repository.HallPassParticipantsListRepository;

/* renamed from: X.EVu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32570EVu extends AbstractC61132qb {
    public final UserSession A00;

    public C32570EVu(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31799DyJ(new HallPassParticipantsListRepository(this.A00));
    }
}
