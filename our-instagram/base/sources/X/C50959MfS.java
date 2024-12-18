package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.MfS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50959MfS extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C145826hf A03;
    public final OJ4 A04;
    public final OF1 A05;
    public final IgLiveBroadcastInfoManager A06;
    public final C147856lA A07;
    public final MTU A08;
    public final InterfaceC24731Iq A09;
    public final InterfaceC19390xP A0A;
    public final C147776l2 A0B;

    public C50959MfS(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C145826hf c145826hf, C147776l2 c147776l2, OJ4 oj4, OF1 of1, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, MTU mtu) {
        JQ0.A1O(userSession, interfaceC11380iw, igLiveBroadcastInfoManager, c147856lA, oj4);
        AbstractC167017dG.A1U(of1, mtu);
        C14360o3.A0B(c147776l2, 8);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A06 = igLiveBroadcastInfoManager;
        this.A07 = c147856lA;
        this.A04 = oj4;
        this.A05 = of1;
        this.A08 = mtu;
        this.A0B = c147776l2;
        this.A03 = c145826hf;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A09 = A12;
        this.A0A = AbstractC07080Za.A03(A12);
    }
}
