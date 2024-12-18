package X;

import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import java.io.IOException;

/* renamed from: X.HtQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40260HtQ {
    public static H5H parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            FundraiserVisibilityOnProfileStatus fundraiserVisibilityOnProfileStatus = null;
            String str6 = null;
            UserRoleOnFundraiser userRoleOnFundraiser = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(956);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("can_viewer_donate".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(797).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("end_time".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("formatted_fundraiser_progress_info_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("formatted_goal_amount".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("fundraiser_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("fundraiser_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    fundraiserVisibilityOnProfileStatus = (FundraiserVisibilityOnProfileStatus) FundraiserVisibilityOnProfileStatus.A01.get(A1P2);
                    if (fundraiserVisibilityOnProfileStatus == null) {
                        fundraiserVisibilityOnProfileStatus = FundraiserVisibilityOnProfileStatus.A06;
                    }
                } else if ("owner_username".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("percent_raised".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("user_role".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    userRoleOnFundraiser = (UserRoleOnFundraiser) UserRoleOnFundraiser.A01.get(A1P);
                    if (userRoleOnFundraiser == null) {
                        userRoleOnFundraiser = UserRoleOnFundraiser.A07;
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("can_viewer_donate", c16l, "StandaloneFundraiserDictV2Impl");
            } else if (l != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("formatted_fundraiser_progress_info_text", c16l, "StandaloneFundraiserDictV2Impl");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("formatted_goal_amount", c16l, "StandaloneFundraiserDictV2Impl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("fundraiser_id", c16l, "StandaloneFundraiserDictV2Impl");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("fundraiser_title", c16l, "StandaloneFundraiserDictV2Impl");
                } else if (fundraiserVisibilityOnProfileStatus == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "StandaloneFundraiserDictV2Impl");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("owner_username", c16l, "StandaloneFundraiserDictV2Impl");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("percent_raised", c16l, "StandaloneFundraiserDictV2Impl");
                } else if (userRoleOnFundraiser == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("user_role", c16l, "StandaloneFundraiserDictV2Impl");
                } else {
                    return new H5H(fundraiserVisibilityOnProfileStatus, userRoleOnFundraiser, str, str2, str3, str4, str5, str6, num.intValue(), l.longValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("end_time", c16l, "StandaloneFundraiserDictV2Impl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
