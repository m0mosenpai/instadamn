package X;

import android.content.Context;
import android.provider.Settings;
import java.util.List;

/* renamed from: X.7oB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173597oB {
    public static final C173597oB A00 = new Object();

    public final Integer A00(Context context) {
        try {
            String string = Settings.System.getString(context.getContentResolver(), "lock_application_shortcut");
            if (string != null) {
                List A0R = AbstractC001900j.A0R(string, new String[]{";"}, 0);
                if (A0R.size() <= 3) {
                    return C05F.A00;
                }
                String str = (String) A0R.get(1);
                String packageName = context.getApplicationContext().getPackageName();
                boolean z = false;
                if (AbstractC001900j.A0a(str, AnonymousClass001.A0R(packageName, "/com.instagram.lockscreen.LockScreenShortcutActivity"), false) || AbstractC001900j.A0a(str, AnonymousClass001.A0R(packageName, "/com.instagram.lockscreen.LockScreenCameraCaptureActivity"), false)) {
                    z = true;
                }
                if (z) {
                    return C05F.A0C;
                }
                String str2 = (String) A0R.get(3);
                String packageName2 = context.getApplicationContext().getPackageName();
                boolean z2 = false;
                if (AbstractC001900j.A0a(str2, AnonymousClass001.A0R(packageName2, "/com.instagram.lockscreen.LockScreenShortcutActivity"), false) || AbstractC001900j.A0a(str2, AnonymousClass001.A0R(packageName2, "/com.instagram.lockscreen.LockScreenCameraCaptureActivity"), false)) {
                    z2 = true;
                }
                if (z2) {
                    return C05F.A0N;
                }
            }
            return C05F.A01;
        } catch (SecurityException unused) {
            return C05F.A00;
        }
    }
}
