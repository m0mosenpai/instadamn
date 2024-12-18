package X;

/* renamed from: X.Duc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31610Duc extends C4F4 {
    public final InterfaceC37124GXj A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31610Duc) {
                C31610Duc c31610Duc = (C31610Duc) obj;
                if (this.A01 != c31610Duc.A01 || !C14360o3.A0K(this.A00, c31610Duc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    public C31610Duc(InterfaceC37124GXj interfaceC37124GXj, boolean z) {
        this.A01 = z;
        this.A00 = interfaceC37124GXj;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return true;
    }
}
