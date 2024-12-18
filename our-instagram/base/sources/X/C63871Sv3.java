package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: X.Sv3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63871Sv3 implements InterfaceC65538TmA {
    public final java.util.Set A00 = Collections.newSetFromMap(new WeakHashMap());

    @Override // X.InterfaceC65538TmA
    public final void onDestroy() {
        Iterator A0y = AbstractC58322PtE.A0y(this.A00);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onDestroy();
        }
    }

    @Override // X.InterfaceC65538TmA
    public final void onStart() {
        Iterator A0y = AbstractC58322PtE.A0y(this.A00);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onStart();
        }
    }

    @Override // X.InterfaceC65538TmA
    public final void onStop() {
        Iterator A0y = AbstractC58322PtE.A0y(this.A00);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onStop();
        }
    }
}
