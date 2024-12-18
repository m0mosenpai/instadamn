package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.19S, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C19S {
    public static String A00() {
        String upperCase;
        C19U A01 = C11830jh.A04.A01(AbstractC12960li.A00).A01(C19T.A22);
        if (A01 == null) {
            upperCase = "";
        } else {
            upperCase = A01.A01.toUpperCase(Locale.ROOT);
        }
        if (TextUtils.isEmpty(upperCase)) {
            C0K8.A0O("MobileConfigIGUtils", "Initializing device id MetaConfig with empty family device id:%s", "EMPTY_FAMILY_DEVICE_ID");
            return "EMPTY_FAMILY_DEVICE_ID";
        }
        return upperCase;
    }
}
