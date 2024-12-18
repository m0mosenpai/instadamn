package X;

/* loaded from: classes5.dex */
public final class C4F extends CA0 {
    public final InterfaceC30843DhI A00;

    public C4F(InterfaceC30843DhI interfaceC30843DhI) {
        C14360o3.A0B(interfaceC30843DhI, 1);
        this.A00 = interfaceC30843DhI;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C4F) && C14360o3.A0K(this.A00, ((C4F) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LogOnboardingEvent(event=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
