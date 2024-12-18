package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class OQD {
    public static final boolean A01(String str, List list) {
        Iterator it = AbstractC001800i.A0X(list).iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(MSZ.A0v(it), str)) {
                return true;
            }
        }
        return false;
    }

    public static final ArrayList A00(List list, List list2) {
        Map A1G;
        if (list != null) {
            List A0X = AbstractC001800i.A0X(list);
            LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(A0X));
            for (Object obj : A0X) {
                A18.put(((com.instagram.tagging.model.Tag) obj).getId(), obj);
            }
            A1G = AbstractC06930Yk.A03(A18);
        } else {
            A1G = AbstractC166987dD.A1G();
        }
        if (list2 != null) {
            Iterator it = AbstractC001800i.A0X(list2).iterator();
            while (it.hasNext()) {
                A1G.remove(MSZ.A0v(it));
            }
        }
        return AbstractC31180DnO.A0n(A1G);
    }
}
