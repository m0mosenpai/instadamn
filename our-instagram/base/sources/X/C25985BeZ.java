package X;

/* renamed from: X.BeZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25985BeZ extends C0T6 {
    public boolean A02 = false;
    public boolean A01 = false;
    public Boolean A00 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25985BeZ) {
                C25985BeZ c25985BeZ = (C25985BeZ) obj;
                if (this.A02 != c25985BeZ.A02 || this.A01 != c25985BeZ.A01 || !C14360o3.A0K(this.A00, c25985BeZ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A02, ((((int) (0 >>> 32)) * 31) + AbstractC53644Nnp.A00()) * 31)) + AbstractC167017dG.A0M(this.A00);
    }
}
