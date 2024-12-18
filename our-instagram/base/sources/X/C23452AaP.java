package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AaP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23452AaP implements InterfaceC174637px {
    public C176877tj A00;
    public C176877tj A01;
    public C176877tj A02;
    public final int A03;
    public final int A04;
    public final int A05;

    @Override // X.InterfaceC174637px
    public final C176997tv ApU(EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        return A00(list, list2, list3, i, i2);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bcq(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        return A00(list, null, list2, i, i2);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bfv(List list, int i, int i2, int i3) {
        return A00(null, null, list, i, i2);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv CFI(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        return A00(null, list, list2, i, i2);
    }

    private C176997tv A00(List list, List list2, List list3, int i, int i2) {
        int i3;
        int i4;
        int i5;
        HashSet hashSet;
        C176877tj c176877tj;
        List list4 = list2;
        List<C176877tj> list5 = list;
        C176877tj c176877tj2 = new C176877tj(Math.max(i, i2), Math.min(i, i2));
        int i6 = this.A04;
        if (i6 > 0) {
            float f = i6;
            i4 = (int) (0.8f * f);
            i3 = (int) (f * 1.2f);
        } else {
            i3 = 3145728;
            i4 = 0;
        }
        ArrayList A01 = A01(list3, i3);
        if (list != null) {
            list5 = A01(list5, 10485760);
        }
        if (list2 != null) {
            list4 = A01(list4, 2097152);
        }
        if (list5 != null) {
            int i7 = this.A03;
            if (i7 <= 0) {
                i7 = c176877tj2.A02 * c176877tj2.A01;
            }
            i5 = 0;
            if (i7 > 0) {
                Iterator it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C176877tj c176877tj3 = (C176877tj) it.next();
                    C176877tj A012 = AD7.A01(c176877tj3, c176877tj2);
                    if (A012 != null) {
                        c176877tj3 = A012;
                    }
                    int i8 = c176877tj3.A02 * c176877tj3.A01;
                    if (i8 > i5) {
                        i5 = i8;
                        if (i8 >= i7) {
                            i5 = i7;
                            break;
                        }
                    }
                }
            }
        } else {
            i5 = 0;
        }
        int i9 = this.A05;
        if (i4 != 0) {
            double A00 = AD7.A00(c176877tj2.A02, c176877tj2.A01);
            double sqrt = Math.sqrt(i4 / A00);
            c176877tj2 = new C176877tj((int) (A00 * sqrt), (int) sqrt);
        }
        int i10 = 0;
        C176877tj c176877tj4 = null;
        if (i5 > 0 && list5 != null) {
            i10 = (int) (i5 * 0.85d);
            hashSet = AbstractC166987dD.A1H();
            for (C176877tj c176877tj5 : list5) {
                C176877tj c176877tj6 = c176877tj5;
                C176877tj A013 = AD7.A01(c176877tj5, c176877tj2);
                if (A013 != null) {
                    c176877tj6 = A013;
                }
                if (c176877tj6.A02 * c176877tj6.A01 >= i10) {
                    hashSet.add(Double.valueOf(AD7.A00(c176877tj5.A02, c176877tj5.A01)));
                }
            }
        } else {
            hashSet = null;
        }
        C176877tj A002 = AbstractC224589vj.A00(c176877tj2, A01, hashSet, 0.0d);
        if (A002 == null && (A002 = AbstractC224589vj.A00(c176877tj2, A01, null, 0.0d)) == null) {
            throw AbstractC166987dD.A18("Could not calculate preview size.");
        }
        double A003 = AD7.A00(A002.A02, A002.A01);
        if (list5 != null) {
            if (i5 > 0) {
                double sqrt2 = Math.sqrt(i10 / A003);
                c176877tj2 = new C176877tj((int) (A003 * sqrt2), (int) sqrt2);
            }
            c176877tj = AbstractC224589vj.A00(c176877tj2, list5, null, A003);
        } else {
            c176877tj = null;
        }
        if (list4 != null) {
            if (i9 == 0) {
                c176877tj4 = AbstractC224589vj.A00(A002, list4, null, A003);
            } else {
                double d = 0.0d;
                if (A003 != 0.0d) {
                    int i11 = 0;
                    for (int i12 = 0; i12 < list4.size(); i12++) {
                        C176877tj c176877tj7 = (C176877tj) list4.get(i12);
                        int i13 = c176877tj7.A02;
                        int i14 = c176877tj7.A01;
                        int i15 = i13 * i14;
                        double A004 = AD7.A00(i13, i14);
                        int abs = Math.abs(i9 - i15);
                        double abs2 = Math.abs(A003 - A004);
                        if (c176877tj4 != null) {
                            double d2 = i15;
                            if (((int) (abs2 * d2)) + abs >= ((int) (d2 * d)) + i11) {
                            }
                        }
                        c176877tj4 = c176877tj7;
                        d = abs2;
                        i11 = abs;
                    }
                }
            }
        }
        this.A01 = A002;
        this.A00 = c176877tj;
        this.A02 = c176877tj4;
        return new C176997tv(A002, c176877tj, c176877tj4, null);
    }

    public C23452AaP(int i, int i2, int i3) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = i3;
    }

    public static ArrayList A01(List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        C176877tj c176877tj = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C176877tj c176877tj2 = (C176877tj) list.get(i2);
            if (c176877tj2.A02 * c176877tj2.A01 <= i) {
                arrayList.add(c176877tj2);
            }
            if (c176877tj == null || c176877tj2.A02 * c176877tj2.A01 < c176877tj.A02 * c176877tj.A01) {
                c176877tj = c176877tj2;
            }
        }
        if (arrayList.isEmpty() && c176877tj != null) {
            arrayList.add(c176877tj);
        }
        return arrayList;
    }
}
