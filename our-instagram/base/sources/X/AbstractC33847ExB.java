package X;

import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.ExB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33847ExB {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC33445EqI enumC33445EqI;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, AbstractC58317Pt9.A00(1));
        RegFlowExtras regFlowExtras = (RegFlowExtras) C6BQ.A0B(c6fq).A01(RegFlowExtras.class, GTQ.A00);
        Iterator A15 = AbstractC166997dE.A15((Map) A01);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            Object value = A1K.getValue();
            if (A17 != null) {
                int hashCode = A17.hashCode();
                String A00 = AbstractC111324zv.A00(11);
                switch (hashCode) {
                    case -1813199520:
                        if (!A17.equals("force_signup_code")) {
                            break;
                        } else {
                            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0B = (String) value;
                            break;
                        }
                    case -1615090447:
                        if (!A17.equals("tos_version")) {
                            break;
                        } else {
                            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0X = (String) value;
                            break;
                        }
                    case -757782465:
                        if (!A17.equals("gdpr_required")) {
                            break;
                        } else {
                            C14360o3.A0C(value, A00);
                            regFlowExtras.A0n = AbstractC166987dD.A1a(value);
                            break;
                        }
                    case -570881039:
                        if (!A17.equals("gdpr_state")) {
                            break;
                        } else {
                            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0C = (String) value;
                            break;
                        }
                    case 3146030:
                        if (!A17.equals("flow")) {
                            break;
                        } else {
                            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            if (C14360o3.A0K(value, "phone")) {
                                enumC33445EqI = EnumC33445EqI.A06;
                            } else if (!C14360o3.A0K(value, "email")) {
                                break;
                            } else {
                                enumC33445EqI = EnumC33445EqI.A03;
                            }
                            regFlowExtras.A03(enumC33445EqI);
                            break;
                        }
                    case 96619420:
                        if (!A17.equals("email")) {
                            break;
                        } else {
                            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A08 = (String) value;
                            break;
                        }
                    case 558076639:
                        if (!A17.equals("age_required")) {
                            break;
                        } else {
                            C14360o3.A0C(value, A00);
                            regFlowExtras.A0g = AbstractC166987dD.A1a(value);
                            break;
                        }
                    case 1174780724:
                        if (!A17.equals("sms_consent")) {
                            break;
                        } else {
                            C14360o3.A0C(value, A00);
                            regFlowExtras.A0q = AbstractC166987dD.A1a(value);
                            break;
                        }
                    case 1274229687:
                        if (!A17.equals("confirmation_code")) {
                            break;
                        } else {
                            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A05 = (String) value;
                            break;
                        }
                    case 1663300947:
                        if (!A17.equals("country_code_data")) {
                            break;
                        } else {
                            C14360o3.A0C(value, AbstractC58317Pt9.A00(11));
                            Map map = (Map) value;
                            String A1A = AbstractC166987dD.A1A("country_number", map);
                            String A1A2 = AbstractC166987dD.A1A("country", map);
                            String A1A3 = AbstractC166987dD.A1A("display_string", map);
                            if (A1A != null && A1A3 != null && A1A2 != null) {
                                regFlowExtras.A01 = new CountryCodeData(A1A, A1A3, A1A2);
                                break;
                            }
                        }
                        break;
                    case 1821199090:
                        if (!A17.equals("phone_number_without_country_code")) {
                            break;
                        } else {
                            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0R = (String) value;
                            break;
                        }
                    case 1980340746:
                        if (!A17.equals("phone_number_with_country_code")) {
                            break;
                        } else {
                            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0Q = (String) value;
                            break;
                        }
                }
            }
        }
        return null;
    }
}
