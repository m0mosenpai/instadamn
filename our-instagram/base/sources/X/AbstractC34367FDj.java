package X;

import java.io.IOException;
import java.util.ArrayList;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;
import libraries.fxcallauncher.model.FxUnifiedLauncherCallbackInfo;

/* renamed from: X.FDj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34367FDj {
    public static FxUnifiedLauncherCallbackInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FxUnifiedLauncherCallbackInfo fxUnifiedLauncherCallbackInfo = new FxUnifiedLauncherCallbackInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("tokenString".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    fxUnifiedLauncherCallbackInfo.A01 = A0m;
                } else if ("addedAccounts".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            FxUnifiedLauncherAddedAccount parseFromJson = AbstractC34366FDi.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    fxUnifiedLauncherCallbackInfo.A03 = arrayList;
                } else if ("userID".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    fxUnifiedLauncherCallbackInfo.A02 = A0m2;
                } else if ("obId".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    fxUnifiedLauncherCallbackInfo.A00 = A0m3;
                }
                c16l.A0z();
            }
            return fxUnifiedLauncherCallbackInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
