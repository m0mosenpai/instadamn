package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H6P extends C0T6 implements InterfaceC43562JLw {
    public final C38321qM A00;
    public final Long A01;
    public final String A02;
    public final List A03;

    @Override // X.InterfaceC43562JLw
    public final H6P F2c(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6P) {
                H6P h6p = (H6P) obj;
                if (!C14360o3.A0K(this.A01, h6p.A01) || !C14360o3.A0K(this.A00, h6p.A00) || !C14360o3.A0K(this.A03, h6p.A03) || !C14360o3.A0K(this.A02, h6p.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43562JLw
    public final Long Avp() {
        return this.A01;
    }

    @Override // X.InterfaceC43562JLw
    public final C38321qM Bhs() {
        return this.A00;
    }

    @Override // X.InterfaceC43562JLw
    public final List BjA() {
        return this.A03;
    }

    @Override // X.InterfaceC43562JLw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSuperlativeUserData", AbstractC40363Hv9.A00(this));
    }

    @Override // X.InterfaceC43562JLw
    public final String getUsername() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public H6P(C38321qM c38321qM, Long l, String str, List list) {
        this.A01 = l;
        this.A00 = c38321qM;
        this.A03 = list;
        this.A02 = str;
    }

    @Override // X.InterfaceC43562JLw
    public final InterfaceC43562JLw EAy(C1DY c1dy) {
        return this;
    }
}
