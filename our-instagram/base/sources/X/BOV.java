package X;

import android.graphics.drawable.GradientDrawable;

/* loaded from: classes5.dex */
public final class BOV {
    public final GradientDrawable A01(GradientDrawable.Orientation orientation, int i) {
        return A00(orientation, ((int) ((i / 255.0f) * 255.0f)) << 24);
    }

    public static final GradientDrawable A00(GradientDrawable.Orientation orientation, int i) {
        return new GradientDrawable(orientation, new int[]{AbstractC13950nL.A06(i, 1.0f), AbstractC13950nL.A06(i, 0.75f), AbstractC13950nL.A06(i, 0.5f), AbstractC13950nL.A06(i, 0.25f), AbstractC13950nL.A06(i, 0.1f), AbstractC13950nL.A06(i, 0.0f)});
    }
}
