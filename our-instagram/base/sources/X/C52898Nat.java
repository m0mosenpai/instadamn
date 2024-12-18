package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Nat, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52898Nat extends C50989Mfw {
    public final C18920wW A00;
    public final UserSession A01;
    public final C145826hf A02;
    public final C147776l2 A03;
    public final IgLiveCommentsRepository A04;
    public final OJ4 A05;
    public final C147856lA A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52898Nat(C18920wW c18920wW, UserSession userSession, C145826hf c145826hf, C147776l2 c147776l2, IgLiveCommentsRepository igLiveCommentsRepository, OJ4 oj4, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu) {
        super(userSession, EnumC142806cg.A05, igLiveBroadcastInfoManager, null, igLiveHeartbeatManager, olc, mtu);
        AbstractC167017dG.A1Q(userSession, mtu);
        AbstractC25234BEr.A0k(4, igLiveBroadcastInfoManager, igLiveHeartbeatManager, olc, c147856lA);
        AbstractC167007dF.A1J(igLiveCommentsRepository, 8, oj4);
        this.A01 = userSession;
        this.A00 = c18920wW;
        this.A06 = c147856lA;
        this.A04 = igLiveCommentsRepository;
        this.A05 = oj4;
        this.A03 = c147776l2;
        this.A02 = c145826hf;
    }
}
