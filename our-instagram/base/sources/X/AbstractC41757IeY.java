package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IeY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41757IeY {
    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, C41730Ie1 c41730Ie1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        long parseLong;
        Long l;
        C0Zx c0Zx;
        AbstractC167007dF.A1D(userSession, 1, str);
        AbstractC167007dF.A1I(str6, 7, c41730Ie1);
        InterfaceC02590Ai A00 = C41730Ie1.A00(AbstractC12220kQ.A00(interfaceC11380iw, C12180kM.A05, userSession), c41730Ie1, "instagram_shopping_bag_add_item_success");
        if (str3 == null) {
            str3 = "";
        }
        AbstractC37301Gc2.A17(A00, str3);
        C41730Ie1.A02(A00, c41730Ie1);
        A00.A7v("is_initial_add", Boolean.valueOf(AbstractC167007dF.A1P(c41730Ie1.A03(), 1)));
        if (str2 == null) {
            str2 = "";
        }
        AbstractC37300Gc1.A0n(A00, str2);
        if (str4 == null) {
            str4 = "";
        }
        AbstractC37300Gc1.A0s(A00, str4);
        if (str5 == null) {
            str5 = "";
        }
        AbstractC37300Gc1.A0t(A00, str5);
        String str11 = null;
        A00.A9K("global_bag_id", AbstractC003100w.A0k(10, str7));
        Long A0k = AbstractC003100w.A0k(10, str8);
        if (A0k != null) {
            parseLong = A0k.longValue();
        } else {
            parseLong = Long.parseLong("");
        }
        A00.A9K("merchant_bag_id", Long.valueOf(parseLong));
        A00.AAP("from", str6);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        AbstractC37300Gc1.A0l(A00, AbstractC37301Gc2.A0h(c38321qM));
        if (str9 != null) {
            l = AbstractC003100w.A0k(10, str9);
        } else {
            l = null;
        }
        A00.A9K(TraceFieldType.BroadcastId, l);
        if (shoppingGuideLoggingInfo != null) {
            c0Zx = new C0Zx();
            c0Zx.A05("guide_id", Long.valueOf(shoppingGuideLoggingInfo.A00));
        } else {
            c0Zx = null;
        }
        A00.AAQ(c0Zx, "guide_logging_info");
        AbstractC37301Gc2.A1B(A00, z);
        if (c38321qM != null && c38321qM.CdW()) {
            str11 = c38321qM.CAR();
        }
        AbstractC37300Gc1.A0o(A00, str11);
        if (str10 != null && str10.length() != 0) {
            A00.A9K("collection_page_id", AbstractC003100w.A0k(10, str10));
        }
        A00.Cht();
    }

    public static final String A00(C43079J2u c43079J2u) {
        C14360o3.A07(c43079J2u.A02);
        int i = c43079J2u.A00;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(C1Q2.A02());
        C14360o3.A0A(numberInstance);
        double d = i;
        double longValue = r1.longValue() / d;
        int log10 = (int) Math.log10(d);
        numberInstance.setMinimumFractionDigits(log10);
        numberInstance.setMaximumFractionDigits(log10);
        numberInstance.setRoundingMode(RoundingMode.HALF_UP);
        String format = numberInstance.format(longValue);
        C14360o3.A07(format);
        return format;
    }

    public static final HashMap A01(C41634IbP c41634IbP, String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A13 = AbstractC31174DnI.A13(c41634IbP.A06);
        while (A13.hasNext()) {
            String A05 = ((C41730Ie1) A13.next()).A05();
            C14360o3.A07(A05);
            AbstractC31177DnL.A1R(A05, A1E);
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC25228BEl.A13(str), A1E);
        return A1G;
    }

    public static final HashMap A02(List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41730Ie1 c41730Ie1 = (C41730Ie1) it.next();
            String A05 = c41730Ie1.A05();
            C14360o3.A07(A05);
            A1G.put(AbstractC25228BEl.A13(A05), AbstractC31171DnF.A0V(c41730Ie1.A03()));
        }
        return A1G;
    }

    public static void A03(InterfaceC02590Ai interfaceC02590Ai, C41634IbP c41634IbP, String str) {
        interfaceC02590Ai.A9M("product_merchant_ids", A01(c41634IbP, str));
        List list = c41634IbP.A09;
        C14360o3.A07(list);
        interfaceC02590Ai.A9M("subtotal_quantities", A02(list));
        interfaceC02590Ai.A9K("subtotal_item_count", Long.valueOf(c41634IbP.A01));
        C43079J2u c43079J2u = c41634IbP.A02;
        C14360o3.A07(c43079J2u);
        interfaceC02590Ai.AAP("subtotal_amount", A00(c43079J2u));
    }

    public static final void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, Product product, String str, String str2, String str3, String str4, String str5) {
        C0Zx c0Zx;
        AbstractC167017dG.A1P(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_shopping_bag_add_item_failure");
        AbstractC37303Gc4.A0j(A0f, product);
        if (str3 == null) {
            str3 = "";
        }
        AbstractC37301Gc2.A17(A0f, str3);
        if (str2 == null) {
            str2 = "";
        }
        AbstractC37300Gc1.A0n(A0f, str2);
        if (str4 == null) {
            str4 = "";
        }
        AbstractC37300Gc1.A0s(A0f, str4);
        if (str5 == null) {
            str5 = "";
        }
        AbstractC37300Gc1.A0t(A0f, str5);
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        String str6 = null;
        AbstractC37300Gc1.A0l(A0f, AbstractC37301Gc2.A0h(c38321qM));
        if (shoppingGuideLoggingInfo != null) {
            c0Zx = new C0Zx();
            c0Zx.A05("guide_id", Long.valueOf(shoppingGuideLoggingInfo.A00));
        } else {
            c0Zx = null;
        }
        A0f.AAQ(c0Zx, "guide_logging_info");
        if (c38321qM != null && c38321qM.CdW()) {
            str6 = c38321qM.CAR();
        }
        AbstractC37300Gc1.A0o(A0f, str6);
        A0f.Cht();
    }

    public static final void A06(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, Product product, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C0Zx c0Zx;
        AbstractC167017dG.A1P(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_shopping_bag_add_item_attempt");
        AbstractC37303Gc4.A0j(A0f, product);
        AbstractC37301Gc2.A17(A0f, str4);
        if (str2 == null) {
            str2 = "";
        }
        AbstractC37300Gc1.A0n(A0f, str2);
        AbstractC37300Gc1.A0q(A0f, str);
        if (str5 == null) {
            str5 = "";
        }
        AbstractC37300Gc1.A0s(A0f, str5);
        if (str6 == null) {
            str6 = "";
        }
        AbstractC37300Gc1.A0t(A0f, str6);
        AbstractC37300Gc1.A0m(A0f, str3);
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        String str8 = null;
        AbstractC37300Gc1.A0l(A0f, AbstractC37301Gc2.A0h(c38321qM));
        if (shoppingGuideLoggingInfo != null) {
            c0Zx = new C0Zx();
            c0Zx.A05("guide_id", Long.valueOf(shoppingGuideLoggingInfo.A00));
        } else {
            c0Zx = null;
        }
        A0f.AAQ(c0Zx, "guide_logging_info");
        AbstractC37302Gc3.A10(A0f, product);
        if (c38321qM != null && c38321qM.CdW()) {
            str8 = c38321qM.CAR();
        }
        AbstractC37300Gc1.A0o(A0f, str8);
        if (str7 != null && str7.length() != 0) {
            A0f.A9K("collection_page_id", AbstractC166997dE.A0j(str7));
        }
        A0f.Cht();
    }
}
