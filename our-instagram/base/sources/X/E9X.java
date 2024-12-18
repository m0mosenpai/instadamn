package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes6.dex */
public final class E9X extends C0T6 implements InterfaceC37276GbT {
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public E9X(List list, boolean z, String str, String str2) {
        AbstractC167007dF.A1F(str2, 3, list);
        this.A00 = str;
        this.A03 = z;
        this.A01 = str2;
        this.A02 = list;
    }

    @Override // X.InterfaceC37276GbT
    public final E9X F6x(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC37276GbT
    public final E9X F6y(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9X) {
                E9X e9x = (E9X) obj;
                if (!C14360o3.A0K(this.A00, e9x.A00) || this.A03 != e9x.A03 || !C14360o3.A0K(this.A01, e9x.A01) || !C14360o3.A0K(this.A02, e9x.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37276GbT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryPollVoterInfo", AbstractC34285FAf.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC167017dG.A0O(this.A00) * 31)));
    }

    @Override // X.InterfaceC37276GbT
    public final String BPp() {
        return this.A00;
    }

    @Override // X.InterfaceC37276GbT
    public final boolean BUt() {
        return this.A03;
    }

    @Override // X.InterfaceC37276GbT
    public final List CH6() {
        return this.A02;
    }

    @Override // X.InterfaceC37276GbT
    public final String getPollId() {
        return this.A01;
    }

    @Override // X.InterfaceC37276GbT
    public final InterfaceC37276GbT EC6(C1DY c1dy) {
        return this;
    }
}
