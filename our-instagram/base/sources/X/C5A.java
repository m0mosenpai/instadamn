package X;

/* loaded from: classes5.dex */
public final class C5A extends CA7 {
    public final C38321qM A00;

    public C5A(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5A) && C14360o3.A0K(this.A00, ((C5A) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaItem(media=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
