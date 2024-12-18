package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Mew, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50927Mew extends AbstractC52922bZ {
    public final C17060sy A00;
    public final IgLiveBroadcastInfoManager A01;
    public final MTU A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final UserSession A05;

    public C50927Mew(UserSession userSession, C17060sy c17060sy, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, MTU mtu) {
        AbstractC167027dH.A0a(1, userSession, igLiveBroadcastInfoManager, mtu, c17060sy);
        this.A05 = userSession;
        this.A01 = igLiveBroadcastInfoManager;
        this.A02 = mtu;
        this.A00 = c17060sy;
        C24721Ip A0s = MSY.A0s();
        this.A03 = A0s;
        this.A04 = AbstractC07080Za.A03(A0s);
        PZY.A01(this, mtu.A00, 25);
    }
}
