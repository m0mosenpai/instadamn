package X;

/* renamed from: X.KIu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45657KIu extends C4F4 {
    public final C43955Jc4 A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45657KIu) {
                C45657KIu c45657KIu = (C45657KIu) obj;
                if (this.A01 != c45657KIu.A01 || !C14360o3.A0K(this.A00, c45657KIu.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45657KIu c45657KIu = (C45657KIu) obj;
        C14360o3.A0B(c45657KIu, 0);
        return AbstractC167007dF.A1P(this.A01 ? 1 : 0, c45657KIu.A01 ? 1 : 0);
    }

    public C45657KIu(C43955Jc4 c43955Jc4, boolean z) {
        this.A01 = z;
        this.A00 = c43955Jc4;
    }
}
