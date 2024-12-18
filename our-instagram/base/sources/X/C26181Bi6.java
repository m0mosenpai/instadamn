package X;

/* renamed from: X.Bi6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26181Bi6 extends C0T6 implements InterfaceC30802Dgd {
    public final float A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26181Bi6) {
                C26181Bi6 c26181Bi6 = (C26181Bi6) obj;
                if (this.A01 != c26181Bi6.A01 || !C119145aW.A01(this.A00, c26181Bi6.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(this.A01 * 31, this.A00);
    }

    public C26181Bi6(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }
}
