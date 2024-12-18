package X;

import com.instagram.api.schemas.MessagingOffPlatformShareType;
import java.io.IOException;

/* renamed from: X.F5v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34171F5v {
    public static C34491jn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34491jn c34491jn = new C34491jn();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("prompt_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34491jn.A01 = A0m;
                } else if ("submission_id".equals(A0s)) {
                    c34491jn.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("share_type".equals(A0s)) {
                    MessagingOffPlatformShareType messagingOffPlatformShareType = (MessagingOffPlatformShareType) MessagingOffPlatformShareType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (messagingOffPlatformShareType == null) {
                        messagingOffPlatformShareType = MessagingOffPlatformShareType.A04;
                    }
                    c34491jn.A00 = messagingOffPlatformShareType;
                } else {
                    AbstractC47856LCb.A01(c16l, c34491jn, A0s);
                }
                c16l.A0z();
            }
            return c34491jn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
