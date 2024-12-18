package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HXC extends C17T implements InterfaceC43569JMd {
    public User A00;

    @Override // X.InterfaceC43569JMd
    public final User BSW() {
        return this.A00;
    }

    @Override // X.InterfaceC43569JMd
    public final List C0p() {
        return A08(1531715286, HUF.class);
    }

    @Override // X.InterfaceC43569JMd
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4H.A00(this));
    }

    @Override // X.InterfaceC43569JMd
    public final String C6J() {
        return A0i(-1064897719);
    }

    @Override // X.InterfaceC43569JMd
    public final String CEu() {
        return A0i(1595179052);
    }

    @Override // X.InterfaceC43569JMd
    public final InterfaceC43569JMd EBw(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -505296440);
        return this;
    }

    @Override // X.InterfaceC43569JMd
    public final C38822H7p F6V(C1DY c1dy) {
        User user;
        String A0e = A0e();
        String A0f = A0f();
        User A0J = AbstractC37303Gc4.A0J(c1dy, this, -505296440);
        ArrayList arrayList = null;
        if (A0J != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0J);
        } else {
            user = null;
        }
        List C0p = C0p();
        if (C0p != null) {
            arrayList = AbstractC167017dG.A0q(C0p);
            Iterator it = C0p.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43491JJd) it.next()).F1s());
            }
        }
        return new C38822H7p(user, A0e, A0f, A0X(), A0i(-1064897719), AbstractC37303Gc4.A0V(this), A0i(1595179052), arrayList);
    }

    @Override // X.InterfaceC43569JMd
    public final C38822H7p F6W(C1DV c1dv) {
        return F6V(AbstractC25235BEs.A0b(AbstractC37301Gc2.A08()));
    }

    @Override // X.InterfaceC43569JMd
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC43569JMd
    public final String getMediaId() {
        return A0f();
    }

    @Override // X.InterfaceC43569JMd
    public final String getText() {
        return A0X();
    }

    @Override // X.InterfaceC43569JMd
    public final String getUserId() {
        return AbstractC37303Gc4.A0V(this);
    }
}
