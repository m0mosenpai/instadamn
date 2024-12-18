package X;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Ba3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25764Ba3 extends C62Y {
    public final float A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25764Ba3) {
                C25764Ba3 c25764Ba3 = (C25764Ba3) obj;
                if (!C14360o3.A0K(this.A01, c25764Ba3.A01) || this.A00 != c25764Ba3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C62Y
    public final Shader A01(long j) {
        long A01 = C5YB.A01(j);
        float A012 = C119365at.A01(A01);
        float A02 = C119365at.A02(A01);
        List list = this.A01;
        long A00 = AbstractC119395aw.A00(A012, A02);
        float f = this.A00;
        if (f == Float.POSITIVE_INFINITY) {
            f = C5YC.A01(j) / 2.0f;
        }
        AbstractC25292BHl.A01(list, null);
        return new RadialGradient(C119365at.A01(A00), C119365at.A02(A00), f, AbstractC25292BHl.A02(list), (float[]) null, AbstractC25293BHm.A00(0));
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC25236BEt.A01(9205357640488583168L, AbstractC166987dD.A0G(this.A01) * 31), this.A00);
    }

    public final String toString() {
        String str = "";
        float f = this.A00;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            str = AnonymousClass001.A0Z("radius=", ", ", f);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RadialGradient(colors=");
        A1C.append(this.A01);
        AbstractC25235BEs.A1L(A1C, ", stops=");
        A1C.append(", ");
        A1C.append("");
        A1C.append(str);
        A1C.append("tileMode=");
        return AbstractC167017dG.A0o("Clamp", A1C);
    }

    public C25764Ba3(List list, float f) {
        this.A01 = list;
        this.A00 = f;
    }
}
