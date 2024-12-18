package X;

import java.util.Arrays;

/* renamed from: X.Jsl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44814Jsl extends AbstractC72460Xe6 {
    public final float[] A00;
    public final float[] A01;
    public final float[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44814Jsl) {
                C44814Jsl c44814Jsl = (C44814Jsl) obj;
                if (!C14360o3.A0K(this.A01, c44814Jsl.A01) || !C14360o3.A0K(this.A02, c44814Jsl.A02) || !C14360o3.A0K(this.A00, c44814Jsl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        float[] fArr = this.A01;
        int hashCode = (fArr == null ? 0 : Arrays.hashCode(fArr)) * 31;
        float[] fArr2 = this.A02;
        int hashCode2 = (hashCode + (fArr2 == null ? 0 : Arrays.hashCode(fArr2))) * 31;
        float[] fArr3 = this.A00;
        return hashCode2 + (fArr3 != null ? Arrays.hashCode(fArr3) : 0);
    }

    public final String toString() {
        return AnonymousClass001.A14("RetinaFaceOutputModel(headBBox=", Arrays.toString(this.A01), ", rotationMatrix=", Arrays.toString(this.A02), ", eulerAngles=", Arrays.toString(this.A00), ')');
    }

    public C44814Jsl(float[] fArr, float[] fArr2, float[] fArr3) {
        this.A01 = fArr;
        this.A02 = fArr2;
        this.A00 = fArr3;
    }

    public C44814Jsl() {
        this(null, null, null);
    }
}
