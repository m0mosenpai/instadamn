package X;

/* loaded from: classes8.dex */
public final class KWj extends AbstractC46459KhJ {
    public final C47Z A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KWj) && C14360o3.A0K(this.A00, ((KWj) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KWj(C47Z c47z) {
        this.A00 = c47z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CameraMedia(pendingMedia=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
