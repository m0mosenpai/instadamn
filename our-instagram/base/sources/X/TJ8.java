package X;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class TJ8 implements Runnable {
    public final WeakReference A00;

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((BiometricFragment) weakReference.get()).A06();
        }
    }

    public TJ8(BiometricFragment biometricFragment) {
        this.A00 = AbstractC25225BEi.A16(biometricFragment);
    }
}
