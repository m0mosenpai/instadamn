package X;

import androidx.biometric.BiometricFragment;

/* loaded from: classes10.dex */
public final class TJ7 implements Runnable {
    public final /* synthetic */ BiometricFragment A00;

    public TJ7(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01.A0L = false;
    }
}
