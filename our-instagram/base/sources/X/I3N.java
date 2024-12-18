package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I3N {
    public static ProductVariantDimension parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductVariantDimension productVariantDimension = new ProductVariantDimension();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    productVariantDimension.A02 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    productVariantDimension.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("values".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ICS parseFromJson = I3M.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    productVariantDimension.A04 = arrayList;
                } else if ("visual_style".equals(A0q)) {
                    ProductVariantVisualStyle productVariantVisualStyle = (ProductVariantVisualStyle) ProductVariantVisualStyle.A01.get(AbstractC167017dG.A0m(c16l));
                    if (productVariantVisualStyle == null) {
                        productVariantVisualStyle = ProductVariantVisualStyle.A06;
                    }
                    productVariantDimension.A00 = productVariantVisualStyle;
                } else if ("sizing_chart".equals(A0q)) {
                    productVariantDimension.A01 = I4L.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            List list = productVariantDimension.A04;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    productVariantDimension.A05.add(((ICS) it.next()).A00);
                }
                return productVariantDimension;
            }
            return productVariantDimension;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
