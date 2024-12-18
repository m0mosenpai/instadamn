package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;

/* loaded from: classes9.dex */
public final class NBZ extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A00;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, EnumC142806cg.A04);
        return new C53009Nch((IgLiveQuestionSubmissionsRepository) A00.A0C.getValue(), A00.A01(), A00.A04, A00.A02(), A00.A03(), C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 2342166213356104781L));
    }

    public NBZ(UserSession userSession) {
        this.A00 = userSession;
    }
}
