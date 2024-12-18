package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;

/* loaded from: classes10.dex */
public final class Q2S extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ AbstractC61603RqS A00;

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public Q2S(AbstractC61603RqS abstractC61603RqS) {
        this.A00 = abstractC61603RqS;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.A00.A00();
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        C63291Sgr c63291Sgr;
        if (authenticationResult != null) {
            c63291Sgr = AbstractC63224Sfb.A02(authenticationResult.getCryptoObject());
        } else {
            c63291Sgr = null;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = AbstractC61614Rqe.A00(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.A00.A02(new C62468SCv(c63291Sgr, i2));
    }
}
