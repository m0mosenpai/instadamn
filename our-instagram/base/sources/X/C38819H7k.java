package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.featuredproduct.SurfaceVisibility;

/* renamed from: X.H7k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38819H7k extends C0T6 implements JLH {
    public final FeaturedProductPermissionStatus A00;
    public final SurfaceVisibility A01;
    public final Long A02;

    @Override // X.JLH
    public final C38819H7k F65() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38819H7k) {
                C38819H7k c38819H7k = (C38819H7k) obj;
                if (!C14360o3.A0K(this.A02, c38819H7k.A02) || this.A00 != c38819H7k.A00 || this.A01 != c38819H7k.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLH
    public final Long BF7() {
        return this.A02;
    }

    @Override // X.JLH
    public final FeaturedProductPermissionStatus C0K() {
        return this.A00;
    }

    @Override // X.JLH
    public final SurfaceVisibility C4R() {
        return this.A01;
    }

    @Override // X.JLH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShoppingFeaturedProductPermissionDict", I3X.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38819H7k(FeaturedProductPermissionStatus featuredProductPermissionStatus, SurfaceVisibility surfaceVisibility, Long l) {
        this.A02 = l;
        this.A00 = featuredProductPermissionStatus;
        this.A01 = surfaceVisibility;
    }
}
