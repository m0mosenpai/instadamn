package X;

/* renamed from: X.Bi0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26175Bi0 extends C0T6 implements InterfaceC30937Dir {
    public final C5C8 A00;
    public final InterfaceC16660sJ A01;

    public C26175Bi0(C5C8 c5c8, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c5c8, 1);
        this.A00 = c5c8;
        this.A01 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26175Bi0) {
                C26175Bi0 c26175Bi0 = (C26175Bi0) obj;
                if (!C14360o3.A0K(this.A00, c26175Bi0.A00) || !C14360o3.A0K(this.A01, c26175Bi0.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    @Override // X.InterfaceC30937Dir
    public final /* bridge */ /* synthetic */ CharSequence BgQ() {
        return this.A00;
    }
}
