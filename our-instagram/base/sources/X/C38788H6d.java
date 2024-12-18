package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H6d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38788H6d extends C0T6 implements InterfaceC43517JKd {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC43517JKd
    public final C38788H6d F2u() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38788H6d) {
                C38788H6d c38788H6d = (C38788H6d) obj;
                if (!C14360o3.A0K(this.A00, c38788H6d.A00) || !C14360o3.A0K(this.A01, c38788H6d.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43517JKd
    public final String Ayb() {
        return this.A00;
    }

    @Override // X.InterfaceC43517JKd
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextAppLinkTextFragment", AbstractC40390Hvd.A00(this));
    }

    @Override // X.InterfaceC43517JKd
    public final String getUri() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C38788H6d(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
