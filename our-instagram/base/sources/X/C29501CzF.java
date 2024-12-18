package X;

/* renamed from: X.CzF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29501CzF implements InterfaceC30844DhJ {
    public final InterfaceC30842DhH A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29501CzF) && C14360o3.A0K(this.A00, ((C29501CzF) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C29501CzF(InterfaceC30842DhH interfaceC30842DhH) {
        this.A00 = interfaceC30842DhH;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LiveCapture(liveCaptureState=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
