package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VWM {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.VkE, java.lang.Object] */
    public static C69245VkE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("video_call_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(2718).equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("display".equals(A0s)) {
                    obj.A00 = VWL.parseFromJson(c16l);
                } else if ("sender".equals(A0s)) {
                    obj.A01 = FB2.parseFromJson(c16l);
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
