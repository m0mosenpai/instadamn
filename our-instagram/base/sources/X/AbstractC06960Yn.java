package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0Yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06960Yn extends AbstractC16990sr {
    public static final List A0S(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        List asList = Arrays.asList(objArr);
        C14360o3.A07(asList);
        return asList;
    }

    public static final void A0T(float[] fArr, float[] fArr2, int i) {
        C14360o3.A0B(fArr, 0);
        C14360o3.A0B(fArr2, 1);
        System.arraycopy(fArr, 0, fArr2, 0, i);
    }

    public static final void A0U(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        C14360o3.A0B(iArr, 0);
        C14360o3.A0B(iArr2, 1);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static final void A0V(Object[] objArr, int i, int i2) {
        C14360o3.A0B(objArr, 0);
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static final void A0W(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        C14360o3.A0B(objArr, 0);
        C14360o3.A0B(objArr2, 1);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final byte[] A0X(byte[] bArr, int i, int i2) {
        C0eD.A0c(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C14360o3.A07(copyOfRange);
        return copyOfRange;
    }

    public static final byte[] A0Y(byte[] bArr, byte[] bArr2) {
        C14360o3.A0B(bArr, 0);
        C14360o3.A0B(bArr2, 1);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        C14360o3.A0A(copyOf);
        return copyOf;
    }

    public static final float[] A0Z(float[] fArr, float[] fArr2) {
        C14360o3.A0B(fArr, 0);
        C14360o3.A0B(fArr2, 1);
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        C14360o3.A0A(copyOf);
        return copyOf;
    }

    public static final Object[] A0a(Object[] objArr, int i, int i2) {
        C14360o3.A0B(objArr, 0);
        C0eD.A0c(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        C14360o3.A07(copyOfRange);
        return copyOfRange;
    }

    public static final Object[] A0b(Object[] objArr, Object[] objArr2) {
        C14360o3.A0B(objArr, 0);
        C14360o3.A0B(objArr2, 1);
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        C14360o3.A0A(copyOf);
        return copyOf;
    }
}
