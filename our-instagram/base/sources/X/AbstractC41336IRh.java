package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.IRh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41336IRh {
    public static C25621Ms A00(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        String str9;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        if (z) {
            str9 = "media/%s/%s/clips_question_response/";
        } else {
            str9 = "media/%s/%s/story_question_response/";
        }
        A0M.A0B(StringFormatUtil.formatStrLocaleSafe(str9, str, str2));
        A0M.A0S(C40781ul.class, C55702hA.class);
        A0M.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        A0M.A9s("client_context", str4);
        A0M.A9s(AbstractC111324zv.A00(4944), str5);
        A0M.A0H("container_module", str6);
        A0M.A9s("delivery_class", str7);
        A0M.A9s("tray_session_id", str8);
        A0M.A0D("tray_position", i);
        A0M.A9s("nav_chain", AbstractC25225BEi.A14());
        A0M.A0R = true;
        return A0M;
    }

    public static C1ON A01(UserSession userSession, C41628IbJ c41628IbJ) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B(String.format("media/%s/delete_story_question_response/", c41628IbJ.A00.getId()));
        AbstractC31176DnK.A1P(A0M, "question_id", c41628IbJ.A01.BjV());
        return AbstractC31172DnG.A0U(A0M, true);
    }
}
