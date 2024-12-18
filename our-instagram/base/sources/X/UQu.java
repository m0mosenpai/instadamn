package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UQu extends C0T6 implements InterfaceC99354d5 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.InterfaceC99354d5
    public final UQu EuC() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQu) {
                UQu uQu = (UQu) obj;
                if (this.A01 != uQu.A01 || this.A02 != uQu.A02 || this.A00 != uQu.A00 || this.A03 != uQu.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC99354d5
    public final boolean AkU() {
        return this.A01;
    }

    @Override // X.InterfaceC99354d5
    public final boolean Al4() {
        return this.A02;
    }

    @Override // X.InterfaceC99354d5
    public final int AsS() {
        return this.A00;
    }

    @Override // X.InterfaceC99354d5
    public final boolean Cag() {
        return this.A03;
    }

    @Override // X.InterfaceC99354d5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHushInfo", AbstractC46590KjT.A00(this));
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int A0D = (AbstractC167007dF.A0D(this.A02, i * 31) + this.A00) * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return A0D + i2;
    }

    public UQu(int i, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = i;
        this.A03 = z3;
    }
}
