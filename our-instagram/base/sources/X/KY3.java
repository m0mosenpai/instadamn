package X;

/* loaded from: classes8.dex */
public final class KY3 extends AbstractC47451Kxg {
    public final EnumC46192KcU A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KY3) {
                KY3 ky3 = (KY3) obj;
                if (!C14360o3.A0K(this.A01, ky3.A01) || this.A00 != ky3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)) + 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KY3(EnumC46192KcU enumC46192KcU, String str) {
        super(C05F.A0C);
        AbstractC167017dG.A1P(str, enumC46192KcU);
        this.A01 = str;
        this.A00 = enumC46192KcU;
    }
}
