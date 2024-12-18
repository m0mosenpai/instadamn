package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DtQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31540DtQ {
    public static Map A00(C43H c43h) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c43h.B4V() != null) {
            A1I.put("fb_account_creation_time", c43h.B4V());
        }
        if (c43h.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c43h.getId());
        }
        c43h.CIs();
        A1I.put("is_valid", Boolean.valueOf(c43h.CIs()));
        if (c43h.BNU() != null) {
            A1I.put("link_time", c43h.BNU());
        }
        if (c43h.getName() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c43h.getName());
        }
        if (c43h.BiB() != null) {
            A1I.put("profile_url", c43h.BiB());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
