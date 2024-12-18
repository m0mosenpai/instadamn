package X;

/* renamed from: X.Vtr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69696Vtr {
    public android.net.Uri A00;
    public C1VO A01;
    public float[] A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C69696Vtr c69696Vtr = (C69696Vtr) obj;
            this.A02.getClass();
            c69696Vtr.A02.getClass();
            float[] fArr = c69696Vtr.A02;
            int length = fArr.length;
            float[] fArr2 = this.A02;
            int length2 = fArr2.length;
            if (length == length2) {
                for (int i = 0; i < length2; i++) {
                    if (Float.compare(fArr[i], fArr2[i]) == 0) {
                    }
                }
                return C2I7.A00(this.A00, c69696Vtr.A00);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        this.A02.getClass();
        int A06 = AbstractC25235BEs.A06(this.A00);
        int i2 = 0;
        while (true) {
            float[] fArr = this.A02;
            if (i2 < fArr.length) {
                int i3 = A06 * 31;
                float f = fArr[i2];
                if (f != 0.0f) {
                    i = Float.floatToIntBits(f);
                } else {
                    i = 0;
                }
                A06 = i3 + i;
                i2++;
            } else {
                return A06;
            }
        }
    }
}
