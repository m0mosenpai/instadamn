package X;

import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HtP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40259HtP {
    public static Map A00(InterfaceC43571JMf interfaceC43571JMf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC43571JMf.getCanViewerDonate();
        A1I.put("can_viewer_donate", Boolean.valueOf(interfaceC43571JMf.getCanViewerDonate()));
        if (interfaceC43571JMf.AnD() != null) {
            A1I.put(AbstractC111324zv.A00(797), interfaceC43571JMf.AnD());
        }
        interfaceC43571JMf.getEndTime();
        A1I.put("end_time", Long.valueOf(interfaceC43571JMf.getEndTime()));
        if (interfaceC43571JMf.getFormattedFundraiserProgressInfoText() != null) {
            A1I.put("formatted_fundraiser_progress_info_text", interfaceC43571JMf.getFormattedFundraiserProgressInfoText());
        }
        if (interfaceC43571JMf.getFormattedGoalAmount() != null) {
            A1I.put("formatted_goal_amount", interfaceC43571JMf.getFormattedGoalAmount());
        }
        if (interfaceC43571JMf.getFundraiserId() != null) {
            A1I.put("fundraiser_id", interfaceC43571JMf.getFundraiserId());
        }
        if (interfaceC43571JMf.getFundraiserTitle() != null) {
            A1I.put("fundraiser_title", interfaceC43571JMf.getFundraiserTitle());
        }
        if (interfaceC43571JMf.B9E() != null) {
            FundraiserVisibilityOnProfileStatus B9E = interfaceC43571JMf.B9E();
            C14360o3.A0B(B9E, 0);
            A1I.put(AbstractC111324zv.A00(956), B9E.A00);
        }
        if (interfaceC43571JMf.getOwnerUsername() != null) {
            A1I.put("owner_username", interfaceC43571JMf.getOwnerUsername());
        }
        interfaceC43571JMf.BcN();
        A1I.put("percent_raised", Integer.valueOf(interfaceC43571JMf.BcN()));
        if (interfaceC43571JMf.CE2() != null) {
            UserRoleOnFundraiser CE2 = interfaceC43571JMf.CE2();
            C14360o3.A0B(CE2, 0);
            A1I.put("user_role", CE2.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
