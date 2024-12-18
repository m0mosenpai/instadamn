package X;

import com.instagram.api.schemas.ProductTileBannerMetadataDecorationImpl;
import com.instagram.api.schemas.ProductTileContextImpl;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hrw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40184Hrw {
    public static ProductTileMetadataDecorationsImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            ProductTileContextImpl productTileContextImpl = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("banners".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductTileBannerMetadataDecorationImpl parseFromJson = AbstractC40178Hrq.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("context".equals(A0s)) {
                    productTileContextImpl = AbstractC40179Hrr.parseFromJson(c16l);
                } else if ("has_reduced_padding".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("has_side_padding".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_three_dot_menu_visible".equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                } else if ("show_dismiss_button".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("show_minimal_profile_overlay".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("show_profile_overlay".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("show_profile_pic_only".equals(A0s)) {
                    bool7 = AbstractC166997dE.A0d(c16l);
                } else {
                    bool8 = AbstractC37303Gc4.A0K(c16l, bool8, A0s, "show_save_button");
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("banners", c16l, "ProductTileMetadataDecorationsImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("has_side_padding", c16l, "ProductTileMetadataDecorationsImpl");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_dismiss_button", c16l, "ProductTileMetadataDecorationsImpl");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_minimal_profile_overlay", c16l, "ProductTileMetadataDecorationsImpl");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_profile_overlay", c16l, "ProductTileMetadataDecorationsImpl");
                } else if (bool7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_profile_pic_only", c16l, "ProductTileMetadataDecorationsImpl");
                } else if (bool8 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_save_button", c16l, "ProductTileMetadataDecorationsImpl");
                } else {
                    return new ProductTileMetadataDecorationsImpl(productTileContextImpl, bool6, arrayList, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool7.booleanValue(), bool8.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("has_reduced_padding", c16l, "ProductTileMetadataDecorationsImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
