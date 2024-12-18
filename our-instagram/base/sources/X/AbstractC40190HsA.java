package X;

import com.instagram.api.schemas.ErrorIdentifier;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HsA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40190HsA {
    public static UPA parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            UPI upi = null;
            ErrorIdentifier errorIdentifier = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(46);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("available_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C66634UQm parseFromJson = AbstractC39861HmA.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("display_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("error_handling_response".equals(A0s)) {
                    upi = AbstractC39909Hmw.parseFromJson(c16l);
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(A1P);
                    if (errorIdentifier == null) {
                        errorIdentifier = ErrorIdentifier.A19;
                    }
                } else if ("internal_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("display_message", c16l, "PromoteError");
            } else if (upi != null || !(c16l instanceof C07950bF)) {
                if (errorIdentifier == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "PromoteError");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("internal_message", c16l, "PromoteError");
                } else {
                    return new UPA(upi, errorIdentifier, str, str2, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("error_handling_response", c16l, "PromoteError");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
