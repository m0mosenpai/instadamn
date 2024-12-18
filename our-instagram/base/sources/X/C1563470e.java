package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.70e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1563470e {
    public int A00;
    public String A01;
    public final int A02;
    public final C70V A03;
    public final C25671My A04;
    public final UserSession A05;
    public final C1563770h A06;
    public final C70Z A07;
    public final C1563370d A08;
    public final C1563670g A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D;
    public final Map A0E;
    public final java.util.Set A0F;

    public C1563470e(UserSession userSession, C70Z c70z, C1563370d c1563370d) {
        C14360o3.A0B(userSession, 2);
        C1563670g A00 = AbstractC1563570f.A00(userSession);
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36593297455645787L);
        C1563770h c1563770h = new C1563770h(AbstractC40691uc.A01(userSession));
        C70V c70v = new C70V(userSession);
        C14360o3.A0B(A00, 3);
        C14360o3.A0B(A002, 4);
        this.A08 = c1563370d;
        this.A05 = userSession;
        this.A09 = A00;
        this.A04 = A002;
        this.A07 = c70z;
        this.A02 = A01;
        this.A06 = c1563770h;
        this.A03 = c70v;
        this.A01 = null;
        this.A0E = new LinkedHashMap();
        this.A0B = new LinkedHashMap();
        this.A0A = new LinkedHashMap();
        this.A0C = new LinkedHashMap();
        this.A0F = new LinkedHashSet();
        this.A0D = new LinkedHashMap();
        this.A00 = -2;
    }

    public final INR A06(String str) {
        C14360o3.A0B(str, 0);
        return (INR) this.A0B.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.JGU A07(com.instagram.user.model.Product r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            int r1 = r3.A00
            int r0 = r3.A02
            if (r1 != r0) goto L14
            com.instagram.common.session.UserSession r1 = r3.A05
            X.IxY r0 = new X.IxY
            r0.<init>(r1)
        L11:
            X.JGU r0 = (X.JGU) r0
            return r0
        L14:
            boolean r0 = r4.A0P
            if (r0 == 0) goto L4a
            X.INR r2 = r3.A06(r5)
            if (r2 == 0) goto L48
            java.lang.String r1 = r4.A0H
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.util.LinkedHashMap r0 = r2.A01
            java.lang.Object r0 = r0.get(r1)
            X.Ie1 r0 = (X.C41730Ie1) r0
            if (r0 == 0) goto L48
            int r0 = r0.A03()
        L32:
            int r1 = r0 + 1
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r4.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L46
            java.lang.Integer r0 = r0.A0C
            if (r0 == 0) goto L46
            int r0 = r0.intValue()
        L42:
            if (r1 > r0) goto L4a
            r0 = 0
            return r0
        L46:
            r0 = 0
            goto L42
        L48:
            r0 = -1
            goto L32
        L4a:
            X.IxX r0 = new X.IxX
            r0.<init>()
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1563470e.A07(com.instagram.user.model.Product, java.lang.String):X.JGU");
    }

    public final C41730Ie1 A08(C41730Ie1 c41730Ie1, Product product, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c41730Ie1, 1);
        INR A06 = A06(str);
        if (A06 != null) {
            A06.A04(c41730Ie1, product);
            A0A(str).add(new C41229IMu(EnumC39548HdK.A06, EnumC39537Hd9.A03, c41730Ie1, product));
            A0B();
            this.A07.D2c(A06, str);
            String str2 = product.A0H;
            C14360o3.A0B(str2, 0);
            return (C41730Ie1) A06.A01.get(str2);
        }
        return null;
    }

    public final String A09(String str) {
        C14360o3.A0B(str, 0);
        return (String) this.A0D.get(str);
    }

    public final List A0A(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A0E;
        List list = (List) map.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            map.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.JHg] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.IFb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.IDF] */
    public final void A0C(InterfaceC43442JHg interfaceC43442JHg, Product product, String str) {
        String str2;
        int i;
        CurrencyAmountInfo currencyAmountInfo;
        Integer BYa;
        CurrencyAmountInfo currencyAmountInfo2;
        C14360o3.A0B(str, 0);
        JGU A07 = A07(product, str);
        if (A07 != null) {
            List singletonList = Collections.singletonList(A07);
            C14360o3.A07(singletonList);
            interfaceC43442JHg.Dxo(singletonList);
            return;
        }
        INR A06 = A06(str);
        if (A06 == null) {
            User user = product.A0B;
            ?? obj = new Object();
            ProductCheckoutProperties productCheckoutProperties = product.A01.A0C;
            if (productCheckoutProperties != null && (currencyAmountInfo2 = productCheckoutProperties.A00) != null) {
                str2 = currencyAmountInfo2.getCurrency();
            } else {
                str2 = null;
            }
            ProductCheckoutProperties productCheckoutProperties2 = product.A01.A0C;
            if (productCheckoutProperties2 != null && (currencyAmountInfo = productCheckoutProperties2.A00) != null && (BYa = currencyAmountInfo.BYa()) != null) {
                i = BYa.intValue();
            } else {
                i = 0;
            }
            ?? obj2 = new Object();
            obj2.A01 = str2;
            obj2.A00 = i;
            A06 = new INR(new C41634IbP(null, obj2, obj, user, C16930sl.A00, true));
            this.A0B.put(str, A06);
        }
        if (A06.A03.A08) {
            A0D(new Object(), product, str, null);
            A06.A02(C41730Ie1.A01(product, 1));
        } else {
            Iterator it = A00(product, str, true).iterator();
            while (it.hasNext()) {
                A01(A06, (C41229IMu) it.next());
            }
            A0B();
        }
        this.A07.D2c(A06, str);
        String str3 = product.A0H;
        C14360o3.A0B(str3, 0);
        Object obj3 = A06.A01.get(str3);
        if (obj3 == null) {
            return;
        }
        interfaceC43442JHg.onSuccess(obj3);
    }

    public final void A0D(InterfaceC43442JHg interfaceC43442JHg, Product product, String str, String str2) {
        C14360o3.A0B(str, 0);
        List A00 = A00(product, str, false);
        A0E(EnumC39539HdB.A04, str);
        HG4 hg4 = new HG4(interfaceC43442JHg, this, product, str, A00);
        if (C18U.A06(C06090Tz.A05, this.A03.A00, 36314974985063348L)) {
            C1563770h c1563770h = this.A06;
            String str3 = product.A0H;
            String A09 = A09(str);
            C14360o3.A0B(str3, 1);
            InterfaceC40711ue interfaceC40711ue = c1563770h.A00;
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            C0CA A02 = GraphQlCallInput.A02.A02();
            C0CA.A00(A02, str, "merchant_id");
            C0CA.A00(A02, str3, "product_id");
            C0CA.A00(A02, 1, "quantity");
            if (A09 != null) {
                C0CA.A00(A02, A09, "cart_id");
            }
            c2jm.A00.A02().A0E(A02, "input");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "CommerceCartGraphQLCartMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C60293Qx5.class, true, null, 0, null, "xfb_commerce_cart_add_product", new ArrayList());
            interfaceC40711ue.ATV(new C42091Ikz(hg4), new C42096Il5(hg4), pandoGraphQLRequest);
            return;
        }
        C1563370d c1563370d = this.A08;
        UserSession userSession = this.A05;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("merchant_id", str).put("product_id", product.A0H).put("additional_quantity", 1);
            if (str2 != null) {
                jSONObject.put("marketer_id", str2);
            }
            jSONArray.put(jSONObject);
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A0B("commerce/bag/add/");
            c25621Ms.A05();
            c25621Ms.A9s(DialogModule.KEY_ITEMS, jSONArray.toString());
            c25621Ms.A0R(C38888HAk.class, ISM.class);
            c25621Ms.A0R = true;
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C39024HGa(hg4, A0N, c1563370d);
            C1GJ.A03(A0N);
        } catch (JSONException e) {
            hg4.onFail(new C115095Ie(e));
        }
    }

    public final void A0E(EnumC39539HdB enumC39539HdB, String str) {
        C14360o3.A0B(str, 0);
        this.A0A.put(str, enumC39539HdB);
    }

    public final void A0F(C41730Ie1 c41730Ie1, String str) {
        C14360o3.A0B(str, 0);
        INR A06 = A06(str);
        if (A06 != null) {
            String A05 = c41730Ie1.A05();
            C14360o3.A07(A05);
            if (A06.A01.get(A05) != null) {
                A06.A03(c41730Ie1);
                A0A(str).add(new C41229IMu(EnumC39548HdK.A05, EnumC39537Hd9.A03, c41730Ie1, null));
                this.A07.D2c(A06, str);
                this.A0C.put(str, Integer.valueOf(A06.A00));
                A02(this);
            }
        }
    }

    public final void A0G(Product product, String str) {
        EnumC39622HeW enumC39622HeW;
        C14360o3.A0B(str, 0);
        INR A06 = A06(str);
        if (A06 != null) {
            String str2 = product.A0H;
            C14360o3.A0B(str2, 0);
            if (A06.A01.get(str2) == null) {
                MultiProductComponent multiProductComponent = A06.A02;
                if (multiProductComponent != null) {
                    enumC39622HeW = multiProductComponent.A04;
                } else {
                    enumC39622HeW = null;
                }
                if (enumC39622HeW == EnumC39622HeW.A0P && multiProductComponent != null) {
                    Iterator it = multiProductComponent.A03.A03.iterator();
                    while (it.hasNext()) {
                        if (((ProductFeedItem) it.next()).getId().equals(str2)) {
                            return;
                        }
                    }
                    multiProductComponent.A02(new ProductFeedItem(product));
                    this.A07.D2c(A06, str);
                }
            }
        }
    }

    public final void A0H(Product product, String str) {
        MultiProductComponent multiProductComponent;
        C14360o3.A0B(str, 0);
        INR A06 = A06(str);
        if (A06 != null && (multiProductComponent = A06.A02) != null && multiProductComponent.A03(product.A0H)) {
            this.A07.D2c(A06, str);
        }
    }

    public static final void A01(INR inr, C41229IMu c41229IMu) {
        int ordinal = c41229IMu.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            Product product = c41229IMu.A03;
                            if (product != null) {
                                inr.A04(c41229IMu.A02, product);
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException();
                    }
                    C41730Ie1 c41730Ie1 = c41229IMu.A02;
                    if (!inr.A01.containsKey(c41730Ie1.A05())) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(c41730Ie1.A05(), c41730Ie1);
                    linkedHashMap.putAll(inr.A01);
                    inr.A01 = linkedHashMap;
                    return;
                }
                C41730Ie1 c41730Ie12 = c41229IMu.A02;
                String A05 = c41730Ie12.A05();
                C14360o3.A07(A05);
                inr.A01(A05, c41730Ie12.A03());
                return;
            }
            inr.A03(c41229IMu.A02);
            return;
        }
        inr.A02(c41229IMu.A02);
    }

    public static final void A02(C1563470e c1563470e) {
        int A02 = AbstractC001800i.A02(c1563470e.A0C.values());
        int i = c1563470e.A00;
        if (i < 0 || A02 != i) {
            c1563470e.A00 = A02;
            c1563470e.A07.Dtx(A02);
        }
    }

    public final void A0B() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        java.util.Set set = this.A0F;
        set.clear();
        for (Map.Entry entry : this.A0B.entrySet()) {
            String str = (String) entry.getKey();
            INR inr = (INR) entry.getValue();
            if (!A05(this, str) && !inr.A03.A08) {
                C14360o3.A0B(str, 0);
                Map map = this.A0A;
                if (map.get(str) != null && map.get(str) == EnumC39539HdB.A03) {
                    if (A04(this, str)) {
                        arrayList2.add(str);
                        arrayList.add(inr);
                        arrayList3.add(A0A(str));
                        A0E(EnumC39539HdB.A04, str);
                    }
                }
            }
            set.add(str);
        }
        if (!arrayList.isEmpty()) {
            C1563370d c1563370d = this.A08;
            UserSession userSession = this.A05;
            C39012HFo c39012HFo = new C39012HFo(this, arrayList2, arrayList3);
            if (arrayList2.size() == arrayList.size()) {
                JSONArray jSONArray = new JSONArray();
                try {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        INR inr2 = (INR) arrayList.get(i);
                        Object obj = arrayList2.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("merchant_id", obj);
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = new ArrayList(inr2.A01.values()).iterator();
                        while (it.hasNext()) {
                            C41730Ie1 c41730Ie1 = (C41730Ie1) it.next();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("product_id", c41730Ie1.A05());
                            jSONObject2.put("quantity", c41730Ie1.A01);
                            jSONArray2.put(jSONObject2);
                        }
                        jSONObject.put(DialogModule.KEY_ITEMS, jSONArray2);
                        jSONArray.put(jSONObject);
                    }
                    C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                    c25621Ms.A0B("commerce/bag/sync/");
                    c25621Ms.A05();
                    c25621Ms.A9s("bags", jSONArray.toString());
                    c25621Ms.A0R(C38888HAk.class, ISM.class);
                    c25621Ms.A0R = true;
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = new C39024HGa(c39012HFo, A0N, c1563370d);
                    C1GJ.A03(A0N);
                    return;
                } catch (JSONException e) {
                    c39012HFo.onFail(new C115095Ie(e));
                    return;
                }
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[LOOP:0: B:7:0x0040->B:9:0x0046, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Ie1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List A00(com.instagram.user.model.Product r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            X.INR r2 = r6.A06(r8)
            if (r2 == 0) goto L52
            java.lang.String r1 = r7.A0H
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.util.LinkedHashMap r0 = r2.A01
            java.lang.Object r3 = r0.get(r1)
            X.Ie1 r3 = (X.C41730Ie1) r3
            if (r3 == 0) goto L52
            int r0 = r3.A03()
            int r2 = r0 + 1
            X.IMp r1 = r3.A02
            int r0 = r3.A00
            X.Ie1 r4 = new X.Ie1
            r4.<init>()
            r4.A02 = r1
            r4.A01 = r2
            r4.A00 = r0
            X.HdK r3 = X.EnumC39548HdK.A04
            X.Hd9 r2 = X.EnumC39537Hd9.A03
            r1 = 0
            X.IMu r0 = new X.IMu
            r0.<init>(r3, r2, r4, r1)
            java.util.List r3 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r3)
        L3c:
            java.util.Iterator r2 = r3.iterator()
        L40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r6.A0A(r8)
            r0.add(r1)
            goto L40
        L52:
            r0 = 1
            X.Ie1 r5 = X.C41730Ie1.A01(r7, r0)
            X.C14360o3.A0A(r5)
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.HdK r1 = X.EnumC39548HdK.A02
            if (r9 == 0) goto L81
            X.Hd9 r0 = X.EnumC39537Hd9.A03
        L64:
            r4 = 0
            X.IMu r3 = new X.IMu
            r3.<init>(r1, r0, r5, r4)
            X.HdK r2 = X.EnumC39548HdK.A03
            if (r9 == 0) goto L7e
            X.Hd9 r1 = X.EnumC39537Hd9.A03
        L70:
            X.IMu r0 = new X.IMu
            r0.<init>(r2, r1, r5, r4)
            X.IMu[] r0 = new X.C41229IMu[]{r3, r0}
            java.util.List r3 = X.AbstractC16960so.A1Q(r0)
            goto L3c
        L7e:
            X.Hd9 r1 = X.EnumC39537Hd9.A04
            goto L70
        L81:
            X.Hd9 r0 = X.EnumC39537Hd9.A04
            goto L64
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1563470e.A00(com.instagram.user.model.Product, java.lang.String, boolean):java.util.List");
    }

    public static final void A03(C1563470e c1563470e, List list, List list2) {
        String str;
        Iterator it = list.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            IIP iip = (IIP) it.next();
            User user = iip.A01;
            if (user != null) {
                str2 = AbstractC76433bn.A00(user);
            }
            C14360o3.A0A(str2);
            c1563470e.A0C.put(str2, Integer.valueOf(iip.A00));
            c1563470e.A01 = iip.A02;
            c1563470e.A0D.put(str2, iip.A03);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C41634IbP c41634IbP = (C41634IbP) it2.next();
            User user2 = c41634IbP.A05;
            if (user2 != null) {
                str = AbstractC76433bn.A00(user2);
            } else {
                str = null;
            }
            C14360o3.A0A(str);
            INR inr = new INR(c41634IbP);
            for (C41229IMu c41229IMu : c1563470e.A0A(str)) {
                EnumC39537Hd9 enumC39537Hd9 = c41229IMu.A00;
                if (enumC39537Hd9 == EnumC39537Hd9.A03 || enumC39537Hd9 == EnumC39537Hd9.A02) {
                    A01(inr, c41229IMu);
                }
            }
            c1563470e.A0B.put(str, inr);
            c1563470e.A0E(EnumC39539HdB.A03, str);
            c1563470e.A0C.put(str, Integer.valueOf(inr.A00));
            linkedHashSet.add(str);
        }
        for (Map.Entry entry : c1563470e.A0B.entrySet()) {
            String str3 = (String) entry.getKey();
            INR inr2 = (INR) entry.getValue();
            if (!linkedHashSet.contains(str3) && A04(c1563470e, str3)) {
                c1563470e.A0C.put(str3, Integer.valueOf(inr2.A00));
            }
        }
        A02(c1563470e);
        if (!(!c1563470e.A08.A00.isEmpty())) {
            java.util.Set entrySet = c1563470e.A0E.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entrySet) {
                if (!A04(c1563470e, (String) ((Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((List) ((Map.Entry) it3.next()).getValue()).clear();
            }
        }
    }

    public static final boolean A04(C1563470e c1563470e, String str) {
        List A0A = c1563470e.A0A(str);
        if (!(A0A instanceof Collection) || !A0A.isEmpty()) {
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                if (((C41229IMu) it.next()).A00 != EnumC39537Hd9.A02) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A05(C1563470e c1563470e, String str) {
        List A0A = c1563470e.A0A(str);
        if ((A0A instanceof Collection) && A0A.isEmpty()) {
            return false;
        }
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            if (((C41229IMu) it.next()).A00 == EnumC39537Hd9.A04) {
                return true;
            }
        }
        return false;
    }
}
