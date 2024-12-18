package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.DqH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31352DqH {
    public static C51757Mtg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("section_header".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("selector_type".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    num = C05F.A00;
                    if (!A1Q.equals("radio")) {
                        num = C05F.A01;
                        if (!A1Q.equals("check")) {
                            num = C05F.A0C;
                            if (!A1Q.equals("toggle")) {
                                num = null;
                            }
                        }
                    }
                } else if ("included_filters".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            BJF parseFromJson = AbstractC31353DqI.parseFromJson(c16l);
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
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("section_header", c16l, "FilteringHeader");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("included_filters", c16l, "FilteringHeader");
                } else {
                    return new C51757Mtg(num, str, arrayList, 20);
                }
            } else {
                AbstractC166997dE.A1V("selector_type", c16l, "FilteringHeader");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
