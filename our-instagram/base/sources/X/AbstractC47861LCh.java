package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LCh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47861LCh {
    public static C1ON A00(UserSession userSession, Integer num, String str) {
        int i;
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("language/translate/");
        A0N.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        switch (num.intValue()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        A0N.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.toString(i));
        C14360o3.A0B(userSession, 0);
        A0N.A0I(AbstractC111324zv.A00(356), new C57382kD(userSession).A00());
        return AbstractC31172DnG.A0S(A0N, HAN.class, IQY.class);
    }

    public static C1ON A01(UserSession userSession, List list) {
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("language/bulk_translate/");
        C14360o3.A0B(userSession, 0);
        A0N.A0I(AbstractC111324zv.A00(356), new C57382kD(userSession).A00());
        A0N.A0S(HAN.class, IQY.class);
        if (!list.isEmpty()) {
            A0N.A9s("comment_ids", C71473Il.A00(',').A02(list));
        }
        return A0N.A0N();
    }
}
