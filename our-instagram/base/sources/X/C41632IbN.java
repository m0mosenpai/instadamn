package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.IbN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41632IbN {
    public final Context A00;
    public final UserSession A01;
    public final C41727Idy A02;
    public final C41621IbB A03;
    public final J0U A04;
    public final C64972wv A05;
    public final JI6 A06;
    public final IND A07;

    public C41632IbN(Context context, UserSession userSession, C41727Idy c41727Idy, IND ind, C41621IbB c41621IbB, J0U j0u, C64972wv c64972wv, JI6 ji6) {
        AbstractC167007dF.A1G(userSession, 1, c41727Idy);
        AbstractC25233BEq.A0y(6, ind, j0u, c41621IbB);
        this.A01 = userSession;
        this.A00 = context;
        this.A06 = ji6;
        this.A02 = c41727Idy;
        this.A07 = ind;
        this.A05 = c64972wv;
        this.A04 = j0u;
        this.A03 = c41621IbB;
    }

    public static final ProductVariantDimension A00(ProductVariantDimension productVariantDimension, C41632IbN c41632IbN) {
        JI6 ji6 = c41632IbN.A06;
        ProductGroup productGroup = ji6.C02().A00;
        ProductVariantDimension productVariantDimension2 = null;
        if (productGroup != null) {
            Iterator A13 = AbstractC31174DnI.A13(productGroup.A02);
            while (A13.hasNext()) {
                ProductVariantDimension productVariantDimension3 = (ProductVariantDimension) A13.next();
                if (!C14360o3.A0K(productVariantDimension3, productVariantDimension) && productVariantDimension3.A00 == ProductVariantVisualStyle.A04) {
                    C41578IaR c41578IaR = ji6.C02().A07;
                    String str = productVariantDimension3.A02;
                    C14360o3.A07(str);
                    if (c41578IaR.A01.get(str) == null) {
                        productVariantDimension2 = productVariantDimension3;
                    }
                }
            }
        }
        return productVariantDimension2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r1.equals(r0.A03) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.model.shopping.ProductVariantDimension r12, X.JGZ r13, X.InterfaceC1119153d r14) {
        /*
            r11 = this;
            X.JI6 r4 = r11.A06
            com.instagram.user.model.Product r1 = X.C41726Idx.A00(r4)
            r6 = 1
            if (r1 == 0) goto L22
            boolean r0 = r1.A04()
            if (r0 == 0) goto L22
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r1.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L22
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r0 = r0.A03
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L23
        L22:
            r3 = 0
        L23:
            X.Idx r0 = r4.C02()
            X.C14360o3.A07(r0)
            com.instagram.shopping.model.variantselector.VariantSelectorModel r2 = X.I7J.A00(r12, r0)
            X.Idy r7 = r11.A02
            X.JID r0 = r4.BUL()
            com.instagram.user.model.Product r1 = r0.Bgk()
            java.lang.String r9 = r12.A02
            X.C14360o3.A07(r9)
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r0 = r12.A00
            X.C14360o3.A07(r0)
            java.lang.String r8 = r0.A00
            if (r3 == 0) goto Le5
            java.util.List r0 = r2.A01
            boolean r0 = X.AbstractC37301Gc2.A1b(r0)
            if (r0 != 0) goto Le5
        L4e:
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            boolean r10 = X.AbstractC167007dF.A1V(r8)
            X.0wW r5 = r7.A04
            java.lang.String r0 = "instagram_shopping_reveal_product_variant_selector"
            X.0Ai r5 = X.AbstractC166987dD.A0f(r5, r0)
            X.AbstractC37303Gc4.A0j(r5, r1)
            java.lang.String r0 = X.AbstractC37302Gc3.A0d(r1)
            X.AbstractC37301Gc2.A17(r5, r0)
            X.AbstractC37302Gc3.A10(r5, r1)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r1.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            r1 = 1
            if (r0 == 0) goto Le3
            java.lang.Boolean r0 = r0.A02
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r10)
            if (r0 == 0) goto Le3
            com.instagram.common.session.UserSession r0 = r7.A06
            boolean r0 = X.AbstractC37302Gc3.A1a(r0)
            if (r0 == 0) goto Le3
        L82:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "can_add_to_bag"
            r5.A7v(r0, r1)
            java.lang.Long r1 = X.AbstractC37302Gc3.A0T()
            java.lang.String r0 = "item_count"
            r5.A9K(r0, r1)
            java.lang.String r0 = "variant_id"
            r5.AAP(r0, r9)
            java.lang.String r0 = "visual_style"
            r5.AAP(r0, r8)
            java.lang.String r0 = r7.A0E
            X.AbstractC37300Gc1.A0s(r5, r0)
            X.C41727Idy.A02(r5, r7)
            java.lang.String r1 = r7.A0H
            java.lang.String r0 = "shopping_session_id"
            java.lang.Boolean r1 = X.AbstractC31173DnH.A0e(r5, r0, r1, r6)
            java.lang.String r0 = "can_enable_restock_reminder"
            r5.A7v(r0, r1)
            r5.Cht()
            X.J0U r1 = r11.A04
            X.IxM r0 = new X.IxM
            r0.<init>(r11, r13, r3)
            r1.A01(r0, r2, r14, r3)
            X.Idx r0 = r4.C02()
            X.IeT r3 = new X.IeT
            r3.<init>(r0)
            X.IaR r0 = r0.A07
            X.C14360o3.A07(r0)
            java.util.HashMap r2 = X.AbstractC166987dD.A1G()
            java.util.Map r0 = r0.A01
            r2.putAll(r0)
            r1 = 0
            X.IaR r0 = new X.IaR
            r0.<init>(r1, r2)
            r3.A07 = r0
            X.C41726Idx.A02(r4, r3)
            return
        Le3:
            r1 = 0
            goto L82
        Le5:
            r6 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41632IbN.A01(com.instagram.model.shopping.ProductVariantDimension, X.JGZ, X.53d):void");
    }

    public final void A02(ProductVariantDimension productVariantDimension, String str, boolean z) {
        String str2;
        String A00;
        JI6 ji6 = this.A06;
        C41726Idx C02 = ji6.C02();
        ProductGroup productGroup = C02.A00;
        if (productGroup != null) {
            C41578IaR c41578IaR = C02.A07;
            String str3 = productVariantDimension.A02;
            C14360o3.A07(str3);
            Map map = c41578IaR.A01;
            Object obj = map.get(str3);
            Product product = C02.A09;
            if (product != null) {
                C41616Ib6 c41616Ib6 = new C41616Ib6(productGroup, product);
                c41616Ib6.A01(productVariantDimension, str);
                Iterator A13 = AbstractC31174DnI.A13(productGroup.A02);
                while (A13.hasNext()) {
                    ProductVariantDimension productVariantDimension2 = (ProductVariantDimension) A13.next();
                    if (!productVariantDimension.equals(productVariantDimension2)) {
                        String str4 = productVariantDimension2.A02;
                        C14360o3.A07(str4);
                        String A1A = AbstractC166987dD.A1A(str4, map);
                        if (A1A != null) {
                            c41616Ib6.A01(productVariantDimension2, A1A);
                        }
                    }
                }
                IH9 ih9 = new IH9(C41616Ib6.A00(c41616Ib6), c41616Ib6.A01, c41616Ib6.A02);
                if (!C14360o3.A0K(obj, str)) {
                    C41727Idy c41727Idy = this.A02;
                    Product product2 = ih9.A00;
                    C14360o3.A06(product2);
                    C38683GzO A03 = C128205qp.A03(c41727Idy.A06, product2);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41727Idy.A04, "instagram_shopping_change_product_variant");
                    C41727Idy.A02(A0f, c41727Idy);
                    Boolean bool = A03.A04;
                    C14360o3.A0A(bool);
                    A0f.A7v("is_checkout_enabled", bool);
                    Boolean bool2 = A03.A02;
                    C14360o3.A0A(bool2);
                    A0f.A7v("can_add_to_bag", bool2);
                    A0f.A7v("is_variant_selection_in_stock", Boolean.valueOf(product2.A0P));
                    C38683GzO.A02(A0f, A03);
                    AbstractC37300Gc1.A0t(A0f, c41727Idy.A0H);
                    C41726Idx C022 = c41727Idy.A0A.C02();
                    C14360o3.A0A(C022);
                    A0f.AAQ(C41727Idy.A01(c41727Idy, C022), "pdp_logging_info");
                    AbstractC37300Gc1.A0s(A0f, c41727Idy.A0E);
                    A0f.A7v("has_drops_launched", A03.A03);
                    AbstractC37300Gc1.A0m(A0f, "variant_selector");
                    String str5 = c41727Idy.A0C;
                    if (str5 != null && !AbstractC001900j.A0T(str5)) {
                        A0f.A9K("collection_page_id", AbstractC166997dE.A0j(str5));
                    }
                    AbstractC37303Gc4.A0b(A0f);
                    A0f.Cht();
                }
                C41726Idx C023 = ji6.C02();
                Product product3 = ih9.A00;
                String str6 = product3.A0H;
                boolean A002 = AbstractC50102Ry.A00(C023.A0B.get(str6), Boolean.TRUE);
                C41753IeT c41753IeT = new C41753IeT(C02);
                c41753IeT.A09 = product3;
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.putAll(map);
                String str7 = c41578IaR.A00;
                A1G.clear();
                Map map2 = ih9.A02;
                C14360o3.A06(map2);
                A1G.putAll(map2);
                c41753IeT.A07 = new C41578IaR(str7, A1G);
                c41753IeT.A0G = C70Y.A00(this.A01).A08(product3);
                if (z && productVariantDimension.A00 == ProductVariantVisualStyle.A04 && !A002 && !product3.A0P) {
                    c41753IeT.A0B.put(str6, true);
                }
                C41726Idx.A02(ji6, c41753IeT);
                if (product != product3) {
                    IND ind = this.A07;
                    ind.A01(null);
                    JI6 ji62 = ind.A07;
                    C41726Idx C024 = ji62.C02();
                    Product product4 = C024.A09;
                    if (product4 != null) {
                        Product product5 = C024.A08;
                        if (product5 != null) {
                            C41753IeT c41753IeT2 = new C41753IeT(C024);
                            C41595Iai c41595Iai = C024.A02;
                            c41753IeT2.A02 = new C41595Iai(c41595Iai.A00, c41595Iai.A01, c41595Iai.A02, c41595Iai.A03, c41595Iai.A04, EnumC39591He1.A06, c41595Iai.A06);
                            C41726Idx.A02(ji62, c41753IeT2);
                            AbstractC59962oe abstractC59962oe = ind.A00;
                            Context context = abstractC59962oe.getContext();
                            if (context != null) {
                                C08790ch A003 = AbstractC018607g.A00(abstractC59962oe);
                                UserSession userSession = ind.A01;
                                String str8 = product5.A0H;
                                User user = product4.A0B;
                                if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                                    C41080IGx c41080IGx = new C41080IGx(ind, C024, product4);
                                    C14360o3.A0B(str8, 3);
                                    String str9 = product4.A0H;
                                    C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                                    A0M.A0L("commerce/products/%s/variant_sections/", str8);
                                    A0M.A9s(MSV.A00(1586), str9);
                                    A0M.A9s("merchant_id", A00);
                                    A0M.A9s("device_width", String.valueOf(AbstractC13880nE.A0A(context)));
                                    A0M.A9s("shopping_bag_enabled", "false");
                                    C1ON A0R = AbstractC31172DnG.A0R(null, A0M, C38882HAe.class, ISW.class, false);
                                    C37484Gf2.A00(A0R, c41080IGx, userSession, 14);
                                    C1GJ.A00(context, A003, A0R);
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                if (z && productVariantDimension.A00 == ProductVariantVisualStyle.A04 && !A002 && !product3.A0P) {
                    IND ind2 = this.A07;
                    User user2 = product3.A0B;
                    if (user2 == null || (str2 = AbstractC76433bn.A00(user2)) == null) {
                        str2 = "";
                    }
                    C37484Gf2 c37484Gf2 = new C37484Gf2(17, ih9, this);
                    C14360o3.A0B(str6, 0);
                    AbstractC59962oe abstractC59962oe2 = ind2.A00;
                    C25621Ms A0c = AbstractC167017dG.A0c(ind2.A01);
                    A0c.A0L("commerce/restock_reminder/%s/set/", str6);
                    AbstractC31173DnH.A1N(A0c);
                    A0c.A9s("enabled", "true");
                    C1ON A0T = AbstractC31172DnG.A0T(A0c, "merchant_id", str2);
                    A0T.A00 = c37484Gf2;
                    abstractC59962oe2.schedule(A0T);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
