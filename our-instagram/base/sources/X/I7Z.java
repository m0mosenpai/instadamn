package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I7Z {
    public static C41634IbP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41634IbP c41634IbP = new C41634IbP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("merchant".equals(A0s)) {
                    c41634IbP.A05 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("shipping_information".equals(A0s)) {
                    c41634IbP.A04 = I7Y.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if (DialogModule.KEY_ITEMS.equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C41730Ie1 parseFromJson = AbstractC40825I7b.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c41634IbP.A06 = arrayList;
                    } else if ("product_collections".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                MultiProductComponent parseFromJson2 = AbstractC40735I3p.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c41634IbP.A07 = arrayList;
                    } else if ("metadata".equals(A0s)) {
                        c41634IbP.A03 = I7X.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            c41634IbP.A01();
            return c41634IbP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
