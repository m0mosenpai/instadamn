package X;

/* renamed from: X.BfL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26032BfL extends C0T6 {
    public final float A00;
    public final float A01;
    public static final C26032BfL A02 = new C26032BfL(32.0f, 16.0f);
    public static final C26032BfL A04 = new C26032BfL(26.0f, 12.0f);
    public static final C26032BfL A03 = new C26032BfL(14.0f, 8.0f);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26032BfL) {
                C26032BfL c26032BfL = (C26032BfL) obj;
                if (!C119145aW.A01(this.A01, c26032BfL.A01) || !C119145aW.A01(this.A00, c26032BfL.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC25235BEs.A02(this.A01), this.A00);
    }

    public C26032BfL(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
