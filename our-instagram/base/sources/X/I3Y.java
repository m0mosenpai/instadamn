package X;

import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.featuredproduct.SurfaceVisibility;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I3Y {
    public static C38819H7k parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            FeaturedProductPermissionStatus featuredProductPermissionStatus = null;
            SurfaceVisibility surfaceVisibility = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    featuredProductPermissionStatus = (FeaturedProductPermissionStatus) FeaturedProductPermissionStatus.A01.get(A1P2);
                    if (featuredProductPermissionStatus == null) {
                        featuredProductPermissionStatus = FeaturedProductPermissionStatus.A0F;
                    }
                } else if ("surface_visibility".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    surfaceVisibility = (SurfaceVisibility) SurfaceVisibility.A01.get(A1P);
                    if (surfaceVisibility == null) {
                        surfaceVisibility = SurfaceVisibility.A06;
                    }
                }
                c16l.A0z();
            }
            return new C38819H7k(featuredProductPermissionStatus, surfaceVisibility, l);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
