package X;

/* renamed from: X.6Ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136856Ho extends C0T6 {
    public final float A00;
    public final int A01;
    public final InterfaceC1333460b A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136856Ho) {
                C136856Ho c136856Ho = (C136856Ho) obj;
                if (this.A01 != c136856Ho.A01 || Float.compare(this.A00, c136856Ho.A00) != 0 || !C14360o3.A0K(this.A02, c136856Ho.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A02.hashCode();
    }

    public C136856Ho(InterfaceC1333460b interfaceC1333460b, float f, int i) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = interfaceC1333460b;
    }
}
