package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveViewerListApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Nac, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52881Nac extends AbstractC31842Dz3 {
    public final IgLiveViewerListApi A00;
    public final IgLiveBroadcastInfoManager A01;
    public final InterfaceC19390xP A02;

    @Override // X.AbstractC31842Dz3
    public final Integer A02() {
        return null;
    }

    @Override // X.AbstractC31842Dz3
    public final void A06() {
    }

    @Override // X.AbstractC31842Dz3
    public final InterfaceC19390xP A04() {
        return this.A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52881Nac(UserSession userSession, IgLiveViewerListApi igLiveViewerListApi, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager) {
        super(userSession, 4);
        String str;
        AbstractC167017dG.A1P(userSession, igLiveBroadcastInfoManager);
        this.A01 = igLiveBroadcastInfoManager;
        this.A00 = igLiveViewerListApi;
        C51709Mse A0U = MSX.A0U(igLiveBroadcastInfoManager);
        this.A02 = new MZP(igLiveViewerListApi.A00((A0U == null || (str = A0U.A08) == null) ? "0" : str), 31);
        A05();
    }
}
