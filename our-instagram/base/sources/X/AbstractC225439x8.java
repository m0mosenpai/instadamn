package X;

import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225439x8 {
    public static C211749Zz parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            Integer num = null;
            String str = null;
            ClipsTemplatesStickerType clipsTemplatesStickerType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("end_time_ms".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    f2 = AbstractC167007dF.A0b(c16l);
                } else if ("offset_x".equals(A0s)) {
                    f3 = AbstractC167007dF.A0b(c16l);
                } else if ("offset_y".equals(A0s)) {
                    f4 = AbstractC167007dF.A0b(c16l);
                } else if ("rotation_degree".equals(A0s)) {
                    f5 = AbstractC167007dF.A0b(c16l);
                } else if ("scale".equals(A0s)) {
                    f6 = AbstractC167007dF.A0b(c16l);
                } else if ("start_time_ms".equals(A0s)) {
                    f7 = AbstractC167007dF.A0b(c16l);
                } else if ("sticker_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("sticker_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsTemplatesStickerType = (ClipsTemplatesStickerType) ClipsTemplatesStickerType.A01.get(A1P);
                    if (clipsTemplatesStickerType == null) {
                        clipsTemplatesStickerType = ClipsTemplatesStickerType.A0A;
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    f8 = AbstractC167007dF.A0b(c16l);
                } else if ("z_index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            if (f == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("end_time_ms", c16l, "ClipsStickerInfoImpl");
            } else if (f2 != null || !(c16l instanceof C07950bF)) {
                if (f3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("offset_x", c16l, "ClipsStickerInfoImpl");
                } else if (f4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("offset_y", c16l, "ClipsStickerInfoImpl");
                } else if (f5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("rotation_degree", c16l, "ClipsStickerInfoImpl");
                } else if (f6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("scale", c16l, "ClipsStickerInfoImpl");
                } else if (f7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("start_time_ms", c16l, "ClipsStickerInfoImpl");
                } else if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("sticker_id", c16l, "ClipsStickerInfoImpl");
                } else if (clipsTemplatesStickerType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("sticker_type", c16l, "ClipsStickerInfoImpl");
                } else if (f8 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactMediaPickerNativeModule.WIDTH, c16l, "ClipsStickerInfoImpl");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("z_index", c16l, "ClipsStickerInfoImpl");
                } else {
                    return new C211749Zz(clipsTemplatesStickerType, str, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), f6.floatValue(), f7.floatValue(), f8.floatValue(), num.intValue());
                }
            } else {
                AbstractC166997dE.A1V(IgReactMediaPickerNativeModule.HEIGHT, c16l, "ClipsStickerInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
