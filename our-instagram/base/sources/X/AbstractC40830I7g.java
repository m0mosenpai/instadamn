package X;

import com.instagram.api.schemas.ProductTileTextColorType;
import java.io.IOException;

/* renamed from: X.I7g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40830I7g {
    public static C51758Mth parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductTileTextColorType productTileTextColorType = null;
            Boolean bool = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(3182);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productTileTextColorType = (ProductTileTextColorType) ProductTileTextColorType.A01.get(A1P);
                    if (productTileTextColorType == null) {
                        productTileTextColorType = ProductTileTextColorType.A06;
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, A00);
                }
                c16l.A0z();
            }
            if (productTileTextColorType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("color", c16l, "DestinationItemLayoutContent");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "DestinationItemLayoutContent");
            } else {
                return new C51758Mth(productTileTextColorType, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
