package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Hsd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40214Hsd {
    public static C50627MWo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MUW muw = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38611GyE c38611GyE = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    muw = AbstractC39768Hke.parseFromJson(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    c38611GyE = AbstractC40213Hsc.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C50627MWo(16, c38611GyE, muw);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
