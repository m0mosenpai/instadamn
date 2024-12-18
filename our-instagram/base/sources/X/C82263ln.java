package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82263ln extends C0T6 implements InterfaceC82273lo {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC82273lo
    public final C82263ln Eyd() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C82263ln) {
                C82263ln c82263ln = (C82263ln) obj;
                if (this.A00 != c82263ln.A00 || !C14360o3.A0K(this.A02, c82263ln.A02) || this.A01 != c82263ln.A01 || !C14360o3.A0K(this.A03, c82263ln.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        String str = this.A02;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.A01) * 31;
        String str2 = this.A03;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC82273lo
    public final int B1r() {
        return this.A00;
    }

    @Override // X.InterfaceC82273lo
    public final int BzY() {
        return this.A01;
    }

    @Override // X.InterfaceC82273lo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfileContextLink", AbstractC31220Do3.A00(this));
    }

    @Override // X.InterfaceC82273lo
    public final String getId() {
        return this.A02;
    }

    @Override // X.InterfaceC82273lo
    public final String getUsername() {
        return this.A03;
    }

    public C82263ln(int i, String str, int i2, String str2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
        this.A03 = str2;
    }
}
