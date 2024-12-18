package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I0P {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IHs, java.lang.Object] */
    public static C41101IHs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("num_responders".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
