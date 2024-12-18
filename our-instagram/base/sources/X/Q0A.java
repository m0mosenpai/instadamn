package X;

/* loaded from: classes10.dex */
public final class Q0A extends Q09 {
    public final Q0E A00;
    public final Q03 A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q0A) {
                Q0A q0a = (Q0A) obj;
                if (!C14360o3.A0K(this.A02, q0a.A02) || !C14360o3.A0K(this.A00, q0a.A00) || !C14360o3.A0K(this.A01, q0a.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0A(Q0E q0e, Q03 q03, String str) {
        super(q03, str);
        AbstractC167017dG.A1Q(str, q03);
        this.A02 = str;
        this.A00 = q0e;
        this.A01 = q03;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ParseResult(key=");
        A1C.append(this.A02);
        A1C.append(", result=");
        A1C.append(this.A00);
        A1C.append(", summary=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
