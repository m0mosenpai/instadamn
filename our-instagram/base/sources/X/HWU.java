package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWU extends C17T implements JMG {
    public User A00;

    @Override // X.JMG
    public final JLG AtX() {
        return (JLG) A04(98832, HWV.class);
    }

    @Override // X.JMG
    public final User BSW() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'merchant' field.");
    }

    @Override // X.JMG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40718I2y.A00(this));
    }

    @Override // X.JMG
    public final Long AZD() {
        return A0L(92655287);
    }

    @Override // X.JMG
    public final String BSY() {
        return A0h(-353887541);
    }

    @Override // X.JMG
    public final List Bh7() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-1311504744);
        C14360o3.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    @Override // X.JMG
    public final JMG EBi(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0P(c1dy, this, -505296440);
        return this;
    }

    @Override // X.JMG
    public final C38812H7c F5a(C1DY c1dy) {
        return new C38812H7c(AtX().F5b(), (User) AbstractC37303Gc4.A07(c1dy, this, -505296440), A0L(92655287), A0h(-353887541), Bh7());
    }
}
