package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I2W {
    public static C38541qi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            H7Y h7y = null;
            String str2 = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_demo".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("learn_more".equals(A0s)) {
                    h7y = I2Y.parseFromJson(c16l);
                } else if ("primer_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("questions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H7Z parseFromJson = AbstractC40694I2a.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("show_primer".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("show_results".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("survey_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("survey_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str3 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("survey_id", c16l, "BrandResearchSurvey");
            } else if (str4 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("survey_type", c16l, "BrandResearchSurvey");
            } else {
                return new C38541qi(h7y, bool, bool2, bool3, str, str2, str3, str4, str5, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
