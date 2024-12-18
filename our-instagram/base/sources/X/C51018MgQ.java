package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.MgQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51018MgQ extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public final LIV A01;
    public final UserSession A02;
    public final OBC A03;
    public final IgLiveLikesRepository A04;
    public final IgLiveBroadcastInfoManager A05;
    public final C147856lA A06;
    public final IgLiveHeartbeatManager A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;

    public C51018MgQ(LIV liv, UserSession userSession, EnumC142806cg enumC142806cg, OBC obc, IgLiveLikesRepository igLiveLikesRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, IgLiveHeartbeatManager igLiveHeartbeatManager) {
        AbstractC167027dH.A0a(1, igLiveLikesRepository, igLiveBroadcastInfoManager, igLiveHeartbeatManager, c147856lA);
        AbstractC167017dG.A1U(userSession, enumC142806cg);
        C14360o3.A0B(obc, 8);
        this.A04 = igLiveLikesRepository;
        this.A05 = igLiveBroadcastInfoManager;
        this.A07 = igLiveHeartbeatManager;
        this.A06 = c147856lA;
        this.A01 = liv;
        this.A02 = userSession;
        this.A03 = obc;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A08 = A12;
        this.A09 = AbstractC07080Za.A03(A12);
        PZY.A01(this, igLiveLikesRepository.A07, 27);
    }

    public static final void A00(String str) {
        C14360o3.A0B(str, 0);
        C0f5 A00 = C18950wb.A00("Avatar sticker url expired", 817902226, true);
        A00.ABW("avatar_reaction_template_id", str);
        A00.report();
    }

    public final void A06() {
        IgLiveLikesRepository igLiveLikesRepository = this.A04;
        igLiveLikesRepository.A02(null, AbstractC141776au.A00(this));
        if (this.A00 == null) {
            this.A00 = MSY.A0q(this, AnonymousClass111.A01(new PZY(this, null, 28), igLiveLikesRepository.A05));
        }
    }
}
