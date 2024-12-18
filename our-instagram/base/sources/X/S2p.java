package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class S2p {
    public static int A00(java.util.Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC25235BEs.A06(it.next());
        }
        return i;
    }
}
