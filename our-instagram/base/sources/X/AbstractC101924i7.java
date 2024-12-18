package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.4i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101924i7 {
    public static C9C9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9C9 c9c9 = new C9C9(6);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9c9.A01 = str;
                } else if (DialogModule.KEY_MESSAGE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9c9.A00 = str;
                }
                c16l.A0z();
            }
            return c9c9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
