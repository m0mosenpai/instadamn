package X;

import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.IxL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42845IxL implements JGT {
    public final /* synthetic */ ProductVariantDimension A00;
    public final /* synthetic */ C41632IbN A01;
    public final /* synthetic */ VariantSelectorModel A02;

    public C42845IxL(ProductVariantDimension productVariantDimension, C41632IbN c41632IbN, VariantSelectorModel variantSelectorModel) {
        this.A01 = c41632IbN;
        this.A00 = productVariantDimension;
        this.A02 = variantSelectorModel;
    }

    @Override // X.JGT
    public final void Dyh(ProductVariantDimension productVariantDimension, String str) {
        String str2;
        AbstractC167017dG.A1N(productVariantDimension, str);
        C41632IbN c41632IbN = this.A01;
        ProductVariantDimension productVariantDimension2 = this.A00;
        c41632IbN.A02(productVariantDimension, str, AbstractC25229BEm.A1Z(productVariantDimension2));
        if (productVariantDimension2 != null) {
            J0U j0u = c41632IbN.A04;
            VariantSelectorModel variantSelectorModel = this.A02;
            c41632IbN.A06.C02();
            j0u.A02(this, variantSelectorModel, C189448aO.A1X);
            return;
        }
        JI6 ji6 = c41632IbN.A06;
        if (C41726Idx.A00(ji6) != null) {
            Product A00 = C41726Idx.A00(ji6);
            if (A00 != null) {
                C41727Idy c41727Idy = c41632IbN.A02;
                User user = A00.A0B;
                if (user == null || (str2 = AbstractC76433bn.A00(user)) == null) {
                    str2 = "";
                }
                c41727Idy.A04(A00, str2);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        c41632IbN.A04.A03(null);
    }
}
