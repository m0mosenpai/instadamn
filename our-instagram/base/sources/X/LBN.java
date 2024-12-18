package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class LBN {
    public static final int A01(Context context, boolean z) {
        C14360o3.A0B(context, 0);
        int A00 = A00(context, EnumC46217Kct.A06);
        if (z) {
            A00 /= 3;
        }
        return A00 - (context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material) * 2);
    }

    public static final int A00(Context context, EnumC46217Kct enumC46217Kct) {
        AbstractC167017dG.A1N(context, enumC46217Kct);
        float f = enumC46217Kct.A00;
        Resources resources = context.getResources();
        if (f > 0.0f) {
            return (int) (Math.ceil(((AbstractC13890nF.A01(context) - resources.getDimensionPixelOffset(R.dimen.afi_margin_top)) / f) / 4.0f) * 4.0d);
        }
        return resources.getDimensionPixelOffset(R.dimen.album_preview_add_item_circle_size);
    }
}
