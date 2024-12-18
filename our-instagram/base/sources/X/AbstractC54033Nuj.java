package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.Nuj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54033Nuj {
    public static AnonymousClass710 A00(Context context, boolean z) {
        int[] iArr;
        int i;
        if (z) {
            iArr = new int[]{R.color.grey_5, R.color.grey_5};
            i = R.color.fds_transparent;
        } else {
            iArr = new int[]{R.color.design_dark_default_color_on_background, R.color.grey_1, R.color.grey_2};
            i = R.color.grey_4;
        }
        return AnonymousClass710.A00(context, iArr, 1.5f, i, R.color.fds_transparent, context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
    }
}
