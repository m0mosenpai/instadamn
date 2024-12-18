package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CV8 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CV8) && C14360o3.A0K(this.A00, ((CV8) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public CV8(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PressedStateStyleValues(pressedStateAnimations=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
