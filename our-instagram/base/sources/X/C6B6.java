package X;

import android.view.View;

/* renamed from: X.6B6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6B6 {
    public final C78473fD A00;
    public final C2W2 A01;
    public final boolean A02;
    public final C135436As A03;

    public static int A00(float f, float f2) {
        int round;
        int i;
        if (f == f2) {
            round = Math.round(f);
            i = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        } else if (!Float.isNaN(f2)) {
            round = Math.round(f2);
            i = Integer.MIN_VALUE;
        } else {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(round, i);
    }

    public C6B6(C135436As c135436As, C78473fD c78473fD, C2W2 c2w2, boolean z) {
        this.A01 = c2w2;
        this.A00 = c78473fD;
        this.A03 = c135436As;
        this.A02 = z;
    }
}
