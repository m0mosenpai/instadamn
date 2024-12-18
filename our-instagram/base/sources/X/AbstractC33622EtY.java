package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.api.base.CacheBehaviorLogger;
import org.json.JSONObject;

/* renamed from: X.EtY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33622EtY {
    public Integer A00;
    public String A01;
    public String A02;

    public final JSONObject A00() {
        String str;
        JSONObject A0q = AbstractC31171DnF.A0q();
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "phone";
                    break;
                case 2:
                    str = "omnistring";
                    break;
                case 3:
                    str = "unknown";
                    break;
                default:
                    str = "email";
                    break;
            }
        } else {
            str = null;
        }
        A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A0q.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, this.A02);
        A0q.put(CacheBehaviorLogger.SOURCE, this.A01);
        return A0q;
    }
}
