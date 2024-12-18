package X;

import com.instagram.api.schemas.OrganicCTAType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hqs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40125Hqs {
    public static H4Q parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            OrganicCTAType organicCTAType = null;
            ArrayList arrayList = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cta_action_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("cta_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("cta_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cta_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    organicCTAType = (OrganicCTAType) OrganicCTAType.A01.get(A1P);
                    if (organicCTAType == null) {
                        organicCTAType = OrganicCTAType.A07;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("cta_title", c16l, "OrganicCTADict");
            } else if (organicCTAType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("cta_type", c16l, "OrganicCTADict");
            } else {
                return new H4Q(organicCTAType, str2, str, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
