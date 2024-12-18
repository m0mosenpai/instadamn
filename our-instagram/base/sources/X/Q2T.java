package X;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public final class Q2T extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ SVO A00;

    public Q2T(SVO svo) {
        this.A00 = svo;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A00.A02.A01(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.A00.A00.A02.A00();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((Q5e) this.A00.A00.A02).A00;
        if (weakReference.get() != null) {
            C58772Q8e c58772Q8e = (C58772Q8e) weakReference.get();
            C2GS c2gs = c58772Q8e.A09;
            if (c2gs == null) {
                c2gs = AbstractC58318PtA.A0J();
                c58772Q8e.A09 = c2gs;
            }
            C58772Q8e.A00(c2gs, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        SVO svo = this.A00;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        C63141Sdn c63141Sdn = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                c63141Sdn = new C63141Sdn(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                c63141Sdn = new C63141Sdn(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                c63141Sdn = new C63141Sdn(cryptoObject.getMac());
            }
        }
        C63291Sgr c63291Sgr = null;
        if (c63141Sdn != null) {
            Cipher cipher = c63141Sdn.A01;
            if (cipher != null) {
                c63291Sgr = new C63291Sgr(cipher);
            } else {
                Signature signature = c63141Sdn.A00;
                if (signature != null) {
                    c63291Sgr = new C63291Sgr(signature);
                } else {
                    Mac mac = c63141Sdn.A02;
                    if (mac != null) {
                        c63291Sgr = new C63291Sgr(mac);
                    }
                }
            }
        }
        svo.A00.A02.A02(new C62468SCv(c63291Sgr, 2));
    }
}
