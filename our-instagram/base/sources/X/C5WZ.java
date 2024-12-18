package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5WZ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class C5WZ {
    public static final InterfaceC74953Yl A00(C5Tl c5Tl, Object obj) {
        if (C0fH.A02()) {
            C0fH.A01(202151877, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object EEc = c5Tl.EEc();
        if (EEc == C5UI.A00) {
            C74883Yd A00 = AbstractC74873Yc.A00();
            InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
            EEc = new ParcelableSnapshotMutableState(A00, obj);
            ((C117505Tk) c5Tl).A0Q(EEc);
        }
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) EEc;
        interfaceC74953Yl.Egh(obj);
        if (C0fH.A02()) {
            C0fH.A00(-1585011926);
        }
        return interfaceC74953Yl;
    }
}
