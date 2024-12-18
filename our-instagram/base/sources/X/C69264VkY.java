package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.VkY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69264VkY {
    public final C70195WFz A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final long[] A04;

    public C69264VkY(C70195WFz c70195WFz, Map map, Map map2, Map map3) {
        this.A00 = c70195WFz;
        this.A03 = map2;
        this.A02 = map3;
        this.A01 = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        C70195WFz.A04(c70195WFz, treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = MSY.A07(it);
            i++;
        }
        this.A04 = jArr;
    }
}
