package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveNotificationApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.MfU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50961MfU extends AbstractC52922bZ {
    public String A00;
    public final Context A01;
    public final C2GT A02;
    public final InterfaceC11380iw A03;
    public final C28271Yo A04;
    public final UserSession A05;
    public final IgLiveNotificationApi A06;
    public final O94 A07;
    public final IgLiveExploreRepository A08;
    public final IgLiveBroadcastInfoManager A09;
    public final MTU A0A;
    public final InterfaceC24731Iq A0B;
    public final InterfaceC19390xP A0C;
    public final boolean A0D;

    public C50961MfU(Context context, InterfaceC11380iw interfaceC11380iw, C28271Yo c28271Yo, UserSession userSession, IgLiveNotificationApi igLiveNotificationApi, O94 o94, IgLiveExploreRepository igLiveExploreRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, MTU mtu, boolean z) {
        AbstractC25233BEq.A0x(2, context, igLiveBroadcastInfoManager, mtu);
        AbstractC167007dF.A1J(interfaceC11380iw, 8, o94);
        this.A05 = userSession;
        this.A01 = context;
        this.A08 = igLiveExploreRepository;
        this.A09 = igLiveBroadcastInfoManager;
        this.A0A = mtu;
        this.A06 = igLiveNotificationApi;
        this.A04 = c28271Yo;
        this.A03 = interfaceC11380iw;
        this.A07 = o94;
        this.A0D = z;
        this.A02 = MSZ.A0L(new C57184PaK(this, null, 6), igLiveExploreRepository.A09, igLiveExploreRepository.A08, igLiveExploreRepository.A07);
        C24721Ip A0s = MSY.A0s();
        this.A0B = A0s;
        this.A0C = AbstractC07080Za.A03(A0s);
    }
}
