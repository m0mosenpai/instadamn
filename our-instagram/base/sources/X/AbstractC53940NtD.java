package X;

import java.util.HashSet;
import java.util.regex.Matcher;

/* renamed from: X.NtD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53940NtD {
    public static final HashSet A00(String str) {
        C14360o3.A0B(str, 0);
        Matcher A09 = AbstractC13670mt.A09(str);
        HashSet A1H = AbstractC166987dD.A1H();
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                A1H.add(AbstractC002300n.A0d(group, "@", "", false));
            }
        }
        return A1H;
    }
}
