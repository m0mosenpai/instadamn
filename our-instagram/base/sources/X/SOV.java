package X;

/* loaded from: classes10.dex */
public final class SOV {
    public final Class A00;
    public final String A01;

    public SOV(String str, Class cls) {
        C14360o3.A0B(cls, 2);
        this.A01 = str;
        this.A00 = cls;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SOV) {
                SOV sov = (SOV) obj;
                if (!C14360o3.A0K(this.A01, sov.A01) || !C14360o3.A0K(this.A00, sov.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FieldCacheKey(fieldName=");
        A1C.append(this.A01);
        A1C.append(", clazz=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
