package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class V8Y extends C17T implements InterfaceC109924xK {
    public User A00;

    @Override // X.InterfaceC109924xK
    public final User AnG() {
        return this.A00;
    }

    @Override // X.InterfaceC109924xK
    public final XGE Aqa() {
        return (XGE) A05(1356895302, V9A.class);
    }

    @Override // X.InterfaceC109924xK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(VOK.A00(this), this);
    }

    @Override // X.InterfaceC109924xK
    public final Integer Ayx() {
        return getOptionalIntValueByHashCode(1893368433);
    }

    @Override // X.InterfaceC109924xK
    public final Integer Ayy() {
        return getOptionalIntValueByHashCode(-972106295);
    }

    @Override // X.InterfaceC109924xK
    public final String B87() {
        return A0i(-215071842);
    }

    @Override // X.InterfaceC109924xK
    public final String B88() {
        return A0i(-280656935);
    }

    @Override // X.InterfaceC109924xK
    public final String B89() {
        return A0i(1775691697);
    }

    @Override // X.InterfaceC109924xK
    public final String B8B() {
        return A0i(1666552046);
    }

    @Override // X.InterfaceC109924xK
    public final String B8C() {
        return A0i(-1108039828);
    }

    @Override // X.InterfaceC109924xK
    public final Long BNw() {
        return A0L(333985468);
    }

    @Override // X.InterfaceC109924xK
    public final Long BzW() {
        return A0L(-1985145259);
    }

    @Override // X.InterfaceC109924xK
    public final InterfaceC109924xK E96(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, 1954752018);
        return this;
    }

    @Override // X.InterfaceC109924xK
    public final C109914xJ Eti(C1DY c1dy) {
        User user;
        User A0J = AbstractC37303Gc4.A0J(c1dy, this, 1954752018);
        C66643URh c66643URh = null;
        if (A0J != null) {
            user = (User) c1dy.A00(A0J);
        } else {
            user = null;
        }
        XGE Aqa = Aqa();
        if (Aqa != null) {
            c66643URh = Aqa.F58();
        }
        return new C109914xJ(c66643URh, user, getOptionalIntValueByHashCode(1893368433), getOptionalIntValueByHashCode(-972106295), A0L(333985468), A0L(-1985145259), A0i(-1578468996), A0i(-215071842), A0i(-280656935), A0i(1775691697), A0i(1666552046), A0i(-1108039828), A0i(2123044865), A0i(26173988));
    }

    @Override // X.InterfaceC109924xK
    public final String getFormattedAmountRaised() {
        return A0i(-1578468996);
    }

    @Override // X.InterfaceC109924xK
    public final String getFormattedGoalAmount() {
        return A0i(2123044865);
    }

    @Override // X.InterfaceC109924xK
    public final String getFundraiserTitle() {
        return A0i(26173988);
    }
}
