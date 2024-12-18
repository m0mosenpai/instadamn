package X;

import java.util.List;

/* renamed from: X.XQc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72147XQc extends AbstractC72460Xe6 {
    public final List A00;
    public final String A01 = "SELECTED_SAM_INPUT_POINTS";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72147XQc) {
                C72147XQc c72147XQc = (C72147XQc) obj;
                if (!C14360o3.A0K(this.A01, c72147XQc.A01) || !C14360o3.A0K(this.A00, c72147XQc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C72147XQc(List list) {
        this.A00 = list;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputPointFs(type=");
        A1C.append(this.A01);
        A1C.append(", pointFs=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
