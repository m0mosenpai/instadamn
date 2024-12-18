package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H6k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38795H6k extends C0T6 implements JLA {
    public final int A00;
    public final C38794H6j A01;
    public final Integer A02;

    public C38795H6k(C38794H6j c38794H6j, Integer num, int i) {
        C14360o3.A0B(c38794H6j, 1);
        this.A01 = c38794H6j;
        this.A02 = num;
        this.A00 = i;
    }

    @Override // X.JLA
    public final C38795H6k F37() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38795H6k) {
                C38795H6k c38795H6k = (C38795H6k) obj;
                if (!C14360o3.A0K(this.A01, c38795H6k.A01) || !C14360o3.A0K(this.A02, c38795H6k.A02) || this.A00 != c38795H6k.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLA
    public final /* bridge */ /* synthetic */ InterfaceC43543JLd B2I() {
        return this.A01;
    }

    @Override // X.JLA
    public final Integer BN2() {
        return this.A02;
    }

    @Override // X.JLA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextEntityRange", AbstractC40402Hvp.A00(this));
    }

    @Override // X.JLA
    public final int getOffset() {
        return this.A00;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00;
    }
}
