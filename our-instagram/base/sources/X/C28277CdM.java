package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CdM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28277CdM {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public List A05;
    public final BZb A06;
    public final ArrayList A07;
    public final List A08;

    public static final int A00(C28277CdM c28277CdM) {
        return ((int) Math.sqrt((c28277CdM.A06.A02.A00 * 1.0d) / c28277CdM.A04)) + 1;
    }

    public final int A01(int i) {
        BZb bZb = this.A06;
        int i2 = bZb.A02.A00;
        if (i2 <= 0) {
            return 0;
        }
        if (i < i2) {
            if (!bZb.A00) {
                return i / this.A04;
            }
            ArrayList arrayList = this.A07;
            int A1L = AbstractC16960so.A1L(arrayList, new C25512BQa(i, 0), arrayList.size());
            if (A1L < 0) {
                A1L = (-A1L) - 2;
            }
            int A00 = A00(this) * A1L;
            int i3 = ((C27850CPn) arrayList.get(A1L)).A00;
            if (i3 <= i) {
                int i4 = 0;
                while (i3 < i) {
                    int i5 = i3 + 1;
                    int A02 = A02(i3);
                    i4 += A02;
                    int i6 = this.A04;
                    if (i4 >= i6) {
                        A00++;
                        i4 = A02;
                        if (i4 == i6) {
                            i4 = 0;
                        }
                    }
                    int A002 = A00(this);
                    if (A00 % A002 == 0 && A00 / A002 >= arrayList.size()) {
                        arrayList.add(new C27850CPn(i5 - (AbstractC167007dF.A1O(i4) ? 1 : 0), 0));
                    }
                    i3 = i5;
                }
                if (i4 + A02(i) > this.A04) {
                    return A00 + 1;
                }
                return A00;
            }
            throw AbstractC166987dD.A12("currentItemIndex > itemIndex");
        }
        throw AbstractC166987dD.A12("ItemIndex > total count");
    }

    public final int A02(int i) {
        C28145Cas c28145Cas = C28145Cas.A01;
        C28145Cas.A00 = this.A04;
        C6Nx AXC = this.A06.A02.AXC(i);
        return (int) ((C27973CUv) ((C28758Cmq) AXC.A02).A00.invoke(c28145Cas, Integer.valueOf(i - AXC.A01))).A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List, java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    public final C27851CPo A03(int i) {
        int i2;
        boolean z;
        ?? A1E;
        int i3;
        BZb bZb = this.A06;
        if (!bZb.A00) {
            int i4 = this.A04;
            i2 = i * i4;
            int i5 = bZb.A02.A00 - i2;
            if (i4 > i5) {
                i4 = i5;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            if (i4 == this.A05.size()) {
                A1E = this.A05;
            } else {
                A1E = AbstractC25225BEi.A17(i4);
                for (int i6 = 0; i6 < i4; i6++) {
                    A1E.add(new C27973CUv(1L));
                }
                this.A05 = A1E;
            }
        } else {
            int A00 = A00(this);
            ArrayList arrayList = this.A07;
            int min = Math.min(i / A00, arrayList.size() - 1);
            int i7 = A00 * min;
            i2 = ((C27850CPn) arrayList.get(min)).A00;
            int i8 = ((C27850CPn) arrayList.get(min)).A01;
            int i9 = this.A01;
            if (i7 <= i9 && i9 <= i) {
                i2 = this.A02;
                i8 = this.A03;
                i7 = i9;
            } else if (min == this.A00) {
                int i10 = i - i7;
                List list = this.A08;
                if (i10 < list.size()) {
                    i2 = AbstractC166987dD.A0H(list.get(i10));
                    i7 = i;
                    i8 = 0;
                }
            }
            int A002 = A00(this);
            if (i7 % A002 == 0 && 2 <= (i3 = i - i7) && i3 < A002) {
                z = true;
                this.A00 = min;
                this.A08.clear();
            } else {
                z = false;
            }
            if (i7 > i) {
                throw AbstractC166987dD.A14("currentLine > lineIndex");
            }
            while (i7 < i) {
                C6Nv c6Nv = bZb.A02;
                if (i2 >= c6Nv.A00) {
                    break;
                }
                if (z) {
                    this.A08.add(Integer.valueOf(i2));
                }
                int i11 = 0;
                while (i11 < this.A04 && i2 < c6Nv.A00) {
                    if (i8 == 0) {
                        i8 = A02(i2);
                    }
                    i11 += i8;
                    if (i11 > this.A04) {
                        break;
                    }
                    i2++;
                    i8 = 0;
                }
                i7++;
                int A003 = A00(this);
                if (i7 % A003 == 0 && i2 < c6Nv.A00) {
                    if (arrayList.size() == i7 / A003) {
                        arrayList.add(new C27850CPn(i2, i8));
                    } else {
                        throw AbstractC166987dD.A14("invalid starting point");
                    }
                }
            }
            this.A01 = i;
            this.A02 = i2;
            this.A03 = i8;
            A1E = AbstractC166987dD.A1E();
            int i12 = i2;
            int i13 = 0;
            while (i13 < this.A04 && i12 < bZb.A02.A00) {
                if (i8 == 0) {
                    i8 = A02(i12);
                }
                i13 += i8;
                if (i13 > this.A04) {
                    break;
                }
                i12++;
                if (i8 > 0) {
                    A1E.add(new C27973CUv(i8));
                    i8 = 0;
                } else {
                    throw AbstractC166987dD.A12("The span value should be higher than 0");
                }
            }
        }
        return new C27851CPo(i2, A1E);
    }

    public C28277CdM(BZb bZb) {
        this.A06 = bZb;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new C27850CPn(0, 0));
        this.A07 = A1E;
        this.A00 = -1;
        this.A08 = AbstractC166987dD.A1E();
        this.A05 = C16930sl.A00;
    }
}
