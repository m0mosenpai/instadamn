package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ServiceInfo;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodSubtype;

/* renamed from: X.94z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049194z {
    public static final String[] A00 = {"braille", "accessibility", "talkback", "quran", "islam"};

    public static final String A00(Context context, InputMethodInfo inputMethodInfo, InputMethodSubtype inputMethodSubtype) {
        String packageName;
        ServiceInfo serviceInfo;
        ApplicationInfo applicationInfo = null;
        if (inputMethodInfo != null) {
            try {
                packageName = inputMethodInfo.getPackageName();
            } catch (NullPointerException unused) {
                return "display_name_null";
            }
        } else {
            packageName = null;
        }
        if (inputMethodInfo != null && (serviceInfo = inputMethodInfo.getServiceInfo()) != null) {
            applicationInfo = ((ComponentInfo) serviceInfo).applicationInfo;
        }
        CharSequence displayName = inputMethodSubtype.getDisplayName(context, packageName, applicationInfo);
        C14360o3.A07(displayName);
        String obj = displayName.toString();
        if (obj == null) {
            return "";
        }
        return obj;
    }
}
