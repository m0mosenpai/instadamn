package X;

import com.instagram.api.schemas.AFI_TYPE;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Hk0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39730Hk0 {
    public static C38621GyO parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            String str = null;
            AFI_TYPE afi_type = null;
            HashMap hashMap = null;
            ArrayList arrayList = null;
            C106344qo c106344qo = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("afi_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("afi_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    afi_type = (AFI_TYPE) AFI_TYPE.A01.get(A1P);
                    if (afi_type == null) {
                        afi_type = AFI_TYPE.A0F;
                    }
                } else if ("extra_data".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            AbstractC31179DnN.A1F(c16l, hashMap);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("questions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C106364qq parseFromJson = AbstractC106324qm.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("undo_button".equals(A0s)) {
                    c106344qo = AbstractC106334qn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("afi_id", c16l, "AdsFeedbackInterfaceContent");
            } else if (afi_type != null || !(c16l instanceof C07950bF)) {
                if (hashMap == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("extra_data", c16l, "AdsFeedbackInterfaceContent");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("questions", c16l, "AdsFeedbackInterfaceContent");
                } else if (c106344qo == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("undo_button", c16l, "AdsFeedbackInterfaceContent");
                } else {
                    return new C38621GyO(afi_type, c106344qo, str, hashMap, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("afi_type", c16l, "AdsFeedbackInterfaceContent");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
