package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4eH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99954eH implements C15C {
    public static final int[] A01 = new int[0];
    public final C15I A00;

    public void A00(int i, List list) {
        Integer valueOf;
        int max;
        int i2;
        int i3;
        if (this instanceof C107714tG) {
            C107714tG c107714tG = (C107714tG) this;
            if (i >= 0 && i <= 100) {
                double d = i / 100.0d;
                int i4 = 800;
                boolean z = false;
                if (i >= 50) {
                    i4 = 1000;
                    z = true;
                }
                boolean z2 = C15G.A00().A05;
                C15I c15i = ((AbstractC99954eH) c107714tG).A00;
                int[] iArr = c15i.A0A;
                int i5 = iArr[1];
                int max2 = Math.max((iArr[0] + ((int) ((i5 - r8) * d))) / 1000, i4);
                int[] iArr2 = c15i.A0C;
                int i6 = iArr2[1];
                int max3 = Math.max((iArr2[0] + ((int) ((i6 - r8) * d))) / 1000, i4);
                boolean z3 = c107714tG.A00;
                int i7 = 1100;
                if (z3 && max2 > 1100) {
                    max2 = 1100;
                }
                list.add(1086324736);
                list.add(1);
                if (z) {
                    list.add(1090519040);
                    list.add(Integer.valueOf(c15i.A00));
                    list.add(1077936128);
                    list.add(1);
                }
                list.add(1082130432);
                list.add(Integer.valueOf(max2));
                list.add(1082130688);
                list.add(Integer.valueOf(max3));
                if (z2) {
                    list.add(1082146816);
                    int i8 = 1700;
                    int i9 = 2016;
                    if (d < 1.0d) {
                        i9 = 1700;
                    }
                    list.add(Integer.valueOf(i9));
                    list.add(1082130432);
                    if (d >= 1.0d) {
                        i8 = 2016;
                    }
                    list.add(Integer.valueOf(i8));
                }
                if (C15G.A00().A05) {
                    list.add(1120043008);
                    list.add(1);
                }
                if (c15i.A08) {
                    int[] iArr3 = c15i.A0D;
                    int i10 = iArr3[1];
                    i3 = Math.max((iArr3[0] + ((int) ((i10 - r3) * d))) / 1000, i4);
                    if (z3) {
                        if (i3 <= 1100) {
                            i7 = i3;
                        }
                        i3 = i7;
                    }
                    list.add(1082130944);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof C104054mS) {
            if (i < 0 || i > 100) {
                return;
            }
            double d2 = i / 100.0d;
            int i11 = 800;
            if (i >= 50) {
                i11 = 1000;
            }
            C15I c15i2 = this.A00;
            if (c15i2.A07) {
                int[] iArr4 = c15i2.A0A;
                int i12 = iArr4[1];
                int max4 = Math.max((iArr4[0] + ((int) ((i12 - r3) * d2))) / 1000, i11);
                int[] iArr5 = c15i2.A0C;
                int i13 = iArr5[1];
                max = Math.max((iArr5[0] + ((int) ((i13 - r3) * d2))) / 1000, i11);
                list.add(Integer.valueOf(c15i2.A00));
                list.add(Integer.valueOf(max4 * 1000));
                i2 = c15i2.A03;
            } else {
                int[] iArr6 = c15i2.A0B;
                int i14 = iArr6[1];
                max = Math.max((iArr6[0] + ((int) ((i14 - r3) * d2))) / 1000, i11);
                i2 = c15i2.A02;
            }
            list.add(Integer.valueOf(i2));
            i3 = max * 1000;
        } else {
            valueOf = Integer.valueOf(i);
            list.add(valueOf);
        }
        valueOf = Integer.valueOf(i3);
        list.add(valueOf);
    }

    @Override // X.C15C
    public final int[] AhH(C15P c15p) {
        if (c15p != null) {
            ArrayList arrayList = new ArrayList();
            int i = c15p.A01;
            int i2 = c15p.A02;
            if (i == 2) {
                if (this instanceof C107714tG) {
                    arrayList.add(1115701248);
                    arrayList.add(1);
                }
            } else {
                A00(i2, arrayList);
            }
            if (!arrayList.isEmpty()) {
                int[] iArr = new int[arrayList.size()];
                int i3 = 0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iArr[i3] = ((Number) it.next()).intValue();
                    i3++;
                }
                return iArr;
            }
        }
        return A01;
    }

    public AbstractC99954eH(C15I c15i) {
        this.A00 = c15i;
    }
}
