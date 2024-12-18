package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class I9C {
    public static final int A00(Context context) {
        int A0A = (int) (((AbstractC13880nE.A0A(context) - AbstractC167017dG.A03(context)) - (AbstractC167017dG.A05(context) * 2.75f)) / 2.75f);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.birthday_selfie_preview_margin_top);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        if (dimensionPixelSize > A0A) {
            dimensionPixelSize = A0A;
        }
        if (dimensionPixelSize2 < dimensionPixelSize) {
            return dimensionPixelSize;
        }
        return dimensionPixelSize2;
    }
}
