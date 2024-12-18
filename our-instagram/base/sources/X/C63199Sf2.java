package X;

/* renamed from: X.Sf2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63199Sf2 {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63199Sf2) {
                C63199Sf2 c63199Sf2 = (C63199Sf2) obj;
                if (Float.compare(this.A00, c63199Sf2.A00) != 0 || Float.compare(this.A01, c63199Sf2.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A0U("CornerRadii(horizontal=", ", vertical=", ')', this.A00, this.A01);
    }

    public static C63199Sf2 A00(C63199Sf2 c63199Sf2) {
        return new C63199Sf2(WF1.A01(c63199Sf2.A00), WF1.A01(c63199Sf2.A01));
    }

    public C63199Sf2(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public C63199Sf2() {
        this(0.0f, 0.0f);
    }
}
