package X;

/* renamed from: X.C3z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27318C3z extends AbstractC27456C9y {
    public final InterfaceC30845DhK A00;

    public C27318C3z(InterfaceC30845DhK interfaceC30845DhK) {
        C14360o3.A0B(interfaceC30845DhK, 1);
        this.A00 = interfaceC30845DhK;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27318C3z) && C14360o3.A0K(this.A00, ((C27318C3z) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SuggestionScreen(imagineSuggestionResponse=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
