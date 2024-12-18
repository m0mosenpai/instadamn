package X;

/* loaded from: classes4.dex */
public final class ACV {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ACV) {
                ACV acv = (ACV) obj;
                if (!C14360o3.A0K(this.A00, acv.A00) || !C14360o3.A0K(this.A01, acv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Object obj = this.A00;
        if (obj instanceof Enum) {
            i = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = i * 31;
        Object obj2 = this.A01;
        if (obj2 instanceof Enum) {
            hashCode = ((Enum) obj2).ordinal();
        } else {
            hashCode = obj2.hashCode();
        }
        return i2 + hashCode;
    }

    public ACV(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("JoinedKey(left=");
        A1C.append(this.A00);
        A1C.append(", right=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
