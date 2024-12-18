package X;

import androidx.compose.foundation.FocusableElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.5Yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118675Yj {
    public static final C118685Yk A00 = new C118685Yk(C5XU.A00);

    public static final Modifier A00(C5XO c5xo, Modifier modifier, boolean z) {
        Modifier modifier2;
        if (z) {
            modifier2 = new FocusableElement(c5xo);
        } else {
            modifier2 = Modifier.A00;
        }
        return modifier.Eq3(modifier2);
    }
}
