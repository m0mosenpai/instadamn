package X;

import java.util.List;

/* renamed from: X.9ZQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZQ extends C0T6 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9ZQ) && C14360o3.A0K(this.A00, ((C9ZQ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C9ZQ(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SparkleMetadata(pointPositionsAndAlphasList=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
