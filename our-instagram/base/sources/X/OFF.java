package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveViewerListApi;

/* loaded from: classes9.dex */
public final class OFF {
    public int A00;
    public String A01;
    public final UserSession A02;
    public final IgLiveModerationApi A03;
    public final IgLiveViewerListApi A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;

    public /* synthetic */ OFF(UserSession userSession) {
        IgLiveModerationApi igLiveModerationApi = new IgLiveModerationApi(userSession);
        IgLiveViewerListApi igLiveViewerListApi = new IgLiveViewerListApi(userSession);
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = igLiveModerationApi;
        this.A04 = igLiveViewerListApi;
        this.A00 = 1;
        MUq mUq = MUq.A00;
        C008002u A00 = C10E.A00(mUq);
        this.A05 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(mUq);
        this.A06 = A002;
        this.A08 = AbstractC208910l.A02(A002);
    }
}
