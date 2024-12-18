package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S4S {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A0b;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        String A0s2 = AbstractC31173DnH.A0s(list, 1);
        String A0s3 = AbstractC31173DnH.A0s(list, 2);
        Map map = (Map) list.get(3);
        List list2 = (List) c6fw.A03(4);
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 5);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 6);
        if (map != null && map.containsKey("payload")) {
            A0b = map.get("payload");
        } else {
            A0b = AbstractC58318PtA.A0b();
        }
        C18C.A0E(AbstractC166987dD.A1b(list2));
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Bundle A0b2 = AbstractC166987dD.A0b();
        A0b2.putString("AUTH_METHOD_TYPE", A0s3);
        A0b2.putString("PAYMENT_TYPE", A0s);
        A0b2.putString("PAYMENT_LOGGING_ID", A0s2);
        A0b2.putStringArray("PTT_UTIL_CAP_NAMES", AbstractC31173DnH.A1b(list2, 0));
        AbstractC63243Sfx.A02("VERIFY_BIO_TO_PAY", A0b2);
        C62697SMl c62697SMl = new C62697SMl();
        c62697SMl.A00(A0s2);
        c62697SMl.A00 = A0s2;
        c62697SMl.A01 = A0s;
        c62697SMl.A02 = null;
        c62697SMl.A03 = null;
        AbstractC58322PtE.A19(A0b2, c62697SMl);
        C63406Sjd.A09(A04, C2FP.A03().A02(A04).A04(new SE2(A0b2), A0b, AbstractC25226BEj.A1I(list2, 0)), new C63626SqY(c6fq, A0t2, A0t, 16));
        return null;
    }
}
