package X;

import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.70Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70Y implements C70Z, InterfaceC13000lm {
    public IgFundedIncentive A00;
    public MultiProductComponent A01;
    public Integer A02;
    public String A03;
    public LinkedHashMap A04;
    public LinkedHashMap A05;
    public final UserSession A06;
    public final C1563470e A07;
    public final InterfaceC41501vz A08;
    public final InterfaceC41501vz A09;
    public final C1563370d A0A;

    public final boolean A08(Product product) {
        List list;
        if (product != null) {
            String A00 = AbstractC76433bn.A00(product.A0B);
            A00.getClass();
            INR A06 = this.A07.A06(A00);
            if (A06 != null) {
                C41634IbP A002 = A06.A00();
                A002.A00();
                Iterator it = A002.A00().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Product product2 = (Product) it.next();
                    if (product2.A0H.equals(product.A0H)) {
                        break;
                    }
                    if (C2I7.A00(product2.A0J, product.A0J) && product2.A03() == product.A03() && (list = product2.A0O) != null) {
                        Iterator it2 = list.iterator();
                        if (it2.hasNext()) {
                            ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf = (ProductVariantPossibleValueDictIntf) it2.next();
                            if (ProductVariantVisualStyle.A05.equals(productVariantPossibleValueDictIntf.CGx())) {
                                product.A01(productVariantPossibleValueDictIntf.getId());
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static C70Y A00(final UserSession userSession) {
        return (C70Y) userSession.A01(C70Y.class, new InterfaceC16820sZ() { // from class: X.70a
            @Override // X.InterfaceC16820sZ
            public final /* bridge */ /* synthetic */ Object invoke() {
                return new C70Y(UserSession.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r17 != false) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.IIP, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.INR r13, X.C70Y r14, X.EnumC39539HdB r15, java.lang.String r16, boolean r17) {
        /*
            com.instagram.common.session.UserSession r0 = r14.A06
            X.1My r0 = X.AbstractC25651Mw.A00(r0)
            if (r13 != 0) goto Lca
            r8 = 0
        L9:
            X.70e r1 = r14.A07
            java.lang.String r10 = r1.A01
            r9 = r16
            java.lang.String r11 = r1.A09(r9)
            r12 = 1
            X.71I r6 = new X.71I
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.E4s(r6)
            java.util.LinkedHashMap r6 = r14.A04
            java.util.LinkedHashMap r8 = r14.A05
            if (r8 == 0) goto L46
            if (r6 == 0) goto L46
            if (r13 == 0) goto L46
            X.IbP r0 = r13.A03
            boolean r0 = r0.A08
            if (r0 != 0) goto L46
            X.IbP r7 = r13.A00()
            int r0 = r7.A00
            r5 = r17
            if (r0 != 0) goto L47
            r8.remove(r9)
            r6.remove(r9)
        L3d:
            X.HdB r1 = X.EnumC39539HdB.A03
            X.HAj r0 = r14.A03()
            A02(r0, r14, r1, r5)
        L46:
            return
        L47:
            boolean r0 = r8.containsKey(r9)
            if (r0 == 0) goto La6
            boolean r0 = r6.containsKey(r9)
            if (r0 == 0) goto La6
            java.lang.Object r1 = r8.get(r9)
            r1.getClass()
            X.IIP r1 = (X.IIP) r1
            int r0 = r7.A00
            r1.A00 = r0
            r6.put(r9, r7)
            if (r17 == 0) goto L3d
        L65:
            java.util.LinkedHashMap r0 = r14.A05
            r0.getClass()
            java.util.LinkedHashMap r0 = r14.A04
            r0.getClass()
            java.util.LinkedHashMap r0 = r14.A05
            int r0 = r0.size()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.util.LinkedHashMap r0 = r14.A04
            int r0 = r0.size()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.LinkedHashMap r0 = r14.A05
            java.lang.Object r0 = r0.remove(r9)
            r2.put(r9, r0)
            java.util.LinkedHashMap r0 = r14.A05
            r2.putAll(r0)
            java.util.LinkedHashMap r0 = r14.A04
            java.lang.Object r0 = r0.remove(r9)
            r1.put(r9, r0)
            java.util.LinkedHashMap r0 = r14.A04
            r1.putAll(r0)
            r14.A05 = r2
            r14.A04 = r1
            goto L3d
        La6:
            com.instagram.user.model.User r4 = r7.A05
            int r3 = r7.A00
            java.lang.String r2 = r1.A01
            r2.getClass()
            java.lang.String r1 = r1.A09(r9)
            r1.getClass()
            X.IIP r0 = new X.IIP
            r0.<init>()
            r0.A01 = r4
            r0.A00 = r3
            r0.A02 = r2
            r0.A03 = r1
            r8.put(r9, r0)
            r6.put(r9, r7)
            goto L65
        Lca:
            X.IbP r8 = r13.A00()
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70Y.A01(X.INR, X.70Y, X.HdB, java.lang.String, boolean):void");
    }

    public static void A02(C38887HAj c38887HAj, C70Y c70y, EnumC39539HdB enumC39539HdB, boolean z) {
        AbstractC25651Mw.A00(c70y.A06).E4s(new C42255Inf(c38887HAj, enumC39539HdB, z));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [X.HAj, X.1um] */
    public final C38887HAj A03() {
        List singletonList;
        LinkedHashMap linkedHashMap = this.A05;
        if (linkedHashMap != null && this.A04 != null) {
            ArrayList arrayList = new ArrayList(linkedHashMap.values());
            ArrayList arrayList2 = new ArrayList(this.A04.values());
            MultiProductComponent multiProductComponent = this.A01;
            if (multiProductComponent == null) {
                singletonList = new ArrayList();
            } else {
                singletonList = Collections.singletonList(multiProductComponent);
            }
            IgFundedIncentive igFundedIncentive = this.A00;
            C14360o3.A0B(singletonList, 3);
            ?? c40791um = new C40791um();
            c40791um.A02 = new ArrayList();
            c40791um.A01 = new ArrayList();
            c40791um.A02 = arrayList;
            c40791um.A01 = arrayList2;
            c40791um.A03 = singletonList;
            c40791um.A00 = igFundedIncentive;
            return c40791um;
        }
        return null;
    }

    public final C41634IbP A04(String str) {
        C1563470e c1563470e = this.A07;
        C14360o3.A0B(str, 0);
        Object obj = c1563470e.A0A.get(str);
        EnumC39539HdB enumC39539HdB = EnumC39539HdB.A04;
        if (obj != enumC39539HdB) {
            c1563470e.A0E(enumC39539HdB, str);
            C1563370d c1563370d = this.A0A;
            UserSession userSession = this.A06;
            HGC hgc = new HGC(this, str);
            C14360o3.A0B(userSession, 0);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A0B("commerce/bag/");
            c25621Ms.A06();
            c25621Ms.A0H("merchant_ids", jSONArray.toString());
            c25621Ms.A0R(C38888HAk.class, ISM.class);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C39024HGa(hgc, A0N, c1563370d);
            C1GJ.A03(A0N);
        }
        INR A06 = c1563470e.A06(str);
        if (A06 == null) {
            return null;
        }
        return A06.A00();
    }

    public final C41634IbP A05(String str) {
        INR A06 = this.A07.A06(str);
        if (A06 != null) {
            return A06.A00();
        }
        return A04(str);
    }

    public final Integer A06() {
        C1563470e c1563470e = this.A07;
        if (c1563470e.A00 == -2) {
            c1563470e.A00 = -1;
            C1563370d c1563370d = c1563470e.A08;
            UserSession userSession = c1563470e.A05;
            C39001HFd c39001HFd = new C39001HFd(c1563470e);
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A0B("commerce/bag/count/");
            c25621Ms.A09(C05F.A0N);
            c25621Ms.A0P(null, HAD.class, ISK.class, false);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C39024HGa(c39001HFd, A0N, c1563370d);
            C1GJ.A03(A0N);
        }
        int i = c1563470e.A00;
        if (i >= 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public final void A07(C41187ILa c41187ILa) {
        C1563370d c1563370d = this.A0A;
        UserSession userSession = this.A06;
        C39018HFu c39018HFu = new C39018HFu(c41187ILa, this);
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A0B("commerce/bag/index/");
        c25621Ms.A06();
        c25621Ms.A0R(C38887HAj.class, ISL.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C39024HGa(c39018HFu, A0N, c1563370d);
        C1GJ.A03(A0N);
        if (this.A05 != null && this.A04 != null) {
            A02(A03(), this, EnumC39539HdB.A03, false);
        }
    }

    @Override // X.C70Z
    public final void D2c(INR inr, String str) {
        A01(inr, this, EnumC39539HdB.A03, str, true);
    }

    @Override // X.C70Z
    public final void Dtx(int i) {
        AbstractC25651Mw.A00(this.A06).E4s(new C71H(EnumC46143Kbh.A03, i));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C25671My A00 = AbstractC25651Mw.A00(this.A06);
        A00.A02(this.A09, C3HW.class);
        A00.A02(this.A08, C1563870i.class);
        this.A07.A0B();
    }

    public C70Y(UserSession userSession) {
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.70b
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String A00;
                EnumC39622HeW enumC39622HeW;
                int A03 = C0f9.A03(998854932);
                int A032 = C0f9.A03(-188572189);
                InterfaceC76653cC interfaceC76653cC = ((C3HW) obj).A00;
                if (interfaceC76653cC instanceof Product) {
                    C1563470e c1563470e = C70Y.this.A07;
                    Product product = (Product) interfaceC76653cC;
                    C14360o3.A0B(product, 0);
                    User user = product.A0B;
                    if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                        if (c1563470e.A06(A00) != null && product.A04() && product.A0P) {
                            if (c1563470e.A09.A03(product)) {
                                c1563470e.A0G(product, A00);
                            } else {
                                INR A06 = c1563470e.A06(A00);
                                if (A06 != null) {
                                    MultiProductComponent multiProductComponent = A06.A02;
                                    if (multiProductComponent != null) {
                                        enumC39622HeW = multiProductComponent.A04;
                                    } else {
                                        enumC39622HeW = null;
                                    }
                                    if (enumC39622HeW == EnumC39622HeW.A0P) {
                                        c1563470e.A0H(product, A00);
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C0f9.A0A(-1640915069, A032);
                C0f9.A0A(-520936447, A03);
            }
        };
        this.A09 = interfaceC41501vz;
        InterfaceC41501vz interfaceC41501vz2 = new InterfaceC41501vz() { // from class: X.70c
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(157610399);
                C1563870i c1563870i = (C1563870i) obj;
                int A032 = C0f9.A03(-1225735555);
                C70Y c70y = C70Y.this;
                IgFundedIncentive igFundedIncentive = c70y.A00;
                if (igFundedIncentive != null && c1563870i.A01.contains(igFundedIncentive.A07)) {
                    c70y.A00 = null;
                }
                C1563470e c1563470e = c70y.A07;
                String str = c1563870i.A00;
                INR A06 = c1563470e.A06(str);
                if (A06 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    boolean z = false;
                    for (Object obj2 : A06.A01.entrySet()) {
                        C14360o3.A07(obj2);
                        Map.Entry entry = (Map.Entry) obj2;
                        Object key = entry.getKey();
                        C41730Ie1 c41730Ie1 = (C41730Ie1) entry.getValue();
                        Product A04 = c41730Ie1.A04();
                        if (A04 != null && A04.A0P) {
                            A06.A00 -= c41730Ie1.A01;
                            z = true;
                        } else {
                            linkedHashMap.put(key, c41730Ie1);
                        }
                    }
                    A06.A01 = linkedHashMap;
                    if (z) {
                        c1563470e.A0C.put(str, Integer.valueOf(A06.A00));
                        C1563470e.A02(c1563470e);
                        c1563470e.A07.D2c(A06, str);
                    }
                }
                C0f9.A0A(1517075457, A032);
                C0f9.A0A(-353314536, A03);
            }
        };
        this.A08 = interfaceC41501vz2;
        this.A02 = C05F.A00;
        this.A06 = userSession;
        C1563370d c1563370d = new C1563370d();
        this.A0A = c1563370d;
        this.A07 = new C1563470e(userSession, this, c1563370d);
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        A00.A01(interfaceC41501vz, C3HW.class);
        A00.A01(interfaceC41501vz2, C1563870i.class);
    }
}
