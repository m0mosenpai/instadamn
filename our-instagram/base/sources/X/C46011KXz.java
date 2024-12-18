package X;

/* renamed from: X.KXz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46011KXz extends AbstractC47450Kxf {
    public final C38687GzS A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46011KXz(C38687GzS c38687GzS, String str) {
        super(C05F.A0Y);
        C14360o3.A0B(c38687GzS, 1);
        this.A00 = c38687GzS;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46011KXz) {
                C46011KXz c46011KXz = (C46011KXz) obj;
                if (!C14360o3.A0K(this.A00, c46011KXz.A00) || !C14360o3.A0K(this.A01, c46011KXz.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
