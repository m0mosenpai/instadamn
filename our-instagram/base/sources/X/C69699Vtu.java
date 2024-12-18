package X;

/* renamed from: X.Vtu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69699Vtu {
    public float A00;
    public float A01;
    public int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69699Vtu c69699Vtu = (C69699Vtu) obj;
            if (Float.compare(this.A00, c69699Vtu.A00) != 0 || Float.compare(this.A01, c69699Vtu.A01) != 0 || this.A02 != c69699Vtu.A02) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(Float.floatToIntBits(this.A00) * 31 * 31, this.A01) + this.A02;
    }
}
