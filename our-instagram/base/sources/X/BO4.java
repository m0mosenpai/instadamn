package X;

/* loaded from: classes5.dex */
public final class BO4 extends C0T6 implements InterfaceC30883Dhw {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final boolean A02;
    public final int A03;
    public final EnumC129395t1 A04;

    public BO4(C120985dq c120985dq, EnumC129395t1 enumC129395t1, C37644Ghd c37644Ghd, int i, boolean z) {
        C14360o3.A0B(enumC129395t1, 3);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A04 = enumC129395t1;
        this.A03 = i;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BO4) {
                BO4 bo4 = (BO4) obj;
                if (!C14360o3.A0K(this.A00, bo4.A00) || !C14360o3.A0K(this.A01, bo4.A01) || this.A04 != bo4.A04 || this.A03 != bo4.A03 || this.A02 != bo4.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00))) + this.A03) * 31);
    }
}
