package X;

import com.instagram.api.schemas.ThreadHeaderContextType;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hw7 {
    public static C38802H6r parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ThreadHeaderContextType threadHeaderContextType = null;
            String str = null;
            C38804H6t c38804H6t = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2188);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("context_info".equals(A0s)) {
                    c38804H6t = Hw8.parseFromJson(c16l);
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    threadHeaderContextType = (ThreadHeaderContextType) ThreadHeaderContextType.A01.get(A1P);
                    if (threadHeaderContextType == null) {
                        threadHeaderContextType = ThreadHeaderContextType.A0B;
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("text_compact".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (threadHeaderContextType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "ThreadHeaderContextImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "ThreadHeaderContextImpl");
            } else {
                return new C38802H6r(c38804H6t, threadHeaderContextType, str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
