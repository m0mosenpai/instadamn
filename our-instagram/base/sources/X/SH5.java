package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public abstract class SH5 {
    public final Bundle A00;
    public final Bundle A01;
    public final SFG A02;
    public final String A03;

    public SH5(Bundle bundle, Bundle bundle2, SFG sfg, String str, boolean z) {
        AbstractC167017dG.A1R(bundle, bundle2);
        this.A03 = str;
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A02 = sfg;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
