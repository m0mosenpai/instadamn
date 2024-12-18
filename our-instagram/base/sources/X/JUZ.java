package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class JUZ implements InterfaceC41521w1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public JUZ(InterfaceC50439MOt interfaceC50439MOt) {
        this.A00 = 1;
        this.A01 = interfaceC50439MOt;
        this.A02 = new HashSet(Collections.singleton("active_safety_interventions"));
    }

    @Override // X.InterfaceC41521w1
    public final void DpC(java.util.Set set) {
        if (this.A00 != 0) {
            HashSet hashSet = new HashSet((Collection) this.A02);
            hashSet.retainAll(set);
            if (!hashSet.isEmpty()) {
                ((InterfaceC50439MOt) this.A01).DpB();
                return;
            }
            return;
        }
        if (!set.contains("fetch_pake_messages")) {
            return;
        }
        AbstractC166987dD.A1Y(this.A01);
    }

    public JUZ(C44457JlP c44457JlP, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = 0;
        this.A02 = c44457JlP;
        this.A01 = interfaceC16820sZ;
    }
}
