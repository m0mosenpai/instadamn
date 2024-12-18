package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;

/* renamed from: X.FVh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34805FVh {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EfU, X.EfQ, X.1um] */
    public static EfQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("access_pw_reset_token".equals(A0s)) {
                    c40791um.A00 = AbstractC167017dG.A0m(c16l);
                } else if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else {
                    C35072Fcj.A00(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
