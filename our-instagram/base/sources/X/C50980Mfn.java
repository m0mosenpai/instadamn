package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Mfn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50980Mfn extends AbstractC52922bZ {
    public float A00;
    public AnonymousClass195 A01;
    public final AbstractC55106ObM A02;
    public final EnumC142806cg A03;
    public final O95 A04;
    public final IgLiveModerationRepository A05;
    public final O97 A06;
    public final IgLiveBroadcastInfoManager A07;
    public final C147856lA A08;
    public final IgLiveHeartbeatManager A09;
    public final OLC A0A;
    public final MTU A0B;
    public final InterfaceC24731Iq A0C;
    public final InterfaceC19390xP A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final void A00(float f) {
        AbstractC166997dE.A1Y(this.A0A.A0C, true);
        float f2 = this.A00;
        float f3 = f;
        if (f < f2) {
            f3 = f2;
        }
        this.A00 = f3;
        AbstractC166987dD.A1Z(new PYa(this, null, f, 11), AbstractC141776au.A00(this));
    }

    public C50980Mfn(AbstractC55106ObM abstractC55106ObM, EnumC142806cg enumC142806cg, O95 o95, IgLiveModerationRepository igLiveModerationRepository, O97 o97, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu, boolean z, boolean z2, boolean z3) {
        JQ0.A1O(igLiveBroadcastInfoManager, igLiveHeartbeatManager, olc, igLiveModerationRepository, c147856lA);
        AbstractC25229BEm.A1J(mtu, 9, enumC142806cg);
        this.A07 = igLiveBroadcastInfoManager;
        this.A09 = igLiveHeartbeatManager;
        this.A0A = olc;
        this.A05 = igLiveModerationRepository;
        this.A08 = c147856lA;
        this.A04 = o95;
        this.A02 = abstractC55106ObM;
        this.A06 = o97;
        this.A0B = mtu;
        this.A03 = enumC142806cg;
        this.A0G = z;
        this.A0E = z2;
        this.A0F = z3;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A0C = A12;
        this.A0D = AbstractC07080Za.A03(A12);
        AbstractC25232BEp.A1J(this, C57167PZl.A01(this, null, 37), mtu.A00);
    }
}
