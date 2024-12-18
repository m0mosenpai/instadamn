package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.MgS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51020MgS extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public AnonymousClass195 A01;
    public final EnumC142806cg A02;
    public final C56805PIw A03;
    public final C54805OJz A04;
    public final O95 A05;
    public final IgLiveJoinRequestsRepository A06;
    public final IgLiveBroadcastInfoManager A07;
    public final ODQ A08;
    public final IgLiveHeartbeatManager A09;
    public final OLC A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final IgLiveCobroadcastRepository A0D;
    public final C54817OKs A0E;
    public final IgLiveLikesRepository A0F;
    public final C147856lA A0G;

    public C51020MgS(EnumC142806cg enumC142806cg, C56805PIw c56805PIw, IgLiveCobroadcastRepository igLiveCobroadcastRepository, C54805OJz c54805OJz, C54817OKs c54817OKs, O95 o95, IgLiveJoinRequestsRepository igLiveJoinRequestsRepository, IgLiveLikesRepository igLiveLikesRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, ODQ odq, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, boolean z, boolean z2) {
        C14360o3.A0B(c147856lA, 1);
        AbstractC25233BEq.A0w(2, igLiveBroadcastInfoManager, igLiveHeartbeatManager, igLiveLikesRepository);
        AbstractC167017dG.A1U(odq, olc);
        C14360o3.A0B(c54817OKs, 8);
        this.A0G = c147856lA;
        this.A07 = igLiveBroadcastInfoManager;
        this.A09 = igLiveHeartbeatManager;
        this.A0F = igLiveLikesRepository;
        this.A0D = igLiveCobroadcastRepository;
        this.A08 = odq;
        this.A0A = olc;
        this.A0E = c54817OKs;
        this.A04 = c54805OJz;
        this.A06 = igLiveJoinRequestsRepository;
        this.A05 = o95;
        this.A03 = c56805PIw;
        this.A02 = enumC142806cg;
        this.A0B = z;
        this.A0C = z2;
        AbstractC18560vj.A03(AbstractC141776au.A00(this), C10Q.A01(new D5K(this, null, 2), igLiveCobroadcastRepository.A01, odq.A02, odq.A01, igLiveBroadcastInfoManager.A06));
        AbstractC25232BEp.A1J(this, new C57154PYy(this, null, 1), igLiveHeartbeatManager.A08);
    }

    public static final void A00(C51020MgS c51020MgS) {
        if (c51020MgS.A00 == null) {
            c51020MgS.A00 = AbstractC25226BEj.A1L(new PZD(c51020MgS, null, 27), AbstractC141776au.A00(c51020MgS));
        }
    }

    public final void A01(String str, Long l) {
        AbstractC166987dD.A1Z(new PZ1(this, str, null, 39), AbstractC141776au.A00(this));
        if (l != null) {
            this.A0G.A01.A01 = l.longValue() * 1000;
        }
        C55072OaS c55072OaS = this.A08.A00;
        OFE ofe = c55072OaS.A00;
        if (ofe != null) {
            if (!C14360o3.A0K(ofe.A08, str)) {
                throw AbstractC166987dD.A14("Cannot reuse for another broadcast.");
            }
        } else {
            c55072OaS.A06.Egh(null);
            C05A c05a = c55072OaS.A04;
            C16910sj c16910sj = C16910sj.A00;
            c05a.Egh(c16910sj);
            c55072OaS.A03.Egh(c16910sj);
            c55072OaS.A05.Egh(c16910sj);
            c55072OaS.A00 = new OFE(c55072OaS.A01, c55072OaS, str);
        }
        OFE ofe2 = c55072OaS.A00;
        if (ofe2 != null && !ofe2.A01) {
            C25671My A00 = AbstractC25651Mw.A00(ofe2.A02);
            A00.A01(ofe2.A04, NYE.class);
            A00.A01(ofe2.A07, NYI.class);
            A00.A01(ofe2.A06, NYH.class);
            A00.A01(ofe2.A05, NYG.class);
            ofe2.A01 = true;
        }
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A00 = null;
        A00(this);
        EnumC142806cg enumC142806cg = this.A02;
        EnumC142806cg enumC142806cg2 = EnumC142806cg.A03;
        if (enumC142806cg == enumC142806cg2) {
            this.A0F.A02(str, AbstractC141776au.A00(this));
        }
        OLC olc = this.A0A;
        if (olc.A03 == enumC142806cg2) {
            olc.A0U.Egh(EnumC53165NfK.A04);
        }
        olc.A0G.Egh(true);
        olc.A0K.Egh(true);
        IgLiveJoinRequestsRepository igLiveJoinRequestsRepository = this.A06;
        if (igLiveJoinRequestsRepository != null) {
            AbstractC25232BEp.A1J(this, new MUV(this, str, null, 3), igLiveJoinRequestsRepository.A09);
        }
    }
}
