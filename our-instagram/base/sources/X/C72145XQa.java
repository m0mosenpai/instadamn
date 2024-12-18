package X;

/* renamed from: X.XQa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72145XQa extends AbstractC72460Xe6 {
    public final Float A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72145XQa) {
                C72145XQa c72145XQa = (C72145XQa) obj;
                if (!C14360o3.A0K(this.A01, c72145XQa.A01) || !C14360o3.A0K(this.A00, c72145XQa.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C72145XQa(String str, Float f) {
        this.A01 = str;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputFloatValue(type=");
        A1C.append(this.A01);
        A1C.append(", floatValue=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
