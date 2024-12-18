package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;

/* renamed from: X.PzU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58657PzU implements InterfaceC65295ThT {
    public final Context A00;

    @Override // X.InterfaceC65295ThT
    public final BiometricManager Ag5() {
        return AbstractC58658PzV.A01(this.A00);
    }

    public C58657PzU(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
