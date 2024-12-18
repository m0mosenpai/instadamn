package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.2vG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63952vG {
    public final InterfaceC43071ya A00;
    public final C57112jm A01;
    public final /* synthetic */ C63922vD A04;
    public final java.util.Set A03 = new C012504o(0);
    public final C63622uj A02 = new C63622uj();

    public C63952vG(C57112jm c57112jm, final C63922vD c63922vD) {
        this.A04 = c63922vD;
        this.A01 = c57112jm;
        this.A00 = new InterfaceC43071ya() { // from class: X.2vH
            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C42520Irz c42520Irz = (C42520Irz) c59062n7.A03;
                java.util.Set set = C63952vG.this.A03;
                String id = c42520Irz.getId();
                if (set.add(id)) {
                    C63922vD c63922vD2 = c63922vD;
                    UserSession userSession = c63922vD2.A03;
                    int position = ((InterfaceC75123Zc) c59062n7.A04).getPosition();
                    InterfaceC60442pS interfaceC60442pS = c63922vD2.A04;
                    C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", AbstractC111324zv.A00(2530)));
                    c82713mZ.A7F = id;
                    c82713mZ.A7Q = c42520Irz.CAR();
                    c82713mZ.A7G = C1XV.A0K.toString();
                    c82713mZ.A4I = Long.valueOf(position);
                    C32U.A0I(userSession, c82713mZ, interfaceC60442pS, C05F.A01);
                }
            }
        };
    }

    public final void A00(C42520Irz c42520Irz, InterfaceC75123Zc interfaceC75123Zc, int i) {
        C63622uj c63622uj = this.A02;
        String id = c42520Irz.getId();
        C59062n7 A00 = c63622uj.A00(id);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.common.viewpoint.core.ViewpointData<com.instagram.feed.feeditem.FeedSurveyItem?, com.instagram.feed.ui.state.PositionState?>");
        C59062n7 c59062n7 = C59062n7.A07;
        if (A00 == c59062n7) {
            InterfaceC43071ya interfaceC43071ya = this.A00;
            ArrayList arrayList = new ArrayList();
            arrayList.add(interfaceC43071ya);
            c63622uj.A01(new C59062n7(c59062n7, c42520Irz, interfaceC75123Zc, id, arrayList), id);
            A00 = c63622uj.A00(id);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.common.viewpoint.core.ViewpointData<com.instagram.feed.feeditem.FeedSurveyItem?, com.instagram.feed.ui.state.PositionState?>");
        }
        String A0G = AnonymousClass001.A0G(id, ':', i);
        c63622uj.A01(new C59062n7(A00, c42520Irz, interfaceC75123Zc, A0G, null), A0G);
    }
}
