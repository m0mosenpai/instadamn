package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Nci, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53010Nci extends AbstractC50987Mfu {
    public boolean A00;
    public final C2GT A01;
    public final C23031Ai A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53010Nci(C23031Ai c23031Ai, IgLiveJoinRequestsRepository igLiveJoinRequestsRepository, IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, OLC olc, MTU mtu, boolean z) {
        super(null, igLiveBroadcastInfoManager, olc, mtu);
        AbstractC167027dH.A0a(1, igLiveJoinRequestsRepository, mtu, igLiveQuestionSubmissionsRepository, igLiveBroadcastInfoManager);
        C14360o3.A0B(olc, 5);
        C14360o3.A0B(c23031Ai, 6);
        this.A02 = c23031Ai;
        this.A06 = z;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A03 = c24721Ip;
        this.A04 = AbstractC07080Za.A03(c24721Ip);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A05 = A1A;
        C0UO c0uo = igLiveJoinRequestsRepository.A09;
        C0UO c0uo2 = igLiveJoinRequestsRepository.A0C;
        C0UO c0uo3 = igLiveQuestionSubmissionsRepository.A06;
        C0UO c0uo4 = igLiveBroadcastInfoManager.A06;
        C15180pY A02 = C10Q.A02(new D5N(this, null, 1), c0uo, c0uo2, c0uo3, c0uo4, A1A);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A02);
        MSZ.A19(this, new BUP(olc, null), olc.A0j, olc.A0l, c0uo4);
        MSZ.A17(this, new PZK(this, null, 16), olc.A0q);
        AbstractC23641Du.A05(anonymousClass191, new C57157PZb(mtu, this, (InterfaceC23621Ds) null, 6), AbstractC141776au.A00(this));
    }

    public final String getFormattedBadgeCount(int i, int i2) {
        if (i > i2) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(i2);
            return MSX.A0l(A1C, '+');
        }
        return String.valueOf(i);
    }
}
