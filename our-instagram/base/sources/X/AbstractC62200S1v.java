package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.S1v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62200S1v {
    public static ArrayList A00(Map map) {
        ArrayList A1E = AbstractC166987dD.A1E();
        List list = (List) map.get("DYNAMIC_AUTH_AUTH_TYPES");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Enum A00 = AbstractC61766RtL.A00(RiX.class, AbstractC166987dD.A1B(it));
                if (A00 != null) {
                    A1E.add(A00);
                }
            }
        }
        return A1E;
    }
}
