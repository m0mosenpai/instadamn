package X;

import java.util.List;

/* renamed from: X.9bG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212479bG extends AbstractC203508z9 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C212479bG) && C14360o3.A0K(this.A00, ((C212479bG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C212479bG(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MlInputFloatArrays(floatArrays=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
