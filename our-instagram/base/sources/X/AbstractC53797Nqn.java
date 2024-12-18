package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nqn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53797Nqn {
    public static final String A00(List list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        String property = System.getProperty(AbstractC111324zv.A00(230));
        if (property == null) {
            property = "\n";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23781El c23781El = (C23781El) it.next();
            String str = c23781El.A00;
            if (str == null || !str.equalsIgnoreCase("X-IG-Set-WWW-Claim")) {
                A1C.append(str);
                A1C.append(property);
                A1C.append(c23781El.A01);
                A1C.append(property);
            }
        }
        A1C.deleteCharAt(A1C.length() - 1);
        return AbstractC166987dD.A19(A1C);
    }
}
