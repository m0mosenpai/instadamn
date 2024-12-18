package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.NCu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52305NCu extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C52305NCu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        NZZ A02 = OYB.A02(userSession);
        NYV A01 = OQX.A01(this.A01, userSession);
        IgLiveBroadcastInfoManager A012 = A02.A01();
        C147856lA c147856lA = A02.A03;
        MTU A03 = A02.A03();
        IgLiveExploreRepository igLiveExploreRepository = new IgLiveExploreRepository(userSession);
        return new C50960MfT(userSession, AbstractC23021Ah.A00(userSession), A01.A01(this.A00), igLiveExploreRepository, A012, c147856lA, A03, C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325274316518350L));
    }
}
