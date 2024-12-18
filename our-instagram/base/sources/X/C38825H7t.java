package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H7t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38825H7t extends C0T6 implements InterfaceC43549JLj {
    public final Boolean A00;
    public final String A01;
    public final List A02;

    @Override // X.InterfaceC43549JLj
    public final C38825H7t F6r(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38825H7t) {
                C38825H7t c38825H7t = (C38825H7t) obj;
                if (!C14360o3.A0K(this.A02, c38825H7t.A02) || !C14360o3.A0K(this.A01, c38825H7t.A01) || !C14360o3.A0K(this.A00, c38825H7t.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43549JLj
    public final List Ayw() {
        return this.A02;
    }

    @Override // X.InterfaceC43549JLj
    public final String BPp() {
        return this.A01;
    }

    @Override // X.InterfaceC43549JLj
    public final Boolean BUs() {
        return this.A00;
    }

    @Override // X.InterfaceC43549JLj
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryFundraiserDonations", I5F.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38825H7t(Boolean bool, String str, List list) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = bool;
    }

    @Override // X.InterfaceC43549JLj
    public final InterfaceC43549JLj EC2(C1DY c1dy) {
        return this;
    }
}
