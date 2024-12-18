package X;

import com.facebook.smartcapture.flow.SelfieCaptureConfig;

/* loaded from: classes10.dex */
public abstract class S1M {
    public static final boolean A00(SelfieCaptureConfig selfieCaptureConfig, C62430SBf c62430SBf) {
        C14360o3.A0B(c62430SBf, 1);
        Integer num = selfieCaptureConfig.A0K;
        if (num == null) {
            num = C05F.A01;
        }
        if (selfieCaptureConfig.A07 != null) {
            num = C05F.A00;
        }
        int intValue = num.intValue();
        if (intValue == 2) {
            return false;
        }
        if (intValue != 0 && c62430SBf.A00.getBoolean("onboarding_has_seen", false)) {
            return false;
        }
        return true;
    }
}
