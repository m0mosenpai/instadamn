package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository;

/* renamed from: X.KFk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45570KFk extends AbstractC61132qb {
    public final UserSession A00;

    public C45570KFk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44511JmH(new DirectPollMessageOptionVotersRepository(this.A00));
    }
}
