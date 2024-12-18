package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VtN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69678VtN {
    public final Map A00 = new HashMap();

    public final List A00(String str) {
        C14360o3.A0B(str, 0);
        if (str.length() > 0) {
            Map map = this.A00;
            String A0f = AbstractC31178DnM.A0f(str);
            if (map.containsKey(A0f)) {
                C14360o3.A07(A0f);
                List list = (List) map.get(A0f);
                if (list != null) {
                    return list;
                }
            }
        }
        return new ArrayList();
    }

    public final void A01(String str, List list) {
        C14360o3.A0B(str, 0);
        this.A00.put(AbstractC31178DnM.A0f(str), list);
    }
}
