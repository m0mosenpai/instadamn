package X;

import java.util.List;

/* loaded from: classes12.dex */
public final class XQW extends AbstractC72459Xe5 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof XQW) && C14360o3.A0K(this.A00, ((XQW) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public XQW(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiInputListPointFs(listPointFs=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}