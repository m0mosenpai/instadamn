package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class Q0E {
    public final String A00;
    public final Map A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q0E) {
                Q0E q0e = (Q0E) obj;
                if (!C14360o3.A0K(this.A01, q0e.A01) || !C14360o3.A0K(this.A02, q0e.A02) || !C14360o3.A0K(this.A00, q0e.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public Q0E(Map map, String str, String str2) {
        this.A01 = map;
        this.A02 = str;
        this.A00 = str2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BloksComponentQueryParseResult(components=");
        A1C.append(this.A01);
        A1C.append(", generatedBundleId=");
        A1C.append(this.A02);
        A1C.append(", clientBundleId=");
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }
}
