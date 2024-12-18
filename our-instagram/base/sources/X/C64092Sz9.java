package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Sz9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64092Sz9 implements InterfaceC174637px {
    @Override // X.InterfaceC174637px
    public final C176997tv ApU(EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        throw AbstractC166987dD.A1D("Only photo mode is used");
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bfv(List list, int i, int i2, int i3) {
        throw AbstractC166987dD.A1D("Only photo mode is used");
    }

    @Override // X.InterfaceC174637px
    public final C176997tv CFI(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        throw AbstractC166987dD.A1D("Only photo mode is used");
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bcq(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        AbstractC167017dG.A1N(list, list2);
        int i4 = 0;
        C176877tj c176877tj = (C176877tj) list.get(0);
        Iterator it = list.iterator();
        C176877tj c176877tj2 = null;
        int i5 = 0;
        while (it.hasNext()) {
            C176877tj c176877tj3 = (C176877tj) it.next();
            int i6 = c176877tj3.A02;
            int i7 = c176877tj3.A01;
            int i8 = i6 * i7;
            if (Math.abs((i6 / i7) - (4.0f / 3.0f)) <= 0.05f && i8 > i4) {
                c176877tj2 = c176877tj3;
                i4 = i8;
            } else if (i8 > i5) {
                c176877tj = c176877tj3;
                i5 = i8;
            }
        }
        if (c176877tj2 != null) {
            c176877tj = c176877tj2;
        }
        int i9 = i * i2;
        Iterator it2 = list2.iterator();
        C176877tj c176877tj4 = null;
        int i10 = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            C176877tj c176877tj5 = (C176877tj) it2.next();
            int i11 = c176877tj5.A02;
            int i12 = c176877tj5.A01;
            int abs = Math.abs(i9 - (i11 * i12));
            if (abs < i10) {
                if (Math.abs((i11 / i12) - (c176877tj.A02 / c176877tj.A01)) <= 0.05f) {
                    c176877tj4 = c176877tj5;
                    i10 = abs;
                }
            }
        }
        return new C176997tv(c176877tj4, c176877tj, null, null);
    }
}
