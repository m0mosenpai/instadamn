package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VOJ {
    public static UQt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("default_selected_donation_value".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("donation_amount_selector_values".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC65702TsY.A1L(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("maximum_donation_amount".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("minimum_donation_amount".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("prefill_amount".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("user_currency".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new UQt(num, num2, num3, num4, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
