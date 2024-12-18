package X;

/* loaded from: classes10.dex */
public final class SOZ {
    public double A00 = 0.0d;
    public double A01 = 0.0d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SOZ) {
                SOZ soz = (SOZ) obj;
                if (Double.compare(this.A00, soz.A00) != 0 || Double.compare(this.A01, soz.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC25228BEl.A03(Double.doubleToLongBits(this.A00)) * 31) + AbstractC25228BEl.A03(Double.doubleToLongBits(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PhysicsState(position=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(1465));
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
