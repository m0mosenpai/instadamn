package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.NaJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C52862NaJ extends AbstractC52865NaM {
    public AnonymousClass195 A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52862NaJ(LIV liv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C171547kk c171547kk, C17060sy c17060sy, C57582kX c57582kX, EnumC142806cg enumC142806cg, OBA oba, O92 o92, OT2 ot2, IgLiveCommentsRepository igLiveCommentsRepository, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu, boolean z, boolean z2) {
        super(liv, interfaceC11380iw, userSession, c171547kk, c17060sy, c57582kX, oba, o92, ot2, igLiveCommentsRepository, igLiveModerationRepository, igLiveBroadcastInfoManager, c147856lA, igLiveHeartbeatManager, olc, mtu, z2);
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        C14360o3.A0B(igLiveCommentsRepository, 3);
        AbstractC25234BEr.A0k(4, olc, mtu, igLiveBroadcastInfoManager, c147856lA);
        AbstractC167007dF.A1J(igLiveModerationRepository, 8, igLiveHeartbeatManager);
        AbstractC25229BEm.A1N(enumC142806cg, 13, oba);
        AbstractC25233BEq.A0z(15, ot2, o92, c171547kk);
        C14360o3.A0B(c17060sy, 18);
        this.A01 = z;
        MSZ.A18(this, new C57178Pa3(this, null, 3), olc.A0f, igLiveBroadcastInfoManager.A06);
        A04();
    }
}
