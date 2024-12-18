package X;

import java.util.Arrays;

/* renamed from: X.0h5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10380h5 implements InterfaceC05740Sa {
    public static final int[] A03 = new int[0];
    public static final Object[] A04 = new Object[0];
    public int[] A01 = A03;
    public Object[] A02 = A04;
    public int A00 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AbstractC10380h5 abstractC10380h5 = (AbstractC10380h5) obj;
            if (this.A00 != abstractC10380h5.A00 || !Arrays.equals(this.A01, abstractC10380h5.A01) || !Arrays.equals(this.A02, abstractC10380h5.A02)) {
                return false;
            }
        }
        return true;
    }

    public static void A00(AbstractC10380h5 abstractC10380h5, Object obj, int i) {
        int i2;
        int binarySearch = Arrays.binarySearch(abstractC10380h5.A01, 0, abstractC10380h5.A00, i);
        if (binarySearch >= 0) {
            abstractC10380h5.A02[binarySearch] = obj;
            return;
        }
        int i3 = binarySearch ^ (-1);
        int[] iArr = abstractC10380h5.A01;
        int i4 = abstractC10380h5.A00;
        int i5 = i4 + 1;
        int length = iArr.length;
        if (i5 <= length) {
            i2 = i3 + 1;
            System.arraycopy(iArr, i3, iArr, i2, i4 - i3);
            iArr[i3] = i;
        } else {
            int i6 = i4 * 2;
            if (i4 <= 2) {
                i6 = 4;
            }
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            iArr2[i3] = i;
            i2 = i3 + 1;
            System.arraycopy(iArr, i3, iArr2, i2, length - i3);
            iArr = iArr2;
        }
        abstractC10380h5.A01 = iArr;
        Object[] objArr = abstractC10380h5.A02;
        int i7 = abstractC10380h5.A00;
        int i8 = i7 + 1;
        int length2 = objArr.length;
        if (i8 <= length2) {
            System.arraycopy(objArr, i3, objArr, i2, i7 - i3);
            objArr[i3] = obj;
        } else {
            int i9 = i7 * 2;
            if (i7 <= 2) {
                i9 = 4;
            }
            Object[] objArr2 = new Object[i9];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            objArr2[i3] = obj;
            System.arraycopy(objArr, i3, objArr2, i2, length2 - i3);
            objArr = objArr2;
        }
        abstractC10380h5.A02 = objArr;
        abstractC10380h5.A00++;
    }

    @Override // X.InterfaceC05740Sa
    public final Object BYT(int i) {
        int binarySearch = Arrays.binarySearch(this.A01, 0, this.A00, i);
        if (binarySearch < 0) {
            return null;
        }
        return this.A02[binarySearch];
    }

    public final int hashCode() {
        return (((this.A00 * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02);
    }

    @Override // X.InterfaceC05740Sa
    public final long BP1(int i, long j) {
        int binarySearch = Arrays.binarySearch(this.A01, 0, this.A00, 131073);
        if (binarySearch < 0) {
            return 79L;
        }
        return ((Number) this.A02[binarySearch]).longValue();
    }
}
