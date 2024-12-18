package X;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import com.facebook.R;

/* renamed from: X.6vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153796vo {
    public static final int A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        int i2 = dimensionPixelSize * 2;
        int A01 = AbstractC13890nF.A01(context);
        if (context instanceof Activity) {
            A01 -= C73O.A00((Activity) context);
        }
        return (A01 - i2) / 3;
    }

    public static final Size A01(Context context, float f) {
        C14360o3.A0B(context, 0);
        return new Size(A00(context), C1H4.A01(A00(context) / f));
    }
}
