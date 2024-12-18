package X;

import android.hardware.biometrics.BiometricManager;

/* renamed from: X.Rqh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61617Rqh {
    public static int A00(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
