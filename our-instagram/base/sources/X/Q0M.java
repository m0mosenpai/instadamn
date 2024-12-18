package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class Q0M {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Q0M) && C14360o3.A0K(this.A00, ((Q0M) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public Q0M(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BloksComponentQueryNetworkParseResponse(results=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
