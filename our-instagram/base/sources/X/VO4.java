package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VO4 {
    public static C66632UQj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("upsell_button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("upsell_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("upsell_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("upsell_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("upsell_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("upsell_button_text", c16l, "ChainingUpsellCardDictImpl");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("upsell_subtitle", c16l, "ChainingUpsellCardDictImpl");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("upsell_title", c16l, "ChainingUpsellCardDictImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("upsell_type", c16l, "ChainingUpsellCardDictImpl");
                } else {
                    return new C66632UQj(num.intValue(), str, str2, str3, str4);
                }
            } else {
                AbstractC166997dE.A1V("upsell_position", c16l, "ChainingUpsellCardDictImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
