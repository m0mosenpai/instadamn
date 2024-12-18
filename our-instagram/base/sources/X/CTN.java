package X;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class CTN {
    public final C28428Cga A00(C5Tl c5Tl) {
        C28428Cga c28428Cga;
        if (C0fH.A02()) {
            C0fH.A01(368819642, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
        }
        View view = (View) c5Tl.AJX(AndroidCompositionLocals_androidKt.A03);
        WeakHashMap weakHashMap = C28428Cga.A0O;
        synchronized (weakHashMap) {
            Object obj = weakHashMap.get(view);
            if (obj == null) {
                obj = new C28428Cga(view);
                weakHashMap.put(view, obj);
            }
            c28428Cga = (C28428Cga) obj;
        }
        boolean A1R = AbstractC25231BEo.A1R(c5Tl, c28428Cga, view);
        Object EEc = c5Tl.EEc();
        if (A1R || EEc == C5UI.A00) {
            EEc = DRZ.A00(c5Tl, c28428Cga, view, 24);
        }
        C5UX.A03(c5Tl, c28428Cga, (InterfaceC16660sJ) EEc);
        if (C0fH.A02()) {
            C0fH.A00(-1346871104);
        }
        return c28428Cga;
    }
}
