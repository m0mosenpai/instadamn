package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.6wR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154166wR {
    public static final C154176wS A00(Context context, int i, boolean z) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i2 = dimensionPixelSize % 3;
        if (i2 != 0) {
            dimensionPixelSize += 3 - i2;
        }
        return new C154176wS(dimensionPixelSize, z, i);
    }
}
