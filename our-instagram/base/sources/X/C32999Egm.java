package X;

import android.content.Context;

/* renamed from: X.Egm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32999Egm extends FP4 {
    public FP4 A00;

    @Override // X.FP4
    public final void startDeviceValidation(Context context, String str) {
        FP4 fp4 = this.A00;
        if (fp4 != null) {
            fp4.startDeviceValidation(context, str);
        }
    }

    public C32999Egm() {
        try {
            this.A00 = (FP4) Class.forName("com.instagram.nux.deviceverification.impl.VerificationPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            C0K8.A0F("DeviceVerificationPlugin", "Failed to instantiate Device Verification Plugin", th);
        }
    }
}
