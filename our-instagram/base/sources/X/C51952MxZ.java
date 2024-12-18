package X;

/* renamed from: X.MxZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51952MxZ extends C0T6 implements InterfaceC57890Plu {
    public final int A00 = 2131961161;
    public final int A01 = 2131961165;
    public final int A02 = 2131954784;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51952MxZ) {
                C51952MxZ c51952MxZ = (C51952MxZ) obj;
                if (this.A00 != c51952MxZ.A00 || this.A01 != c51952MxZ.A01 || this.A02 != c51952MxZ.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }
}
