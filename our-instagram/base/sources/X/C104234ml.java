package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104234ml {
    private final boolean A00(C4CP c4cp, BPT bpt, UserSession userSession, boolean z) {
        BPT bpt2;
        if (c4cp == null) {
            return false;
        }
        int ordinal = c4cp.BgW().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 0 && ordinal != 3) {
                    throw new RuntimeException();
                }
                bpt2 = BPT.A04;
            } else {
                bpt2 = BPT.A02;
            }
        } else {
            bpt2 = BPT.A03;
        }
        if (bpt2 != bpt) {
            return false;
        }
        int ordinal2 = c4cp.AYh().ordinal();
        if (ordinal2 == 3) {
            return (z && C18U.A06(C06090Tz.A05, userSession, 36328761829965585L)) ? false : true;
        }
        if (ordinal2 != 2) {
            if (ordinal2 != 1) {
                if (ordinal2 != 0) {
                    throw new RuntimeException();
                }
                return false;
            }
            return A03(userSession, C05F.A0C, true);
        }
        return C18U.A06(C06090Tz.A05, userSession, 36318428138576010L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0059. Please report as an issue. */
    public final boolean A01(BPT bpt, UserSession userSession, C38321qM c38321qM, Integer num) {
        String str;
        int ordinal;
        C14360o3.A0B(bpt, 3);
        if (c38321qM != null) {
            User A2E = c38321qM.A2E(userSession);
            InterfaceC84133oz A1O = c38321qM.A1O();
            C27S.A00();
            C27V c27v = (C27V) userSession.A01(C27V.class, new C50250MHf(userSession, 6));
            C4CW c4cw = null;
            if (A2E != null) {
                str = A2E.getId();
            } else {
                str = null;
            }
            String A38 = c38321qM.A38();
            if (A38 != null) {
                C06090Tz c06090Tz = C06090Tz.A05;
                C27V.A00(c27v, new C43747JWi(c27v, A1O, num, str, A38, C18U.A06(c06090Tz, userSession, 36316491108585897L)));
                if (A1O != null) {
                    c4cw = A1O.B2S();
                }
                if (A2E != null && c4cw != null) {
                    switch (num.intValue()) {
                        case 0:
                            break;
                        case 1:
                            C4CP BdB = c4cw.BdB();
                            c4cw.CC9();
                            return A00(BdB, bpt, userSession, true);
                        case 2:
                            C4CP BdB2 = c4cw.BdB();
                            c4cw.CC9();
                            return A00(BdB2, bpt, userSession, false);
                        case 3:
                            InterfaceC116715Qa BaO = c4cw.BaO();
                            if (BaO == null || (ordinal = BaO.AYh().ordinal()) == 3) {
                                return false;
                            }
                            if (ordinal != 2) {
                                if (ordinal != 1) {
                                    if (ordinal == 0) {
                                        return false;
                                    }
                                    throw new RuntimeException();
                                }
                                return A03(userSession, C05F.A0C, true);
                            }
                            return C18U.A06(c06090Tz, userSession, 36318428138576010L);
                        default:
                            C4CS ApW = c4cw.ApW();
                            if (ApW == null) {
                                return false;
                            }
                            int ordinal2 = ApW.AYh().ordinal();
                            if (ordinal2 != 3) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 1) {
                                        if (ordinal2 == 0) {
                                            return false;
                                        }
                                        throw new RuntimeException();
                                    }
                                    return A03(userSession, C05F.A0C, true);
                                }
                                return C18U.A06(c06090Tz, userSession, 36318428138576010L);
                            }
                            return true;
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return false;
    }

    public final boolean A02(UserSession userSession) {
        if (!C18U.A06(C06090Tz.A05, userSession, 36316491108585897L)) {
            return false;
        }
        if (!AbstractC63302u8.A00(userSession).A04(UserMonetizationProductType.A0A) && !A03(userSession, C05F.A0C, false)) {
            return false;
        }
        return true;
    }

    public final boolean A03(UserSession userSession, Integer num, boolean z) {
        C06090Tz c06090Tz;
        long j;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return C18U.A06(C06090Tz.A05, userSession, 36316491108585897L);
            }
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            j = 36316491109372332L;
        } else {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            j = 36316491108585897L;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, j);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }
}
