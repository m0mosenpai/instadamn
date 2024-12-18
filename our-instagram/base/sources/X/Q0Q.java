package X;

/* loaded from: classes10.dex */
public final class Q0Q extends Q09 {
    public final C64517THk A00;
    public final Q03 A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q0Q) {
                Q0Q q0q = (Q0Q) obj;
                if (!C14360o3.A0K(this.A02, q0q.A02) || !C14360o3.A0K(this.A00, q0q.A00) || !C14360o3.A0K(this.A01, q0q.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0Q(Q03 q03, C64517THk c64517THk, String str) {
        super(q03, str);
        AbstractC167017dG.A1Q(str, q03);
        this.A02 = str;
        this.A00 = c64517THk;
        this.A01 = q03;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Resource(key=");
        A1C.append(this.A02);
        A1C.append(", resources=");
        A1C.append(this.A00);
        A1C.append(", summary=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
