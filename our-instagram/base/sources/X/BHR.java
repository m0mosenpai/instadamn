package X;

/* loaded from: classes5.dex */
public final class BHR extends C0T6 implements InterfaceC31097Dlf {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHR) {
                BHR bhr = (BHR) obj;
                if (this.A00 != bhr.A00 || !C14360o3.A0K(this.A01, bhr.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC167017dG.A0M(this.A01);
    }

    public BHR(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
