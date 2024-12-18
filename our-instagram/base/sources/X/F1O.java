package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F1O {
    public static C51760Mtj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C45116Jxl c45116Jxl = null;
            C50679MYx c50679MYx = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("header".equals(A0s)) {
                    c45116Jxl = F1S.parseFromJson(c16l);
                } else if ("themed_image_url".equals(A0s)) {
                    c50679MYx = F1R.parseFromJson(c16l);
                } else if ("value_props".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C45116Jxl parseFromJson = F1S.parseFromJson(c16l);
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
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("value_props", c16l, "ProductValuePropComponent");
                throw C00O.createAndThrow();
            }
            return new C51760Mtj(c50679MYx, c45116Jxl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
