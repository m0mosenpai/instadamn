package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.viewmodel.cobroadcast.IgLiveHostCobroadcastViewModel$4;

/* renamed from: X.Mgm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51037Mgm extends AbstractC52922bZ {
    public final C25671My A00;
    public final InterfaceC41501vz A01;
    public final UserSession A02;
    public final C56805PIw A03;
    public final C55085Oah A04;
    public final IgLiveCobroadcastRepository A05;
    public final IgLiveBroadcastInfoManager A06;
    public final C147856lA A07;
    public final ODQ A08;
    public final OLC A09;
    public final MTU A0A;
    public final C53021Nct A0B;
    public final java.util.Set A0C;
    public final java.util.Set A0D;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC19390xP A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static final void A00(C51037Mgm c51037Mgm, java.util.Set set) {
        Object value;
        if (AbstractC31171DnF.A1b(set) && (value = c51037Mgm.A06.A06.getValue()) != null) {
            C56805PIw c56805PIw = c51037Mgm.A03;
            c56805PIw.A0h.incrementAndGet();
            C56805PIw.A0B(c56805PIw, C05F.A0a);
            AbstractC166987dD.A1Z(new C57168PZm(set, value, c51037Mgm, (InterfaceC23621Ds) null, 13), AbstractC141776au.A00(c51037Mgm));
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        UserSession userSession = this.A02;
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        EnumC142806cg enumC142806cg = EnumC142806cg.A03;
        c147836l8.A01(userSession, enumC142806cg);
        AbstractC147746kz.A0A.A01(userSession, enumC142806cg);
        this.A00.A02(this.A01, C2AS.class);
    }

    public /* synthetic */ C51037Mgm(UserSession userSession, C56805PIw c56805PIw, C55085Oah c55085Oah, IgLiveCobroadcastRepository igLiveCobroadcastRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, ODQ odq, OLC olc, MTU mtu, C53021Nct c53021Nct, long j, long j2, boolean z, boolean z2) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(olc, 2);
        AbstractC25234BEr.A0k(3, mtu, odq, igLiveBroadcastInfoManager, c147856lA);
        AbstractC25229BEm.A1O(c53021Nct, 10, A00);
        this.A02 = userSession;
        this.A09 = olc;
        this.A0A = mtu;
        this.A05 = igLiveCobroadcastRepository;
        this.A08 = odq;
        this.A06 = igLiveBroadcastInfoManager;
        this.A07 = c147856lA;
        this.A03 = c56805PIw;
        this.A04 = c55085Oah;
        this.A0B = c53021Nct;
        this.A0H = z;
        this.A0G = z2;
        this.A00 = A00;
        C24721Ip A0s = MSY.A0s();
        this.A0E = A0s;
        this.A0F = AbstractC07080Za.A03(A0s);
        this.A0C = AbstractC31171DnF.A0l();
        this.A0D = AbstractC31171DnF.A0l();
        this.A01 = new C56026Otx(this, 5);
        MSZ.A17(this, C57167PZl.A01(this, null, 39), olc.A0s);
        MSZ.A17(this, new C57169PZn(this, null), mtu.A00);
        MSZ.A17(this, new C57168PZm(this, (InterfaceC23621Ds) null, 11), odq.A04);
        if (z2) {
            MSZ.A19(this, new IgLiveHostCobroadcastViewModel$4(this, null), olc.A0h, C0RV.A00(igLiveCobroadcastRepository.A02, j2), odq.A01);
            MSZ.A18(this, new MU8(this, (InterfaceC23621Ds) null, 36), odq.A02, C0RV.A00(igLiveCobroadcastRepository.A01, j));
        }
    }

    public static final void A01(C51037Mgm c51037Mgm, java.util.Set set) {
        AbstractC166987dD.A1Z(new C57169PZn(c51037Mgm, set, null, 41), AbstractC141776au.A00(c51037Mgm));
        if (!c51037Mgm.A0G) {
            c51037Mgm.A0C.removeAll(set);
        }
    }
}
