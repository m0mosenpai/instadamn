package X;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: classes10.dex */
public abstract class SQM {
    public static void A00(BiometricPrompt.Builder builder) {
        builder.setConfirmationRequired(true);
    }

    public static void A01(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
