package X;

/* renamed from: X.6Uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139806Uj extends C0T6 {
    public final float A00;
    public final float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139806Uj) {
                C139806Uj c139806Uj = (C139806Uj) obj;
                if (!C14360o3.A0K(this.A04, c139806Uj.A04) || !C14360o3.A0K(this.A02, c139806Uj.A02) || !C14360o3.A0K(this.A03, c139806Uj.A03) || Float.compare(this.A00, c139806Uj.A00) != 0 || Float.compare(this.A01, c139806Uj.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A04;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.A02;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.A03;
        return ((((hashCode2 + (f3 != null ? f3.hashCode() : 0)) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01);
    }

    public C139806Uj(Float f, Float f2, Float f3, float f4, float f5) {
        this.A04 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
        this.A01 = f5;
    }
}
