package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4cY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99114cY implements InterfaceC13000lm {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.clear();
    }

    public final void A00(java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C99134ca c99134ca = (C99134ca) it.next();
            this.A00.put(c99134ca.A07, c99134ca);
        }
    }
}
