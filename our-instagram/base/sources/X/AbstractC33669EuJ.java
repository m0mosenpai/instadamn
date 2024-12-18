package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.EuJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33669EuJ {
    public static C51647Mre parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            IGCreatorIncentiveProgram iGCreatorIncentiveProgram = null;
            Integer num4 = null;
            String str8 = null;
            String str9 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(1110);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("boost_activation_params".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("creation_time".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("deal_deliverable_count".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("deal_end_date".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("deal_estimated_contract_payment".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("deal_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("deal_template_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("deal_total_contract_value".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("incentive_program".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGCreatorIncentiveProgram = (IGCreatorIncentiveProgram) IGCreatorIncentiveProgram.A01.get(A1P);
                    if (iGCreatorIncentiveProgram == null) {
                        iGCreatorIncentiveProgram = IGCreatorIncentiveProgram.A0N;
                    }
                } else if ("is_deal_template_ig_bonus_program".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("maximum_deliverable_count".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("payout_contract_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str3 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("deal_id", c16l, "BonusDealMetadata");
            } else if (str4 != null || !(c16l instanceof C07950bF)) {
                if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deal_template_id", c16l, "BonusDealMetadata");
                } else if (str7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DevServerEntity.COLUMN_DESCRIPTION, c16l, "BonusDealMetadata");
                } else if (iGCreatorIncentiveProgram == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("incentive_program", c16l, "BonusDealMetadata");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_deal_template_ig_bonus_program", c16l, "BonusDealMetadata");
                } else if (str9 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, c16l, "BonusDealMetadata");
                } else {
                    return new C51647Mre(iGCreatorIncentiveProgram, num, num2, num3, num4, str, str2, str3, str4, str5, str6, str7, str8, str9, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(A00, c16l, "BonusDealMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
