package X;

import java.util.List;

/* renamed from: X.Nte, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53967Nte {
    public static final C50679MYx A00(String str) {
        String str2 = null;
        List A0R = AbstractC001900j.A0R(str, new String[]{":"}, 0);
        String str3 = null;
        if (AbstractC166987dD.A1b(A0R)) {
            str2 = MSW.A14(A0R, 0);
        }
        if (A0R.size() == 2) {
            str3 = (String) AbstractC001800i.A0O(A0R, 1);
        }
        return new C50679MYx(str2, str3, 44);
    }
}
