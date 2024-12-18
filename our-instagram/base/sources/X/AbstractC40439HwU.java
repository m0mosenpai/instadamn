package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.HwU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40439HwU {
    public static C51636MrT parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2401);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC43591JPw.A00(73).equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("duration".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("formatted_incentive_match".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("formatted_milestone_bonus".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("insights_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("maxed_out_match_limit".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("num_badges".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("num_supporters".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str3 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "UserPayMediaInsights");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("num_badges", c16l, "UserPayMediaInsights");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("num_supporters", c16l, "UserPayMediaInsights");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "UserPayMediaInsights");
                } else {
                    return new C51636MrT(num3, num4, str, str2, str3, str4, str5, num.intValue(), num2.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("maxed_out_match_limit", c16l, "UserPayMediaInsights");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
