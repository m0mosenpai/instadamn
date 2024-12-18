package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.Locale;

/* renamed from: X.RsH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61700RsH {
    public static final C62412SAm A00(Context context, String str) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 1024);
        long longVersionCode = packageInfo.getLongVersionCode();
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = null;
        if (applicationInfo != null) {
            strArr = applicationInfo.sharedLibraryFiles;
        }
        String lowerCase = "com.google.android.trichromelibrary".toLowerCase();
        C14360o3.A07(lowerCase);
        if (strArr != null) {
            C0s6 c0s6 = new C0s6(strArr);
            while (c0s6.hasNext()) {
                String str2 = (String) c0s6.next();
                C14360o3.A0A(str2);
                Locale locale = Locale.US;
                C14360o3.A08(locale);
                if (AbstractC001900j.A0a(AbstractC31172DnG.A16(locale, str2), lowerCase, false)) {
                    break;
                }
            }
        }
        return new C62412SAm(longVersionCode);
    }
}
