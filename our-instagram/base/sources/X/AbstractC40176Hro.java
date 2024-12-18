package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.api.schemas.ProductPivotsSourceMediaType;
import com.instagram.api.schemas.ShoppingPivotItemType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hro, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40176Hro {
    public static C38651Gys parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductPivotsButtonImpl productPivotsButtonImpl = null;
            Integer num = null;
            C39561sd c39561sd = null;
            ArrayList arrayList = null;
            String str = null;
            ShoppingPivotItemType shoppingPivotItemType = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            String str3 = null;
            ProductPivotsSourceMediaType productPivotsSourceMediaType = null;
            String str4 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button".equals(A0s)) {
                    productPivotsButtonImpl = AbstractC40175Hrn.parseFromJson(c16l);
                } else if ("global_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("item_client_gap_rules".equals(A0s)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H5A parseFromJson = AbstractC40242Ht6.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("pivot_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("pivot_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    shoppingPivotItemType = (ShoppingPivotItemType) ShoppingPivotItemType.A01.get(A1P2);
                    if (shoppingPivotItemType == null) {
                        shoppingPivotItemType = ShoppingPivotItemType.A09;
                    }
                } else if ("products".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1L(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("source_media_author_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("source_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("source_media_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productPivotsSourceMediaType = (ProductPivotsSourceMediaType) ProductPivotsSourceMediaType.A01.get(A1P);
                    if (productPivotsSourceMediaType == null) {
                        productPivotsSourceMediaType = ProductPivotsSourceMediaType.A0E;
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "view_state_item_type");
                }
                c16l.A0z();
            }
            return new C38651Gys(productPivotsButtonImpl, productPivotsSourceMediaType, c39561sd, shoppingPivotItemType, num, num2, str, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
