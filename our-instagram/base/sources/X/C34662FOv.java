package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.FOv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34662FOv {
    public final void A00(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        AbstractC167027dH.A12(abstractC12990ll, str, str2);
        C14360o3.A0B(str4, 4);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "instagram_notification_inline_survey_response");
        if (A0f.isSampled()) {
            A0f.AAP("extra_data_token", str6);
            A0f.AAP("n_pk", str5);
            A0f.AAP("channel", str3);
            A0f.A9K("qp_id", Long.valueOf(AbstractC31178DnM.A03(AbstractC003100w.A0k(10, str))));
            A0f.AAP("question_id", str2);
            A0f.A9M(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, map);
            A0f.AAP("notification_type", str4);
            A0f.A9K("tessa_survey_config_id", AbstractC31177DnL.A0Z(str7));
            A0f.Cht();
        }
    }
}
