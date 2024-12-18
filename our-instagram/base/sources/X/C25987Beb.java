package X;

/* renamed from: X.Beb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25987Beb extends C0T6 {
    public final int A00;
    public final InterfaceC1333460b A01;
    public final boolean A02;
    public final boolean A03 = true;

    public C25987Beb(InterfaceC1333460b interfaceC1333460b, int i, boolean z) {
        this.A00 = i;
        this.A01 = interfaceC1333460b;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25987Beb) {
                C25987Beb c25987Beb = (C25987Beb) obj;
                if (this.A00 != c25987Beb.A00 || !C14360o3.A0K(this.A01, c25987Beb.A01) || this.A03 != c25987Beb.A03 || this.A02 != c25987Beb.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A01, this.A00 * 31)));
    }
}
