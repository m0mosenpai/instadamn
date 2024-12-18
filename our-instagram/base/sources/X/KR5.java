package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class KR5 extends AbstractC46437Kgx {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KR5) && C14360o3.A0K(this.A00, ((KR5) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KR5(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Faceswarm(urls=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
