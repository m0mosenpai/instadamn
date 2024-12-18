package X;

/* loaded from: classes11.dex */
public final class U6Z {
    public final int A00;
    public final int A01;
    public final C2W5 A02;
    public final C102884kP A03;

    public U6Z(C2W5 c2w5, C102884kP c102884kP, int i, int i2) {
        C14360o3.A0B(c2w5, 2);
        this.A03 = c102884kP;
        this.A02 = c2w5;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof U6Z) {
                U6Z u6z = (U6Z) obj;
                if (!C14360o3.A0K(this.A03, u6z.A03) || !C14360o3.A0K(this.A02, u6z.A02) || this.A01 != u6z.A01 || this.A00 != u6z.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A02, this.A03.hashCode() * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalLayoutResult(model=");
        sb.append(this.A03);
        sb.append(AbstractC111324zv.A00(1429));
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(1468));
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(1419));
        return AbstractC25236BEt.A0Z(sb, this.A00);
    }
}
