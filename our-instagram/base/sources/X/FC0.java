package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FC0 {
    public static int A00(Context context, C34957Fah c34957Fah) {
        int i;
        boolean z = c34957Fah.A02;
        boolean z2 = c34957Fah.A03;
        boolean z3 = c34957Fah.A00;
        if (z2) {
            if (z3) {
                i = R.attr.backgroundDrawableSingle;
                if (z) {
                    i = R.attr.backgroundElevatedDrawableSingle;
                }
            } else {
                i = R.attr.backgroundDrawableTop;
                if (z) {
                    i = R.attr.backgroundElevatedDrawableTop;
                }
            }
        } else if (z3) {
            i = R.attr.backgroundDrawableBottom;
            if (z) {
                i = R.attr.backgroundElevatedDrawableBottom;
            }
        } else {
            i = R.attr.backgroundDrawable;
            if (z) {
                i = R.attr.elevatedBackgroundDrawable;
            }
        }
        return AbstractC53242c7.A0H(context, i);
    }
}
