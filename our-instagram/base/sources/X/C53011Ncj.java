package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.video.live.mvvm.viewmodel.ufi.IgLiveViewerUfiViewModel$viewState$1;
import java.util.List;

/* renamed from: X.Ncj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53011Ncj extends AbstractC50987Mfu {
    public long A00;
    public final C2GT A01;
    public final C23031Ai A02;
    public final IgLiveBroadcastInfoManager A03;
    public final List A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final boolean A07;
    public final boolean A08;
    public final UserSession A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53011Ncj(UserSession userSession, C23031Ai c23031Ai, C147776l2 c147776l2, IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, OCR ocr, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu, boolean z, boolean z2) {
        super(c147776l2, igLiveBroadcastInfoManager, olc, mtu);
        JQ0.A1O(igLiveHeartbeatManager, mtu, igLiveQuestionSubmissionsRepository, ocr, olc);
        C14360o3.A0B(igLiveBroadcastInfoManager, 6);
        C14360o3.A0B(c23031Ai, 7);
        this.A03 = igLiveBroadcastInfoManager;
        this.A02 = c23031Ai;
        this.A09 = userSession;
        this.A07 = z;
        this.A08 = z2;
        this.A04 = AbstractC166987dD.A1E();
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A05 = c24721Ip;
        this.A06 = AbstractC07080Za.A03(c24721Ip);
        C0UO c0uo = olc.A0p;
        C0UO c0uo2 = igLiveHeartbeatManager.A08;
        C0UO c0uo3 = igLiveQuestionSubmissionsRepository.A06;
        C0UO c0uo4 = ocr.A03;
        C0UO c0uo5 = igLiveBroadcastInfoManager.A06;
        C0UO c0uo6 = olc.A0n;
        IgLiveViewerUfiViewModel$viewState$1 igLiveViewerUfiViewModel$viewState$1 = new IgLiveViewerUfiViewModel$viewState$1(this, null);
        this.A01 = AbstractC31172DnG.A0E(MSW.A1I(new C57157PZb(this, null, 7), C10Q.A03(new MU8((InterfaceC23621Ds) null, (Object) igLiveViewerUfiViewModel$viewState$1, 44), C10Q.A00(C57205Pap.A00, c0uo, c0uo2, c0uo3), C10Q.A00(C57206Paq.A00, c0uo4, c0uo5, c0uo6))));
    }

    public final boolean isButtonVisible(EnumC53184Nfg enumC53184Nfg, List list, boolean z) {
        AbstractC167017dG.A1N(enumC53184Nfg, list);
        if (list.contains(enumC53184Nfg)) {
            if (list.size() <= 4 || list.indexOf(enumC53184Nfg) < 3 || z) {
                return true;
            }
            return false;
        }
        return false;
    }
}
