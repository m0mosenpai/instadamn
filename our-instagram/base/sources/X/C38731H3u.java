package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38731H3u extends C0T6 implements JKL {
    public final String A00;
    public final String A01;

    @Override // X.JKL
    public final C38731H3u EvS() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38731H3u) {
                C38731H3u c38731H3u = (C38731H3u) obj;
                if (!C14360o3.A0K(this.A00, c38731H3u.A00) || !C14360o3.A0K(this.A01, c38731H3u.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKL
    public final String BYY() {
        return this.A00;
    }

    @Override // X.JKL
    public final String BiW() {
        return this.A01;
    }

    @Override // X.JKL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGPromoAdsPromoCodeDict", AbstractC40017Hoy.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C38731H3u(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
