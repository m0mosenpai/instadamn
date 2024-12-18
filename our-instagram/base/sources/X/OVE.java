package X;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OVE {
    public static final OVE A00 = new Object();

    public final Size A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        int i2 = dimensionPixelSize * 2;
        int A01 = AbstractC13890nF.A01(context);
        boolean z = context instanceof Activity;
        if (z) {
            A01 -= C73O.A00((Activity) context);
        }
        int i3 = (A01 - i2) / 3;
        int A04 = AbstractC166997dE.A04(context, R.dimen.photo_grid_spacing);
        int i4 = A04 % 3;
        if (i4 != 0) {
            A04 += 3 - i4;
        }
        int i5 = A04 * 2;
        int A012 = AbstractC13890nF.A01(context);
        if (z) {
            A012 -= C73O.A00((Activity) context);
        }
        return new Size(i3, MSW.A02((A012 - i5) / 3, 0.75f));
    }
}
