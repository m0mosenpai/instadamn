package X;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: X.0kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12270kV {
    public static final String A02(Context context, boolean z) {
        Object[] objArr;
        String str;
        C14360o3.A0B(context, 0);
        Locale locale = Locale.getDefault();
        if (z) {
            objArr = new Object[]{locale.toString(), locale.getLanguage(), A01(context)};
            str = "(%s; %s; %s)";
        } else {
            objArr = new Object[]{locale.toString(), locale.getLanguage()};
            str = "(%s; %s)";
        }
        return AbstractC13670mt.A06("%s %s Android %s", "Instagram", AbstractC12880la.A04(context), AbstractC13670mt.A06(str, objArr));
    }

    public static final String A00(Context context) {
        String str;
        String A04 = AbstractC12880la.A04(context);
        String A01 = A01(context);
        String obj = Locale.getDefault().toString();
        C14360o3.A07(obj);
        try {
            try {
                String str2 = Build.MANUFACTURER;
                String str3 = Build.BRAND;
                if (!C14360o3.A0K(str2, str3)) {
                    str2 = AbstractC13670mt.A06("%s/%s", str2, str3);
                }
                str = AbstractC13670mt.A06("(%s/%s; %s; %s; %s; %s; %s; %s; %s)", Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.RELEASE, A01, str2, Build.MODEL, Build.DEVICE, Build.HARDWARE, obj, String.valueOf(AbstractC12880la.A00()));
            } catch (Exception unused) {
                str = "(unknown build)";
            }
        } catch (Exception unused2) {
            str = AbstractC13670mt.A06("(%s/%s)", Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.RELEASE);
        }
        return AbstractC13670mt.A06("%s %s Android %s", "Instagram", A04, str);
    }

    public static final String A01(Context context) {
        int i;
        int i2;
        int i3;
        try {
            DisplayMetrics A0I = AbstractC13880nE.A0I(context);
            i = A0I.densityDpi;
            try {
                i2 = A0I.widthPixels;
                try {
                    i3 = A0I.heightPixels;
                } catch (Exception unused) {
                    i3 = 0;
                    return AbstractC13670mt.A06("%sdpi; %sx%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                }
            } catch (Exception unused2) {
                i2 = 0;
                i3 = 0;
                return AbstractC13670mt.A06("%sdpi; %sx%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } catch (Exception unused3) {
            i = 0;
        }
        return AbstractC13670mt.A06("%sdpi; %sx%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
