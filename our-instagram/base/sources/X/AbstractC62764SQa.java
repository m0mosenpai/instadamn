package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.SQa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62764SQa {
    public static final Object A00(C6FW c6fw) {
        if (C0K8.A01.isLoggable(5)) {
            try {
                Object A0a = MSY.A0a(c6fw);
                C14360o3.A0C(A0a, AbstractC111324zv.A00(12));
                List list = (List) A0a;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(A01(it.next()));
                }
                C0K8.A01(5, "BKS::debugLog", AbstractC31175DnJ.A0a(", ", A0q));
                return null;
            } catch (Exception e) {
                C0K8.A0F("BKS::debugLog", "Failed to log", e);
                return null;
            }
        }
        return null;
    }

    public static final String A01(Object obj) {
        ArrayList A0q;
        String str;
        String str2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            A0q = MSY.A0k(map);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A0q.add(AnonymousClass001.A0T(A01(A1K.getKey()), A01(A1K.getValue()), '='));
            }
            str = "{ ";
            str2 = " }";
        } else if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            A0q = AbstractC167017dG.A0q(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                A0q.add(A01(it.next()));
            }
            str = "[ ";
            str2 = " ]";
        } else {
            if (obj instanceof String) {
                return AnonymousClass001.A0E((String) obj, '\"', '\"');
            }
            return String.valueOf(obj);
        }
        return AbstractC001800i.A0P(", ", str, str2, A0q, null);
    }
}
