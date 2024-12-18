package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOK {
    public static Map A00(InterfaceC109924xK interfaceC109924xK) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        User AnG = interfaceC109924xK.AnG();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (AnG != null) {
            linkedHashMap.put("charity_user", AnG.A07());
        }
        if (interfaceC109924xK.Aqa() != null) {
            XGE Aqa = interfaceC109924xK.Aqa();
            if (Aqa != null) {
                treeUpdaterJNI = Aqa.F7o();
            }
            linkedHashMap.put("consumption_sheet_config", treeUpdaterJNI);
        }
        if (interfaceC109924xK.Ayx() != null) {
            linkedHashMap.put("donations_count", interfaceC109924xK.Ayx());
        }
        if (interfaceC109924xK.Ayy() != null) {
            linkedHashMap.put("donations_count_current_session_only", interfaceC109924xK.Ayy());
        }
        if (interfaceC109924xK.getFormattedAmountRaised() != null) {
            linkedHashMap.put("formatted_amount_raised", interfaceC109924xK.getFormattedAmountRaised());
        }
        if (interfaceC109924xK.B87() != null) {
            linkedHashMap.put("formatted_amount_raised_current_session_only", interfaceC109924xK.B87());
        }
        if (interfaceC109924xK.B88() != null) {
            linkedHashMap.put("formatted_amount_raised_during_live_str", interfaceC109924xK.B88());
        }
        if (interfaceC109924xK.B89() != null) {
            linkedHashMap.put("formatted_amount_raised_of_goal_amount_str", interfaceC109924xK.B89());
        }
        if (interfaceC109924xK.B8B() != null) {
            linkedHashMap.put("formatted_donations_count", interfaceC109924xK.B8B());
        }
        if (interfaceC109924xK.B8C() != null) {
            linkedHashMap.put("formatted_donations_count_current_session_only", interfaceC109924xK.B8C());
        }
        if (interfaceC109924xK.getFormattedGoalAmount() != null) {
            linkedHashMap.put("formatted_goal_amount", interfaceC109924xK.getFormattedGoalAmount());
        }
        if (interfaceC109924xK.getFundraiserTitle() != null) {
            linkedHashMap.put("fundraiser_title", interfaceC109924xK.getFundraiserTitle());
        }
        if (interfaceC109924xK.BNw() != null) {
            linkedHashMap.put("live_fundraiser_id", interfaceC109924xK.BNw());
        }
        if (interfaceC109924xK.BzW() != null) {
            linkedHashMap.put("standalone_fundraiser_id", interfaceC109924xK.BzW());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
