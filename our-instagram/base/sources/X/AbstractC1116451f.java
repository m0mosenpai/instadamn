package X;

import com.instagram.api.schemas.GreetingAttachment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.51f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1116451f {
    public static GreetingAttachment parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new GreetingAttachment(num, num2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
