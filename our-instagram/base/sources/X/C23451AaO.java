package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.AaO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23451AaO implements InterfaceC174637px {
    public final float A00;
    public final int A01;
    public final int A02;

    @Override // X.InterfaceC174637px
    public final C176997tv Bfv(List list, int i, int i2, int i3) {
        C14360o3.A0B(list, 0);
        C176877tj A01 = A01(list, this.A00, this.A01);
        return new C176997tv(A01, A01, null, null);
    }

    public C23451AaO(int i, float f) {
        this.A01 = i;
        this.A02 = i;
        this.A00 = f;
    }

    public static C176997tv A00(C23451AaO c23451AaO, List list, List list2, List list3) {
        C14360o3.A07(list);
        List A00 = AbstractC176907tm.A00(AbstractC176907tm.A01, AbstractC176887tk.A01(list2, list3));
        C14360o3.A07(A00);
        int i = c23451AaO.A01;
        float f = c23451AaO.A00;
        C176877tj A01 = A01(list, f, i);
        C176877tj A012 = A01(A00, f, c23451AaO.A02);
        return new C176997tv(A012, A01, A012, null);
    }

    public static final C176877tj A01(List list, float f, int i) {
        Iterator it = list.iterator();
        double d = Double.MAX_VALUE;
        C176877tj c176877tj = null;
        C176877tj c176877tj2 = null;
        int i2 = Integer.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        while (it.hasNext()) {
            C176877tj c176877tj3 = (C176877tj) it.next();
            int i3 = c176877tj3.A01;
            int i4 = c176877tj3.A02;
            int i5 = i3 * i4;
            if (i5 > i2) {
                c176877tj2 = c176877tj3;
                i2 = i5;
            }
            float f2 = i4;
            double abs = Math.abs(Math.min((int) (f2 / f), i3) - i);
            if (abs <= d && (abs != d || AbstractC166987dD.A01(f, f2 / i3) <= Math.abs(f - d2))) {
                d = abs;
                d2 = f2 / i3;
                c176877tj = c176877tj3;
            }
        }
        if (c176877tj == null && c176877tj2 != null) {
            return c176877tj2;
        }
        return c176877tj;
    }

    @Override // X.InterfaceC174637px
    public final C176997tv ApU(EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        AbstractC167027dH.A12(list, list2, list3);
        return A00(this, AbstractC176907tm.A00(AbstractC176907tm.A00, list), list3, list2);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bcq(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        AbstractC167017dG.A1N(list, list2);
        List A00 = AbstractC176907tm.A00(AbstractC176907tm.A00, list);
        C14360o3.A07(A00);
        List A002 = AbstractC176907tm.A00(AbstractC176907tm.A01, list2);
        C14360o3.A07(A002);
        int i4 = this.A01;
        float f = this.A00;
        return new C176997tv(A01(A002, f, this.A02), A01(A00, f, i4), null, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv CFI(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        AbstractC167017dG.A1N(list, list2);
        return A00(this, AbstractC176907tm.A00(AbstractC176907tm.A00, list), list2, list);
    }
}
