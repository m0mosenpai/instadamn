package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2XL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XL {
    public final Map A00 = new HashMap();

    public final synchronized void A00() {
        Iterator it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            C79283gZ c79283gZ = (C79283gZ) ((Map.Entry) it.next()).getValue();
            if (!c79283gZ.A00) {
                it.remove();
            } else {
                c79283gZ.A00 = false;
            }
        }
    }

    public final synchronized void A01(C2XE c2xe, C2VD c2vd, String str) {
        C79283gZ c79283gZ;
        C14360o3.A0B(c2xe, 0);
        C14360o3.A0B(c2vd, 1);
        if (str != null && (c79283gZ = (C79283gZ) this.A00.get(str)) != null) {
            c79283gZ.A00 = true;
            C2VE c2ve = c79283gZ.A01;
            c2ve.A01 = c2vd;
            c2ve.A00 = c2xe;
            c2ve.A02 = true;
        }
    }

    public final synchronized void A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.first;
            C2V9 c2v9 = (C2V9) pair.second;
            Map map = this.A00;
            C79283gZ c79283gZ = (C79283gZ) map.get(str);
            if (c79283gZ == null) {
                C79283gZ c79283gZ2 = new C79283gZ(c2v9.A00);
                C14360o3.A0A(str);
                map.put(str, c79283gZ2);
            } else {
                c2v9.A00 = c79283gZ.A01;
            }
        }
    }
}
