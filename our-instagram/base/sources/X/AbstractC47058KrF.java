package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.KrF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47058KrF {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Ki2, java.lang.Object] */
    public static C46503Ki2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else {
                    l = AbstractC37303Gc4.A0O(c16l, l, A0s, "countdown_date");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "VotingInfoHeader");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("countdown_date", c16l, "VotingInfoHeader");
                } else {
                    long longValue = l.longValue();
                    ?? obj = new Object();
                    obj.A02 = str;
                    obj.A01 = str2;
                    obj.A00 = longValue;
                    return obj;
                }
            } else {
                AbstractC166997dE.A1V("subtitle", c16l, "VotingInfoHeader");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
