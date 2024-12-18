package X;

import java.io.IOException;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;

/* renamed from: X.FDi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34366FDi {
    public static FxUnifiedLauncherAddedAccount parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FxUnifiedLauncherAddedAccount fxUnifiedLauncherAddedAccount = new FxUnifiedLauncherAddedAccount();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("userID".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    fxUnifiedLauncherAddedAccount.A02 = A0m;
                } else if ("obId".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    fxUnifiedLauncherAddedAccount.A01 = A0m2;
                } else if ("account_type".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    fxUnifiedLauncherAddedAccount.A00 = A0m3;
                }
                c16l.A0z();
            }
            return fxUnifiedLauncherAddedAccount;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
