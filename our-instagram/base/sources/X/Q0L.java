package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class Q0L {
    public final Q0E A00;
    public final C64517THk A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q0L) {
                Q0L q0l = (Q0L) obj;
                if (!C14360o3.A0K(this.A00, q0l.A00) || !C14360o3.A0K(this.A02, q0l.A02) || !C14360o3.A0K(this.A04, q0l.A04) || !C14360o3.A0K(this.A03, q0l.A03) || !C14360o3.A0K(this.A01, q0l.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00)))) + AbstractC167017dG.A0M(this.A01);
    }

    public Q0L(Q0E q0e, C64517THk c64517THk, String str, String str2, Map map) {
        this.A00 = q0e;
        this.A02 = str;
        this.A04 = map;
        this.A03 = str2;
        this.A01 = c64517THk;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BloksBatchedComponentQueryParseResult(componentParseResult=");
        A1C.append(this.A00);
        A1C.append(", appId=");
        A1C.append(this.A02);
        A1C.append(", consumedParams=");
        A1C.append(this.A04);
        A1C.append(", rawComponentPayload=");
        A1C.append(this.A03);
        A1C.append(", resources=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
