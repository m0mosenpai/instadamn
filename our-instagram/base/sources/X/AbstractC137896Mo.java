package X;

import android.content.Context;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.6Mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137896Mo {
    public static final Modifier A00(InterfaceC31113Dlv interfaceC31113Dlv, C6MZ c6mz, C6M3 c6m3, C6M4 c6m4, C5XO c5xo, C5Tl c5Tl, Modifier modifier, int i, boolean z, boolean z2) {
        InterfaceC137936Mt interfaceC137936Mt;
        Modifier modifier2;
        if ((i & 64) != 0) {
            interfaceC31113Dlv = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(1013264376, "androidx.compose.foundation.scrollingContainer (ScrollingContainer.kt:40)");
        }
        if (C0fH.A02()) {
            C0fH.A01(838754084, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        if (C0fH.A02()) {
            C0fH.A01(1070059059, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        Context context = (Context) C5UT.A01(AndroidCompositionLocals_androidKt.A01, C117505Tk.A04(c117505Tk));
        C137926Mr c137926Mr = (C137926Mr) C5UT.A01(AbstractC137906Mp.A00, C117505Tk.A04(c117505Tk));
        if (c137926Mr != null) {
            c5Tl.Eno(1586021609);
            boolean AH4 = c5Tl.AH4(context) | c5Tl.AH4(c137926Mr);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                EEc = new AndroidEdgeEffectOverscrollEffect(context, c137926Mr);
                c117505Tk.A0Q(EEc);
            }
            interfaceC137936Mt = (AndroidEdgeEffectOverscrollEffect) EEc;
            C117505Tk.A0L(c117505Tk, false);
        } else {
            c5Tl.Eno(1586120933);
            C117505Tk.A0I(c117505Tk);
            interfaceC137936Mt = C28720CmC.A00;
        }
        InterfaceC137936Mt interfaceC137936Mt2 = interfaceC137936Mt;
        if (C0fH.A02()) {
            C0fH.A00(-2142619774);
        }
        if (C0fH.A02()) {
            C0fH.A00(1056081614);
        }
        C6M3 c6m32 = C6M3.Vertical;
        if (c6m3 == c6m32) {
            modifier2 = AbstractC137966Mw.A01;
        } else {
            modifier2 = AbstractC137966Mw.A00;
        }
        Modifier Eq3 = modifier.Eq3(modifier2).Eq3(interfaceC137936Mt2.B0U());
        boolean z3 = !z2;
        if (C5UT.A01(C5V2.A07, C117505Tk.A04(c117505Tk)) == AnonymousClass583.Rtl && c6m3 != c6m32) {
            z3 = !z3;
        }
        Modifier Eq32 = Eq3.Eq3(new ScrollableElement(interfaceC137936Mt2, interfaceC31113Dlv, c6mz, c6m3, c6m4, c5xo, z, z3));
        if (C0fH.A02()) {
            C0fH.A00(-896437404);
        }
        return Eq32;
    }
}
