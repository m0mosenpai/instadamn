package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I1v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40689I1v {
    public static LeadForm parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            SimpleImageUrl simpleImageUrl = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            String str3 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1009);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cover_photo_uri".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("display_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("form_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            LeadGenInfoFieldData parseFromJson = AbstractC40691I1x.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("is_configured_organic_form".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(5589).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("display_name", c16l, "LeadForm");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "LeadForm");
                } else {
                    return new LeadForm(simpleImageUrl, bool, str, str2, str3, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("form_id", c16l, "LeadForm");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
