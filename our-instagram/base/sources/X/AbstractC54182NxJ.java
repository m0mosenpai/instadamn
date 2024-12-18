package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.NxJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54182NxJ {
    public static final UQE A00(C67315Uk0 c67315Uk0) {
        String A0d = MSX.A0d(c67315Uk0, "fbid", 0);
        String A08 = c67315Uk0.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (A08 == null) {
            A08 = "";
        }
        return new UQE(A0d, A08, 8);
    }
}
