package X;

import com.instagram.api.schemas.MediaType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.6rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151476rq {
    public static C151486rs parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            String str = null;
            String str2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            MediaType mediaType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("cdn_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("instruction_key_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("margin_bottom".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("margin_left".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("margin_right".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("margin_top".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("media_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaType = (MediaType) MediaType.A01.get(A1P);
                    if (mediaType == null) {
                        mediaType = MediaType.A06;
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("cdn_url", "AvatarProfilePicImpl");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("instruction_key_id", "AvatarProfilePicImpl");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "AvatarProfilePicImpl");
                } else {
                    return new C151486rs(mediaType, num3, num4, num5, num6, str, str2, num.intValue(), num2.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "AvatarProfilePicImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
