package X;

import android.content.Context;
import androidx.biometric.FingerprintDialogFragment;

/* loaded from: classes10.dex */
public final class TJB implements Runnable {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public TJB(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FingerprintDialogFragment fingerprintDialogFragment = this.A00;
        Context context = fingerprintDialogFragment.getContext();
        if (context == null) {
            android.util.Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            fingerprintDialogFragment.A04.A02(1);
            fingerprintDialogFragment.A04.A03(context.getString(2131962617));
        }
    }
}
