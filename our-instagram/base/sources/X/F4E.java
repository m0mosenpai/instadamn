package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4E {
    public static E69 parseFromJson(C16L c16l) {
        int A1D;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DatePickerDialogModule.ARG_MODE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1D = 3;
                    } else {
                        A1D = c16l.A1D();
                    }
                    num = Integer.valueOf(A1D);
                } else if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(DatePickerDialogModule.ARG_MODE, c16l, "DirectThreadGroupInviteLinkDelta");
                throw C00O.createAndThrow();
            }
            return new E69(num.intValue(), str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
