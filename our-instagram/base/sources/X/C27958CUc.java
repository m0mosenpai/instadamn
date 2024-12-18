package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.CUc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27958CUc {
    public final C6MK A01 = new C6MK();
    public final C6MK A00 = new C6MK();

    public final Object A00(Integer num, Integer num2, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        C6MK c6mk;
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        CS5 cs5 = new CS5(num, str, str2, c24891Jo);
        if (num2.intValue() != 0) {
            c6mk = this.A00;
        } else {
            c6mk = this.A01;
        }
        if (str2 != null) {
            Iterator it = c6mk.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((CS5) obj).A02, str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            CS5 cs52 = (CS5) obj;
            if (cs52 != null) {
                A01(cs52, EnumC46146Kbk.A04);
            }
        }
        c6mk.add(cs5);
        return c24891Jo.A0E();
    }

    public final void A01(CS5 cs5, EnumC46146Kbk enumC46146Kbk) {
        this.A01.remove(cs5);
        this.A00.remove(cs5);
        AbstractC25231BEo.A1G(enumC46146Kbk, cs5.A03);
    }
}
