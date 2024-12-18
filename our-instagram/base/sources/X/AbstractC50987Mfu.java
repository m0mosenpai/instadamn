package X;

import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Mfu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50987Mfu extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public boolean A01;
    public final IgLiveBroadcastInfoManager A02;
    public final OLC A03;
    public final MTU A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C147776l2 A07;

    public final void A00() {
        C147776l2 c147776l2;
        OLC olc = this.A03;
        C0UO c0uo = olc.A0p;
        if (!MSZ.A1a(c0uo) && (c147776l2 = this.A07) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147776l2.A08, "ig_live_expand_ufi");
            MSY.A16(A0f, c147776l2.A03);
            MSY.A12(A0f, Long.parseLong(c147776l2.A02));
            AbstractC37301Gc2.A15(A0f, c147776l2.A07);
            AbstractC37300Gc1.A0l(A0f, c147776l2.A04);
            MSW.A1T(A0f, "viewer");
            MSY.A17(A0f, AbstractC001800i.A0a(c147776l2.A06));
        }
        boolean z = !MSZ.A1a(c0uo);
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A00);
        if (z) {
            this.A00 = AbstractC25226BEj.A1L(new PZD(this, A0s, 46), AbstractC141776au.A00(this));
        }
        AbstractC166997dE.A1Y(olc.A0R, !MSZ.A1a(c0uo));
    }

    public final void A01() {
        AbstractC25229BEm.A1R(this.A00);
        AbstractC166997dE.A1Y(this.A03.A0R, false);
    }

    public AbstractC50987Mfu(C147776l2 c147776l2, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, OLC olc, MTU mtu) {
        this.A04 = mtu;
        this.A02 = igLiveBroadcastInfoManager;
        this.A03 = olc;
        this.A07 = c147776l2;
        C24721Ip A0s = MSY.A0s();
        this.A05 = A0s;
        this.A06 = AbstractC07080Za.A03(A0s);
    }
}
