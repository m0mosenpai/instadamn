package X;

import com.instagram.creatortools.api.schemas.EligibilityCriteria;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F1H {
    public static C26079Bg8 parseFromJson(C16L c16l) {
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
            EligibilityCriteria eligibilityCriteria = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("asset_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("display_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("eligibility_criteria".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    eligibilityCriteria = (EligibilityCriteria) EligibilityCriteria.A01.get(A1P);
                    if (eligibilityCriteria == null) {
                        eligibilityCriteria = EligibilityCriteria.A09;
                    }
                } else if ("link_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C50679MYx parseFromJson = AbstractC33711Euz.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("passes_criteria".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("asset_name", c16l, "EligibilityCriteriaInfo");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (eligibilityCriteria == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("eligibility_criteria", c16l, "EligibilityCriteriaInfo");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("passes_criteria", c16l, "EligibilityCriteriaInfo");
                } else {
                    return new C26079Bg8(eligibilityCriteria, str, str2, arrayList, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("display_text", c16l, "EligibilityCriteriaInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
