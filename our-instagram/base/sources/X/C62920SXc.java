package X;

import java.util.Map;

/* renamed from: X.SXc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62920SXc {
    public static final C62920SXc A00 = new Object();
    public static final C03250Di A01;

    public final void A00(InterfaceC02550Ad interfaceC02550Ad, Integer num, String str, String str2, String str3, Map map, long j) {
        Integer num2;
        Ric ric;
        RiV riV;
        C14360o3.A0B(str, 2);
        if (interfaceC02550Ad != null) {
            InterfaceC02590Ai A0H = MSY.A0H(interfaceC02550Ad, "fx_third_party_account_linking");
            long A06 = AbstractC31177DnL.A06();
            if (j == 0) {
                num2 = C05F.A00;
            } else if (j <= A06) {
                num2 = C05F.A0C;
            } else {
                num2 = C05F.A01;
            }
            if (!A0H.isSampled()) {
                return;
            }
            switch (num.intValue()) {
                case 3:
                    ric = Ric.END_AUTH_FLOW;
                    break;
                case 4:
                    ric = Ric.END_CODE_EXCHANGE;
                    break;
                case 5:
                    ric = Ric.END_GET_AUTH_URL;
                    break;
                case 6:
                    ric = Ric.END_REFRESH_TOKEN;
                    break;
                case 7:
                    ric = Ric.SDK_INIT;
                    break;
                case 8:
                    ric = Ric.START_AUTH_FLOW;
                    break;
                case 9:
                    ric = Ric.START_CODE_EXCHANGE;
                    break;
                case 10:
                    ric = Ric.START_GET_AUTH_URL;
                    break;
                default:
                    ric = Ric.START_REFRESH_TOKEN;
                    break;
            }
            A0H.A8R(ric, "event");
            A0H.A9K("partner_integration_id", AbstractC25228BEl.A13(str));
            A0H.A8R(RiM.OAUTH, "auth_mechanism");
            int intValue = num2.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    riV = RiV.AUTHENTICATED_EXPIRED;
                } else {
                    riV = RiV.AUTHENTICATED_ACTIVE;
                }
            } else {
                riV = RiV.UNAUTHENTICATED;
            }
            A0H.A8R(riV, "authentication_state");
            A0H.A9M("extra_data", map);
            A0H.AAP("error_message", str2);
            A0H.AAP("error_stacktrace", str3);
            A0H.Cht();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SXc, java.lang.Object] */
    static {
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        A01 = c03250Di;
    }
}
