package X;

import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class W5X {
    public final C69786VvR A01;
    public final java.util.Set A02 = new LinkedHashSet();
    public final java.util.Set A00 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (X.AbstractC50102Ry.A00(r1, r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017a, code lost:
    
        if (X.AbstractC50102Ry.A00(r0, r1) != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(X.W5X r10, java.util.Set r11) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W5X.A00(X.W5X, java.util.Set):boolean");
    }

    public final MediaMapPin A01() {
        java.util.Set set = this.A02;
        if (set.isEmpty()) {
            return null;
        }
        C69786VvR c69786VvR = this.A01;
        return (MediaMapPin) c69786VvR.A02.get(set.iterator().next());
    }

    public final TreeSet A02() {
        C69786VvR c69786VvR = this.A01;
        java.util.Set set = this.A02;
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            treeSet.add(c69786VvR.A00((String) it.next()));
        }
        return treeSet;
    }

    public final void A03(String str) {
        LinkedHashSet linkedHashSet;
        if (str != null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(str);
        } else {
            linkedHashSet = null;
        }
        A00(this, linkedHashSet);
    }

    public W5X(C69786VvR c69786VvR) {
        this.A01 = c69786VvR;
    }
}
