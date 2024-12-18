package X;

/* renamed from: X.CVk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27987CVk {
    public final String A00;
    public final InterfaceC16620sF A01;
    public final InterfaceC16610sE A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27987CVk) {
                C27987CVk c27987CVk = (C27987CVk) obj;
                if (!C14360o3.A0K(this.A00, c27987CVk.A00) || !C14360o3.A0K(this.A01, c27987CVk.A01) || !C14360o3.A0K(this.A02, c27987CVk.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A00)));
    }

    public C27987CVk(String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE) {
        this.A00 = str;
        this.A01 = interfaceC16620sF;
        this.A02 = interfaceC16610sE;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ScreenDefinition(name=");
        A1C.append(this.A00);
        A1C.append(", dataSource=");
        A1C.append(this.A01);
        A1C.append(", content=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
