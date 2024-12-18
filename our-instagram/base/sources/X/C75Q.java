package X;

/* renamed from: X.75Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75Q extends C0T6 implements InterfaceC41211vV {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C75Q) {
                C75Q c75q = (C75Q) obj;
                if (this.A01 != c75q.A01 || this.A00 != c75q.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C75Q(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
