package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: X.Ru1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61807Ru1 {
    public static boolean A00(Context context) {
        String str;
        int length;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.facebook.appmanager", 64).signatures;
            if (signatureArr == null || (length = signatureArr.length) == 0) {
                str = "AppManager has no signature.";
            } else if (length > 1) {
                str = "AppManager has multiple signatures.";
            } else {
                Signature signature = signatureArr[0];
                if (C1SD.A00.equals(signature) || C1SD.A01.equals(signature)) {
                    return true;
                }
                str = "AppManager does not have trusted Oxygen preload signature.";
            }
            C0K8.A0D("OxygenAppUpdateRequest", str);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            C0K8.A0H("OxygenAppUpdateRequest", "Failed to get AppManager info.", e);
            return false;
        }
    }
}
