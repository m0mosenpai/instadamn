package X;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.5Vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118005Vk {
    public static final boolean A00(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(1744036670, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:40)");
        }
        if (C0fH.A02()) {
            C0fH.A01(1154605270, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z = false;
        if ((((Configuration) C5UT.A01(AndroidCompositionLocals_androidKt.A00, C117505Tk.A04((C117505Tk) c5Tl))).uiMode & 48) == 32) {
            z = true;
        }
        if (C0fH.A02()) {
            C0fH.A00(-2082198669);
        }
        if (C0fH.A02()) {
            C0fH.A00(751574677);
        }
        return z;
    }
}
