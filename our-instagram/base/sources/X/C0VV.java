package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.0VV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0VV {
    public static String A00(int i) {
        switch (i) {
            case 1:
                return "unknown";
            case 2:
                return "controller_init";
            case 3:
                return "missed_event";
            case 4:
                return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
            case 5:
                return "new_start";
            case 6:
                return "condition_not_met";
            case 7:
            default:
                return AnonymousClass001.A0O("UNKNOWN REASON ", i);
            case 8:
                return "writer_exception";
            case 9:
                return "logout";
        }
    }
}
