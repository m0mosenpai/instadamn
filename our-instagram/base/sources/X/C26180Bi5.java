package X;

/* renamed from: X.Bi5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26180Bi5 extends C0T6 implements InterfaceC30802Dgd {
    public final float A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26180Bi5) {
                C26180Bi5 c26180Bi5 = (C26180Bi5) obj;
                if (this.A01 != c26180Bi5.A01 || !C119145aW.A01(this.A00, c26180Bi5.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(this.A01 * 31, this.A00);
    }

    public C26180Bi5(float f, int i) {
        this.A01 = i;
        this.A00 = f;
    }
}
