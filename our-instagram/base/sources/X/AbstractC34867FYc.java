package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FYc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34867FYc {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 4);
        HashMap A0e = AbstractC31179DnN.A0e();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_wellbeing_self_remediation_action");
        A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "block");
        AbstractC31171DnF.A1A(A0f, str);
        A0f.A9K("actor_ig_userid", AbstractC003100w.A0k(10, str2));
        A0f.A9K("target_ig_userid", AbstractC003100w.A0k(10, str3));
        A0f.AAP("comment_id", str4);
        A0f.A9K("direct_thread_id", null);
        A0f.A9K("parent_comment_id", null);
        A0f.A9K(AbstractC111324zv.A00(131), null);
        A0f.AAP("entrypoint", null);
        A0f.A9M("extra_values", A0e);
        A0f.Cht();
    }

    public static final void A01(UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "mwb_igd_client_delta_received");
        if (A0f.isSampled()) {
            AbstractC31175DnJ.A15(A0f, str);
        }
    }
}
