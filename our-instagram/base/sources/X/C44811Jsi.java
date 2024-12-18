package X;

import java.util.List;

/* renamed from: X.Jsi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44811Jsi extends AbstractC72460Xe6 {
    public final List A00;
    public final String A01 = "Colors";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44811Jsi) {
                C44811Jsi c44811Jsi = (C44811Jsi) obj;
                if (!C14360o3.A0K(this.A01, c44811Jsi.A01) || !C14360o3.A0K(this.A00, c44811Jsi.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C44811Jsi(List list) {
        this.A00 = list;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputColors(type=");
        A1C.append(this.A01);
        A1C.append(", colors=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
