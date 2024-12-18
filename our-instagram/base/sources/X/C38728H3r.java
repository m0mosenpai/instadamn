package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38728H3r extends C0T6 implements JKK {
    public final Integer A00;
    public final Integer A01;

    @Override // X.JKK
    public final C38728H3r EvI() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38728H3r) {
                C38728H3r c38728H3r = (C38728H3r) obj;
                if (!C14360o3.A0K(this.A00, c38728H3r.A00) || !C14360o3.A0K(this.A01, c38728H3r.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKK
    public final Integer B1s() {
        return this.A00;
    }

    @Override // X.JKK
    public final Integer Bza() {
        return this.A01;
    }

    @Override // X.JKK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGNativeSmartTextOverlayTimestamp", AbstractC40008Hop.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38728H3r(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
