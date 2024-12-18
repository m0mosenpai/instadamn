package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14490oL {
    public static final String A02 = AnonymousClass001.A0R("market://details?id=", "com.instagram.android");
    public static final String[] A03 = {"com.android.vending", "com.google.android.gms", "com.google.market"};
    public static final android.net.Uri A01 = new Uri.Builder().scheme("market").authority("details").build();
    public static final android.net.Uri A00 = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").build();
    public static final Comparator A04 = new C15110pR(5);

    public static android.net.Uri A03(String str, String str2) {
        Uri.Builder buildUpon = A01.buildUpon();
        buildUpon.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("referrer", str2);
        }
        if (!TextUtils.isEmpty(null)) {
            buildUpon.appendQueryParameter("listing", null);
        }
        return buildUpon.build();
    }

    public static String A05(Context context, String str) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 0)) == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean A0I(Context context, String str, int i) {
        try {
            String A05 = A05(context, str);
            if (A05 == null || TextUtils.isEmpty(A05)) {
                return false;
            }
            return Integer.parseInt(A05.split("\\.", 2)[0]) >= i;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Intent A01(INK ink, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        ink.A00(intent, str);
        return intent;
    }

    public static boolean A0J(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return false;
        }
        return C0JS.A04(packageManager, str);
    }

    public static int A00(Context context, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            activityInfo.getClass();
            String str = ((PackageItemInfo) activityInfo).packageName;
            if (context.getPackageName().equals(str)) {
                return 0;
            }
            if ("com.instagram.android".equals(str)) {
                return 3;
            }
            if ("com.facebook.katana".equals(str) || "com.facebook.wakizashi".equals(str) || "com.instagram.barcelona".equals(str)) {
                return 4;
            }
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", AbstractC08820cl.A03("https://www.example.com"));
        PackageManager packageManager2 = context.getPackageManager();
        packageManager2.getClass();
        List<ResolveInfo> queryIntentActivities2 = packageManager2.queryIntentActivities(intent2, 0);
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Comparator comparator = A04;
            C14360o3.A0B(queryIntentActivities2, 0);
            C14360o3.A0B(comparator, 2);
            if ((queryIntentActivities2 instanceof Collection) && queryIntentActivities2.isEmpty()) {
                return 1;
            }
            Iterator<ResolveInfo> it2 = queryIntentActivities2.iterator();
            while (it2.hasNext()) {
                if (comparator.compare(it2.next(), resolveInfo) == 0) {
                    break;
                }
            }
            return 1;
        }
        return 2;
    }

    public static Intent A02(INK ink, String str, String str2) {
        String A0R = AnonymousClass001.A0R("market://details?id=", str);
        if (str2 != null) {
            A0R = AnonymousClass001.A0g(A0R, "&referrer=utm_source%3D", str2);
        }
        return A01(ink, AbstractC08820cl.A03(A0R).toString());
    }

    public static String A04(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (A0J(packageManager, "com.instagram.barcelona")) {
            return "com.instagram.barcelona";
        }
        if (A0J(packageManager, "com.instagram.barcelona.debug")) {
            return "com.instagram.barcelona.debug";
        }
        return null;
    }

    public static void A06(Context context, INK ink, String str, String str2) {
        String str3;
        try {
        } catch (ActivityNotFoundException e) {
            if (e.getMessage() != null) {
                str3 = e.getMessage();
            } else {
                str3 = "ActivityNotFound";
            }
            C0w9.A03("PackageUtil", str3);
        }
        if (!C12260kU.A09((Activity) context, A02(ink, str, str2), 0)) {
            A07(context, str, str2);
        }
    }

    public static void A07(Context context, String str, String str2) {
        String A0R = AnonymousClass001.A0R("market://details?id=", str);
        if (str2 != null) {
            A0R = AnonymousClass001.A0g(A0R, "&referrer=utm_source%3D", str2);
        }
        android.net.Uri A032 = AbstractC08820cl.A03(A0R);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(A032);
        if (!C12260kU.A0E(context, intent)) {
            C12260kU.A0G(context, A00.buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str).build());
        }
    }

    public static void A08(Context context, String str, boolean z) {
        String str2;
        ComponentName componentName = new ComponentName(context.getPackageName(), str);
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        Intent intent = new Intent();
        intent.setComponent(componentName);
        try {
            packageManager.getClass();
            if (packageManager.resolveActivity(intent, 131584) != null) {
                int i = 2;
                if (z) {
                    i = 1;
                }
                packageManager.setComponentEnabledSetting(componentName, i, 1);
            }
        } catch (RuntimeException e) {
            if (e.getMessage() != null) {
                str2 = e.getMessage();
            } else {
                str2 = "Runtime";
            }
            C0w9.A03("PackageUtil", str2);
        }
    }

    public static boolean A09(Context context) {
        String packageName = context.getPackageName();
        if (!packageName.equals("com.instagram.barcelona") && !packageName.equals("com.instagram.barcelona.debug")) {
            return false;
        }
        return true;
    }

    public static boolean A0A(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (!A0J(packageManager, "com.instagram.barcelona") && !A0J(packageManager, "com.instagram.barcelona.debug")) {
            return false;
        }
        return true;
    }

    public static boolean A0B(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (!A0J(packageManager, "com.facebook.katana") && !A0J(packageManager, "com.facebook.wakizashi")) {
            return false;
        }
        return true;
    }

    public static boolean A0C(Context context) {
        String packageName = context.getPackageName();
        if (!packageName.equals("com.instagram.android") && !packageName.equals("com.instagram.android.debug")) {
            return false;
        }
        return true;
    }

    public static boolean A0D(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (!A0J(packageManager, "com.instagram.android") && !A0J(packageManager, "com.instagram.android.debug")) {
            return false;
        }
        return true;
    }

    public static boolean A0E(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (!A0J(packageManager, "com.facebook.stella") && !A0J(packageManager, "com.facebook.stella_debug")) {
            return false;
        }
        return true;
    }

    public static boolean A0F(Context context) {
        String str;
        PackageManager packageManager = context.getPackageManager();
        boolean z = false;
        if (packageManager == null || packageManager.getLaunchIntentForPackage("com.android.vending") == null) {
            return false;
        }
        try {
            z = packageManager.getApplicationInfo("com.android.vending", 0).enabled;
            return z;
        } catch (PackageManager.NameNotFoundException e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "NameNotFound";
            }
            C0w9.A03("PackageUtil", str);
            return z;
        }
    }

    public static boolean A0G(Context context) {
        return A0J(context.getPackageManager(), "com.whatsapp");
    }

    public static boolean A0H(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getClass();
            packageManager.getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
