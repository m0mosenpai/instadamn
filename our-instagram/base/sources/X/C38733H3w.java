package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38733H3w extends C0T6 implements JKM {
    public final C108054to A00;
    public final C38729H3s A01;

    @Override // X.JKM
    public final C38733H3w EvY() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38733H3w) {
                C38733H3w c38733H3w = (C38733H3w) obj;
                if (!C14360o3.A0K(this.A01, c38733H3w.A01) || !C14360o3.A0K(this.A00, c38733H3w.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKM
    public final /* bridge */ /* synthetic */ JJQ Bha() {
        return this.A01;
    }

    @Override // X.JKM
    public final /* bridge */ /* synthetic */ InterfaceC108064tp BjS() {
        return this.A00;
    }

    @Override // X.JKM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGStoryOffsiteLeadAdsInfoDict", AbstractC40023Hp6.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38733H3w(C108054to c108054to, C38729H3s c38729H3s) {
        this.A01 = c38729H3s;
        this.A00 = c108054to;
    }
}
