package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* renamed from: X.CWn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28015CWn {
    public static final Modifier A01(Modifier modifier, C5AH c5ah, float f, long j, long j2, boolean z) {
        if (Float.compare(f, 0.0f) > 0 || z) {
            return modifier.Eq3(new ShadowGraphicsLayerElement(c5ah, f, j, j2, z));
        }
        return modifier;
    }

    public static Modifier A00(C5Tl c5Tl, Modifier modifier, boolean z) {
        C5WI A00 = C5WF.A00();
        long j = AbstractC1132259k.A00;
        return C6L3.A01(A01(modifier, A00, 4.0f, j, j, z), C5WF.A00(), C5XL.A00(c5Tl).A0B);
    }
}
