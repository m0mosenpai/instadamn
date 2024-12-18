package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.44E, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C44E {
    public static C44F parseFromJson(C16L c16l) {
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
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("default_selected_donation_value".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("donation_amount_selector_values".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Integer valueOf = Integer.valueOf(c16l.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("maximum_donation_amount".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("minimum_donation_amount".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("prefill_amount".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("user_currency".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("donation_amount_selector_values", "FundraiserDonationAmountConfigImpl");
                throw C00O.createAndThrow();
            }
            return new C44F(num, num2, num3, num4, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
