package X;

import java.util.ArrayList;

/* renamed from: X.5Tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117555Tq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final C117445Td A09;
    public final int[] A0A;
    public final Object[] A0B;
    public final int A0C;
    public final C117525Tn A0D;

    public final void A07() {
        this.A06 = true;
        C117445Td c117445Td = this.A09;
        int i = c117445Td.A01;
        if (i > 0) {
            c117445Td.A01 = i - 1;
        } else {
            C5UC.A03("Unexpected reader close()");
            throw C00O.createAndThrow();
        }
    }

    public static final Object A00(C117555Tq c117555Tq, int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return c117555Tq.A0B[iArr[i2 + 4] + AbstractC117585Tt.A00(i3 >> 30)];
        }
        return null;
    }

    public final int A01() {
        int i = 1;
        if (this.A04 == 0) {
            int[] iArr = this.A0A;
            int i2 = this.A01;
            if (!AbstractC117585Tt.A03(iArr, i2)) {
                i = iArr[(i2 * 5) + 1] & 67108863;
            }
            this.A01 = i2 + iArr[(i2 * 5) + 3];
            return i;
        }
        C5UC.A03("Cannot skip while in an empty region");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.5Tu] */
    public final C117595Tu A02(int i) {
        ArrayList arrayList = this.A09.A05;
        int A01 = AbstractC117585Tt.A01(arrayList, i, this.A08);
        if (A01 < 0) {
            ?? obj = new Object();
            obj.A00 = i;
            arrayList.add(-(A01 + 1), obj);
            return obj;
        }
        return (C117595Tu) arrayList.get(A01);
    }

    public final Object A03() {
        int i = this.A01;
        if (i < this.A00) {
            int[] iArr = this.A0A;
            int i2 = i * 5;
            int i3 = iArr[i2 + 1];
            if ((268435456 & i3) != 0) {
                Object[] objArr = this.A0B;
                int length = iArr.length;
                if (i2 < length) {
                    length = AbstractC117585Tt.A00(i3 >> 29) + iArr[i2 + 4];
                }
                return objArr[length];
            }
            return C5UI.A00;
        }
        return 0;
    }

    public final Object A04() {
        int i;
        if (this.A04 <= 0 && (i = this.A02) < this.A03) {
            this.A07 = true;
            Object[] objArr = this.A0B;
            this.A02 = i + 1;
            return objArr[i];
        }
        this.A07 = false;
        return C5UI.A00;
    }

    public final Object A05(int i) {
        int[] iArr = this.A0A;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            Object[] objArr = this.A0B;
            int length = iArr.length;
            if (i2 < length) {
                length = AbstractC117585Tt.A00(i3 >> 29) + iArr[i2 + 4];
            }
            return objArr[length];
        }
        return C5UI.A00;
    }

    public final Object A06(int i, int i2) {
        int i3;
        int[] iArr = this.A0A;
        int i4 = i * 5;
        int A00 = iArr[i4 + 4] + AbstractC117585Tt.A00(iArr[i4 + 1] >> 28);
        int i5 = i + 1;
        if (i5 < this.A08) {
            i3 = iArr[(i5 * 5) + 4];
        } else {
            i3 = this.A0C;
        }
        int i6 = A00 + i2;
        if (i6 < i3) {
            return this.A0B[i6];
        }
        return C5UI.A00;
    }

    public final void A08() {
        int i;
        int i2;
        if (this.A04 == 0) {
            if (this.A01 == this.A00) {
                int[] iArr = this.A0A;
                int i3 = iArr[(this.A05 * 5) + 2];
                this.A05 = i3;
                if (i3 < 0) {
                    i = this.A08;
                } else {
                    i = iArr[(i3 * 5) + 3] + i3;
                }
                this.A00 = i;
                C117525Tn c117525Tn = this.A0D;
                int[] iArr2 = c117525Tn.A01;
                int i4 = c117525Tn.A00 - 1;
                c117525Tn.A00 = i4;
                int i5 = iArr2[i4];
                if (i5 < 0) {
                    this.A02 = 0;
                    this.A03 = 0;
                    return;
                }
                this.A02 = i5;
                if (i3 >= this.A08 - 1) {
                    i2 = this.A0C;
                } else {
                    i2 = iArr[((i3 + 1) * 5) + 4];
                }
                this.A03 = i2;
                return;
            }
            C5UC.A03("endGroup() not called at the end of a group");
            throw C00O.createAndThrow();
        }
    }

    public final void A09() {
        if (this.A04 == 0) {
            this.A01 = this.A00;
            this.A02 = 0;
            this.A03 = 0;
            return;
        }
        C5UC.A03("Cannot skip the enclosing group while in an empty region");
        throw C00O.createAndThrow();
    }

    public final void A0A() {
        int i;
        if (this.A04 <= 0) {
            int i2 = this.A05;
            int i3 = this.A01;
            int[] iArr = this.A0A;
            if (iArr[(i3 * 5) + 2] == i2) {
                C117525Tn c117525Tn = this.A0D;
                int i4 = this.A02;
                int i5 = this.A03;
                if (i4 == 0 && i5 == 0) {
                    i4 = -1;
                }
                c117525Tn.A00(i4);
                this.A05 = i3;
                int i6 = i3 * 5;
                this.A00 = iArr[i6 + 3] + i3;
                int i7 = i3 + 1;
                this.A01 = i7;
                this.A02 = iArr[i6 + 4] + AbstractC117585Tt.A00(iArr[i6 + 1] >> 28);
                if (i3 >= this.A08 - 1) {
                    i = this.A0C;
                } else {
                    i = iArr[(i7 * 5) + 4];
                }
                this.A03 = i;
                return;
            }
            SQP.A00("Invalid slot table detected");
            throw C00O.createAndThrow();
        }
    }

    public final void A0B(int i) {
        int i2;
        if (this.A04 == 0) {
            this.A01 = i;
            int i3 = this.A08;
            if (i < i3) {
                i2 = this.A0A[(i * 5) + 2];
            } else {
                i2 = -1;
            }
            this.A05 = i2;
            if (i2 >= 0) {
                i3 = i2 + this.A0A[(i2 * 5) + 3];
            }
            this.A00 = i3;
            this.A02 = 0;
            this.A03 = 0;
            return;
        }
        C5UC.A03("Cannot reposition while in an empty region");
        throw C00O.createAndThrow();
    }

    public final String toString() {
        int i;
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 < i3) {
            i = this.A0A[i2 * 5];
        } else {
            i = 0;
        }
        return AnonymousClass001.A0w("SlotReader(current=", ", key=", ", parent=", ", end=", ')', i2, i, this.A05, i3);
    }

    public C117555Tq(C117445Td c117445Td) {
        this.A09 = c117445Td;
        this.A0A = c117445Td.A08;
        int i = c117445Td.A00;
        this.A08 = i;
        this.A0B = c117445Td.A09;
        this.A0C = c117445Td.A02;
        this.A00 = i;
        this.A05 = -1;
        this.A0D = new C117525Tn();
    }
}
