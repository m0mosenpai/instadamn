package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hmx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39910Hmx {
    public static E71 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("amount_with_offset".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("tax_line_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            URO parseFromJson = AbstractC40383HvW.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("total_formatted_amount_with_taxes".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("amount_with_offset", c16l, "EstimatedTaxes");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("total_formatted_amount_with_taxes", c16l, "EstimatedTaxes");
            } else {
                return new E71(arrayList, num.intValue(), str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
