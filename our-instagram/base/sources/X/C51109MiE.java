package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.MiE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51109MiE extends C110814yt {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51109MiE(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        float f;
        float f2;
        switch (this.A00) {
            case 1:
                C14360o3.A0B(displayMetrics, 0);
                f = displayMetrics.densityDpi;
                f2 = 6500.0f;
                break;
            case 2:
                C14360o3.A0B(displayMetrics, 0);
                f = displayMetrics.densityDpi;
                f2 = 10.0f;
                break;
            default:
                return super.A06(displayMetrics);
        }
        return f2 / f;
    }

    @Override // X.C110814yt
    public final int A07() {
        if (this.A00 != 0) {
            return super.A07();
        }
        return -1;
    }

    @Override // X.C110814yt
    public final int A08() {
        switch (this.A00) {
            case 2:
            case 3:
                return -1;
            default:
                return super.A08();
        }
    }
}
