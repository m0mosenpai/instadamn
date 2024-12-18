package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;
import java.io.IOException;

/* renamed from: X.EuY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33684EuY {
    public static E7g parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            IGCreatorIncentiveProgram iGCreatorIncentiveProgram = null;
            String str5 = null;
            E80 e80 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("deal_delivery_end_date".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("deal_delivery_start_date".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("deal_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("deal_template_contract_terms".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("deal_template_hr_program".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("deal_template_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("deal_template_program".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGCreatorIncentiveProgram = (IGCreatorIncentiveProgram) IGCreatorIncentiveProgram.A01.get(A1P);
                    if (iGCreatorIncentiveProgram == null) {
                        iGCreatorIncentiveProgram = IGCreatorIncentiveProgram.A0N;
                    }
                } else if ("deal_total_contract_value".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("deferred_onboarding_eligible".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_deal_template_ig_bonus_program".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("reels_on_the_rise_details".equals(A0s)) {
                    e80 = AbstractC33728EvG.parseFromJson(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "reels_performance_fund_play_count");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("deal_delivery_end_date", c16l, "DealTemplateMetadata");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deal_description", c16l, "DealTemplateMetadata");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deal_template_contract_terms", c16l, "DealTemplateMetadata");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deal_template_hr_program", c16l, "DealTemplateMetadata");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deal_template_id", c16l, "DealTemplateMetadata");
                } else if (iGCreatorIncentiveProgram == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deal_template_program", c16l, "DealTemplateMetadata");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deal_total_contract_value", c16l, "DealTemplateMetadata");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deferred_onboarding_eligible", c16l, "DealTemplateMetadata");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_deal_template_ig_bonus_program", c16l, "DealTemplateMetadata");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("reels_performance_fund_play_count", c16l, "DealTemplateMetadata");
                } else {
                    return new E7g(iGCreatorIncentiveProgram, e80, str, str2, str3, str4, str5, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("deal_delivery_start_date", c16l, "DealTemplateMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
