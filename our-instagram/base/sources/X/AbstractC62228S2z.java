package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.S2z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62228S2z {
    public static void A00(C71473Il c71473Il, Appendable appendable, String str, Iterator it) {
        if (!it.hasNext()) {
            return;
        }
        while (true) {
            Map.Entry A1K = AbstractC166987dD.A1K(it);
            appendable.append(c71473Il.A01(A1K.getKey()));
            appendable.append(str);
            appendable.append(c71473Il.A01(A1K.getValue()));
            if (it.hasNext()) {
                appendable.append(c71473Il.A00);
            } else {
                return;
            }
        }
    }
}
