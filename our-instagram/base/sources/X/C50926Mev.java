package X;

import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Mev, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50926Mev extends AbstractC52922bZ {
    public boolean A00;
    public boolean A01;
    public final IgLiveHeartbeatManager A02;
    public final MTU A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;

    public C50926Mev(IgLiveHeartbeatManager igLiveHeartbeatManager, MTU mtu) {
        AbstractC167017dG.A1P(igLiveHeartbeatManager, mtu);
        this.A02 = igLiveHeartbeatManager;
        this.A03 = mtu;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A04 = A12;
        this.A05 = AbstractC07080Za.A03(A12);
        PZY.A01(this, igLiveHeartbeatManager.A08, 23);
        PZY.A01(this, mtu.A00, 24);
    }
}
