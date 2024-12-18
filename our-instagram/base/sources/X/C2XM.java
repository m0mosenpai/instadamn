package X;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2XM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XM {
    public Map A00;
    public Map A01;

    public final synchronized void A00() {
        Map map = this.A00;
        if (map != null) {
            map.clear();
        }
        Map map2 = this.A01;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final void A01(C51422Xp c51422Xp) {
        Map map;
        synchronized (this) {
            Map map2 = this.A00;
            if (map2 == null) {
                map2 = new HashMap();
                this.A00 = map2;
            }
            if (this.A01 == null) {
                this.A01 = new HashMap();
            }
            if (map2 != null) {
                map2.put(c51422Xp.A04, c51422Xp);
            }
            C51322Xf c51322Xf = c51422Xp.A03;
            if (c51322Xf != null && (map = this.A01) != null) {
                Object obj = map.get(c51322Xf);
                if (obj == null) {
                    obj = new SparseArray();
                    map.put(c51322Xf, obj);
                }
                ((SparseArray) obj).put(c51422Xp.A02, c51422Xp);
            }
        }
    }
}
