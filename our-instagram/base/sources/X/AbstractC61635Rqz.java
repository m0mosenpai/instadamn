package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

/* renamed from: X.Rqz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61635Rqz {
    public static FingerprintManager A00(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }
}
