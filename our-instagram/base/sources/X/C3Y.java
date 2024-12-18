package X;

/* loaded from: classes5.dex */
public final class C3Y extends AbstractC27455C9x {
    public final C27988CVl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3Y) && C14360o3.A0K(this.A00, ((C3Y) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C3Y(C27988CVl c27988CVl) {
        this.A00 = c27988CVl;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FlashSelect(selectedImage=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
