package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OGJ {
    public final int A00(Context context, Integer num) {
        Resources resources = context.getResources();
        Integer num2 = C05F.A01;
        int i = R.dimen.account_discovery_bottom_gap;
        if (num == num2) {
            i = R.dimen.abc_button_padding_horizontal_material;
        }
        return (int) ((AbstractC13880nE.A0A(context) - (resources.getDimensionPixelOffset(i) * Math.ceil(4.3d))) / 4.3d);
    }
}
