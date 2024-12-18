package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;

/* renamed from: X.FAu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34300FAu {
    public static FOW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FOW fow = new FOW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    fow.A0C = A0m;
                } else if ("category_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    fow.A02 = A0m2;
                } else if ("category_name".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    fow.A03 = A0m3;
                } else if ("public_email".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    fow.A09 = A0m4;
                } else if (AbstractC58317Pt9.A00(347).equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    fow.A0A = A0m5;
                } else if ("public_phone_national_number".equals(A0s)) {
                    String A0m6 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m6, 0);
                    fow.A0B = A0m6;
                } else if ("public_address_street".equals(A0s)) {
                    String A0m7 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m7, 0);
                    fow.A08 = A0m7;
                } else if ("public_address_postal_code".equals(A0s)) {
                    String A0m8 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m8, 0);
                    fow.A07 = A0m8;
                } else if ("public_address_city_id".equals(A0s)) {
                    String A0m9 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m9, 0);
                    fow.A05 = A0m9;
                } else if ("public_address_city_name".equals(A0s)) {
                    String A0m10 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m10, 0);
                    fow.A06 = A0m10;
                } else if ("page_id".equals(A0s)) {
                    String A0m11 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m11, 0);
                    fow.A04 = A0m11;
                } else if ("page_name".equals(A0s)) {
                    C14360o3.A0B(AbstractC167017dG.A0m(c16l), 0);
                } else if ("is_page_convertable".equals(A0s)) {
                    fow.A0D = c16l.A0d();
                } else if ("category_account_type".equals(A0s)) {
                    fow.A00 = C16Z.A00(c16l.A1D());
                } else if ("previous_account_type".equals(A0s)) {
                    fow.A01 = C16Z.A00(c16l.A1D());
                }
                c16l.A0z();
            }
            return fow;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
