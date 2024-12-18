package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ip9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42347Ip9 implements InterfaceC13000lm {
    public final UserSession A00;
    public final C41642IbY A01;
    public final C41039IFi A02;
    public final Map A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final C05A A06;
    public final boolean A07;
    public final InterfaceC41501vz A08;
    public final Map A09;
    public final Map A0A;

    public C42347Ip9(UserSession userSession, C41642IbY c41642IbY, C41039IFi c41039IFi, boolean z) {
        int A08 = AbstractC25230BEn.A08(1, userSession, c41642IbY);
        this.A00 = userSession;
        this.A02 = c41039IFi;
        this.A07 = z;
        this.A01 = c41642IbY;
        this.A09 = AbstractC166987dD.A1I();
        this.A0A = AbstractC166987dD.A1I();
        this.A05 = J8U.A00(this, 46);
        this.A03 = AbstractC166987dD.A1I();
        this.A06 = AbstractC25225BEi.A1H(new C45125Jxu());
        C42266Inq c42266Inq = new C42266Inq(A08, userSession, this);
        this.A08 = c42266Inq;
        this.A04 = J8U.A00(this, 45);
        AbstractC25651Mw.A00(userSession).A01(c42266Inq, C71I.class);
    }

    public static final Object A00(C38631GyY c38631GyY, C42347Ip9 c42347Ip9, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        Object A00 = AnonymousClass194.A00(interfaceC23621Ds, new C57169PZn((InterfaceC23621Ds) null, c42347Ip9, c38631GyY, interfaceC16820sZ, 27));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    public final void A0G(EnumC39623HeX enumC39623HeX, Product product) {
        String str = null;
        if (AbstractC167007dF.A1Z(this.A04)) {
            if (this.A05.CWa()) {
                AbstractC166987dD.A1Z(new C57166PZk(product, this, enumC39623HeX, null, 27), AbstractC167017dG.A0w(C12L.A00, 301752202));
            }
            Map map = this.A03;
            User user = product.A0B;
            if (user != null) {
                str = AbstractC76433bn.A00(user);
            }
            Object obj = map.get(str);
            if (obj != null) {
                AbstractC166987dD.A1Z(new C57169PZn(enumC39623HeX, product, obj, this, null, 28), AbstractC167017dG.A0w(C12L.A00, 301752202));
                return;
            }
            return;
        }
        User user2 = product.A0B;
        if (user2 != null) {
            str = AbstractC76433bn.A00(user2);
        }
        Iterator it = A01(this, str).iterator();
        while (it.hasNext()) {
            A05(new ProductFeedItem(product), enumC39623HeX, (C05A) it.next());
        }
    }

    public static final List A01(C42347Ip9 c42347Ip9, String str) {
        Object obj;
        InterfaceC09390do interfaceC09390do = c42347Ip9.A05;
        if (interfaceC09390do.CWa()) {
            obj = interfaceC09390do.getValue();
        } else {
            obj = null;
        }
        return AbstractC16960so.A1R((C05A) obj, (C05A) c42347Ip9.A03.get(str));
    }

    public static final Map A02(C42347Ip9 c42347Ip9, String str) {
        if (str != null) {
            Map map = c42347Ip9.A0A;
            Object obj = map.get(str);
            if (obj == null) {
                obj = AbstractC166987dD.A1I();
                map.put(str, obj);
            }
            return (Map) obj;
        }
        return c42347Ip9.A09;
    }

    public final C23671Dx A0C(C38631GyY c38631GyY, C19L c19l) {
        Map A02 = A02(this, c38631GyY.A02);
        EnumC39623HeX enumC39623HeX = c38631GyY.A00;
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) A02.get(enumC39623HeX);
        boolean z = true;
        if (anonymousClass195 == null || !anonymousClass195.isActive()) {
            z = false;
        }
        if (z) {
            C43172J6r.A03(anonymousClass195, c19l, 31);
        }
        C23671Dx A04 = AbstractC23641Du.A04(AnonymousClass191.A00, new C57158PZc(c38631GyY, this, null, 5), c19l);
        A02.put(enumC39623HeX, A04);
        return A04;
    }

    public final C05A A0D(String str) {
        C38685GzQ c38685GzQ;
        if (str != null) {
            Map map = this.A03;
            Object obj = map.get(str);
            if (obj == null) {
                if (AbstractC37302Gc3.A1a(this.A00)) {
                    c38685GzQ = new C38685GzQ((AbstractC39668Hix) null, (Integer) null, 7);
                } else {
                    c38685GzQ = null;
                }
                obj = C10E.A00(new C38688GzT(c38685GzQ));
                map.put(str, obj);
            }
            C05A c05a = (C05A) obj;
            if (c05a != null) {
                return c05a;
            }
        }
        return (C05A) this.A05.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    public final void A0E(C38321qM c38321qM, EnumC39623HeX enumC39623HeX) {
        for (C05A c05a : A01(this, AbstractC37303Gc4.A0T(this.A00, c38321qM))) {
            ?? obj = new Object();
            obj.A06 = C05F.A0C;
            obj.A00 = c38321qM;
            obj.A06 = C05F.A0N;
            A05(obj, enumC39623HeX, c05a);
        }
        C05A c05a2 = this.A06;
        ?? obj2 = new Object();
        obj2.A06 = C05F.A0C;
        obj2.A00 = c38321qM;
        obj2.A06 = C05F.A0N;
        A06(obj2, enumC39623HeX, c05a2);
    }

    public final void A0F(C38321qM c38321qM, EnumC39623HeX enumC39623HeX) {
        String str;
        Iterator it = A01(this, AbstractC37303Gc4.A0T(this.A00, c38321qM)).iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            C05A c05a = (C05A) it.next();
            String id = c38321qM.getId();
            if (id != null) {
                str = id;
            }
            A08(enumC39623HeX, str, c05a);
        }
        C05A c05a2 = this.A06;
        String id2 = c38321qM.getId();
        if (id2 != null) {
            str = id2;
        }
        A09(enumC39623HeX, str, c05a2);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A00).A02(this.A08, C71I.class);
    }

    public static final InterfaceC19390xP A03(EnumC39623HeX enumC39623HeX, C42347Ip9 c42347Ip9, Integer num, List list) {
        Integer num2;
        int ordinal = enumC39623HeX.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return null;
                }
                num2 = C05F.A0C;
            } else {
                num2 = C05F.A01;
            }
        } else {
            num2 = C05F.A00;
        }
        return I7I.A00(c42347Ip9.A00, num2, num, list).A03(301752202);
    }

    public static final void A04(C38685GzQ c38685GzQ, EnumC39623HeX enumC39623HeX, C05A c05a) {
        C38688GzT c38688GzT;
        C38688GzT A04 = AbstractC37300Gc1.A04(c05a);
        int A05 = AbstractC25227BEk.A05(enumC39623HeX, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    if (A05 == 3) {
                        C38685GzQ c38685GzQ2 = (C38685GzQ) A04.A00;
                        C38685GzQ c38685GzQ3 = (C38685GzQ) A04.A03;
                        C38685GzQ c38685GzQ4 = (C38685GzQ) A04.A02;
                        AbstractC167027dH.A13(c38685GzQ3, c38685GzQ4, c38685GzQ);
                        c38688GzT = new C38688GzT(c38685GzQ2, c38685GzQ3, c38685GzQ4, c38685GzQ);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    C38685GzQ c38685GzQ5 = (C38685GzQ) A04.A00;
                    C38685GzQ c38685GzQ6 = (C38685GzQ) A04.A03;
                    C38685GzQ c38685GzQ7 = (C38685GzQ) A04.A01;
                    AbstractC167027dH.A13(c38685GzQ6, c38685GzQ, c38685GzQ7);
                    c38688GzT = new C38688GzT(c38685GzQ5, c38685GzQ6, c38685GzQ, c38685GzQ7);
                }
            } else {
                C38685GzQ c38685GzQ8 = (C38685GzQ) A04.A00;
                C38685GzQ c38685GzQ9 = (C38685GzQ) A04.A02;
                C38685GzQ c38685GzQ10 = (C38685GzQ) A04.A01;
                AbstractC167027dH.A13(c38685GzQ, c38685GzQ9, c38685GzQ10);
                c38688GzT = new C38688GzT(c38685GzQ8, c38685GzQ, c38685GzQ9, c38685GzQ10);
            }
        } else {
            C38685GzQ c38685GzQ11 = (C38685GzQ) A04.A03;
            C38685GzQ c38685GzQ12 = (C38685GzQ) A04.A02;
            C38685GzQ c38685GzQ13 = (C38685GzQ) A04.A01;
            AbstractC167027dH.A13(c38685GzQ11, c38685GzQ12, c38685GzQ13);
            c38688GzT = new C38688GzT(c38685GzQ, c38685GzQ11, c38685GzQ12, c38685GzQ13);
        }
        c05a.Egh(c38688GzT);
    }

    public static final void A05(ProductFeedItem productFeedItem, EnumC39623HeX enumC39623HeX, C05A c05a) {
        C38685GzQ A05 = AbstractC37300Gc1.A04(c05a).A05(enumC39623HeX);
        if (A05 != null) {
            List A1J = AbstractC166987dD.A1J(productFeedItem);
            List list = (List) A05.A02;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                AbstractC25232BEp.A1Q(((ProductFeedItem) obj).getId(), productFeedItem.getId(), obj, A1E);
            }
            ArrayList A0S = AbstractC001800i.A0S(A1E, A1J);
            Integer num = (Integer) A05.A00;
            AbstractC39668Hix abstractC39668Hix = (AbstractC39668Hix) A05.A01;
            AbstractC167027dH.A12(A0S, num, abstractC39668Hix);
            A04(new C38685GzQ(abstractC39668Hix, num, A0S), enumC39623HeX, c05a);
        }
    }

    public static final void A06(ProductFeedItem productFeedItem, EnumC39623HeX enumC39623HeX, C05A c05a) {
        List A1J = AbstractC166987dD.A1J(productFeedItem);
        List A01 = ((C45125Jxu) c05a.getValue()).A01(enumC39623HeX);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A01) {
            AbstractC25232BEp.A1Q(((ProductFeedItem) obj).getId(), productFeedItem.getId(), obj, A1E);
        }
        A0B(enumC39623HeX, AbstractC001800i.A0S(A1E, A1J), c05a);
    }

    public static final void A07(EnumC39623HeX enumC39623HeX, String str, List list, C05A c05a) {
        String str2;
        User user;
        C38685GzQ A05 = AbstractC37300Gc1.A04(c05a).A05(enumC39623HeX);
        if (A05 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                Product A02 = ((ProductFeedItem) obj).A02();
                if (A02 != null && (user = A02.A0B) != null) {
                    str2 = AbstractC76433bn.A00(user);
                } else {
                    str2 = null;
                }
                AbstractC25232BEp.A1Q(str2, str, obj, A1E);
            }
            ArrayList A0S = AbstractC001800i.A0S(A1E, list);
            Integer num = (Integer) A05.A00;
            AbstractC39668Hix abstractC39668Hix = (AbstractC39668Hix) A05.A01;
            AbstractC167027dH.A12(A0S, num, abstractC39668Hix);
            A04(new C38685GzQ(abstractC39668Hix, num, A0S), enumC39623HeX, c05a);
        }
    }

    private final void A08(EnumC39623HeX enumC39623HeX, String str, C05A c05a) {
        C38685GzQ A05 = AbstractC37300Gc1.A04(c05a).A05(enumC39623HeX);
        if (A05 != null) {
            List list = (List) A05.A02;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                AbstractC25232BEp.A1Q(((ProductFeedItem) obj).getId(), str, obj, A1E);
            }
            Integer num = (Integer) A05.A00;
            AbstractC39668Hix abstractC39668Hix = (AbstractC39668Hix) A05.A01;
            AbstractC167027dH.A12(A1E, num, abstractC39668Hix);
            A04(new C38685GzQ(abstractC39668Hix, num, A1E), enumC39623HeX, c05a);
        }
    }

    private final void A09(EnumC39623HeX enumC39623HeX, String str, C05A c05a) {
        List A01 = ((C45125Jxu) c05a.getValue()).A01(enumC39623HeX);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A01) {
            AbstractC25232BEp.A1Q(((ProductFeedItem) obj).getId(), str, obj, A1E);
        }
        A0B(enumC39623HeX, A1E, c05a);
    }

    public static final void A0A(EnumC39623HeX enumC39623HeX, List list, C05A c05a) {
        List A01 = ((C45125Jxu) c05a.getValue()).A01(enumC39623HeX);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A01) {
            ProductFeedItem productFeedItem = (ProductFeedItem) obj;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((ProductFeedItem) it.next()).getId());
            }
            AbstractC25228BEl.A1Q(obj, A1E, A0q.contains(productFeedItem.getId()) ? 1 : 0);
        }
        A0B(enumC39623HeX, AbstractC001800i.A0S(A1E, list), c05a);
    }

    public static final void A0B(EnumC39623HeX enumC39623HeX, List list, C05A c05a) {
        C45125Jxu c45125Jxu;
        C45125Jxu c45125Jxu2 = (C45125Jxu) c05a.getValue();
        int A05 = AbstractC25227BEk.A05(enumC39623HeX, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 3 && A05 != 2) {
                    throw B4Z.A00();
                }
                List list2 = (List) c45125Jxu2.A00;
                List list3 = (List) c45125Jxu2.A04;
                C14360o3.A0B(list2, 0);
                AbstractC167007dF.A1D(list3, 1, list);
                c45125Jxu = new C45125Jxu(list2, list3, list);
            } else {
                List list4 = (List) c45125Jxu2.A00;
                List list5 = (List) c45125Jxu2.A01;
                C14360o3.A0B(list4, 0);
                AbstractC167007dF.A1D(list, 1, list5);
                c45125Jxu = new C45125Jxu(list4, list, list5);
            }
        } else {
            List list6 = (List) c45125Jxu2.A04;
            List list7 = (List) c45125Jxu2.A01;
            C14360o3.A0B(list, 0);
            AbstractC167017dG.A1P(list6, list7);
            c45125Jxu = new C45125Jxu(list, list6, list7);
        }
        c05a.Egh(c45125Jxu);
    }

    public final void A0H(EnumC39623HeX enumC39623HeX, Product product) {
        Iterator it = A01(this, AbstractC37302Gc3.A0d(product)).iterator();
        while (it.hasNext()) {
            A08(enumC39623HeX, product.A0H, (C05A) it.next());
        }
        A09(enumC39623HeX, product.A0H, this.A06);
    }
}
