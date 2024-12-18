package X;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/* renamed from: X.4Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97374Yx {
    public static /* synthetic */ boolean A00(ColorFilter colorFilter, ColorFilter colorFilter2) {
        if ((colorFilter instanceof BlendModeColorFilter) && (colorFilter2 instanceof BlendModeColorFilter) && ((BlendModeColorFilter) colorFilter).getColor() != ((BlendModeColorFilter) colorFilter2).getColor()) {
            return true;
        }
        return false;
    }
}
