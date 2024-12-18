package X;

import java.util.List;

/* renamed from: X.XQd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72148XQd extends AbstractC72460Xe6 {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72148XQd) {
                C72148XQd c72148XQd = (C72148XQd) obj;
                if (!C14360o3.A0K(this.A00, c72148XQd.A00) || !C14360o3.A0K(this.A01, c72148XQd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    public C72148XQd(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputPoints(type=");
        A1C.append(this.A00);
        A1C.append(", points=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
