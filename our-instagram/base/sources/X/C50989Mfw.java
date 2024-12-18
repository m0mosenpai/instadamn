package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveViewerListApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Mfw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50989Mfw extends AbstractC52922bZ {
    public final C2GT A00;
    public final UserSession A01;
    public final IgLiveViewerListApi A02;
    public final EnumC142806cg A03;
    public final IgLiveBroadcastInfoManager A04;
    public final IgLiveHeartbeatManager A05;
    public final OLC A06;
    public final MTU A07;
    public final NRG A08;
    public final InterfaceC24731Iq A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;

    public /* synthetic */ C50989Mfw(UserSession userSession, EnumC142806cg enumC142806cg, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, ODQ odq, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu) {
        C0UO A00;
        IgLiveViewerListApi igLiveViewerListApi = new IgLiveViewerListApi(userSession);
        NRG A002 = AbstractC54273Nyt.A00(userSession);
        C14360o3.A0B(A002, 9);
        this.A01 = userSession;
        this.A03 = enumC142806cg;
        this.A07 = mtu;
        this.A04 = igLiveBroadcastInfoManager;
        this.A05 = igLiveHeartbeatManager;
        this.A06 = olc;
        this.A02 = igLiveViewerListApi;
        this.A08 = A002;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A09 = c24721Ip;
        this.A0A = AbstractC07080Za.A03(c24721Ip);
        C008002u A003 = C10E.A00(C51692MsN.A03);
        this.A0B = A003;
        C0UO c0uo = igLiveBroadcastInfoManager.A06;
        C0UO c0uo2 = igLiveHeartbeatManager.A08;
        if (odq != null) {
            A00 = odq.A02;
        } else {
            A00 = C10E.A00(null);
        }
        this.A00 = AbstractC31172DnG.A0E(MV5.A00(this, AbstractC50522MSa.A1b(new C0UO[]{A003, c0uo, c0uo2, A00, olc.A0Z, olc.A0h, olc.A0a}), 28));
    }

    public final void A00() {
        Object value;
        if (!((C51692MsN) this.A0B.getValue()).A02 && (value = this.A04.A06.getValue()) != null) {
            PZY.A02(value, this, AbstractC141776au.A00(this), 17);
        }
    }

    public final void A01(String str) {
        if (this instanceof C52898Nat) {
            C52898Nat c52898Nat = (C52898Nat) this;
            PZ1.A01(c52898Nat, str, AbstractC141776au.A00(c52898Nat), 34);
            C147776l2 c147776l2 = c52898Nat.A03;
            if (c147776l2 != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147776l2.A08, "live_tap_user");
                A0f.A9K("a_pk", AbstractC25228BEl.A13(c147776l2.A03));
                MSY.A12(A0f, Long.parseLong(c147776l2.A02));
                AbstractC37300Gc1.A0l(A0f, c147776l2.A04);
                A0f.AAP("method", "header");
                AbstractC37301Gc2.A15(A0f, c147776l2.A07);
                A0f.Cht();
            }
        }
    }
}
