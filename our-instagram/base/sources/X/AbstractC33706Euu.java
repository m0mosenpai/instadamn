package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Euu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33706Euu {
    public static C51760Mtj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            E7g e7g = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("active_deal_templates".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51647Mre parseFromJson = AbstractC33669EuJ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("available_deal_templates_to_onboard".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            E7g parseFromJson2 = AbstractC33684EuY.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("deal_template_to_onboard".equals(A0s)) {
                    e7g = AbstractC33684EuY.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("active_deal_templates", c16l, "IncentivePlatformOnboardingConfig");
            } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("available_deal_templates_to_onboard", c16l, "IncentivePlatformOnboardingConfig");
            } else {
                return new C51760Mtj(e7g, arrayList, arrayList2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
