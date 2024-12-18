package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VR7 {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Vjf, java.lang.Object] */
    public static C69212Vjf parseFromJson(C16L c16l) {
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
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(AbstractC62862SUj.MAX_FACTORIAL).equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("hide_back_button".equals(A0s)) {
                    obj.A02 = c16l.A0d();
                } else if ("hide_navbar".equals(A0s)) {
                    obj.A03 = c16l.A0d();
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
