package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.4Ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93174Ft {
    @Deprecated(message = "")
    public static final EnumC172127lh A00(Map map) {
        String str;
        C14360o3.A0B(map, 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return C5L9.A00(map);
        }
        if (i == 33) {
            str = "android.permission.READ_MEDIA_IMAGES";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        return (EnumC172127lh) map.get(str);
    }

    public static final void A01(Activity activity, InterfaceC23471Cj interfaceC23471Cj) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(interfaceC23471Cj, 1);
        String[] A05 = A05(activity);
        AbstractC23451Ch.A04(activity, interfaceC23471Cj, (String[]) Arrays.copyOf(A05, A05.length));
    }

    public static final boolean A03(Context context) {
        C14360o3.A0B(context, 0);
        if (Build.VERSION.SDK_INT >= 34) {
            return C5L9.A02(context);
        }
        String[] A05 = A05(context);
        return AbstractC23451Ch.A08(context, (String[]) Arrays.copyOf(A05, A05.length));
    }

    public static final boolean A04(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C5L9.A03(context);
        }
        return false;
    }

    public static final boolean A02(Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C5L9.A01(activity);
        }
        for (String str : A05(activity)) {
            if (AbstractC23451Ch.A05(activity, str)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated(message = "")
    public static final String[] A05(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return C5L9.A04();
        }
        if (i == 33 && context.getApplicationInfo().targetSdkVersion >= 33) {
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.ACCESS_MEDIA_LOCATION"};
        }
        if (i >= 29) {
            return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.ACCESS_MEDIA_LOCATION"};
        }
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }
}
