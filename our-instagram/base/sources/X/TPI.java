package X;

import androidx.biometric.BiometricFragment;

/* loaded from: classes10.dex */
public final class TPI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public TPI(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BiometricFragment biometricFragment = this.A01;
        BiometricFragment.A03(biometricFragment, this.A02, this.A00);
        biometricFragment.A05();
    }
}
