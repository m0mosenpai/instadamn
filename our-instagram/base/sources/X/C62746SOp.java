package X;

/* renamed from: X.SOp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62746SOp {
    public Class A00;
    public Class A01;
    public Class A02;

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C62746SOp c62746SOp = (C62746SOp) obj;
                if (this.A00.equals(c62746SOp.A00) && this.A01.equals(c62746SOp.A01)) {
                    Class cls = this.A02;
                    Class cls2 = c62746SOp.A02;
                    if (cls == null) {
                        equals = AbstractC25229BEm.A1Z(cls2);
                    } else {
                        equals = cls.equals(cls2);
                    }
                    if (!equals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC25235BEs.A06(this.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MultiClassKey{first=");
        A1C.append(this.A00);
        A1C.append(AbstractC43591JPw.A00(102));
        return AbstractC58320PtC.A11(this.A01, A1C);
    }
}
