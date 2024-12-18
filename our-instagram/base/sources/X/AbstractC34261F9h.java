package X;

import com.instagram.nux.cal.model.FxAccountInfo;
import java.io.IOException;

/* renamed from: X.F9h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34261F9h {
    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.nux.cal.model.FxAccountInfo, java.lang.Object] */
    public static FxAccountInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_type".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("display_name".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    obj.A00 = AbstractC222616c.A00(c16l);
                } else if (AbstractC111324zv.A00(2876).equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
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
