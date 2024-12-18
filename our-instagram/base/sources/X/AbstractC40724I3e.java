package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I3e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40724I3e {
    public static C38901HAy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38901HAy c38901HAy = new C38901HAy();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    c38901HAy.A00 = AbstractC167017dG.A0m(c16l);
                } else if (!DialogModule.KEY_ITEMS.equals(A0q) && !"suggested_brands".equals(A0q)) {
                    C55702hA.A01(c16l, c38901HAy, A0q);
                } else {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ShoppingBrandWithProductsImpl parseFromJson = AbstractC40237Ht1.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c38901HAy.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c38901HAy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
