package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ie2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41731Ie2 {
    public String A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final C18920wW A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final UserSession A09;
    public final Boolean A0A;
    public final String A0B;

    public C41731Ie2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(userSession, 2);
        this.A01 = interfaceC11380iw;
        this.A09 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = str3;
        this.A04 = str4;
        this.A07 = str2 == null ? str4 : str2;
        this.A08 = str5;
        this.A0B = str6;
        this.A0A = bool;
        this.A03 = AbstractC12220kQ.A00(interfaceC11380iw, C12180kM.A05, userSession);
        this.A02 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A06(String str, String str2, String str3, List list) {
        ArrayList arrayList;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_ig_funded_incentive_button_tap");
        A0f.AAk("ig_funded_discount_ids", AbstractC166987dD.A1J(AbstractC25228BEl.A13(str)));
        C0Zx c0Zx = new C0Zx();
        AbstractC37300Gc1.A0v(c0Zx, this.A07);
        AbstractC37300Gc1.A0w(c0Zx, this.A05);
        AbstractC37302Gc3.A0u(A0f, c0Zx, this.A08);
        C4SX c4sx = null;
        if (list != null) {
            arrayList = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), arrayList);
            }
        } else {
            arrayList = null;
        }
        A0f.AAQ(A00(this, str3, arrayList), "bag_logging_info");
        if (str2 != null) {
            c4sx = C4SX.A00(str2);
        }
        A0f.AAK(c4sx, "merchant_id");
        A0f.Cht();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Gws, X.0Zx] */
    public static final C38531Gws A00(C41731Ie2 c41731Ie2, String str, List list) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("checkout_session_id", str);
        c0Zx.A06("global_bag_entry_point", c41731Ie2.A00);
        c0Zx.A06("global_bag_prior_module", c41731Ie2.A04);
        c0Zx.A06("merchant_bag_entry_point", c41731Ie2.A05);
        c0Zx.A06("merchant_bag_prior_module", c41731Ie2.A06);
        c0Zx.A07("merchant_bag_ids", list);
        return c0Zx;
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C41731Ie2 c41731Ie2, String str, String str2) {
        interfaceC02590Ai.AAP("shopping_session_id", str);
        interfaceC02590Ai.AAP("global_bag_entry_point", c41731Ie2.A00);
        interfaceC02590Ai.AAP("global_bag_prior_module", c41731Ie2.A04);
        if (str2 != null) {
            interfaceC02590Ai.A9K("global_bag_id", AbstractC003100w.A0k(10, str2));
        }
    }

    public final void A03() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "instagram_shopping_bag_index_entry");
        String str = this.A00;
        if (str != null) {
            A0f.AAP("global_bag_entry_point", str);
            String str2 = this.A04;
            if (str2 != null) {
                A0f.AAP("global_bag_prior_module", str2);
                String str3 = this.A08;
                if (str3 == null) {
                    str3 = "";
                }
                AbstractC37300Gc1.A0t(A0f, str3);
                A0f.A7v("is_bloks", this.A0A);
                AbstractC37300Gc1.A0l(A0f, this.A0B);
                A0f.Cht();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static String A01(InterfaceC02590Ai interfaceC02590Ai, C41731Ie2 c41731Ie2, String str, String str2, String str3) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("checkout_session_id", str3);
        String str4 = c41731Ie2.A08;
        if (str4 == null) {
            return "";
        }
        return str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r4.compareTo(r7.A02) > 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C41634IbP r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r6 = this;
            X.AbstractC167017dG.A1R(r10, r11)
            X.0wW r1 = r6.A02
            java.lang.String r0 = "instagram_shopping_bag_checkout_button_tap"
            X.0Ai r3 = X.AbstractC166987dD.A0f(r1, r0)
            X.IDF r0 = r7.A04
            com.instagram.model.payments.CurrencyAmountInfoImpl r1 = r0.A00
            r0 = 0
            if (r1 != 0) goto La8
            r4 = r0
        L13:
            java.lang.String r1 = r6.A08
            java.lang.String r5 = ""
            if (r1 != 0) goto L1a
            r1 = r5
        L1a:
            X.AbstractC37300Gc1.A0t(r3, r1)
            java.lang.String r1 = "merchant_id"
            r3.AAP(r1, r10)
            java.lang.String r2 = r6.A05
            if (r2 != 0) goto L27
            r2 = r5
        L27:
            java.lang.String r1 = "merchant_bag_entry_point"
            r3.AAP(r1, r2)
            java.lang.String r1 = r6.A06
            if (r1 == 0) goto L31
            r5 = r1
        L31:
            java.lang.String r1 = "merchant_bag_prior_module"
            r3.AAP(r1, r5)
            X.AbstractC37300Gc1.A0s(r3, r11)
            java.lang.Long r2 = X.AbstractC25228BEl.A13(r12)
            java.lang.String r1 = "global_bag_id"
            r3.A9K(r1, r2)
            java.lang.Long r2 = X.AbstractC25228BEl.A13(r13)
            java.lang.String r1 = "merchant_bag_id"
            r3.A9K(r1, r2)
            java.lang.Long r2 = X.AbstractC31171DnF.A0V(r14)
            java.lang.String r1 = "total_item_count"
            r3.A9K(r1, r2)
            int r1 = r7.A00
            X.AbstractC37304Gc5.A11(r3, r1)
            X.AbstractC41757IeY.A03(r3, r7, r10)
            if (r4 == 0) goto L67
            X.J2u r1 = r7.A02
            int r2 = r4.compareTo(r1)
            r1 = 1
            if (r2 <= 0) goto L68
        L67:
            r1 = 0
        L68:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "is_free_shipping_reached"
            r3.A7v(r1, r2)
            X.J2u r1 = r7.A02
            java.lang.String r2 = r1.A01
            java.lang.String r1 = "currency"
            r3.AAP(r1, r2)
            X.J2u r1 = r7.A02
            java.lang.String r2 = r1.A01
            java.lang.String r1 = "currency_code"
            r3.AAP(r1, r2)
            java.lang.String r2 = r6.A00
            java.lang.String r1 = "global_bag_entry_point"
            r3.AAP(r1, r2)
            java.lang.String r2 = r6.A04
            java.lang.String r1 = "global_bag_prior_module"
            r3.AAP(r1, r2)
            if (r4 == 0) goto L97
            java.lang.String r0 = X.AbstractC41757IeY.A00(r4)
        L97:
            java.lang.String r1 = "free_shipping_order_value"
            r3.AAP(r1, r0)
            java.lang.String r0 = "logging_token"
            r3.AAP(r0, r8)
            X.AbstractC37300Gc1.A0o(r3, r9)
            r3.Cht()
            return
        La8:
            X.J2u r4 = X.C43079J2u.A00(r1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41731Ie2.A04(X.IbP, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final void A05(String str, String str2, String str3, String str4, String str5) {
        AbstractC167017dG.A1N(str, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "instagram_shopping_merchant_bag_entry");
        AbstractC37301Gc2.A17(A0f, str);
        String str6 = this.A05;
        if (str6 != null) {
            AbstractC37300Gc1.A0t(A0f, A01(A0f, this, "merchant_bag_entry_point", str6, str2));
            String str7 = this.A06;
            if (str7 != null) {
                A0f.AAP("merchant_bag_prior_module", str7);
                A0f.AAP("global_bag_entry_point", this.A00);
                A0f.AAP("tooltip_text", str5);
                A0f.AAP("global_bag_prior_module", this.A04);
                A0f.A7v("is_bloks", this.A0A);
                AbstractC37302Gc3.A0t(A0f);
                if (str3 != null) {
                    A0f.A9K("global_bag_id", AbstractC166997dE.A0j(str3));
                }
                AbstractC37303Gc4.A0m(A0f, str4);
                String str8 = this.A0B;
                if (str8 != null) {
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A06("m_pk", str8);
                    A0f.AAQ(c0Zx, "feed_item_info");
                }
                A0f.Cht();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A07(String str, String str2, java.util.Set set, boolean z) {
        AbstractC167027dH.A12(set, str, str2);
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(((ProductDiscountInformationDict) it.next()).getId(), A0q);
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "shops_promotions_more_tap");
        AbstractC37301Gc2.A15(A0f, this.A01);
        C0Zx c0Zx = new C0Zx();
        AbstractC37300Gc1.A0v(c0Zx, this.A07);
        AbstractC37300Gc1.A0w(c0Zx, this.A05);
        AbstractC37302Gc3.A0u(A0f, c0Zx, this.A08);
        A0f.AAk("discount_ids", A0q);
        AbstractC37301Gc2.A18(A0f, str);
        A0f.AAQ(A00(this, str2, null), "bag_logging_info");
        A0f.A7v("is_megaphone_banner", AbstractC31173DnH.A0e(A0f, "checkout_session_id", str2, z));
        A0f.Cht();
    }
}
