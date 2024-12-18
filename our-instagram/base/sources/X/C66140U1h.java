package X;

import com.instagram.model.keyword.Keyword;
import com.instagram.user.model.User;

/* renamed from: X.U1h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66140U1h implements InterfaceC43071ya {
    public boolean A00;
    public final C66163U2e A01;
    public final XBA A02;
    public final C66137U1e A03;
    public final C66138U1f A04;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String A04;
        String A01;
        String A02;
        Integer valueOf;
        User user;
        String str;
        String str2;
        Integer num;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C && this.A00) {
            C66138U1f c66138U1f = this.A04;
            Object obj = c59062n7.A03;
            AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) obj;
            if (c66138U1f.AHA(abstractC65924TwV.A01())) {
                Object obj2 = c59062n7.A04;
                C14360o3.A06(obj2);
                Tx0 tx0 = (Tx0) obj2;
                C66137U1e c66137U1e = this.A03;
                C14360o3.A06(obj);
                String Byf = this.A02.Byf();
                C14360o3.A0B(tx0, 1);
                c66137U1e.A00 = Byf;
                if (abstractC65924TwV instanceof C66130U0o) {
                    C66130U0o c66130U0o = (C66130U0o) abstractC65924TwV;
                    if (!c66130U0o.A03) {
                        Keyword keyword = c66130U0o.A01;
                        C14360o3.A0C(keyword, "null cannot be cast to non-null type com.instagram.model.keyword.Keyword");
                        if (keyword.A0A && !tx0.A0F) {
                            A04 = c66130U0o.A04();
                            A01 = c66130U0o.A01();
                            A02 = c66130U0o.A01.A04;
                            valueOf = Integer.valueOf(abstractC65924TwV.A00);
                            num = C05F.A00;
                        } else {
                            A04 = c66130U0o.A04();
                            A01 = c66130U0o.A01();
                            A02 = c66130U0o.A01.A04;
                            valueOf = Integer.valueOf(abstractC65924TwV.A00);
                            num = C05F.A01;
                        }
                        if (num.intValue() != 0) {
                            str2 = "NORMAL";
                        } else {
                            str2 = "POPULAR";
                        }
                        user = null;
                        str = null;
                    } else {
                        return;
                    }
                } else {
                    if (abstractC65924TwV instanceof C68090V9z) {
                        C68090V9z c68090V9z = (C68090V9z) abstractC65924TwV;
                        if (c68090V9z.A01) {
                            return;
                        }
                        A04 = "HASHTAG";
                        A01 = c68090V9z.A01();
                        A02 = c68090V9z.A02();
                        valueOf = Integer.valueOf(abstractC65924TwV.A00);
                        str = abstractC65924TwV.A03;
                        user = null;
                    } else if (abstractC65924TwV instanceof C65741TtG) {
                        C65741TtG c65741TtG = (C65741TtG) abstractC65924TwV;
                        if (c65741TtG.A01) {
                            return;
                        }
                        A04 = "USER";
                        A01 = c65741TtG.A01();
                        A02 = c65741TtG.A02();
                        valueOf = Integer.valueOf(abstractC65924TwV.A00);
                        str = abstractC65924TwV.A03;
                        user = c65741TtG.A06();
                    } else {
                        A04 = abstractC65924TwV.A04();
                        A01 = abstractC65924TwV.A01();
                        A02 = abstractC65924TwV.A02();
                        valueOf = Integer.valueOf(abstractC65924TwV.A00);
                        user = null;
                        str = abstractC65924TwV.A03;
                    }
                    str2 = "";
                }
                c66137U1e.A00(tx0, user, valueOf, A04, A01, A02, str2, str);
            }
        }
    }

    public C66140U1h(C66163U2e c66163U2e, XBA xba, C66137U1e c66137U1e, C66138U1f c66138U1f) {
        this.A03 = c66137U1e;
        this.A04 = c66138U1f;
        this.A01 = c66163U2e;
        this.A02 = xba;
    }
}
