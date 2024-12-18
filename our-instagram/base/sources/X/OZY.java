package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class OZY {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();
    public final C05A A01;
    public final C0UO A02;

    public static final C54830OLp A00(C54830OLp c54830OLp, OX8 ox8, OX8 ox82) {
        O1E o1e;
        O1E o1e2;
        O1E o1e3;
        O1E o1e4;
        O1E o1e5;
        O1E o1e6;
        if (c54830OLp != null) {
            o1e = c54830OLp.A02;
        } else {
            o1e = C51057MhB.A01;
        }
        O1E o1e7 = ox8.A02;
        if (ox82 != null && (o1e6 = ox82.A02) != null) {
            if (!(o1e instanceof C51059MhD) || (((o1e7 instanceof C51057MhB) && (o1e6 instanceof C51057MhB)) || (o1e6 instanceof C51058MhC))) {
                o1e = o1e6;
            }
        } else {
            o1e = o1e7;
        }
        if (c54830OLp != null) {
            o1e2 = c54830OLp.A01;
        } else {
            o1e2 = C51057MhB.A01;
        }
        O1E o1e8 = ox8.A01;
        if (ox82 != null && (o1e5 = ox82.A01) != null) {
            if (!(o1e2 instanceof C51059MhD) || (((o1e7 instanceof C51057MhB) && (o1e5 instanceof C51057MhB)) || (o1e5 instanceof C51058MhC))) {
                o1e2 = o1e5;
            }
            o1e8 = o1e2;
        }
        if (c54830OLp != null) {
            o1e3 = c54830OLp.A00;
        } else {
            o1e3 = C51057MhB.A01;
        }
        O1E o1e9 = ox8.A00;
        if (ox82 != null && (o1e4 = ox82.A00) != null) {
            if (!(o1e3 instanceof C51059MhD) || (((o1e7 instanceof C51057MhB) && (o1e4 instanceof C51057MhB)) || (o1e4 instanceof C51058MhC))) {
                o1e3 = o1e4;
            }
            o1e9 = o1e3;
        }
        return new C54830OLp(o1e, o1e8, o1e9, ox8, ox82);
    }

    public static final void A01(OZY ozy, InterfaceC16660sJ interfaceC16660sJ) {
        Object value;
        Object invoke;
        C05A c05a = ozy.A01;
        do {
            value = c05a.getValue();
            invoke = interfaceC16660sJ.invoke(value);
            if (C14360o3.A0K(value, invoke)) {
                return;
            }
        } while (!c05a.AIi(value, invoke));
        if (invoke != null) {
            Iterator it = ozy.A00.iterator();
            while (it.hasNext()) {
                AbstractC25225BEi.A1U(it.next(), invoke);
            }
        }
    }

    public OZY() {
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A01 = A0z;
        this.A02 = AbstractC208910l.A02(A0z);
    }
}
