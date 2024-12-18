package X;

import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.Sbh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63060Sbh {
    public static final C2JO A00(OtcInput otcInput) {
        if (otcInput != null) {
            C2JO c2jo = new C2JO();
            c2jo.A09(otcInput.A00, "otc_session_id");
            c2jo.A09(otcInput.A01, "otc_type");
            return c2jo;
        }
        return null;
    }

    public static final C70073W1q A01(OtcInput otcInput) {
        return new C70073W1q(true, otcInput.A01);
    }

    public static void A02(Be9 be9, OtcInput otcInput) {
        be9.A07(String.valueOf(AbstractC62320S6q.A00.getAndIncrement()), "client_mutation_id");
        be9.A06(A00(otcInput), "one_time_checkout_input");
        String str = C2FP.A01().A0H;
        if (str != null && !AbstractC001900j.A0T(str)) {
            be9.A07(str, "actor_id");
        }
    }
}
