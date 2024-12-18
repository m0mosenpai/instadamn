package X;

import com.instagram.api.schemas.UserCallSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FSW {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.EAm, X.1um, X.1ul] */
    public static C32139EAm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str = null;
                if ("allow_list_data".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList2);
                        }
                    }
                    c40791um.A02 = arrayList2;
                } else if ("setting_type".equals(A0s)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    UserCallSettings userCallSettings = (UserCallSettings) UserCallSettings.A01.get(str);
                    if (userCallSettings == null) {
                        userCallSettings = UserCallSettings.A0A;
                    }
                    c40791um.A01 = userCallSettings;
                } else if ("suggested_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c40791um.A03 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A02;
            C14360o3.A0A(list);
            UserCallSettings userCallSettings2 = c40791um.A01;
            C14360o3.A0A(userCallSettings2);
            List list2 = c40791um.A03;
            C14360o3.A0A(list2);
            c40791um.A00 = new E6E(userCallSettings2, list, list2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
