package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Grc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38233Grc extends AbstractC64412w0 {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;
    public final String A03;

    @Override // X.AbstractC64412w0
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C42C c42c = (C42C) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c42c);
        if (c120985dq.A0J == EnumC40111tc.A09) {
            C75113Zb c75113Zb = c42c.A01;
            List list = c120985dq.A0R;
            if (list != null) {
                int i = c42c.A00;
                C38321qM c38321qM = (C38321qM) AbstractC001800i.A0O(list, i);
                if (c38321qM != null) {
                    if (c120985dq.A0F()) {
                        C30W c30w = this.A01;
                        InterfaceC60442pS interfaceC60442pS = this.A02;
                        C40971v4 A06 = c120985dq.A06();
                        int position = c75113Zb.getPosition();
                        C82713mZ A01 = AbstractC82703mY.A01(c30w.A00, c38321qM, interfaceC60442pS, A06, c30w.A01, Integer.valueOf(position), AnonymousClass001.A0R("carousel_", "time_spent"));
                        if (A01 != null) {
                            A01.A0B(j);
                            A01.A6S = this.A03;
                            C32U.A0Z(A01, c120985dq.A06(), i);
                            C32U.A0H(this.A00, A01, interfaceC60442pS);
                            return;
                        }
                        return;
                    }
                    C38321qM c38321qM2 = c120985dq.A02;
                    if (c38321qM2 == null) {
                        return;
                    }
                    C30W c30w2 = this.A01;
                    InterfaceC60442pS interfaceC60442pS2 = this.A02;
                    int position2 = c75113Zb.getPosition();
                    C82713mZ A0F = AbstractC37301Gc2.A0F(c30w2.A00, c38321qM, interfaceC60442pS2, AnonymousClass001.A0R("carousel_", "time_spent"));
                    A0F.A09(position2);
                    A0F.A0B(j);
                    A0F.A6S = this.A03;
                    C32U.A0F(this.A00, A0F, c38321qM2, interfaceC60442pS2, C05F.A00, i, A1a);
                }
            }
        }
    }

    public C38233Grc(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A03 = str;
        this.A02 = interfaceC60442pS;
        this.A00 = userSession;
        this.A01 = new C30W(userSession, null);
    }
}
