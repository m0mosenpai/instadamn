package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.H5w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38782H5w extends C0T6 implements InterfaceC43561JLv {
    public final User A00;
    public final Integer A01;
    public final Integer A02;

    @Override // X.InterfaceC43561JLv
    public final C38782H5w F1V(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC43561JLv
    public final C38782H5w F1W(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38782H5w) {
                C38782H5w c38782H5w = (C38782H5w) obj;
                if (!C14360o3.A0K(this.A01, c38782H5w.A01) || !C14360o3.A0K(this.A02, c38782H5w.A02) || !C14360o3.A0K(this.A00, c38782H5w.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43561JLv
    public final Integer Ac5() {
        return this.A01;
    }

    @Override // X.InterfaceC43561JLv
    public final Integer CBD() {
        return this.A02;
    }

    @Override // X.InterfaceC43561JLv
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC43561JLv
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryQuizParticipantDict", AbstractC40313HuI.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38782H5w(User user, Integer num, Integer num2) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = user;
    }

    @Override // X.InterfaceC43561JLv
    public final InterfaceC43561JLv EAc(C1DY c1dy) {
        return this;
    }
}
