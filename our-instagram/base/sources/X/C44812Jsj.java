package X;

import java.util.Arrays;

/* renamed from: X.Jsj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44812Jsj extends AbstractC72460Xe6 {
    public final float[] A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44812Jsj) {
                C44812Jsj c44812Jsj = (C44812Jsj) obj;
                if (!C14360o3.A0K(this.A01, c44812Jsj.A01) || !C14360o3.A0K(this.A00, c44812Jsj.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("AiOutputFloatArray(type=", this.A01, ", floatArray=", Arrays.toString(this.A00), ')');
    }

    public final int hashCode() {
        int hashCode;
        int A0J = AbstractC166987dD.A0J(this.A01);
        float[] fArr = this.A00;
        if (fArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(fArr);
        }
        return A0J + hashCode;
    }

    public C44812Jsj(String str, float[] fArr) {
        this.A01 = str;
        this.A00 = fArr;
    }
}
