package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Y1e {
    public final Map A00 = AbstractC166987dD.A1G();

    public final void A01(C73348Y9d c73348Y9d, InterfaceC179247xa interfaceC179247xa) {
        C0J8.A08(AbstractC167007dF.A1W(interfaceC179247xa), "Null event passed in");
        Map map = this.A00;
        synchronized (map) {
            EnumC179217xX CBM = interfaceC179247xa.CBM();
            if (map.containsKey(CBM) && !((C1814082s) map.get(CBM)).A00.isEmpty()) {
                C72748XmP A02 = c73348Y9d.A02();
                A02.A00 = interfaceC179247xa;
                C1814082s c1814082s = (C1814082s) map.get(CBM);
                List list = c1814082s.A00;
                for (int i = 0; i < list.size(); i++) {
                    WeakReference weakReference = (WeakReference) list.get(i);
                    if (((InterfaceC179577y7) weakReference.get()) == null) {
                        c1814082s.A02(weakReference);
                    }
                }
                A02.A02 = c1814082s.A00;
                c73348Y9d.A03(A02);
            }
        }
    }

    public static WeakReference A00(Y1e y1e, InterfaceC179577y7 interfaceC179577y7, EnumC179217xX enumC179217xX) {
        Map map = y1e.A00;
        synchronized (map) {
            C1814082s c1814082s = (C1814082s) map.get(enumC179217xX);
            if (c1814082s != null) {
                List list = c1814082s.A00;
                for (int i = 0; i < list.size(); i++) {
                    WeakReference weakReference = (WeakReference) list.get(i);
                    if (weakReference.get() == interfaceC179577y7) {
                        return weakReference;
                    }
                }
            }
            return null;
        }
    }

    public final boolean A03(EnumC179217xX enumC179217xX) {
        boolean z;
        Map map = this.A00;
        synchronized (map) {
            C1814082s c1814082s = (C1814082s) map.get(enumC179217xX);
            z = false;
            if (c1814082s != null && c1814082s.A00.size() > 0) {
                z = true;
            }
        }
        return z;
    }

    public final void A02(InterfaceC179577y7 interfaceC179577y7, EnumC179217xX enumC179217xX) {
        C0J8.A08(AbstractC167007dF.A1W(interfaceC179577y7), "Null listener unregistered");
        Map map = this.A00;
        synchronized (map) {
            if (map.containsKey(enumC179217xX)) {
                ((C1814082s) map.get(enumC179217xX)).A02(A00(this, interfaceC179577y7, enumC179217xX));
            }
        }
    }
}
