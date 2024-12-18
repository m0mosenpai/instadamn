package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NCI extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        C147766l1 A002 = AbstractC147736ky.A00(this.A00, userSession);
        IgLiveHeartbeatManager igLiveHeartbeatManager = ((AbstractC147826l7) A00).A04;
        MTU A03 = A00.A03();
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = (IgLiveQuestionSubmissionsRepository) A00.A0C.getValue();
        OCR ocr = (OCR) A00.A0G.getValue();
        OLC A02 = A00.A02();
        return new C53011Ncj(userSession, AbstractC23021Ah.A00(userSession), (C147776l2) A002.A04.getValue(), igLiveQuestionSubmissionsRepository, ocr, A00.A01(), igLiveHeartbeatManager, A02, A03, AbstractC109224vo.A04(userSession), C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 2342166213356104781L));
    }

    public NCI(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
