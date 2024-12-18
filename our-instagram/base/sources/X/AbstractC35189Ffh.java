package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.Ffh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35189Ffh {
    public static final String A01(Resources resources, int i, boolean z, boolean z2) {
        int i2;
        C14360o3.A0B(resources, 0);
        if (z) {
            i2 = R.plurals.rolodex_minute;
            if (i < 60) {
                i2 = R.plurals.rolodex_second;
            }
            i /= 60;
        } else {
            i2 = R.plurals.rolodex_hour;
            if (i < 60) {
                i2 = R.plurals.rolodex_minute;
            }
            i /= 60;
        }
        String A0k = AbstractC167017dG.A0k(resources, i, i2);
        C14360o3.A0A(A0k);
        if (z2) {
            String A0r = AbstractC166997dE.A0r(resources, A0k, 2131975197);
            C14360o3.A0A(A0r);
            return A0r;
        }
        return A0k;
    }

    public static final String A02(Resources resources, long j) {
        C14360o3.A0B(resources, 0);
        float f = ((float) j) / 60.0f;
        if (f == 0 && j > 0) {
            f += 1.0f;
        }
        int i = (int) (f / 60.0f);
        int A01 = C1H4.A01(f % 60.0f);
        String A0k = AbstractC167017dG.A0k(resources, i, R.plurals.average_time_spent_hours);
        C14360o3.A07(A0k);
        String A0k2 = AbstractC167017dG.A0k(resources, A01, R.plurals.average_time_spent_minutes);
        C14360o3.A07(A0k2);
        if (i > 0) {
            if (A01 > 0) {
                String string = resources.getString(2131953573, A0k, A0k2);
                C14360o3.A0A(string);
                return string;
            }
            return A0k;
        }
        return A0k2;
    }

    public static final String A00(Context context, Integer num) {
        if (num == null) {
            return "";
        }
        return MX0.A01(context, (C461529z.A01() + num.intValue()) * 1000);
    }

    public static final String A03(Resources resources, long j) {
        int i;
        long j2;
        if (AbstractC16960so.A1Q(900L, 1800L, 2700L).contains(Long.valueOf(j))) {
            i = R.plurals.granted_extension_time_minutes;
            j2 = 60;
        } else {
            i = R.plurals.granted_extension_time_hours;
            j2 = 3600;
        }
        long j3 = j / j2;
        String A0W = AbstractC31175DnJ.A0W(resources, Long.valueOf(j3), i, (int) j3);
        C14360o3.A0A(A0W);
        return A0W;
    }
}
