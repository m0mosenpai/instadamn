package X;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37591ow {
    public static final C37581ov A00(String str, int i) {
        C14360o3.A0B(str, 0);
        TreeMap treeMap = C37581ov.A08;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C37581ov c37581ov = (C37581ov) ceilingEntry.getValue();
                c37581ov.A07 = str;
                c37581ov.A00 = i;
                return c37581ov;
            }
            C37581ov c37581ov2 = new C37581ov(i);
            c37581ov2.A07 = str;
            c37581ov2.A00 = i;
            return c37581ov2;
        }
    }
}
