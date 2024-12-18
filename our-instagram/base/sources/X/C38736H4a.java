package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.H4a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38736H4a extends C0T6 implements JMK {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Float A03;
    public final String A04;
    public final List A05;

    @Override // X.JMK
    public final C38736H4a Ey6(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38736H4a) {
                C38736H4a c38736H4a = (C38736H4a) obj;
                if (!C14360o3.A0K(this.A05, c38736H4a.A05) || !C14360o3.A0K(this.A01, c38736H4a.A01) || !C14360o3.A0K(this.A02, c38736H4a.A02) || !C14360o3.A0K(this.A03, c38736H4a.A03) || !C14360o3.A0K(this.A04, c38736H4a.A04) || !C14360o3.A0K(this.A00, c38736H4a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMK
    public final List AiP() {
        return this.A05;
    }

    @Override // X.JMK
    public final Boolean Aki() {
        return this.A01;
    }

    @Override // X.JMK
    public final Boolean Akk() {
        return this.A02;
    }

    @Override // X.JMK
    public final Float BLv() {
        return this.A03;
    }

    @Override // X.JMK
    public final User CDj() {
        return this.A00;
    }

    @Override // X.JMK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTPostLiveItem", HrN.A00(this));
    }

    @Override // X.JMK
    public final String getPk() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38736H4a(User user, Boolean bool, Boolean bool2, Float f, String str, List list) {
        this.A05 = list;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = f;
        this.A04 = str;
        this.A00 = user;
    }

    @Override // X.JMK
    public final JMK E9c(C1DY c1dy) {
        return this;
    }
}
