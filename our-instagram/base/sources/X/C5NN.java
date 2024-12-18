package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5NN, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5NN {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.5NO] */
    public static C5NO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("drawable_id".equals(A0q)) {
                    obj.A0B = c16l.A1D();
                } else if ("center_x".equals(A0q)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("center_y".equals(A0q)) {
                    obj.A01 = (float) c16l.A0U();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    obj.A0A = (float) c16l.A0U();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    obj.A02 = (float) c16l.A0U();
                } else if ("normalized_center_x".equals(A0q)) {
                    obj.A03 = (float) c16l.A0U();
                } else if ("normalized_center_y".equals(A0q)) {
                    obj.A05 = (float) c16l.A0U();
                } else if ("normalized_center_x_precise".equals(A0q)) {
                    obj.A04 = (float) c16l.A0U();
                } else if ("normalized_center_y_precise".equals(A0q)) {
                    obj.A06 = (float) c16l.A0U();
                } else if ("normalized_width".equals(A0q)) {
                    obj.A08 = (float) c16l.A0U();
                } else if ("normalized_height".equals(A0q)) {
                    obj.A07 = (float) c16l.A0U();
                } else if ("video_position".equals(A0q)) {
                    obj.A0C = c16l.A1D();
                } else if ("rotation".equals(A0q)) {
                    obj.A09 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
