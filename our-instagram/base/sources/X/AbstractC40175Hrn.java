package X;

import com.instagram.api.schemas.ProductPivotsButtonActionType;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hrn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40175Hrn {
    public static ProductPivotsButtonImpl parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductPivotsButtonActionType productPivotsButtonActionType = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ProductPivotsButtonActionType productPivotsButtonActionType2 = null;
            User user = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    productPivotsButtonActionType = (ProductPivotsButtonActionType) ProductPivotsButtonActionType.A01.get(A1P2);
                    if (productPivotsButtonActionType == null) {
                        productPivotsButtonActionType = ProductPivotsButtonActionType.A0J;
                    }
                } else if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("destination_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("destination_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("destination_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("destination_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productPivotsButtonActionType2 = (ProductPivotsButtonActionType) ProductPivotsButtonActionType.A01.get(A1P);
                    if (productPivotsButtonActionType2 == null) {
                        productPivotsButtonActionType2 = ProductPivotsButtonActionType.A0J;
                    }
                } else if ("merchant".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (productPivotsButtonActionType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("action", c16l, "ProductPivotsButtonImpl");
                throw C00O.createAndThrow();
            }
            return new ProductPivotsButtonImpl(productPivotsButtonActionType, productPivotsButtonActionType2, user, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
