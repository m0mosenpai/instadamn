package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T1I implements InterfaceC65368Tj0 {
    public final java.util.Set A00 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC65368Tj0
    public final boolean EiC(Map map) {
        Iterator it = this.A00.iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= ((InterfaceC65368Tj0) it.next()).EiC(map);
        }
        return z;
    }
}
