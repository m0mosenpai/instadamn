package X;

import android.view.View;

/* renamed from: X.075, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass075 {
    public static final Integer A00(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    return C05F.A0C;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown visibility ", i));
            }
            return C05F.A0N;
        }
        return C05F.A01;
    }

    public final Integer A01(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return C05F.A0N;
        }
        return A00(view.getVisibility());
    }
}
