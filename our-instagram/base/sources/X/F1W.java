package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes6.dex */
public abstract class F1W {
    public static final void A00(C18920wW c18920wW, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        C14360o3.A0B(c18920wW, 0);
        AbstractC25233BEq.A0w(1, str, str3, str4);
        if (directShareTarget == null) {
            str8 = "aiTarget is nil,";
        } else if (((PendingRecipient) AbstractC001800i.A0I(AbstractC31175DnJ.A0f(directShareTarget))).A0B == null) {
            str8 = "aiTarget userId is nil,";
        } else {
            str8 = "";
        }
        String A0g = AnonymousClass001.A0g(str8, " agentId is ", str5);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "ig_meta_ai_bottomsheet_load_error");
        if (A0f.isSampled()) {
            A0f.AAP("entrypoint", str2);
            A0f.AAP("nav_chain", str);
            A0f.AAP("search_session_id", str6);
            A0f.AAP("query_text", str7);
            A0f.AAP(MSV.A00(583), str3);
            A0f.AAP("name_of_class", str4);
            A0f.AAP("addtional_debug_info", A0g);
            A0f.Cht();
        }
    }
}
