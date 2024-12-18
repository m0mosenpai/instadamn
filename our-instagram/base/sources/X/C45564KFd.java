package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.powerups.repository.AvatarPowerupsRepository;

/* renamed from: X.KFd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45564KFd extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44514JmK(new AvatarPowerupsRepository(this.A00));
    }

    public C45564KFd(UserSession userSession) {
        this.A00 = userSession;
    }
}
