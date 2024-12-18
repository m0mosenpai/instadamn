package X;

/* renamed from: X.NHu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52424NHu extends O29 {
    public final InterfaceC115505Kk A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52424NHu(InterfaceC115505Kk interfaceC115505Kk, boolean z, boolean z2) {
        super(C05F.A0N);
        C14360o3.A0B(interfaceC115505Kk, 1);
        this.A00 = interfaceC115505Kk;
        this.A02 = z;
        this.A01 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52424NHu) {
                C52424NHu c52424NHu = (C52424NHu) obj;
                if (!C14360o3.A0K(this.A00, c52424NHu.A00) || this.A02 != c52424NHu.A02 || this.A01 != c52424NHu.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)));
    }
}
