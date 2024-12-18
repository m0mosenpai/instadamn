package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Rse, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61723Rse {
    public static final String A00(java.util.Set set) {
        C14360o3.A0B(set, 0);
        java.util.Set A0j = AbstractC001800i.A0j(AbstractC001800i.A0Z(AbstractC001800i.A0a(set)));
        List asList = Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", "usage_frequency");
        C14360o3.A07(asList);
        A0j.removeAll(AbstractC001800i.A0k(asList));
        String join = TextUtils.join(", ", A0j);
        C14360o3.A07(join);
        return join;
    }
}
