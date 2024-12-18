package X;

import java.util.Arrays;

/* renamed from: X.58D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58D implements C58E {
    public final float[] A00;
    public final float[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C58D)) {
                return false;
            }
            C58D c58d = (C58D) obj;
            if (!Arrays.equals(this.A00, c58d.A00) || !Arrays.equals(this.A01, c58d.A01)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C58E
    public final float AK5(float f) {
        return C58F.A00(this.A01, this.A00, f);
    }

    @Override // X.C58E
    public final float AK9(float f) {
        return C58F.A00(this.A00, this.A01, f);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.A00);
        C14360o3.A07(arrays);
        String arrays2 = Arrays.toString(this.A01);
        C14360o3.A07(arrays2);
        return AnonymousClass001.A0v("FontScaleConverter{fromSpValues=", arrays, ", toDpValues=", arrays2, '}');
    }

    public C58D(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length) {
            this.A00 = fArr;
            this.A01 = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero");
    }
}
