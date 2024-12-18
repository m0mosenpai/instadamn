package X;

import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Mee, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50909Mee extends AbstractC52922bZ {
    public final MTU A00;
    public final boolean A01;
    public final IgLiveBroadcastInfoManager A02;
    public final NRG A03;

    public C50909Mee(IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, MTU mtu, NRG nrg, boolean z) {
        C51709Mse A0U;
        AbstractC167027dH.A13(igLiveBroadcastInfoManager, mtu, nrg);
        this.A02 = igLiveBroadcastInfoManager;
        this.A00 = mtu;
        this.A03 = nrg;
        this.A01 = z;
        if (!z && (A0U = MSX.A0U(igLiveBroadcastInfoManager)) != null) {
            nrg.A01(C05F.A0Y, A0U.A09, A0U.A08, "INSTAGRAM_USERPAY_BADGES");
        }
    }
}
