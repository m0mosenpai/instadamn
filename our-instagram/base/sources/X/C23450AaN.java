package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.AaN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23450AaN implements InterfaceC174637px {
    public static C176877tj A00(List list, int i, int i2) {
        float f = i / i2;
        Iterator it = list.iterator();
        C176877tj c176877tj = null;
        double d = Double.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        C176877tj c176877tj2 = null;
        while (it.hasNext()) {
            C176877tj c176877tj3 = (C176877tj) it.next();
            int i4 = c176877tj3.A01;
            int i5 = c176877tj3.A02;
            int i6 = i4 * i5;
            if (i6 > i3 && (i4 < i2 || c176877tj2 == null)) {
                c176877tj2 = c176877tj3;
                i3 = i6;
            }
            if (AbstractC166987dD.A01(i5 / i4, f) <= 0.05f) {
                double abs = Math.abs(i4 - i2);
                if (abs < d) {
                    d = abs;
                    c176877tj = c176877tj3;
                }
            }
        }
        if (c176877tj == null) {
            if (c176877tj2 != null) {
                return c176877tj2;
            }
            throw AbstractC166987dD.A18("This device has no compatible camera sizes.");
        }
        return c176877tj;
    }

    @Override // X.InterfaceC174637px
    public final C176997tv ApU(EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        C176877tj A00 = A00(AbstractC176867ti.A00(list2, list3), i, i2);
        return new C176997tv(A00, A00(list, i, i2), A00, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bcq(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        return new C176997tv(A00(list2, i, i2), A00(list, i, i2), null, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bfv(List list, int i, int i2, int i3) {
        return new C176997tv(A00(list, i, i2), null, null, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv CFI(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        C176877tj A00 = A00(AbstractC176867ti.A00(list, list2), i, i2);
        return new C176997tv(A00, null, A00, null);
    }
}
