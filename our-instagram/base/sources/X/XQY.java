package X;

import android.graphics.Rect;

/* loaded from: classes12.dex */
public final class XQY extends AbstractC72459Xe5 {
    public final Rect A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof XQY) && C14360o3.A0K(this.A00, ((XQY) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public XQY(Rect rect) {
        this.A00 = rect;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiInputRect(rect=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
