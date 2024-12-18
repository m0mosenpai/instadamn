package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.NCs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52303NCs extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final EnumC142806cg A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A01;
        EnumC142806cg enumC142806cg = this.A02;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, enumC142806cg);
        AbstractC147746kz A002 = AbstractC147746kz.A0A.A00(this.A00, userSession, enumC142806cg);
        IgLiveLikesRepository igLiveLikesRepository = (IgLiveLikesRepository) A00.A09.getValue();
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A00.A04;
        return new C51018MgQ((LIV) A00.A0F.getValue(), userSession, enumC142806cg, (OBC) A002.A07.getValue(), igLiveLikesRepository, A01, A00.A03, igLiveHeartbeatManager);
    }

    public C52303NCs(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        AbstractC167017dG.A1R(interfaceC11380iw, enumC142806cg);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = enumC142806cg;
    }
}
