package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.H7c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38812H7c extends C0T6 implements JMG {
    public final C38813H7d A00;
    public final User A01;
    public final Long A02;
    public final String A03;
    public final List A04;

    public C38812H7c(C38813H7d c38813H7d, User user, Long l, String str, List list) {
        AbstractC25234BEr.A0j(2, c38813H7d, user, str, list);
        this.A02 = l;
        this.A00 = c38813H7d;
        this.A01 = user;
        this.A03 = str;
        this.A04 = list;
    }

    @Override // X.JMG
    public final C38812H7c F5a(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38812H7c) {
                C38812H7c c38812H7c = (C38812H7c) obj;
                if (!C14360o3.A0K(this.A02, c38812H7c.A02) || !C14360o3.A0K(this.A00, c38812H7c.A00) || !C14360o3.A0K(this.A01, c38812H7c.A01) || !C14360o3.A0K(this.A03, c38812H7c.A03) || !C14360o3.A0K(this.A04, c38812H7c.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMG
    public final Long AZD() {
        return this.A02;
    }

    @Override // X.JMG
    public final /* bridge */ /* synthetic */ JLG AtX() {
        return this.A00;
    }

    @Override // X.JMG
    public final User BSW() {
        return this.A01;
    }

    @Override // X.JMG
    public final String BSY() {
        return this.A03;
    }

    @Override // X.JMG
    public final List Bh7() {
        return this.A04;
    }

    @Override // X.JMG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShoppingNetegoInStoryShopSuggestion", AbstractC40718I2y.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0M(this.A02) * 31))));
    }

    @Override // X.JMG
    public final JMG EBi(C1DY c1dy) {
        return this;
    }
}
