package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.S3y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62253S3y {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean equalsIgnoreCase;
        C140966Yy c140966Yy;
        C63307ShD A0E;
        String str;
        Fragment A00;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        String A0s = AbstractC31173DnH.A0s(c6fw.A00, 1);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Bundle A0b = AbstractC166987dD.A0b();
        C62697SMl c62697SMl = new C62697SMl();
        c62697SMl.A00(A0s);
        c62697SMl.A01 = "fbpay_hub";
        AbstractC58322PtE.A19(A0b, c62697SMl);
        if (A0d == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = A0d.equalsIgnoreCase("PAYMENT_SETTINGS");
        }
        if (equalsIgnoreCase) {
            c140966Yy = new C140966Yy(A04, A0B);
            A0E = C2FP.A0E();
            str = "settings";
        } else {
            if (A0d != null && A0d.equalsIgnoreCase("SECURITY")) {
                A0b.putBoolean("should_log_view_load_success", true);
                c140966Yy = new C140966Yy(A04, A0B);
                A00 = C2FP.A03().A04.A00(A0b, "PIN_BIO_SETTINGS");
                C14360o3.A07(A00);
                c140966Yy.A0B(null, A00);
                c140966Yy.A04();
                return null;
            }
            if (A0d != null && A0d.equalsIgnoreCase("WELCOME_PAGE")) {
                A0b.putBoolean("show_branding_page", true);
                c140966Yy = new C140966Yy(A04, A0B);
                A0E = C2FP.A0E();
                str = "home";
            } else if (A0d != null && A0d.equalsIgnoreCase("ORDER_HISTORY")) {
                A0b.putString("sessionId", A0s);
                c140966Yy = new C140966Yy(A04, A0B);
                A0E = C2FP.A0E();
                str = "order_list";
            } else if (A0d != null && A0d.equalsIgnoreCase("TRANSACTION_HISTORY")) {
                c140966Yy = new C140966Yy(A04, A0B);
                A0E = C2FP.A0E();
                str = "transactions_list";
            } else {
                if (A0d != null && A0d.equalsIgnoreCase("PROMOTION_PAYMENTS")) {
                    C140966Yy c140966Yy2 = new C140966Yy(A04, A0B);
                    c140966Yy2.A0B(null, C2FP.A0E().A03(A0b, "promotion_payment"));
                    c140966Yy2.A0A = "OrderAndPaymentsPromotionPayments.BACK_STACK_NAME";
                    c140966Yy2.A04();
                    return null;
                }
                if (A0d != null && A0d.equalsIgnoreCase("DELIVERY_ADDRESS")) {
                    c140966Yy = new C140966Yy(A04, A0B);
                    A0E = C2FP.A0E();
                    str = "address";
                } else {
                    if (A0d != null && A0d.equalsIgnoreCase("DELIVERY_CONTACT")) {
                        c140966Yy = new C140966Yy(A04, A0B);
                        A0E = C2FP.A0E();
                        str = "contact_info";
                    }
                    return null;
                }
            }
        }
        A00 = A0E.A03(A0b, str);
        C14360o3.A07(A00);
        c140966Yy.A0B(null, A00);
        c140966Yy.A04();
        return null;
    }
}
