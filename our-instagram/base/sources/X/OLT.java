package X;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class OLT {
    public final Integer A00;
    public final float[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLT) {
                OLT olt = (OLT) obj;
                if (this.A00 != olt.A00 || !C14360o3.A0K(this.A01, olt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return (AbstractC25230BEn.A0C(num, AbstractC53655No0.A00(num)) * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A0v("UploadEditInputPoint(type=", AbstractC53655No0.A00(this.A00), ", coordinates=", Arrays.toString(this.A01), ')');
    }

    public OLT(Integer num, float[] fArr) {
        this.A00 = num;
        this.A01 = fArr;
    }
}
