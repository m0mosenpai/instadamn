package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IOZ {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.H9V, X.1um, X.1ul] */
    public static H9V parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("incentive_platform_onboarding_config".equals(A0s)) {
                    c40791um.A00 = AbstractC33706Euu.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("next_steps".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                H4J parseFromJson = AbstractC40090HqH.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A05 = arrayList;
                    } else if ("product_config".equals(A0s)) {
                        c40791um.A02 = AbstractC40121Hqo.parseFromJson(c16l);
                    } else if ("product_type".equals(A0s)) {
                        c40791um.A04 = AbstractC104314mu.A00(AbstractC167017dG.A0m(c16l));
                    } else if ("revshare_onboarding_config".equals(A0s)) {
                        c40791um.A03 = AbstractC40218Hsh.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            C51760Mtj c51760Mtj = c40791um.A00;
            List list = c40791um.A05;
            C14360o3.A0A(list);
            C40120Hqn c40120Hqn = c40791um.A02;
            UserMonetizationProductType userMonetizationProductType = c40791um.A04;
            C14360o3.A0A(userMonetizationProductType);
            c40791um.A01 = new Mr1(c51760Mtj, c40120Hqn, c40791um.A03, userMonetizationProductType, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
