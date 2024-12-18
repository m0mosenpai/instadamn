package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;

/* renamed from: X.6tZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC152466tZ {
    public static final C5SW A00(Activity activity, View view, EnumC58132lV enumC58132lV, String str) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(str, 2);
        return A01(activity, view, enumC58132lV, str, activity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), view.getWidth() / 2);
    }

    public static final C5SW A01(Activity activity, View view, EnumC58132lV enumC58132lV, String str, int i, int i2) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(enumC58132lV, 3);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i3 = iArr[0] + i2;
        int i4 = iArr[1];
        if (enumC58132lV == EnumC58132lV.A02) {
            i4 -= i;
        } else if (enumC58132lV == EnumC58132lV.A03) {
            i4 += view.getHeight() + i;
        }
        C5SU c5su = new C5SU(activity, new C149686oL(str));
        View findViewById = activity.findViewById(android.R.id.content);
        C14360o3.A07(findViewById);
        c5su.A04(findViewById, i3, i4, false);
        c5su.A05 = enumC58132lV;
        return c5su.A00();
    }

    public static final C5SW A02(Activity activity, View view, String str) {
        C14360o3.A0B(str, 2);
        return A01(activity, view, EnumC58132lV.A02, str, activity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), view.getWidth() / 2);
    }

    public static final boolean A03(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            return false;
        }
        return true;
    }
}
