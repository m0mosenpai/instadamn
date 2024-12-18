package X;

import java.io.IOException;

/* renamed from: X.5Ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115405Ka {
    public static C115435Kd parseFromJson(C16L c16l) {
        String A1P;
        Object c09540e5;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            EnumC115415Kb enumC115415Kb = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("error_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    try {
                        c09540e5 = EnumC115415Kb.valueOf(A1P);
                    } catch (Throwable th) {
                        c09540e5 = new C09540e5(th);
                    }
                    Object obj = EnumC115415Kb.A0M;
                    if (c09540e5 instanceof C09540e5) {
                        c09540e5 = obj;
                    }
                    enumC115415Kb = (EnumC115415Kb) c09540e5;
                } else if ("input_error_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("server_error_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("response_code".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (!"cause".equals(A0q)) {
                    if ("localized_error_message".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str3 = null;
                        } else {
                            str3 = c16l.A1P();
                        }
                    } else if ("reason".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str4 = null;
                        } else {
                            str4 = c16l.A1P();
                        }
                    }
                }
                c16l.A0z();
            }
            if (enumC115415Kb == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("error_type", "FailureInterpreter");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("response_code", "FailureInterpreter");
                } else {
                    return new C115435Kd(enumC115415Kb, str, str2, str3, str4, null, num.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("input_error_message", "FailureInterpreter");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
