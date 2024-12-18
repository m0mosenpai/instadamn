package X;

import java.util.Arrays;

/* renamed from: X.5Th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117485Th extends AbstractC117475Tg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C5Ti[] A06 = new C5Ti[16];
    public int[] A05 = new int[16];
    public Object[] A07 = new Object[16];

    public final void A00() {
        this.A02 = 0;
        this.A00 = 0;
        AbstractC06960Yn.A0V(this.A07, 0, this.A01);
        this.A01 = 0;
    }

    public final void A02(C5Ti c5Ti) {
        this.A03 = 0;
        this.A04 = 0;
        int i = this.A02;
        C5Ti[] c5TiArr = this.A06;
        if (i == c5TiArr.length) {
            int i2 = i;
            if (i > 1024) {
                i2 = 1024;
            }
            Object[] copyOf = Arrays.copyOf(c5TiArr, i + i2);
            C14360o3.A07(copyOf);
            this.A06 = (C5Ti[]) copyOf;
        }
        int i3 = this.A00;
        int i4 = c5Ti.A00;
        int i5 = i3 + i4;
        int[] iArr = this.A05;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = length;
            if (length > 1024) {
                i6 = 1024;
            }
            int i7 = length + i6;
            if (i7 < i5) {
                i7 = i5;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i7);
            C14360o3.A07(copyOf2);
            this.A05 = copyOf2;
        }
        int i8 = this.A01;
        int i9 = c5Ti.A01;
        int i10 = i8 + i9;
        Object[] objArr = this.A07;
        int length2 = objArr.length;
        if (i10 > length2) {
            int i11 = length2;
            if (length2 > 1024) {
                i11 = 1024;
            }
            int i12 = length2 + i11;
            if (i12 < i10) {
                i12 = i10;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i12);
            C14360o3.A07(copyOf3);
            this.A07 = copyOf3;
        }
        C5Ti[] c5TiArr2 = this.A06;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        c5TiArr2[i13] = c5Ti;
        this.A00 += i4;
        this.A01 += i9;
    }

    public final void A01(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr) {
        C117485Th c117485Th;
        int i;
        if (this.A02 != 0) {
            C5Z4 c5z4 = new C5Z4(this);
            do {
                c117485Th = c5z4.A03;
                C5Ti c5Ti = c117485Th.A06[c5z4.A02];
                C14360o3.A0A(c5Ti);
                c5Ti.A02(c5tz, c5z3, c117565Tr, c5z4);
                int i2 = c5z4.A02;
                if (i2 >= c117485Th.A02) {
                    break;
                }
                C5Ti c5Ti2 = c117485Th.A06[i2];
                C14360o3.A0A(c5Ti2);
                c5z4.A00 += c5Ti2.A00;
                c5z4.A01 += c5Ti2.A01;
                i = c5z4.A02 + 1;
                c5z4.A02 = i;
            } while (i < c117485Th.A02);
        }
        A00();
    }
}
