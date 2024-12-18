package X;

import java.util.List;

/* loaded from: classes10.dex */
public abstract class S47 {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A03(0);
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 1);
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 2);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 3);
        C1Ee c1Ee = new C1Ee();
        c1Ee.A05("bank_account_number", str);
        if (A0s != null) {
            c1Ee.A05("payment_dev_cycle", A0s);
        }
        C1ON A01 = AnonymousClass963.A01(AbstractC24481Hr.A06.A00(new CallableC58499PwS(c1Ee, 6), 658, 2, false, false).A02(new C26561Ql(null), 747, 2, true, false).A01(new TG2(0), 748, 2), "FetchPaymentToken", "https://secure.facebook.com/payments/generate_token");
        A01.A00 = new C45552KEr(1, c6fq, A0t, A0t2);
        C1GJ.A03(A01);
        return null;
    }
}
