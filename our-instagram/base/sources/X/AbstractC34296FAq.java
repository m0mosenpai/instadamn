package X;

import com.instagram.registration.model.UserBirthDate;
import java.io.IOException;

/* renamed from: X.FAq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34296FAq {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.registration.model.UserBirthDate, java.lang.Object] */
    public static UserBirthDate parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("birth_year".equals(A0s)) {
                    obj.A02 = c16l.A1D();
                } else if ("birth_month".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("birth_day".equals(A0s)) {
                    obj.A00 = c16l.A1D();
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
