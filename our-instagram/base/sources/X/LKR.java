package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes8.dex */
public abstract class LKR {
    public static void A01(Bundle bundle) {
        bundle.putBoolean("useDebugKey", false);
        A02(bundle, byte[].class, "requestMessage");
        A02(bundle, Boolean.class, "useDebugKey");
        A02(bundle, Boolean.class, "backupAttributes");
        A02(bundle, Integer.class, "maxSessionAmount");
        A02(bundle, Integer.class, "sessionTTLOverrideMinutes");
        new Bundle();
    }

    public static Class A00(Bundle bundle) {
        A04(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, bundle);
        A02(bundle, Bundle.class, "auxArguments");
        A02(bundle, Bundle.class, "additionalKeyMaterial");
        A02(bundle, Boolean.class, "refreshVerifier");
        return Boolean.class;
    }

    public static void A03(Class cls, Object obj, String str) {
        Class<?> cls2;
        if (obj != null && (cls2 = obj.getClass()) != cls) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Expecting: ");
            A1C.append(cls);
            A1C.append(" under key ");
            A1C.append(str);
            throw AbstractC37303Gc4.A0M(cls2, " but was: ", A1C);
        }
    }

    public static void A04(String str, Bundle bundle) {
        Object obj = bundle.get(str);
        if (obj != null) {
            A03(byte[].class, obj, str);
            return;
        }
        throw AbstractC167007dF.A0c("Missing required key: ", str);
    }

    public static void A02(Bundle bundle, Class cls, String str) {
        A03(cls, bundle.get(str), str);
    }
}
