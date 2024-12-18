package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S4O {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        C58252li A02;
        String A00 = C6AN.A00(c6fw.A01());
        String A002 = C6AN.A00(c6fw.A02());
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 2);
        String A0s2 = AbstractC31173DnH.A0s(list, 3);
        Map map = (Map) list.get(4);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 5);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 6);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (map == null) {
            map = AbstractC166987dD.A1G();
        }
        SPF spf = new SPF(A0s2, A002, A00, A0s, map);
        C14360o3.A0B(A04, 0);
        Bundle A0b = AbstractC166987dD.A0b();
        String str = spf.A03;
        if (str != null && str.length() != 0) {
            A0b.putString("PAYMENT_ACCOUNT_ID", str);
        }
        String str2 = spf.A00;
        if (str2 != null) {
            A0b.putString("AUTH_METHOD_TYPE", str2);
        }
        String str3 = spf.A01;
        A0b.putString("PAYMENT_TYPE", str3);
        C62697SMl c62697SMl = new C62697SMl();
        c62697SMl.A00(spf.A02);
        c62697SMl.A01 = str3;
        AbstractC58322PtE.A19(A0b, c62697SMl);
        Map map2 = spf.A04;
        Object obj = map2.get("capabilities");
        C14360o3.A0C(obj, AbstractC111324zv.A00(8));
        A0b.putStringArray("PTT_UTIL_CAP_NAMES", AbstractC31173DnH.A1b((List) obj, 0));
        if ("PAYPAL_ACCESS_TOKEN".equals(str2)) {
            A0b.putBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", true);
            SE2 A003 = AbstractC63061Sbi.A00(A0b, new SPN(null, (String) AbstractC58321PtD.A0o("secret_value", "null cannot be cast to non-null type kotlin.String", map2), (String) AbstractC58321PtD.A0o("credential_id", "null cannot be cast to non-null type kotlin.String", map2), null, null, null, str2, null, null, null), "CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION");
            C63345Si1 A022 = C2FP.A03().A02(A04);
            String str4 = (String) AbstractC58321PtD.A0o("target_operation", "null cannot be cast to non-null type kotlin.String", map2);
            Object obj2 = map2.get("ptt_payload");
            if (obj2 == null) {
                obj2 = AbstractC06930Yk.A0E();
            }
            A02 = A022.A04(A003, obj2, str4);
        } else {
            AbstractC63243Sfx.A02("VERIFY_PIN_TO_PAY", A0b);
            AbstractC63243Sfx.A03("VERIFY_PIN", A0b);
            C58252li A0I3 = AbstractC58318PtA.A0I();
            if ("PIN".equals(str2)) {
                C58773Q8f c58773Q8f = (C58773Q8f) C2FP.A03().A00().create(C58773Q8f.class);
                AbstractC58321PtD.A1D(c58773Q8f.A06, A0I3, new C50358MLk(A0I3, 39), 9);
                AbstractC58321PtD.A1D(c58773Q8f.A07, A0I3, new C50358MLk(A0I3, 40), 9);
                c58773Q8f.A02(A0b, null);
                c58773Q8f.A03((String) AbstractC58321PtD.A0o("secret_value", "null cannot be cast to non-null type kotlin.String", map2));
            } else if (!"CSC".equals(str2)) {
                C63406Sjd.A0C(A0I3, null);
            } else {
                C58771Q8d c58771Q8d = (C58771Q8d) C2FP.A03().A00().create(C58771Q8d.class);
                AbstractC58321PtD.A1D(c58771Q8d.A05, A0I3, new C50358MLk(A0I3, 41), 9);
                C58252li c58252li = c58771Q8d.A06;
                AbstractC58321PtD.A1D(c58252li, A0I3, new C50358MLk(A0I3, 42), 9);
                A0b.putString("CREDENTIAL_ID", (String) AbstractC58321PtD.A0o("credential_id", "null cannot be cast to non-null type kotlin.String", map2));
                c58771Q8d.A02(A0b);
                c58771Q8d.A02 = (String) AbstractC58321PtD.A0o("secret_value", "null cannot be cast to non-null type kotlin.String", map2);
                c58252li.A0A(null);
                if (!TextUtils.isEmpty(c58771Q8d.A02) && c58771Q8d.A02.length() == c58771Q8d.A01()) {
                    C58771Q8d.A00(c58771Q8d);
                }
            }
            A02 = C75M.A02(A0I3, new C65076Td9(39, spf, A0b));
        }
        A02.A06(A04, new C63626SqY(c6fq, A0I, A0I2, 14));
        return null;
    }
}
