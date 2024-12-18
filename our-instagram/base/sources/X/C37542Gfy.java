package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.Gfy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37542Gfy {
    public final InterfaceC116925Qy A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final MVO A03;
    public final SearchContext A04;
    public final InterfaceC43589JPu A05;
    public final IG5 A06;
    public final C37671Gi4 A07;

    public C37542Gfy(InterfaceC116925Qy interfaceC116925Qy, UserSession userSession, InterfaceC60442pS interfaceC60442pS, MVO mvo, SearchContext searchContext, InterfaceC43589JPu interfaceC43589JPu, IG5 ig5, C37671Gi4 c37671Gi4) {
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A1R(interfaceC60442pS, searchContext, interfaceC43589JPu, c37671Gi4, mvo);
        AbstractC167007dF.A1I(ig5, 7, interfaceC116925Qy);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A04 = searchContext;
        this.A05 = interfaceC43589JPu;
        this.A07 = c37671Gi4;
        this.A03 = mvo;
        this.A06 = ig5;
        this.A00 = interfaceC116925Qy;
    }

    public final void A00(C120985dq c120985dq) {
        C82713mZ A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        UserSession userSession = this.A01;
        String str = this.A06.A00;
        SearchContext searchContext = this.A04;
        if (c120985dq.A02 != null && (A01 = AbstractC37670Gi3.A01(c120985dq, userSession, interfaceC60442pS, "number_of_comments")) != null) {
            A01.A6S = str;
            A01.A6y = searchContext.A05;
            A01.A6f = searchContext.A03;
            A01.A6d = searchContext.A02;
            C32U.A0I(userSession, A01, interfaceC60442pS, C05F.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.IBm, java.lang.Object] */
    public final void A01(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C82713mZ A01;
        String str;
        C38321qM A0x;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A02;
            UserSession userSession = this.A01;
            IG5 ig5 = this.A06;
            String str2 = ig5.A00;
            SearchContext searchContext = this.A04;
            InterfaceC43589JPu interfaceC43589JPu = this.A05;
            C37671Gi4 c37671Gi4 = this.A07;
            Double d = c37671Gi4.A01.A00(c38321qM).A0B;
            if (c120985dq.A02 != null && (A01 = AbstractC37670Gi3.A01(c120985dq, userSession, interfaceC60442pS, "comment_button")) != null) {
                A01.A6S = str2;
                A01.A6y = searchContext.A05;
                A01.A6f = searchContext.A03;
                A01.A6d = searchContext.A02;
                A01.A2S = d;
                A01.A09(c37644Ghd.A06());
                A01.A6h = interfaceC43589JPu.CGJ();
                A01.A4m = interfaceC43589JPu.Amq();
                C75113Zb c75113Zb = c37644Ghd.A0E;
                if (c75113Zb != null) {
                    int i = c75113Zb.A03;
                    C38801rC c38801rC = C38321qM.A0h;
                    List list = c120985dq.A0R;
                    if (C38801rC.A09(i, list)) {
                        A01.A08(i);
                        if (list != null && (A0x = AbstractC25225BEi.A0x(list, i)) != null) {
                            str = A0x.getId();
                        } else {
                            str = null;
                        }
                        A01.A4l = C38801rC.A05(str);
                    }
                }
                C32U.A0I(userSession, A01, interfaceC60442pS, C05F.A00);
            }
            AbstractC37300Gc1.A11(this.A00, AnonymousClass317.A07, c120985dq, c37644Ghd);
            AbstractC37670Gi3.A0B(EnumC120795dP.A0G, interfaceC60442pS, userSession, c38321qM, interfaceC43589JPu, ig5.A00, c37644Ghd.A06());
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                C110974z9 A00 = c37671Gi4.A01.A00(c38321qM2);
                ?? obj = new Object();
                obj.A00 = true;
                A00.A03 = obj;
            }
            MVO mvo = this.A03;
            AbstractC37302Gc3.A1W(mvo, mvo.A0N, 6);
        }
    }
}
