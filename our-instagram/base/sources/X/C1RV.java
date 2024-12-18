package X;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1RV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RV implements C1RX {
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C1RZ.A00);
    public final java.util.Set A00 = new LinkedHashSet();

    @Override // X.C1RX
    public final synchronized void CiS(double d, long j, long j2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1RX) it.next()).CiS(d, j, j2);
        }
    }

    @Override // X.C1RX
    public final synchronized void Ckm(double d) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1RX) it.next()).Ckm(d);
        }
    }

    @Override // X.C1RX
    public final synchronized void ClI(String str, boolean z) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1RX) it.next()).ClI(str, z);
        }
    }

    @Override // X.C1RX
    public final synchronized void ClJ(C1QY c1qy) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1RX) it.next()).ClJ(c1qy);
        }
    }
}
