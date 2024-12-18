package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.List;

/* renamed from: X.Sbi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63061Sbi {
    public static SE2 A02(String str, String str2, String str3, String str4, List list) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("PAYMENT_TYPE", str);
        A0b.putString("PAYMENT_LOGGING_ID", str2);
        if (!TextUtils.isEmpty(null)) {
            A0b.putString("PAYMENT_ACCOUNT_ID", null);
        }
        A0b.putStringArray("PTT_UTIL_CAP_NAMES", AbstractC31173DnH.A1b(list, 0));
        C62697SMl c62697SMl = new C62697SMl();
        c62697SMl.A00(str2);
        c62697SMl.A00 = str2;
        c62697SMl.A01 = str;
        c62697SMl.A02 = str3;
        c62697SMl.A03 = str4;
        AbstractC58322PtE.A19(A0b, c62697SMl);
        return new SE2(A0b);
    }

    public static SE2 A00(Bundle bundle, SPN spn, String str) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("AUTH_METHOD_TYPE", spn.A00);
        AbstractC63243Sfx.A02(str, bundle2);
        String str2 = spn.A02;
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("CREDENTIAL_ID", str2);
        }
        String str3 = spn.A01;
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("PAYPAL_LOGIN_URL", str3);
        }
        String str4 = spn.A03;
        if (!TextUtils.isEmpty(str4)) {
            bundle2.putString("PAYPAL_HIDDEN_EMAIL", str4);
        }
        String str5 = spn.A06;
        if (!TextUtils.isEmpty(str5)) {
            bundle2.putString("CARD_INFO", str5);
        }
        String str6 = spn.A04;
        if (!TextUtils.isEmpty(str6)) {
            bundle2.putString("NONCE", str6);
        }
        String str7 = spn.A05;
        if (!TextUtils.isEmpty(str7)) {
            bundle2.putString("THREE_DS_URL", str7);
        }
        return new SE2(bundle2);
    }

    public static SE2 A01(FBPayLoggerData fBPayLoggerData, String str) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("AUTH_METHOD_TYPE", "PIN");
        A0b.putString("PAYMENT_TYPE", str);
        A0b.putParcelable("logger_data", fBPayLoggerData);
        return new SE2(A0b);
    }
}
