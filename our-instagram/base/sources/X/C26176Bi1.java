package X;

/* renamed from: X.Bi1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26176Bi1 extends C0T6 implements InterfaceC30937Dir {
    public final C5C8 A00;
    public final String A01;
    public final InterfaceC16660sJ A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26176Bi1) {
                C26176Bi1 c26176Bi1 = (C26176Bi1) obj;
                if (!C14360o3.A0K(this.A01, c26176Bi1.A01) || !C14360o3.A0K(this.A00, c26176Bi1.A00) || !C14360o3.A0K(this.A02, c26176Bi1.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public C26176Bi1(C5C8 c5c8, String str, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1Q(str, interfaceC16660sJ);
        this.A01 = str;
        this.A00 = c5c8;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC30937Dir
    public final /* bridge */ /* synthetic */ CharSequence BgQ() {
        return this.A01;
    }
}
