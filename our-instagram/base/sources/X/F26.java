package X;

import java.util.List;

/* loaded from: classes6.dex */
public abstract class F26 {
    public static final FKM A00(String str) {
        Integer num;
        Integer num2;
        C14360o3.A0B(str, 0);
        Integer A0i = AbstractC003100w.A0i(str);
        boolean z = false;
        if (A0i != null) {
            int intValue = A0i.intValue();
            if (intValue > -1) {
                z = true;
            }
            return new FKM(null, intValue, z);
        }
        List A0m = AbstractC167007dF.A0m(str, ":", 0);
        if (A0m.size() != 2) {
            return null;
        }
        String str2 = (String) AbstractC001800i.A0O(A0m, 0);
        if (str2 != null) {
            num = AbstractC003100w.A0i(str2);
        } else {
            num = null;
        }
        String str3 = (String) AbstractC001800i.A0O(A0m, 1);
        if (str3 != null) {
            num2 = AbstractC003100w.A0i(str3);
        } else {
            num2 = null;
        }
        if (num == null || num2 == null) {
            return null;
        }
        if (num.intValue() > -1 || num2.intValue() > -1) {
            z = true;
        }
        return new FKM(num, num2.intValue(), z);
    }
}
