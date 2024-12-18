package X;

import com.instagram.nux.cal.model.FXCalAgeInfo;
import java.io.IOException;

/* renamed from: X.F9f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34259F9f {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.nux.cal.model.FXCalAgeInfo, java.lang.Object] */
    public static FXCalAgeInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31189DnY.A01().equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("account_id".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("birthdate".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("account_type".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("is_default_selected".equals(A0s)) {
                    obj.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("age".equals(A0s)) {
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
