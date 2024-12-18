package X;

import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.IxK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42844IxK implements JGT {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42844IxK(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.JGT
    public final void Dyh(ProductVariantDimension productVariantDimension, String str) {
        C38332GtR c38332GtR;
        String str2;
        int i = this.A00;
        AbstractC167017dG.A1N(productVariantDimension, str);
        if (i != 0) {
            c38332GtR = (C38332GtR) ((HCB) this.A02).A0B.getValue();
        } else {
            c38332GtR = ((C42279Io3) this.A02).A06;
        }
        Integer num = ((HZC) ((AbstractC39660Hip) this.A01)).A01;
        boolean A1V = AbstractC167007dF.A1V(num);
        c38332GtR.A05.A00.put(productVariantDimension.A02, str);
        C41728Idz c41728Idz = c38332GtR.A04;
        Product product = c38332GtR.A08;
        C38683GzO A03 = C128205qp.A03(c41728Idz.A03, product);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41728Idz.A02, "instagram_shopping_change_product_variant");
        AbstractC37300Gc1.A0n(A0f, c41728Idz.A0A);
        AbstractC37300Gc1.A0q(A0f, c41728Idz.A0B);
        Boolean bool = A03.A04;
        if (bool != null) {
            A0f.A7v("is_checkout_enabled", bool);
            Boolean bool2 = A03.A02;
            if (bool2 != null) {
                A0f.A7v("can_add_to_bag", bool2);
                A0f.A7v("is_variant_selection_in_stock", Boolean.valueOf(product.A0P));
                C38683GzO.A02(A0f, A03);
                AbstractC37300Gc1.A0t(A0f, c41728Idz.A0D);
                C0Zx c0Zx = new C0Zx();
                c0Zx.A05(AbstractC111324zv.A00(222), AbstractC003100w.A0k(10, c41728Idz.A09));
                Product product2 = c41728Idz.A05;
                String str3 = product2.A0H;
                C14360o3.A0B(str3, 0);
                c0Zx.A05("pdp_product_id", AbstractC003100w.A0k(10, str3));
                User user = product2.A0B;
                if (user == null || (str2 = AbstractC76433bn.A00(user)) == null) {
                    str2 = "";
                }
                c0Zx.A00.put("pdp_merchant_id", C4SX.A00(str2).F7g());
                A0f.AAQ(c0Zx, "pdp_logging_info");
                AbstractC37300Gc1.A0s(A0f, c41728Idz.A07);
                A0f.A7v("has_drops_launched", A03.A03);
                AbstractC37300Gc1.A0m(A0f, "instagram_shopping_lightbox");
                String str4 = c41728Idz.A08;
                if (str4 != null && str4.length() != 0) {
                    A0f.A9K("collection_page_id", AbstractC003100w.A0k(10, str4));
                }
                AbstractC37303Gc4.A0b(A0f);
                A0f.Cht();
                C43172J6r.A03(c38332GtR, AbstractC141776au.A00(c38332GtR), 24);
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == A1V) {
                        c38332GtR.A05(A1V);
                        return;
                    }
                    throw B4Z.A00();
                }
                c38332GtR.A04(A1V);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
