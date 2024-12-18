package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.H7x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38826H7x extends C0T6 implements InterfaceC43550JLk {
    public final User A00;
    public final Float A01;
    public final Integer A02;

    @Override // X.InterfaceC43550JLk
    public final C38826H7x F76(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38826H7x) {
                C38826H7x c38826H7x = (C38826H7x) obj;
                if (!C14360o3.A0K(this.A02, c38826H7x.A02) || !C14360o3.A0K(this.A00, c38826H7x.A00) || !C14360o3.A0K(this.A01, c38826H7x.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43550JLk
    public final Integer CBD() {
        return this.A02;
    }

    @Override // X.InterfaceC43550JLk
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC43550JLk
    public final Float CH3() {
        return this.A01;
    }

    @Override // X.InterfaceC43550JLk
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStorySliderVoterObject", AbstractC40772I5a.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38826H7x(User user, Float f, Integer num) {
        this.A02 = num;
        this.A00 = user;
        this.A01 = f;
    }

    @Override // X.InterfaceC43550JLk
    public final InterfaceC43550JLk ECA(C1DY c1dy) {
        return this;
    }
}
