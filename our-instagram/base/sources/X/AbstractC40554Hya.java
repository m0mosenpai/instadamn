package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.Hya, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40554Hya {
    public static C41095IHm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41095IHm c41095IHm = new C41095IHm();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_exclusive".equals(A0s)) {
                    c41095IHm.A00 = AbstractC166997dE.A0d(c16l);
                } else if ("num_responders".equals(A0s)) {
                    c41095IHm.A01 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c41095IHm.A02 = A0m;
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c41095IHm.A03 = A0m2;
                }
                c16l.A0z();
            }
            return c41095IHm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
