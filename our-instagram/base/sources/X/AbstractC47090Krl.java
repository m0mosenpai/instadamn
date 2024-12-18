package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.Krl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47090Krl {
    public static final String A00(Context context, EnumC89613z1 enumC89613z1, int i) {
        Resources resources;
        int i2;
        int ordinal = enumC89613z1.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    resources = context.getResources();
                    if (ordinal != 3) {
                        i2 = R.plurals.countdown_sticker_month;
                    } else {
                        i2 = R.plurals.countdown_sticker_day;
                    }
                } else {
                    resources = context.getResources();
                    i2 = R.plurals.countdown_sticker_hour;
                }
            } else {
                resources = context.getResources();
                i2 = R.plurals.countdown_sticker_minute;
            }
        } else {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_second;
        }
        String quantityString = resources.getQuantityString(i2, i);
        C14360o3.A07(quantityString);
        return quantityString;
    }
}
