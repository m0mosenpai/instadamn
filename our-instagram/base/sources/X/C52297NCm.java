package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveNotificationApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.NCm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52297NCm extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C52297NCm(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C147766l1 A002 = AbstractC147736ky.A00(interfaceC11380iw, userSession);
        Context context = this.A00;
        IgLiveExploreRepository igLiveExploreRepository = new IgLiveExploreRepository(userSession);
        IgLiveBroadcastInfoManager A01 = A00.A01();
        MTU A03 = A00.A03();
        return new C50961MfU(context, interfaceC11380iw, C2OJ.A00(), userSession, new IgLiveNotificationApi(userSession), (O94) A002.A03.getValue(), igLiveExploreRepository, A01, A03, C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325274316518350L));
    }
}
