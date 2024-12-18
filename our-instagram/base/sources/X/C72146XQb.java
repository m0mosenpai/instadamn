package X;

import java.util.List;

/* renamed from: X.XQb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72146XQb extends AbstractC72460Xe6 {
    public final List A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72146XQb) {
                C72146XQb c72146XQb = (C72146XQb) obj;
                if (!C14360o3.A0K(this.A01, c72146XQb.A01) || !C14360o3.A0K(this.A00, c72146XQb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C72146XQb(String str, List list) {
        this.A01 = str;
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputListPointFs(type=");
        A1C.append(this.A01);
        A1C.append(", listPointFs=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
