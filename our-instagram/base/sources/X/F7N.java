package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F7N {
    public static final java.util.Set A00(String... strArr) {
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        C14360o3.A0B(copyOf, 0);
        List A0I = AbstractC009903n.A0I(copyOf);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0I) {
            if (((String) obj).length() > 0) {
                A1E.add(obj);
            }
        }
        return AbstractC001800i.A0k(A1E);
    }
}
