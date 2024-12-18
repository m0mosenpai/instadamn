package X;

/* renamed from: X.Cd0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28255Cd0 {
    public final C5Hc A00;

    public C28255Cd0(C5Hc c5Hc) {
        C14360o3.A0B(c5Hc, 1);
        this.A00 = c5Hc;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28255Cd0) && C14360o3.A0K(this.A00, ((C28255Cd0) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineMEmuResponse(extendedCaptureImages=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C28255Cd0() {
        this(AbstractC133095zb.A00(C16930sl.A00));
    }
}
