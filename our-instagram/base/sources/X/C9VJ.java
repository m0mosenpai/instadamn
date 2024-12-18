package X;

import java.util.List;

/* renamed from: X.9VJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VJ extends AbstractC223599u2 {
    public final List A00;

    public C9VJ(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9VJ) && C14360o3.A0K(this.A00, ((C9VJ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Success(aiOutputs=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
