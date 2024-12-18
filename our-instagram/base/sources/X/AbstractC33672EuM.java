package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EuM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33672EuM {
    public static C26124BhA parseFromJson(C16L c16l) {
        String A00;
        String A002;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(91);
                A002 = AbstractC111324zv.A00(4074);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (A002.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Long A0h = AbstractC31173DnH.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("subtitle_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("title_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("button_text", c16l, "ChallengeToastInfoImpl");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "ChallengeToastInfoImpl");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("subtitle_text", c16l, "ChallengeToastInfoImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("title_text", c16l, "ChallengeToastInfoImpl");
                } else {
                    return new C26124BhA(str, str2, str3, str4, arrayList);
                }
            } else {
                AbstractC166997dE.A1V(A002, c16l, "ChallengeToastInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
