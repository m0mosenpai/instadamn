package X;

import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.api.schemas.ProductDiscountsDictImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hri, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40170Hri {
    public static ProductDiscountsDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if ("discounts".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductDiscountInformationDictImpl parseFromJson = AbstractC40168Hrg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new ProductDiscountsDictImpl(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
