package X;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;

/* renamed from: X.0nG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13900nG {
    public static final void A00(Context context, String str) {
        C14360o3.A0B(context, 0);
        A01(context, str, null);
    }

    public static final void A01(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        CharSequence applicationLabel;
        if (str2 == null || str2.length() == 0) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo(((PackageItemInfo) context.getApplicationInfo()).packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (applicationInfo != null) {
                    applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                    str2 = applicationLabel.toString();
                }
            }
            applicationLabel = context.getString(R.string.untitled);
            str2 = applicationLabel.toString();
        }
        ClipData newPlainText = ClipData.newPlainText(str2, str);
        Object systemService = context.getSystemService("clipboard");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
    }
}
