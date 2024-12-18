package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;

/* renamed from: X.SJi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62625SJi {
    public final LinkedHashMap A00(String str, String str2, boolean z) {
        LinkedHashMap A03 = AbstractC06930Yk.A03(AbstractC25232BEp.A1F("with_ads_disclosure", String.valueOf(z), AbstractC166987dD.A1L("user_action", str), AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2)));
        A03.get("action");
        A03.put("IS_BLOKS_ACTION", "true");
        return A03;
    }
}
