package X;

/* renamed from: X.Lx2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49671Lx2 implements InterfaceC41211vV {
    public int A00;
    public C45093JxN A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C49671Lx2)) {
            return false;
        }
        C49671Lx2 c49671Lx2 = (C49671Lx2) obj;
        if (c49671Lx2.A00 != this.A00 || !C14360o3.A0K(c49671Lx2.A01.A01(), this.A01.A01())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return JQ0.A01(this.A01.A01().hashCode()) + this.A00;
    }
}
