package X;

import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class SLS {
    public boolean A00;
    public final java.util.Set A02 = Collections.newSetFromMap(new WeakHashMap());
    public final java.util.Set A01 = AbstractC166987dD.A1H();

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append("{numRequests=");
        A1C.append(this.A02.size());
        A1C.append(", isPaused=");
        return AbstractC50523MSb.A0X(A1C, this.A00);
    }
}
