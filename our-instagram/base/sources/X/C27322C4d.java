package X;

import java.util.List;

/* renamed from: X.C4d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27322C4d extends CA2 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27322C4d) && C14360o3.A0K(this.A00, ((C27322C4d) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C27322C4d(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AbstractC43591JPw.A00(121));
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
