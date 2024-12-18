package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Idx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41726Idx {
    public final ProductGroup A00;
    public final C4NL A01;
    public final C41595Iai A02;
    public final IIQ A03;
    public final C41723Idu A04;
    public final IH4 A05;
    public final IH5 A06;
    public final C41578IaR A07;
    public final Product A08;
    public final Product A09;
    public final String A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D;
    public final Map A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static void A01(AdsProductPageFragment adsProductPageFragment, C41753IeT c41753IeT) {
        adsProductPageFragment.Eej(new C41726Idx(c41753IeT));
    }

    public static void A02(JI6 ji6, C41753IeT c41753IeT) {
        ji6.Eej(new C41726Idx(c41753IeT));
    }

    public final boolean A03() {
        ProductGroup productGroup = this.A00;
        if (productGroup != null && Collections.unmodifiableList(productGroup.A02) != null) {
            Iterator A13 = AbstractC31174DnI.A13(productGroup.A02);
            while (A13.hasNext()) {
                ProductVariantDimension productVariantDimension = (ProductVariantDimension) A13.next();
                C41578IaR c41578IaR = this.A07;
                String str = productVariantDimension.A02;
                C14360o3.A0B(str, 0);
                if (c41578IaR.A01.get(str) == null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public C41726Idx(C41753IeT c41753IeT) {
        this.A0G = c41753IeT.A0G;
        this.A0F = c41753IeT.A0F;
        this.A02 = c41753IeT.A02;
        this.A0E = c41753IeT.A0E;
        this.A04 = c41753IeT.A04;
        this.A05 = c41753IeT.A05;
        this.A06 = c41753IeT.A06;
        this.A07 = c41753IeT.A07;
        this.A00 = c41753IeT.A00;
        this.A08 = c41753IeT.A08;
        this.A0A = c41753IeT.A0A;
        this.A09 = c41753IeT.A09;
        this.A0C = c41753IeT.A0C;
        this.A0B = c41753IeT.A0B;
        this.A03 = c41753IeT.A03;
        this.A0D = c41753IeT.A0D;
        this.A01 = c41753IeT.A01;
    }

    public static Product A00(JI6 ji6) {
        return ji6.C02().A09;
    }
}
