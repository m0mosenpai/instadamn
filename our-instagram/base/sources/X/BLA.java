package X;

/* loaded from: classes5.dex */
public final class BLA extends C0T6 {
    public final int A00;
    public final C120985dq A01;
    public final EnumC129395t1 A02;
    public final String A03;
    public final boolean A04;

    public BLA(C120985dq c120985dq, EnumC129395t1 enumC129395t1, String str, int i, boolean z) {
        C14360o3.A0B(enumC129395t1, 2);
        this.A01 = c120985dq;
        this.A02 = enumC129395t1;
        this.A00 = i;
        this.A03 = str;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BLA) {
                BLA bla = (BLA) obj;
                if (!C14360o3.A0K(this.A01, bla.A01) || this.A02 != bla.A02 || this.A00 != bla.A00 || !C14360o3.A0K(this.A03, bla.A03) || this.A04 != bla.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A0K(this.A03, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)) + this.A00) * 31));
    }
}
