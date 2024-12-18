package X;

import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F8R {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount, java.lang.Object] */
    public static AssistAccountRecoveryResponse$UhlAccount parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("uid".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31182DnR.A01().equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    obj.A00 = AbstractC222616c.A00(c16l);
                } else if ("full_name".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
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
