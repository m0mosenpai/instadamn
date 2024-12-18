package X;

/* loaded from: classes6.dex */
public final class E97 extends C0T6 implements InterfaceC37091GWa {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E97) {
                E97 e97 = (E97) obj;
                if (this.A02 != e97.A02 || this.A03 != e97.A03 || !C14360o3.A0K(this.A01, e97.A01) || this.A00 != e97.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A02))) + F2U.A00(this.A00);
    }

    public E97(Integer num, String str, boolean z, boolean z2) {
        this.A02 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A00 = num;
    }

    public E97() {
        this(C05F.A01, "", false, false);
    }
}
