package X;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes5.dex */
public abstract class BHJ {
    public static final int A00(float f) {
        double floor;
        double d = f;
        if (f >= 0.0f) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return -((int) floor);
    }

    public static final BHI A02(C5Tl c5Tl) {
        View view = (View) c5Tl.AJX(AndroidCompositionLocals_androidKt.A03);
        if (C0fH.A02()) {
            C0fH.A01(986604945, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        boolean AH4 = c5Tl.AH4(view);
        Object EEc = c5Tl.EEc();
        if (AH4 || EEc == C5UI.A00) {
            EEc = new BHI(view);
            c5Tl.FBy(EEc);
        }
        BHI bhi = (BHI) EEc;
        if (C0fH.A02()) {
            C0fH.A00(576166946);
        }
        return bhi;
    }

    public static final long A01(int[] iArr, long j) {
        float A01 = C119365at.A01(j);
        float f = iArr[0] * (-1.0f);
        if (A01 < 0.0f ? f < A01 : f > A01) {
            f = A01;
        }
        float A02 = C119365at.A02(j);
        float f2 = iArr[1] * (-1.0f);
        if (A02 < 0.0f ? f2 < A02 : f2 > A02) {
            f2 = A02;
        }
        return AbstractC119395aw.A00(f, f2);
    }
}
