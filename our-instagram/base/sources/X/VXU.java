package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VXU {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Vj2, java.lang.Object] */
    public static C69173Vj2 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A01 = IAW.parseFromJson(c16l);
                } else if ("action_type".equals(A0s)) {
                    obj.A00 = (EnumC68199VFr) EnumC68199VFr.A01.get(c16l.A1Q());
                } else if ("button_type".equals(A0s)) {
                    EnumC68193VFl.A01.get(c16l.A1Q());
                } else if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A02 = A1P;
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
