package X;

import android.graphics.Rect;
import com.instagram.creation.base.CropInfo;
import java.io.IOException;

/* renamed from: X.8z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203458z2 {
    public static CropInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Rect rect = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("original_image_width".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("original_image_height".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("crop_rect".equals(A0q)) {
                    rect = Rect.unflattenFromString(c16l.A1Q());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("original_image_width", "CropInfo");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (rect == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("crop_rect", "CropInfo");
                } else {
                    return new CropInfo(rect, num.intValue(), num2.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("original_image_height", "CropInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, CropInfo cropInfo) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("original_image_width", cropInfo.A01);
        anonymousClass182.A0Q("original_image_height", cropInfo.A00);
        Rect rect = cropInfo.A02;
        if (rect != null) {
            anonymousClass182.A0S("crop_rect", rect.flattenToString());
        }
        anonymousClass182.A0a();
    }
}
