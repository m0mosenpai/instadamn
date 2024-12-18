package X;

/* renamed from: X.C4b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27320C4b extends CA1 {
    public final CWM A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27320C4b) && C14360o3.A0K(this.A00, ((C27320C4b) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C27320C4b(CWM cwm) {
        this.A00 = cwm;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Success(generatedImage=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
