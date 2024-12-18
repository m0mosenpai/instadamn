package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.io.IOException;

/* renamed from: X.I3p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40735I3p {
    public static MultiProductComponent parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MultiProductComponent multiProductComponent = new MultiProductComponent();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1E(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    EnumC39622HeW enumC39622HeW = (EnumC39622HeW) EnumC39622HeW.A01.get(A0m);
                    if (enumC39622HeW != null) {
                        multiProductComponent.A04 = enumC39622HeW;
                    } else {
                        throw AbstractC167007dF.A0c("Cannot parse product feed type = ", A0m);
                    }
                } else if ("collection_id".equals(A0s)) {
                    multiProductComponent.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("label".equals(A0s)) {
                    multiProductComponent.A07 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    multiProductComponent.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("display_style".equals(A0s)) {
                    multiProductComponent.A02 = (EnumC39620HeU) EnumC39620HeU.A01.get(AbstractC167017dG.A0m(c16l));
                } else if ("label_display_style".equals(A0s)) {
                    EnumC39570Hdg enumC39570Hdg = (EnumC39570Hdg) EnumC39570Hdg.A01.get(AbstractC167017dG.A0m(c16l));
                    if (enumC39570Hdg == null) {
                        enumC39570Hdg = EnumC39570Hdg.A04;
                    }
                    multiProductComponent.A01 = enumC39570Hdg;
                } else if ("total_item_count".equals(A0s)) {
                    multiProductComponent.A00 = c16l.A1D();
                } else if ("product_feed".equals(A0s)) {
                    multiProductComponent.A03 = IRD.parseFromJson(c16l);
                } else if ("destination".equals(A0s)) {
                    multiProductComponent.A05 = IRF.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            multiProductComponent.A01();
            return multiProductComponent;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
