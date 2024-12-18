package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.ProductVariantPossibleValueDict;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hs3 {
    public static ProductVariantPossibleValueDict parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ProductVariantVisualStyle productVariantVisualStyle = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_preselected".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1129).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("visual_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productVariantVisualStyle = (ProductVariantVisualStyle) ProductVariantVisualStyle.A01.get(A1P);
                    if (productVariantVisualStyle == null) {
                        productVariantVisualStyle = ProductVariantVisualStyle.A06;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "ProductVariantPossibleValueDict");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "ProductVariantPossibleValueDict");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c16l, "ProductVariantPossibleValueDict");
                } else if (productVariantVisualStyle == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("visual_style", c16l, "ProductVariantPossibleValueDict");
                } else {
                    return new ProductVariantPossibleValueDict(productVariantVisualStyle, str, str2, str3, str4, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_preselected", c16l, "ProductVariantPossibleValueDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
