package X;

import android.os.Bundle;

/* renamed from: X.QEn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58877QEn extends SVS {
    public final String A00() {
        String string = this.A00.getString("TrackingInfo.ARG_MODULE_NAME", "in_app_browser_v2");
        C14360o3.A07(string);
        return string;
    }

    public C58877QEn(Bundle bundle) {
        Bundle A0b;
        if (bundle != null) {
            A0b = new Bundle(bundle);
        } else {
            A0b = AbstractC166987dD.A0b();
        }
        this.A00 = A0b;
    }

    public C58877QEn() {
    }
}
