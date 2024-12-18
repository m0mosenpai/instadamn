package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* renamed from: X.2rS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61652rS {
    public static final EnumC23041Aj A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36312866156643681L)) {
            return EnumC23041Aj.BASIC_ADS_TIER_YOUTH;
        }
        if (C18U.A06(c06090Tz, userSession, 36312866156578144L)) {
            return EnumC23041Aj.BASIC_ADS_TIER_0;
        }
        if (C18U.A06(c06090Tz, userSession, 36312866156709218L)) {
            return EnumC23041Aj.BASIC_ADS_TIER_A;
        }
        if (C18U.A06(c06090Tz, userSession, 36312866156774755L)) {
            return EnumC23041Aj.BASIC_ADS_TIER_B;
        }
        if (C18U.A06(c06090Tz, userSession, 36312866156840292L)) {
            return EnumC23041Aj.BASIC_ADS_TIER_C;
        }
        if (C18U.A06(c06090Tz, userSession, 36312866157036901L)) {
            return EnumC23041Aj.BASIC_ADS_TIER_P;
        }
        return EnumC23041Aj.BASIC_ADS_TIER_NONE;
    }

    public static final EnumC23041Aj A01(C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 0);
        String A0C = c23031Ai.A0C();
        EnumC23041Aj enumC23041Aj = EnumC23041Aj.BASIC_ADS_TIER_YOUTH;
        if (!C14360o3.A0K(A0C, enumC23041Aj.toString())) {
            String A0C2 = c23031Ai.A0C();
            EnumC23041Aj enumC23041Aj2 = EnumC23041Aj.BASIC_ADS_TIER_0;
            if (!C14360o3.A0K(A0C2, enumC23041Aj2.toString())) {
                String A0C3 = c23031Ai.A0C();
                EnumC23041Aj enumC23041Aj3 = EnumC23041Aj.BASIC_ADS_TIER_A;
                if (!C14360o3.A0K(A0C3, enumC23041Aj3.toString())) {
                    String A0C4 = c23031Ai.A0C();
                    EnumC23041Aj enumC23041Aj4 = EnumC23041Aj.BASIC_ADS_TIER_B;
                    if (!C14360o3.A0K(A0C4, enumC23041Aj4.toString())) {
                        String A0C5 = c23031Ai.A0C();
                        EnumC23041Aj enumC23041Aj5 = EnumC23041Aj.BASIC_ADS_TIER_C;
                        if (!C14360o3.A0K(A0C5, enumC23041Aj5.toString())) {
                            String A0C6 = c23031Ai.A0C();
                            EnumC23041Aj enumC23041Aj6 = EnumC23041Aj.BASIC_ADS_TIER_P;
                            if (!C14360o3.A0K(A0C6, enumC23041Aj6.toString())) {
                                String A0C7 = c23031Ai.A0C();
                                EnumC23041Aj enumC23041Aj7 = EnumC23041Aj.BASIC_ADS_TIER_C_TEST;
                                if (!C14360o3.A0K(A0C7, enumC23041Aj7.toString())) {
                                    String A0C8 = c23031Ai.A0C();
                                    EnumC23041Aj enumC23041Aj8 = EnumC23041Aj.BASIC_ADS_TIER_SHARED;
                                    if (!C14360o3.A0K(A0C8, enumC23041Aj8.toString())) {
                                        return EnumC23041Aj.BASIC_ADS_TIER_NONE;
                                    }
                                    return enumC23041Aj8;
                                }
                                return enumC23041Aj7;
                            }
                            return enumC23041Aj6;
                        }
                        return enumC23041Aj5;
                    }
                    return enumC23041Aj4;
                }
                return enumC23041Aj3;
            }
            return enumC23041Aj2;
        }
        return enumC23041Aj;
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36312866157167974L);
    }

    public static final boolean A07(UserSession userSession, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 0);
        EnumC23041Aj A01 = A01(c23031Ai);
        EnumC23041Aj enumC23041Aj = EnumC23041Aj.BASIC_ADS_TIER_NONE;
        if (A01 == enumC23041Aj && A00(userSession) == enumC23041Aj) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "Should replace with surface level implementation instead")
    public static final boolean A08(UserSession userSession, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 0);
        C14360o3.A0B(userSession, 1);
        if (!C14360o3.A0K(c23031Ai.A0C(), EnumC23041Aj.BASIC_ADS_TIER_YOUTH.toString()) && !C18U.A06(C06090Tz.A05, userSession, 36312866156643681L)) {
            return false;
        }
        return true;
    }

    public static final boolean A09(UserSession userSession, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36312866157692270L)) {
            EnumC23041Aj A01 = A01(c23031Ai);
            EnumC23041Aj enumC23041Aj = EnumC23041Aj.BASIC_ADS_TIER_NONE;
            if (A01 != enumC23041Aj || A00(userSession) != enumC23041Aj) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 0);
        EnumC23041Aj A01 = A01(c23031Ai);
        EnumC23041Aj enumC23041Aj = EnumC23041Aj.BASIC_ADS_TIER_NONE;
        if ((A01 != enumC23041Aj || A00(userSession) != enumC23041Aj) && C18U.A06(C06090Tz.A05, userSession, 36312866157888881L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 0);
        if (!C14360o3.A0K(c23031Ai.A0C(), EnumC23041Aj.BASIC_ADS_TIER_C.toString())) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36312866156840292L) && !C14360o3.A0K(c23031Ai.A0C(), EnumC23041Aj.BASIC_ADS_TIER_P.toString()) && !C18U.A06(c06090Tz, userSession, 36312866157036901L)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        if (!C14360o3.A0K(AbstractC23021Ah.A00(userSession).A0C(), EnumC23041Aj.BASIC_ADS_TIER_YOUTH.toString()) && !C18U.A06(C06090Tz.A05, userSession, 36312866156643681L)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession) {
        if (A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36312866156447071L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        EnumC23041Aj A01 = A01(AbstractC23021Ah.A00(userSession));
        EnumC23041Aj enumC23041Aj = EnumC23041Aj.BASIC_ADS_TIER_NONE;
        if (A01 == enumC23041Aj && A00(userSession) == enumC23041Aj) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession) {
        if (A05(userSession) && C18U.A06(C06090Tz.A05, userSession, 36312866156447071L)) {
            return true;
        }
        return false;
    }
}
