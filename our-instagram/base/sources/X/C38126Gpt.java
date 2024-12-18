package X;

import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.Gpt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38126Gpt implements InterfaceC61522rF {
    public final UserSession A00;
    public final AbstractC64162vb A01;
    public final C57112jm A02;
    public final C38132Gpz A03;
    public final C38133Gq0 A04;
    public final C38127Gpu A05;
    public final C38131Gpy A06;
    public final C38140Gq7 A07;
    public final java.util.Set A08;
    public final C64092vU A09;

    @Override // X.InterfaceC61522rF
    public final void A8m(InterfaceC673231x interfaceC673231x) {
        C14360o3.A0B(interfaceC673231x, 0);
        this.A08.add(interfaceC673231x);
    }

    @Override // X.InterfaceC61522rF
    public final void EFQ(InterfaceC673231x interfaceC673231x) {
        C14360o3.A0B(interfaceC673231x, 0);
        this.A08.remove(interfaceC673231x);
    }

    public C38126Gpt(C18920wW c18920wW, UserSession userSession, C57112jm c57112jm, JI3 ji3, ExploreTopicCluster exploreTopicCluster, C38082GpB c38082GpB, InterfaceC60442pS interfaceC60442pS, C64842wi c64842wi, String str, boolean z) {
        C38132Gpz c38132Gpz;
        this.A02 = c57112jm;
        this.A00 = userSession;
        this.A05 = new C38127Gpu(userSession, exploreTopicCluster, c38082GpB, interfaceC60442pS, c64842wi, str);
        this.A01 = new C38129Gpw(userSession, c38082GpB, interfaceC60442pS);
        C64092vU A0R = AbstractC37302Gc3.A0R(userSession);
        this.A09 = A0R;
        this.A06 = new C38131Gpy(c18920wW, userSession, interfaceC60442pS, A0R);
        if (ji3 != null) {
            c38132Gpz = new C38132Gpz(ji3);
        } else {
            c38132Gpz = null;
        }
        this.A03 = c38132Gpz;
        this.A07 = z ? new C38140Gq7(userSession) : null;
        this.A08 = AbstractC31171DnF.A0l();
        this.A04 = new C38133Gq0(userSession, interfaceC60442pS);
    }
}
