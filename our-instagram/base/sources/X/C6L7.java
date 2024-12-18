package X;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.6L7, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6L7 {
    public static final long A00(float f, long j) {
        long j2 = AbstractC137646Lk.A00;
        return AbstractC137636Lj.A00(Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f), Math.max(0.0f, AbstractC137646Lk.A00(j) - f));
    }

    public static final Modifier A01(C6KV c6kv, Modifier modifier, C5AH c5ah) {
        return A02(modifier, c6kv.A01, c5ah, c6kv.A00);
    }

    public static final Modifier A02(Modifier modifier, C6L5 c6l5, C5AH c5ah, float f) {
        return modifier.Eq3(new BorderModifierNodeElement(c6l5, c5ah, f));
    }

    public static final Modifier A03(Modifier modifier, C5AH c5ah, float f, long j) {
        return A02(modifier, new C6L4(j), c5ah, f);
    }
}
