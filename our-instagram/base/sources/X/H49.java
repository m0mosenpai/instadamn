package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H49 extends C0T6 implements InterfaceC43539JKz {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    @Override // X.InterfaceC43539JKz
    public final H49 EwB() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H49) {
                H49 h49 = (H49) obj;
                if (!C14360o3.A0K(this.A00, h49.A00) || this.A01 != h49.A01 || this.A02 != h49.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43539JKz
    public final Integer BXd() {
        return this.A00;
    }

    @Override // X.InterfaceC43539JKz
    public final boolean Bw6() {
        return this.A02;
    }

    @Override // X.InterfaceC43539JKz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMediaAchievementsInfo", AbstractC40059Hpl.A00(this));
    }

    @Override // X.InterfaceC43539JKz
    public final boolean getShowAchievements() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC167017dG.A0M(this.A00) * 31));
    }

    public H49(Integer num, boolean z, boolean z2) {
        this.A00 = num;
        this.A01 = z;
        this.A02 = z2;
    }
}
