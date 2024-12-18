package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.5Ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114515Ew extends C02G {
    public static void A03(Activity activity, C5GL c5gl) {
        SharedElementCallbackC31733Dwe sharedElementCallbackC31733Dwe;
        if (c5gl != null) {
            sharedElementCallbackC31733Dwe = new SharedElementCallbackC31733Dwe(c5gl);
        } else {
            sharedElementCallbackC31733Dwe = null;
        }
        activity.setEnterSharedElementCallback(sharedElementCallbackC31733Dwe);
    }

    public static void A04(Activity activity, C5GL c5gl) {
        SharedElementCallbackC31733Dwe sharedElementCallbackC31733Dwe;
        if (c5gl != null) {
            sharedElementCallbackC31733Dwe = new SharedElementCallbackC31733Dwe(c5gl);
        } else {
            sharedElementCallbackC31733Dwe = null;
        }
        activity.setExitSharedElementCallback(sharedElementCallbackC31733Dwe);
    }

    public static void A05(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0g("Permission request for permissions ", Arrays.toString(strArr), " must not contain null or empty values"));
                }
            } else {
                int size = hashSet.size();
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    for (int i3 = 0; i3 < length; i3++) {
                        hashSet.contains(Integer.valueOf(i3));
                    }
                }
                activity.requestPermissions(strArr, i);
                return;
            }
        }
    }

    public static boolean A06(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            if (i < 32) {
                if (i == 31) {
                    return BUT.A00(activity, str);
                }
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return BUR.A00(activity, str);
    }
}
