package X;

import android.graphics.PathEffect;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class L9D {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public PathEffect A08;
    public float[] A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.litho.drawable.BorderColorDrawable.State");
                L9D l9d = (L9D) obj;
                if (this.A01 != l9d.A01 || this.A03 != l9d.A03 || this.A02 != l9d.A02 || this.A00 != l9d.A00 || this.A05 != l9d.A05 || this.A07 != l9d.A07 || this.A06 != l9d.A06 || this.A04 != l9d.A04 || !C14360o3.A0K(this.A08, l9d.A08) || Arrays.equals(this.A09, l9d.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A06 = ((((((((((((((((((int) this.A01) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A00)) * 31) + this.A05) * 31) + this.A07) * 31) + this.A06) * 31) + this.A04) * 31) + AbstractC25235BEs.A06(this.A08)) * 31;
        float[] fArr = this.A09;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return A06 + i;
    }
}
