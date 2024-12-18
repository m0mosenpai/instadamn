package X;

/* loaded from: classes5.dex */
public final class BL4 extends C0T6 implements InterfaceC30869Dhi {
    public final String A00;
    public final String A01;

    public BL4(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BL4) {
                BL4 bl4 = (BL4) obj;
                if (!C14360o3.A0K(this.A00, bl4.A00) || !C14360o3.A0K(this.A01, bl4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }
}
