package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.KlH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46698KlH {
    public static final int A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        return (AbstractC13880nE.A0A(context) - (dimensionPixelSize * 2)) / 3;
    }
}
