package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.PzT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58656PzT {
    public final InterfaceC65295ThT A00;
    public final C58660PzX A01;
    public final BiometricManager A02;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r0.hasEnrolledFingerprints() == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00() {
        /*
            r3 = this;
            X.ThT r0 = r3.A00
            X.PzU r0 = (X.C58657PzU) r0
            android.content.Context r1 = r0.A00
            java.lang.Class<android.app.KeyguardManager> r0 = android.app.KeyguardManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            r2 = 0
            if (r0 == 0) goto L15
            boolean r2 = r0.isDeviceSecure()
        L15:
            X.PzX r0 = r3.A01
            if (r0 != 0) goto L29
            java.lang.String r1 = "BiometricManager"
            java.lang.String r0 = "Failure in canAuthenticate(). FingerprintManager was null."
            android.util.Log.e(r1, r0)
            r1 = 1
        L21:
            r0 = r1
            if (r2 == 0) goto L28
            r0 = -1
            if (r1 != 0) goto L28
            r0 = 0
        L28:
            return r0
        L29:
            android.content.Context r1 = r0.A00
            android.hardware.fingerprint.FingerprintManager r0 = X.AbstractC61635Rqz.A00(r1)
            if (r0 == 0) goto L47
            boolean r0 = r0.isHardwareDetected()
            if (r0 == 0) goto L47
            android.hardware.fingerprint.FingerprintManager r0 = X.AbstractC61635Rqz.A00(r1)
            if (r0 == 0) goto L44
            boolean r0 = r0.hasEnrolledFingerprints()
            r1 = 0
            if (r0 != 0) goto L21
        L44:
            r1 = 11
            goto L21
        L47:
            r1 = 12
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58656PzT.A00():int");
    }

    private int A01() {
        BiometricPrompt.CryptoObject A00;
        Method A02 = AbstractC58658PzV.A02();
        if (A02 != null && (A00 = AbstractC63224Sfb.A00(AbstractC63224Sfb.A01())) != null) {
            try {
                Object invoke = A02.invoke(this.A02, A00);
                if (invoke instanceof Integer) {
                    return AbstractC166987dD.A0H(invoke);
                }
                android.util.Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                android.util.Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int A022 = A02();
        if (!AbstractC63225Sfc.A00(((C58657PzU) this.A00).A00, Build.MODEL) && A022 == 0) {
            return A00();
        }
        return A022;
    }

    private int A02() {
        BiometricManager biometricManager = this.A02;
        if (biometricManager == null) {
            android.util.Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        return AbstractC58658PzV.A00(biometricManager);
    }

    public final int A03(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.A02;
            if (biometricManager == null) {
                android.util.Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            return AbstractC61617Rqh.A00(biometricManager, i);
        }
        if (!AbstractC61615Rqf.A00(i)) {
            return -2;
        }
        Context context = ((C58657PzU) this.A00).A00;
        if (context.getSystemService(KeyguardManager.class) == null) {
            return 12;
        }
        if ((32768 & i) != 0) {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
            if (keyguardManager != null && keyguardManager.isDeviceSecure()) {
                return 0;
            }
            return 11;
        }
        if (i2 == 29) {
            if ((i & 255) == 255) {
                return A02();
            }
            return A01();
        }
        if (context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return 12;
        }
        return A00();
    }

    public C58656PzT(InterfaceC65295ThT interfaceC65295ThT) {
        BiometricManager biometricManager;
        this.A00 = interfaceC65295ThT;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            biometricManager = interfaceC65295ThT.Ag5();
        } else {
            biometricManager = null;
        }
        this.A02 = biometricManager;
        this.A01 = i <= 29 ? new C58660PzX(((C58657PzU) interfaceC65295ThT).A00) : null;
    }
}
