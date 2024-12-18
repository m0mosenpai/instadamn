package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.5bG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119585bG {
    public static final long A00(C5Tl c5Tl, int i) {
        if (C0fH.A02()) {
            C0fH.A01(615015746, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        Context context = (Context) C5UT.A01(AndroidCompositionLocals_androidKt.A01, C117505Tk.A04((C117505Tk) c5Tl));
        long color = context.getResources().getColor(i, context.getTheme()) << 32;
        long j = C1132359l.A01;
        if (C0fH.A02()) {
            C0fH.A00(-299158786);
        }
        return color;
    }
}
