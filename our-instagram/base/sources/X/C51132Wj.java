package X;

import android.content.Context;
import android.provider.Settings;

/* renamed from: X.2Wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51132Wj {
    public static final boolean A00 = C2V3.isEndToEndTestRun;

    public static final boolean A00(Context context) {
        if (C2V3.isAnimationDisabled) {
            return false;
        }
        if (!C2V3.isEndToEndTestRun) {
            return true;
        }
        if (context == null) {
            return false;
        }
        float f = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        if (!C2V3.forceEnableTransitionsForInstrumentationTests && f == 0.0f) {
            return false;
        }
        return true;
    }
}
