package X;

import com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Nzw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54338Nzw {
    public static C56138Ovy A00;

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC53199Nfv enumC53199Nfv;
        Object A03 = c6fw.A03(1);
        String A002 = AbstractC111324zv.A00(8);
        C14360o3.A0C(A03, A002);
        List list = (List) A03;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(it.next(), "subs")) {
                enumC53199Nfv = EnumC53199Nfv.A04;
            } else {
                enumC53199Nfv = EnumC53199Nfv.A03;
            }
            A0q.add(enumC53199Nfv);
        }
        Object A032 = c6fw.A03(2);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        Object A033 = c6fw.A03(3);
        C14360o3.A0C(A033, A002);
        String A0y = AbstractC43593JPy.A0y(c6fw, 4);
        String A0y2 = AbstractC43593JPy.A0y(c6fw, 5);
        Object A034 = c6fw.A03(6);
        C14360o3.A0C(A034, AbstractC58317Pt9.A00(11));
        String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 7);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 8);
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC166987dD.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "NOT_FETCHED"), AbstractC166987dD.A1L("fetch_status_error_code", ""), AbstractC166987dD.A1L("fetch_status_error_description", ""), AbstractC166987dD.A1L("product_status", ""), AbstractC166987dD.A1L("product_price", AbstractC166987dD.A1I()), AbstractC166987dD.A1L("purchase_product_status", ""), AbstractC166987dD.A1L("purchase_product_status_error_code", ""), AbstractC166987dD.A1L("purchase_product_status_error_description", ""), AbstractC166987dD.A1L(AbstractC58317Pt9.A00(295), ""), AbstractC166987dD.A1L(AbstractC58317Pt9.A00(275), ""), AbstractC166987dD.A1L("price_info", AbstractC166987dD.A1I()));
        C54761OHq c54761OHq = new C54761OHq(c6fq, A0I);
        AbstractC166987dD.A1Z(new BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1(c54761OHq, c6fq, (String) A032, A0o, A0y, A0y2, A0q, (List) A033, (Map) A034, A07, null), MSY.A0v());
        A00 = null;
        return null;
    }
}
