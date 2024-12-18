package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NCH extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        C147766l1 A002 = AbstractC147736ky.A00(this.A00, userSession);
        IgLiveBroadcastInfoManager igLiveBroadcastInfoManager = (IgLiveBroadcastInfoManager) ((AbstractC147826l7) A00).A05.getValue();
        C147856lA c147856lA = ((AbstractC147826l7) A00).A03;
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) A00.A06.getValue();
        IgLiveHeartbeatManager igLiveHeartbeatManager = (IgLiveHeartbeatManager) A00.A08.getValue();
        OLC A02 = A00.A02();
        O97 o97 = (O97) A00.A03.getValue();
        OCR ocr = (OCR) A00.A0G.getValue();
        IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository = (IgLiveViewerJoinFlowRepository) A00.A02.getValue();
        MTU A03 = A00.A03();
        O96 o96 = (O96) A00.A01.getValue();
        return new C51041Mgr(userSession, (C147776l2) A002.A05.getValue(), igLiveCommentsRepository, (OJ4) A00.A00.getValue(), ocr, o96, igLiveViewerJoinFlowRepository, o97, igLiveBroadcastInfoManager, c147856lA, igLiveHeartbeatManager, A02, A03);
    }

    public NCH(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
