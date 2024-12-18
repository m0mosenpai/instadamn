package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;

/* loaded from: classes9.dex */
public final class NCE extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C147766l1 A002 = AbstractC147736ky.A00(interfaceC11380iw, userSession);
        IgLiveLikesRepository igLiveLikesRepository = (IgLiveLikesRepository) A00.A09.getValue();
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = ((AbstractC147826l7) A00).A04;
        C147856lA c147856lA = ((AbstractC147826l7) A00).A03;
        return new IgLiveViewerLikesViewModel(AbstractC12220kQ.A01(interfaceC11380iw, userSession), userSession, A002.A00, (OBC) ((AbstractC147746kz) A002).A07.getValue(), igLiveLikesRepository, (OJ4) A00.A00.getValue(), A01, c147856lA, igLiveHeartbeatManager, A00.A02(), A00.A03());
    }

    public NCE(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
