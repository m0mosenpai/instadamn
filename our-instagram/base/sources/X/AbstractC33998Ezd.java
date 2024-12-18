package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ezd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33998Ezd {
    public static Object A00(C6FW c6fw) {
        Map map = (Map) c6fw.A01();
        int A0H = AbstractC166987dD.A0H(c6fw.A02());
        Iterator A14 = AbstractC166997dE.A14(C6BQ.A0H(map));
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            C63B.A01.ATB(719983200, A0H, AbstractC31172DnG.A17(A1K), (String) A1K.getValue());
        }
        return null;
    }
}
