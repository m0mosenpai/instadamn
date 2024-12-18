package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveWaveApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* loaded from: classes9.dex */
public final class OF1 {
    public C1Df A00;
    public String A01;
    public final UserSession A02;
    public final IgLiveWaveApi A03;
    public final IgLiveBroadcastInfoManager A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C147856lA A07;

    public OF1(UserSession userSession, IgLiveWaveApi igLiveWaveApi, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA) {
        AbstractC167027dH.A13(userSession, c147856lA, igLiveBroadcastInfoManager);
        this.A02 = userSession;
        this.A07 = c147856lA;
        this.A04 = igLiveBroadcastInfoManager;
        this.A03 = igLiveWaveApi;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A05 = A12;
        this.A06 = AbstractC07080Za.A03(A12);
    }
}
