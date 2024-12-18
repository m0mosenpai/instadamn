package X;

/* loaded from: classes5.dex */
public final class C3W extends AbstractC27455C9x {
    public final CWM A00;

    public C3W(CWM cwm) {
        C14360o3.A0B(cwm, 1);
        this.A00 = cwm;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3W) && C14360o3.A0K(this.A00, ((C3W) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Edit(selectedImage=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
