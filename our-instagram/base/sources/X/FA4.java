package X;

import com.instagram.phonenumber.model.CountryCodeData;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FA4 {
    public static CountryCodeData parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            CountryCodeData countryCodeData = new CountryCodeData();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("country_code".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    countryCodeData.A01 = A0m;
                } else if ("display_string".equals(A0s)) {
                    countryCodeData.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("country".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    countryCodeData.A00 = A0m2;
                }
                c16l.A0z();
            }
            return countryCodeData;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
