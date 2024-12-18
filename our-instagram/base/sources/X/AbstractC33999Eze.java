package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Eze, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33999Eze {
    public static Object A00(C6FW c6fw) {
        int A0H = AbstractC166987dD.A0H(c6fw.A01());
        int A0H2 = AbstractC166987dD.A0H(c6fw.A02());
        Iterator A14 = AbstractC166997dE.A14(C6BQ.A0H((Map) c6fw.A00()));
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            C63B.A01.ATB(A0H, A0H2, AbstractC31172DnG.A17(A1K), (String) A1K.getValue());
        }
        return null;
    }
}
