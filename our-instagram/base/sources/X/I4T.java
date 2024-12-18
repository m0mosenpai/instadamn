package X;

import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I4T {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.II1, java.lang.Object] */
    public static II1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("product_type".equals(A0s)) {
                    obj.A00 = AbstractC104314mu.A00(AbstractC167017dG.A0m(c16l));
                } else if ("is_eligible_for_partner_program_onboarding".equals(A0s)) {
                    c16l.A0d();
                } else if ("next_steps".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductOnboardingNextStepInfo parseFromJson = I4U.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("onboarding_intro_video_url".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("tax_information_country_string".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
