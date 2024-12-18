package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AaL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23448AaL implements InterfaceC174637px {
    @Override // X.InterfaceC174637px
    public final C176997tv Bcq(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC174637px
    public final C176997tv CFI(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC174637px
    public final C176997tv ApU(EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        C176877tj c176877tj;
        C176877tj c176877tj2;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list2 != null && !list2.isEmpty()) {
            for (Object obj : list2) {
                if (list3.contains(obj)) {
                    A1E.add(obj);
                }
            }
        } else {
            A1E.addAll(list3);
        }
        List A00 = AbstractC176907tm.A00(AbstractC176907tm.A01, A1E);
        Collections.sort(A00, new C50585MUv(this, 3));
        if (A00.size() == 1) {
            c176877tj = (C176877tj) AbstractC166987dD.A16(A00);
        } else {
            c176877tj = null;
        }
        EnumC174667q0 enumC174667q03 = EnumC174667q0.HIGH;
        if (enumC174667q02.equals(enumC174667q03)) {
            c176877tj = (C176877tj) A00.get(A00.size() - 1);
        } else if (enumC174667q02.equals(EnumC174667q0.MEDIUM)) {
            C176877tj c176877tj3 = (C176877tj) A00.get(A00.size() - 1);
            int i4 = (c176877tj3.A02 * c176877tj3.A01) / 2;
            int size = A00.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                c176877tj = (C176877tj) A00.get(size);
            } while (c176877tj.A02 * c176877tj.A01 > i4);
        } else if (enumC174667q02.equals(EnumC174667q0.LOW)) {
            C176877tj c176877tj4 = (C176877tj) A00.get(A00.size() - 1);
            int i5 = (c176877tj4.A02 * c176877tj4.A01) / 3;
            int size2 = A00.size();
            do {
                size2--;
                if (size2 < 0) {
                    break;
                }
                c176877tj = (C176877tj) A00.get(size2);
            } while (c176877tj.A02 * c176877tj.A01 > i5);
        }
        c176877tj.getClass();
        List A002 = AbstractC176907tm.A00(AbstractC176907tm.A00, list);
        ArrayList A1F = AbstractC166987dD.A1F(A002);
        if (A1F.isEmpty()) {
            A1F.addAll(A002);
        }
        Collections.sort(A1F, new C50585MUv(this, 4));
        if (enumC174667q0.equals(enumC174667q03)) {
            c176877tj2 = (C176877tj) A1F.get(A1F.size() - 1);
        } else if (enumC174667q0.equals(EnumC174667q0.MEDIUM)) {
            int size3 = A1F.size();
            c176877tj2 = null;
            do {
                size3--;
                if (size3 < 0) {
                    break;
                }
                c176877tj2 = (C176877tj) A1F.get(size3);
            } while (c176877tj2.A02 * c176877tj2.A01 > 2097152);
        } else if (enumC174667q0.equals(EnumC174667q0.LOW)) {
            int size4 = A1F.size();
            c176877tj2 = null;
            do {
                size4--;
                if (size4 < 0) {
                    break;
                }
                c176877tj2 = (C176877tj) A1F.get(size4);
            } while (c176877tj2.A02 * c176877tj2.A01 > 1048576);
        } else {
            c176877tj2 = null;
        }
        return new C176997tv(c176877tj, c176877tj2, c176877tj, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bfv(List list, int i, int i2, int i3) {
        float f;
        float f2;
        float max = Math.max(i, i2) / Math.min(i, i2);
        Iterator it = list.iterator();
        int i4 = 0;
        C176877tj c176877tj = null;
        while (it.hasNext()) {
            C176877tj c176877tj2 = (C176877tj) it.next();
            int i5 = c176877tj2.A02;
            int i6 = c176877tj2.A01;
            if (max < Math.max(i5, i6) / Math.min(i5, i6)) {
                f2 = i6;
                f = f2 * max;
            } else {
                f = i5;
                f2 = f / max;
            }
            int i7 = (int) (f * f2);
            if (i7 > i4) {
                c176877tj = c176877tj2;
                i4 = i7;
            }
        }
        return new C176997tv(c176877tj, null, null, null);
    }
}
