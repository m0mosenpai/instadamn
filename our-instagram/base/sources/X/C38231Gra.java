package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gra, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38231Gra extends AbstractC64162vb {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;
    public final String A03;

    private final void A00(C120985dq c120985dq, C42C c42c, String str) {
        if (c120985dq.A0J == EnumC40111tc.A09) {
            C75113Zb c75113Zb = c42c.A01;
            List list = c120985dq.A0R;
            if (list != null) {
                int i = c42c.A00;
                C38321qM c38321qM = (C38321qM) AbstractC001800i.A0O(list, i);
                if (c38321qM != null) {
                    if (c120985dq.A0F()) {
                        C40971v4 A06 = c120985dq.A06();
                        C30W c30w = this.A01;
                        InterfaceC60442pS interfaceC60442pS = this.A02;
                        C82713mZ A01 = AbstractC82703mY.A01(c30w.A00, c38321qM, interfaceC60442pS, A06, c30w.A01, Integer.valueOf(i), AnonymousClass001.A0R("carousel_", str));
                        C30W.A00(c30w, A01, c38321qM, interfaceC60442pS);
                        if (A01 != null) {
                            A01.A03();
                            A01.A02();
                            A01.A6S = this.A03;
                            A01.A8I = c75113Zb.A2Q;
                            C32U.A0Z(A01, A06, i);
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
                    C82713mZ A03 = c30w2.A03(c38321qM2, interfaceC60442pS2, str, i, c75113Zb.getPosition());
                    if (A03 == null) {
                        return;
                    }
                    C32U.A0F(this.A00, A03, c38321qM, interfaceC60442pS2, C05F.A01, i, true);
                }
            }
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C42C c42c = (C42C) obj2;
        AbstractC167017dG.A1N(c120985dq, c42c);
        A00(c120985dq, c42c, "impression");
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C42C c42c = (C42C) obj2;
        AbstractC167017dG.A1N(c120985dq, c42c);
        A00(c120985dq, c42c, "sub_impression");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38231Gra(com.instagram.common.session.UserSession r4, X.InterfaceC60442pS r5, java.lang.String r6) {
        /*
            r3 = this;
            X.2tB r0 = X.AbstractC62712tA.A00(r4)
            X.2tC r0 = r0.A00
            X.1BX r2 = r0.A01
            X.C14360o3.A07(r2)
            r1 = 0
            X.GrZ r0 = new X.GrZ
            r0.<init>(r4, r1)
            r3.<init>(r2, r0)
            r3.A03 = r6
            r3.A02 = r5
            r3.A00 = r4
            r1 = 0
            X.30W r0 = new X.30W
            r0.<init>(r4, r1)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38231Gra.<init>(com.instagram.common.session.UserSession, X.2pS, java.lang.String):void");
    }
}
