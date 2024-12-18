package X;

import java.util.List;

/* loaded from: classes12.dex */
public final class XQX extends AbstractC72459Xe5 {
    public final List A00;

    public XQX(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof XQX) && C14360o3.A0K(this.A00, ((XQX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiInputPointFs(listPointFs=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
