package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.9xG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225519xG {
    public static C171867lH parseFromJson(C16L c16l) {
        String A00;
        String A002;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            String str = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2909);
                A002 = AbstractC111324zv.A00(1093);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A002.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (A00.equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A002, c16l, "PreLiveShoppingSheetConfigImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "PreLiveShoppingSheetConfigImpl");
                } else {
                    return new C171867lH(str, num.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(A00, c16l, "PreLiveShoppingSheetConfigImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
