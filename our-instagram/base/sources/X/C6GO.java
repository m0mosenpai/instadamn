package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6GO, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6GO {
    public static final C6GU A00(final LazyListState lazyListState, C5Tl c5Tl) {
        final C6GP c6gp = C6GP.A00;
        if (C0fH.A02()) {
            C0fH.A01(-1641625064, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z = true;
        if (!c5Tl.AH4(lazyListState)) {
            z = false;
        }
        Object EEc = c5Tl.EEc();
        if (z || EEc == C5UI.A00) {
            EEc = new C6GS() { // from class: X.6GR
                /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
                
                    if (java.lang.Math.abs(r10) <= java.lang.Math.abs(r11)) goto L29;
                 */
                @Override // X.C6GS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final float AFI(float r20) {
                    /*
                        Method dump skipped, instructions count: 210
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C6GR.AFI(float):float");
                }

                @Override // X.C6GS
                public final float AF3(float f, float f2) {
                    float abs = Math.abs(f2);
                    List list = ((C6IF) lazyListState.A02()).A0D;
                    int i = 0;
                    if (!list.isEmpty()) {
                        int size = list.size();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            i += ((C137036Ig) ((InterfaceC137046Ii) it.next())).A09;
                        }
                        i /= size;
                    }
                    float f3 = abs - i;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    return f3 * Math.signum(f2);
                }
            };
            ((C117505Tk) c5Tl).A0Q(EEc);
        }
        C6GS c6gs = (C6GS) EEc;
        if (C0fH.A02()) {
            C0fH.A01(-1159999346, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:256)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        Object A01 = C5UT.A01(C5V2.A01, C117505Tk.A04(c117505Tk));
        boolean z2 = false;
        C6MY A00 = C6MS.A00(c5Tl);
        if (c5Tl.AH4(c6gs)) {
            z2 = true;
        }
        boolean AH4 = c5Tl.AH4(A00) | z2 | c5Tl.AH4(A01);
        Object EEc2 = c5Tl.EEc();
        if (AH4 || EEc2 == C5UI.A00) {
            EEc2 = new SnapFlingBehavior(new C5Y4(null, 1.0f, 400.0f), A00, c6gs);
            c117505Tk.A0Q(EEc2);
        }
        C6GU c6gu = (C6GU) EEc2;
        if (C0fH.A02()) {
            C0fH.A00(-954141855);
        }
        if (C0fH.A02()) {
            C0fH.A00(1413808976);
        }
        return c6gu;
    }
}
