package X;

import android.content.Intent;

/* loaded from: classes6.dex */
public abstract class FWU {
    public static final Intent A00(Intent intent) {
        String str;
        if (intent != null) {
            String action = intent.getAction();
            if (action != null) {
                str = new C11L(AbstractC58317Pt9.A00(736)).A01(action, "android.");
            } else {
                str = null;
            }
            intent.setAction(str);
            return intent;
        }
        return null;
    }

    public static final boolean A01(String str) {
        if (str != null) {
            if ("android.intent.action.BOOT_COMPLETED".equals(str) || C14360o3.A0K(new C11L("android\\.").A01("android.intent.action.BOOT_COMPLETED", "com.instagram.android."), str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
