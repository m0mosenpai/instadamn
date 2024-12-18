package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VXY {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.VJ3, java.lang.Object] */
    public static VJ3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ILV ilv = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (DialogModule.KEY_TITLE.equals(AbstractC166997dE.A0s(c16l))) {
                    ilv = IAW.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (ilv == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "PolicyFormattedText");
                throw C00O.createAndThrow();
            }
            ?? obj = new Object();
            obj.A00 = ilv;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
