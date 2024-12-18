package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hr2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40134Hr2 {
    public static H4S parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(1106);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("parameter_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("values".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "ParameterPickerImpl");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "ParameterPickerImpl");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("values", c16l, "ParameterPickerImpl");
                } else {
                    return new H4S(str, str2, str3, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("parameter_name", c16l, "ParameterPickerImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
