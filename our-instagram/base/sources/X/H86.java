package X;

/* loaded from: classes7.dex */
public final class H86 extends C0T6 implements InterfaceC43391JFg {
    public final int A00;
    public final long A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H86) {
                H86 h86 = (H86) obj;
                if (this.A01 != h86.A01 || this.A02 != h86.A02 || this.A00 != h86.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC25235BEs.A03(this.A01)) + this.A00;
    }

    public H86(long j, int i, boolean z) {
        this.A01 = j;
        this.A02 = z;
        this.A00 = i;
    }
}
