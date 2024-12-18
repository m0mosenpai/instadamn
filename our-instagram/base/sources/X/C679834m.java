package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.34m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C679834m extends AnonymousClass346 {
    public final InterfaceC43071ya A00;
    public final InterfaceC60442pS A01;
    public final C28091Xn A02;
    public final UserSession A03;
    public final InterfaceC43071ya A04;
    public final C30W A05;

    /* JADX WARN: Type inference failed for: r8v0, types: [X.34r, java.lang.Object] */
    public C679834m(final UserSession userSession, final C30W c30w, final InterfaceC60442pS interfaceC60442pS, final AnonymousClass341 anonymousClass341, final C61382r1 c61382r1, final C1M1 c1m1, final C28091Xn c28091Xn) {
        final boolean z = true;
        this.A03 = userSession;
        this.A01 = interfaceC60442pS;
        this.A05 = c30w;
        this.A02 = c28091Xn;
        final InterfaceC680034o interfaceC680034o = new InterfaceC680034o(userSession, c30w, interfaceC60442pS, anonymousClass341, c61382r1, c1m1, c28091Xn) { // from class: X.34n
            public final UserSession A00;
            public final C30W A01;
            public final InterfaceC60442pS A02;
            public final C61382r1 A03;
            public final C1M1 A04;
            public final AnonymousClass341 A05;
            public final C28091Xn A06;

            /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C82753md A00(X.C38321qM r18, X.C75113Zb r19) {
                /*
                    Method dump skipped, instructions count: 343
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C679934n.A00(X.1qM, X.3Zb):X.3md");
            }

            @Override // X.InterfaceC680034o
            public final InterfaceC82433m7 E6X(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, InterfaceC82433m7 interfaceC82433m7) {
                Long l;
                String str;
                Long l2;
                Long l3;
                List list;
                String str2;
                Long l4;
                String Bnr;
                Long valueOf;
                String obj;
                int position;
                if (interfaceC82433m7 == null) {
                    Object obj2 = c59062n7.A03;
                    C14360o3.A06(obj2);
                    Object obj3 = c59062n7.A04;
                    C14360o3.A06(obj3);
                    interfaceC82433m7 = A00((C38321qM) obj2, (C75113Zb) obj3);
                }
                C38321qM c38321qM = (C38321qM) c59062n7.A03;
                C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
                UserSession userSession2 = this.A00;
                Integer num = null;
                List list2 = null;
                if (c38321qM != null) {
                    C130175uN c130175uN = C130175uN.A00;
                    l = C130175uN.A00(c38321qM);
                    list2 = c130175uN.A01(null, userSession2, c38321qM);
                } else {
                    l = null;
                }
                if (interfaceC82433m7 != null) {
                    C32U.A0X(interfaceC82433m7.BH8(), c38321qM, c75113Zb.A03);
                    C82713mZ BH8 = interfaceC82433m7.BH8();
                    InterfaceC88353wq B3J = c38321qM.A0C.B3J();
                    if (B3J != null) {
                        str = B3J.C8y();
                    } else {
                        str = null;
                    }
                    BH8.A4z = str;
                    BH8.A3l = Long.valueOf(AbstractC82633mR.A00(c38321qM, c75113Zb));
                    String id = c38321qM.getId();
                    if (id != null) {
                        String A06 = C38801rC.A06(id);
                        C14360o3.A0B(A06, 0);
                        l2 = AbstractC003100w.A0k(10, A06);
                    } else {
                        l2 = null;
                    }
                    BH8.A3k = l2;
                    User A2E = c38321qM.A2E(userSession2);
                    if (A2E != null) {
                        l3 = AbstractC003100w.A0k(10, A2E.getId());
                    } else {
                        l3 = null;
                    }
                    BH8.A3j = l3;
                    BH8.A29 = c75113Zb.A0y;
                    BH8.A41 = l;
                    if (list2 == null) {
                        list2 = C16930sl.A00;
                    }
                    C14360o3.A0B(list2, 0);
                    BH8.A8C = list2;
                    BH8.A3z = AbstractC82633mR.A05(userSession2, c38321qM);
                    BH8.A40 = Long.valueOf(C77403dQ.A00.A06(userSession2, c38321qM).size());
                    BH8.A5P = AbstractC82633mR.A0D(userSession2, c38321qM);
                    List list3 = c75113Zb.A1e;
                    if (list3 != null) {
                        list = AbstractC001800i.A0a(list3);
                    } else {
                        list = null;
                    }
                    BH8.A7r = list;
                    if (!C18U.A06(C06090Tz.A05, userSession2, 36329045297741813L)) {
                        interfaceC82433m7.BH8().A6h = this.A04.getSessionId();
                    }
                    if (c75113Zb.A0p() && (position = c75113Zb.getPosition()) != -1) {
                        long j = position;
                        if (Long.valueOf(j) != null) {
                            interfaceC82433m7.BH8().A09((int) j);
                        }
                    }
                    String str3 = c38321qM.A0R;
                    if (str3 != null) {
                        interfaceC82433m7.BH8().A72 = str3;
                    }
                    String A00 = AbstractC77343dK.A00(c38321qM.A0e);
                    if (A00 != null) {
                        interfaceC82433m7.BH8().A57 = A00;
                    }
                    if (c38321qM.A1x().ordinal() == 2 && (obj = EnumC76383bi.A07.toString()) != null) {
                        interfaceC82433m7.BH8().A4a = obj;
                    }
                    int i = c75113Zb.A0W;
                    if (Integer.valueOf(i) != null && i != -1 && (valueOf = Long.valueOf(i)) != null) {
                        interfaceC82433m7.BH8().A07 = (int) valueOf.longValue();
                    }
                    C82713mZ BH82 = interfaceC82433m7.BH8();
                    Hashtag B7K = c38321qM.A0C.B7K();
                    if (B7K != null) {
                        str2 = B7K.getName();
                    } else {
                        str2 = null;
                    }
                    BH82.A5Y = str2;
                    if (c38321qM.A0C.B7K() != null) {
                        interfaceC82433m7.BH8().A5X = HashtagFollowStatus.A04.A00;
                    }
                    InterfaceC60442pS interfaceC60442pS2 = this.A02;
                    if (interfaceC60442pS2 instanceof AnonymousClass309) {
                        C11520jB E6P = ((AnonymousClass309) interfaceC60442pS2).E6P();
                        C14360o3.A07(E6P);
                        interfaceC82433m7.BH8().A6z = (String) E6P.A01(AbstractC129015sM.A02);
                    }
                    interfaceC82433m7.BH8().A0e = AbstractC82633mR.A01(c38321qM);
                    C82713mZ BH83 = interfaceC82433m7.BH8();
                    JML Bns = c38321qM.A0C.Bns();
                    if (Bns != null && (Bnr = Bns.Bnr()) != null) {
                        l4 = AbstractC003100w.A0k(10, Bnr);
                    } else {
                        l4 = null;
                    }
                    BH83.A4F = l4;
                    interfaceC82433m7.BH8().A5t = c38321qM.A0C.BJN();
                    C82713mZ BH84 = interfaceC82433m7.BH8();
                    C3XK B5f = c38321qM.A0C.B5f();
                    if (B5f != null) {
                        num = B5f.BlL();
                    }
                    BH84.A3H = num;
                    interfaceC82433m7.BH8().A14 = Boolean.valueOf(this.A06.A03(c38321qM.A3E(userSession2, false)));
                }
                return interfaceC82433m7;
            }

            @Override // X.InterfaceC680034o
            public final InterfaceC82433m7 E6Y(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, InterfaceC82433m7 interfaceC82433m7) {
                return null;
            }

            @Override // X.InterfaceC680034o
            public final InterfaceC82433m7 E6W(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, InterfaceC82433m7 interfaceC82433m7) {
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                Object obj2 = c59062n7.A04;
                C14360o3.A06(obj2);
                return A00((C38321qM) obj, (C75113Zb) obj2);
            }

            {
                this.A00 = userSession;
                this.A02 = interfaceC60442pS;
                this.A05 = anonymousClass341;
                this.A01 = c30w;
                this.A06 = c28091Xn;
                this.A04 = c1m1;
                this.A03 = c61382r1;
            }
        };
        final InterfaceC680034o interfaceC680034o2 = new InterfaceC680034o(userSession, interfaceC60442pS) { // from class: X.34p
            public final UserSession A00;
            public final InterfaceC60442pS A01;

            @Override // X.InterfaceC680034o
            public final InterfaceC82433m7 E6W(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, InterfaceC82433m7 interfaceC82433m7) {
                return interfaceC82433m7;
            }

            @Override // X.InterfaceC680034o
            public final InterfaceC82433m7 E6Y(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, InterfaceC82433m7 interfaceC82433m7) {
                return interfaceC82433m7;
            }

            @Override // X.InterfaceC680034o
            public final InterfaceC82433m7 E6X(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, InterfaceC82433m7 interfaceC82433m7) {
                if (interfaceC82433m7 != null) {
                    Object obj = c59062n7.A04;
                    C14360o3.A06(obj);
                    boolean A00 = AbstractC126515nm.A00((C75113Zb) obj);
                    C57462kL A002 = AbstractC65512xn.A00(this.A00);
                    Object obj2 = c59062n7.A03;
                    C14360o3.A06(obj2);
                    this.A01.getModuleName();
                    boolean A05 = A002.A05((C38321qM) obj2);
                    interfaceC82433m7.BH8().A0g = new C9BB(interfaceC57162jr.BQM(c59062n7), interfaceC57162jr.BQL(c59062n7), 2, A05, A00);
                }
                return interfaceC82433m7;
            }

            {
                this.A00 = userSession;
                this.A01 = interfaceC60442pS;
            }
        };
        final InterfaceC680334r interfaceC680334r = new InterfaceC680334r(userSession, c28091Xn) { // from class: X.34q
            public final UserSession A00;
            public final C28091Xn A01;

            @Override // X.InterfaceC680334r
            public final void A7Q(C82543mI c82543mI, C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                List list = c82543mI.A06;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C82493mD) it.next()).A00);
                }
                if (!arrayList.isEmpty() && AbstractC124635kR.A00((C82513mF) arrayList.get(0)) >= 250) {
                    C38321qM c38321qM = (C38321qM) c59062n7.A03;
                    UserSession userSession2 = this.A00;
                    C38801rC c38801rC = C38321qM.A0h;
                    this.A01.A02(c38321qM.A3E(userSession2, false));
                }
            }

            {
                this.A01 = c28091Xn;
                this.A00 = userSession;
            }
        };
        final InterfaceC63482uV A00 = AbstractC63462uT.A00(userSession);
        final C680434s c680434s = C680434s.A00;
        final boolean z2 = false;
        final ?? obj = new Object();
        this.A00 = new InterfaceC43071ya(userSession, interfaceC60442pS, A00, interfaceC680034o2, obj, c680434s, z, z2) { // from class: X.34u
            public final InterfaceC60442pS A00;
            public final InterfaceC63482uV A01;
            public final InterfaceC680034o A02;
            public final InterfaceC680334r A03;
            public final InterfaceC16620sF A04;
            public final boolean A05;
            public final UserSession A06;
            public final boolean A07;

            {
                C14360o3.A0B(A00, 4);
                C14360o3.A0B(c680434s, 7);
                this.A00 = interfaceC60442pS;
                this.A06 = userSession;
                this.A01 = A00;
                this.A02 = interfaceC680034o2;
                this.A03 = obj;
                this.A04 = c680434s;
                this.A07 = z;
                this.A05 = z2;
            }

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                InterfaceC63482uV interfaceC63482uV;
                InterfaceC82433m7 E6W;
                float f;
                Integer num;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Integer CFq = interfaceC57162jr.CFq(c59062n7);
                C14360o3.A07(CFq);
                int intValue = CFq.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        InterfaceC680034o interfaceC680034o3 = this.A02;
                        InterfaceC63482uV interfaceC63482uV2 = this.A01;
                        C82543mI ECO = interfaceC63482uV2.ECO(this.A00, A00(c59062n7, interfaceC57162jr, interfaceC680034o3.E6X(c59062n7, interfaceC57162jr, interfaceC63482uV2.B3k((String) this.A04.invoke(c59062n7.A03, c59062n7.A04))), C05F.A01, 0.0f), "feed", true);
                        if (ECO != null) {
                            this.A03.A7Q(ECO, c59062n7, interfaceC57162jr);
                            return;
                        }
                        return;
                    }
                    if (this.A05) {
                        return;
                    }
                    InterfaceC680034o interfaceC680034o4 = this.A02;
                    interfaceC63482uV = this.A01;
                    E6W = interfaceC680034o4.E6Y(c59062n7, interfaceC57162jr, interfaceC63482uV.B3k((String) this.A04.invoke(c59062n7.A03, c59062n7.A04)));
                    f = interfaceC57162jr.CGk(c59062n7);
                    num = C05F.A0C;
                } else {
                    InterfaceC680034o interfaceC680034o5 = this.A02;
                    interfaceC63482uV = this.A01;
                    E6W = interfaceC680034o5.E6W(c59062n7, interfaceC57162jr, interfaceC63482uV.B3k((String) this.A04.invoke(c59062n7.A03, c59062n7.A04)));
                    if (!this.A05) {
                        f = interfaceC57162jr.CGk(c59062n7);
                    } else {
                        f = 0.0f;
                    }
                    num = C05F.A00;
                }
                interfaceC63482uV.ECO(this.A00, A00(c59062n7, interfaceC57162jr, E6W, num, f), "feed", false);
            }

            private final C82453m9 A00(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, InterfaceC82433m7 interfaceC82433m7, Integer num, float f) {
                String str = (String) this.A04.invoke(c59062n7.A03, c59062n7.A04);
                long BmE = interfaceC57162jr.BmE();
                return new C82453m9(interfaceC82433m7, num, C05F.A0N, str, C16930sl.A00, f, BmE, this.A07, true);
            }
        };
        this.A04 = new InterfaceC43071ya(userSession, interfaceC60442pS, A00, interfaceC680034o, interfaceC680334r, c680434s, z2, z) { // from class: X.34u
            public final InterfaceC60442pS A00;
            public final InterfaceC63482uV A01;
            public final InterfaceC680034o A02;
            public final InterfaceC680334r A03;
            public final InterfaceC16620sF A04;
            public final boolean A05;
            public final UserSession A06;
            public final boolean A07;

            {
                C14360o3.A0B(A00, 4);
                C14360o3.A0B(c680434s, 7);
                this.A00 = interfaceC60442pS;
                this.A06 = userSession;
                this.A01 = A00;
                this.A02 = interfaceC680034o;
                this.A03 = interfaceC680334r;
                this.A04 = c680434s;
                this.A07 = z2;
                this.A05 = z;
            }

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                InterfaceC63482uV interfaceC63482uV;
                InterfaceC82433m7 E6W;
                float f;
                Integer num;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Integer CFq = interfaceC57162jr.CFq(c59062n7);
                C14360o3.A07(CFq);
                int intValue = CFq.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        InterfaceC680034o interfaceC680034o3 = this.A02;
                        InterfaceC63482uV interfaceC63482uV2 = this.A01;
                        C82543mI ECO = interfaceC63482uV2.ECO(this.A00, A00(c59062n7, interfaceC57162jr, interfaceC680034o3.E6X(c59062n7, interfaceC57162jr, interfaceC63482uV2.B3k((String) this.A04.invoke(c59062n7.A03, c59062n7.A04))), C05F.A01, 0.0f), "feed", true);
                        if (ECO != null) {
                            this.A03.A7Q(ECO, c59062n7, interfaceC57162jr);
                            return;
                        }
                        return;
                    }
                    if (this.A05) {
                        return;
                    }
                    InterfaceC680034o interfaceC680034o4 = this.A02;
                    interfaceC63482uV = this.A01;
                    E6W = interfaceC680034o4.E6Y(c59062n7, interfaceC57162jr, interfaceC63482uV.B3k((String) this.A04.invoke(c59062n7.A03, c59062n7.A04)));
                    f = interfaceC57162jr.CGk(c59062n7);
                    num = C05F.A0C;
                } else {
                    InterfaceC680034o interfaceC680034o5 = this.A02;
                    interfaceC63482uV = this.A01;
                    E6W = interfaceC680034o5.E6W(c59062n7, interfaceC57162jr, interfaceC63482uV.B3k((String) this.A04.invoke(c59062n7.A03, c59062n7.A04)));
                    if (!this.A05) {
                        f = interfaceC57162jr.CGk(c59062n7);
                    } else {
                        f = 0.0f;
                    }
                    num = C05F.A00;
                }
                interfaceC63482uV.ECO(this.A00, A00(c59062n7, interfaceC57162jr, E6W, num, f), "feed", false);
            }

            private final C82453m9 A00(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, InterfaceC82433m7 interfaceC82433m7, Integer num, float f) {
                String str = (String) this.A04.invoke(c59062n7.A03, c59062n7.A04);
                long BmE = interfaceC57162jr.BmE();
                return new C82453m9(interfaceC82433m7, num, C05F.A0N, str, C16930sl.A00, f, BmE, this.A07, true);
            }
        };
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu2(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c59072n8, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        InterfaceC60442pS interfaceC60442pS = this.A01;
        if (!AbstractC75423a9.A02(c38321qM, interfaceC60442pS) && AbstractC75423a9.A01(c38321qM, interfaceC60442pS)) {
            c59072n8.A00(this.A04);
        }
    }
}
