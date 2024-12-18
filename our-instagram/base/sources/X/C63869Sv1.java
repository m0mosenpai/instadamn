package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: X.Sv1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63869Sv1 implements InterfaceC65479Tkw {
    public boolean A00;
    public boolean A01;
    public final java.util.Set A02 = Collections.newSetFromMap(new WeakHashMap());

    public final void A00() {
        this.A01 = true;
        Iterator A0y = AbstractC58322PtE.A0y(this.A02);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onDestroy();
        }
    }

    @Override // X.InterfaceC65479Tkw
    public final void A8y(InterfaceC65538TmA interfaceC65538TmA) {
        this.A02.add(interfaceC65538TmA);
        if (this.A01) {
            interfaceC65538TmA.onDestroy();
        } else if (this.A00) {
            interfaceC65538TmA.onStart();
        } else {
            interfaceC65538TmA.onStop();
        }
    }

    @Override // X.InterfaceC65479Tkw
    public final void EFW(InterfaceC65538TmA interfaceC65538TmA) {
        this.A02.remove(interfaceC65538TmA);
    }
}
