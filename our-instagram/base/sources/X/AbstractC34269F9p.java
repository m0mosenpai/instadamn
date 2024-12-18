package X;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.F9p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34269F9p {
    public static String A00(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("IS_ADD_ACCOUNT_FLOW", false)) {
            String string = bundle.getString("page_id_for_suma_new_biz_account");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return null;
    }
}
