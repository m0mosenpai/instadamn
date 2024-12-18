package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NCD extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public NCD(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C147766l1 A002 = AbstractC147736ky.A00(interfaceC11380iw, userSession);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        MTU A03 = A00.A03();
        IgLiveBroadcastInfoManager A012 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = ((AbstractC147826l7) A00).A04;
        OLC A02 = A00.A02();
        C147856lA c147856lA = ((AbstractC147826l7) A00).A03;
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) A00.A06.getValue();
        OJ4 oj4 = (OJ4) A00.A00.getValue();
        return new C52898Nat(A01, userSession, A002.A00, (C147776l2) A002.A05.getValue(), igLiveCommentsRepository, oj4, A012, c147856lA, igLiveHeartbeatManager, A02, A03);
    }
}
