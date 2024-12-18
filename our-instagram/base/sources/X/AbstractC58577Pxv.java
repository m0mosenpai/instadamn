package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: X.Pxv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58577Pxv {
    public static final C25548BRk A00(C120985dq c120985dq, UserSession userSession, long j, boolean z, boolean z2) {
        C06090Tz c06090Tz;
        long j2;
        Double valueOf;
        double doubleValue;
        long j3;
        int A07;
        double A00;
        long j4;
        double A002;
        double A003;
        long j5;
        long j6;
        long j7;
        long j8;
        Double valueOf2;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        C14360o3.A0B(userSession, 0);
        if (z) {
            if (z2) {
                c06090Tz = C06090Tz.A06;
                j6 = 36598992587787645L;
            } else if (c120985dq != null && c120985dq.CdW()) {
                c06090Tz = C06090Tz.A06;
                j6 = 36598992583724398L;
            } else {
                c06090Tz = C06090Tz.A06;
                j6 = 36598992586673528L;
            }
            long A072 = AbstractC25225BEi.A07(c06090Tz, userSession, j6);
            if (z2) {
                j7 = 36598992587853182L;
            } else if (c120985dq != null && c120985dq.CdW()) {
                j7 = 36598992583789935L;
            } else {
                j7 = 36598992586739065L;
            }
            long A073 = AbstractC25225BEi.A07(c06090Tz, userSession, j7);
            if (j <= A072) {
                if (c120985dq != null && c120985dq.CdW()) {
                    j11 = 37161942537273529L;
                } else {
                    j11 = 37161942540419273L;
                }
                doubleValue = C18U.A00(c06090Tz, userSession, j11);
                C14360o3.A0A(Double.valueOf(doubleValue));
                if (c120985dq != null && c120985dq.CdW()) {
                    j12 = 36598992583658861L;
                } else {
                    j12 = 36598992586607991L;
                }
                A07 = AbstractC25225BEi.A07(c06090Tz, userSession, j12);
                if (c120985dq != null && c120985dq.CdW()) {
                    j13 = 37161942537732288L;
                } else {
                    j13 = 37161942540812494L;
                }
                A00 = C18U.A00(c06090Tz, userSession, j13);
                C14360o3.A0A(Double.valueOf(A00));
                if (c120985dq != null && c120985dq.CdW()) {
                    j14 = 37161942537666751L;
                } else {
                    j14 = 37161942540615884L;
                }
                A002 = C18U.A00(c06090Tz, userSession, j14);
                C14360o3.A0A(Double.valueOf(A002));
                if (c120985dq != null && c120985dq.CdW()) {
                    j15 = 37161942537339066L;
                } else {
                    j15 = 37161942540550347L;
                }
                A003 = C18U.A00(c06090Tz, userSession, j15);
                C14360o3.A0A(Double.valueOf(A003));
                j5 = 37161942537535677L;
            } else if (j > A073) {
                if (z2) {
                    valueOf2 = Double.valueOf(C18U.A00(c06090Tz, userSession, 37161942539501764L));
                } else {
                    if (c120985dq != null && c120985dq.CdW()) {
                        j8 = 37161942536945848L;
                    } else {
                        j8 = 37161942540484810L;
                    }
                    valueOf2 = Double.valueOf(C18U.A00(c06090Tz, userSession, j8));
                    C14360o3.A0A(valueOf2);
                }
                doubleValue = valueOf2.doubleValue();
                if (z2) {
                    A07 = (int) C18U.A00(c06090Tz, userSession, 37161942539305154L);
                } else {
                    if (c120985dq != null && c120985dq.CdW()) {
                        j9 = 36598992583593324L;
                    } else {
                        j9 = 36598992587263355L;
                    }
                    A07 = AbstractC25225BEi.A07(c06090Tz, userSession, j9);
                }
                A00 = C18U.A00(c06090Tz, userSession, 37161942537404603L);
                if (z2) {
                    j10 = 37161942541336784L;
                } else if (c120985dq != null && c120985dq.CdW()) {
                    j10 = 37161942537470140L;
                } else {
                    j10 = 37161942540222663L;
                }
                A002 = C18U.A00(c06090Tz, userSession, j10);
                C14360o3.A0A(Double.valueOf(A002));
                A003 = C18U.A00(c06090Tz, userSession, 37161942537797825L);
                j5 = 37161942537601214L;
            }
            return new C25548BRk(doubleValue, A00, A002, A003, C18U.A00(c06090Tz, userSession, j5), A07);
        }
        if (z2) {
            c06090Tz = C06090Tz.A06;
            valueOf = Double.valueOf(C18U.A00(c06090Tz, userSession, 37161942539567301L));
        } else {
            if (c120985dq != null && c120985dq.CdW()) {
                c06090Tz = C06090Tz.A06;
                j2 = 37161942535831731L;
            } else {
                c06090Tz = C06090Tz.A06;
                j2 = 37161942540746957L;
            }
            valueOf = Double.valueOf(C18U.A00(c06090Tz, userSession, j2));
            C14360o3.A0A(valueOf);
        }
        doubleValue = valueOf.doubleValue();
        if (z2) {
            A07 = (int) C18U.A00(c06090Tz, userSession, 37161942539370691L);
        } else {
            if (c120985dq != null && c120985dq.CdW()) {
                j3 = 36598992582479205L;
            } else {
                j3 = 36598992586870138L;
            }
            A07 = AbstractC25225BEi.A07(c06090Tz, userSession, j3);
        }
        A00 = C18U.A00(c06090Tz, userSession, 37161942535962804L);
        if (z2) {
            j4 = 37161942541402321L;
        } else if (c120985dq != null && c120985dq.CdW()) {
            j4 = 37161942536093878L;
        } else {
            j4 = 37161942540353736L;
        }
        A002 = C18U.A00(c06090Tz, userSession, j4);
        C14360o3.A0A(Double.valueOf(A002));
        A003 = C18U.A00(c06090Tz, userSession, 37161942536028341L);
        j5 = 37161942536224951L;
        return new C25548BRk(doubleValue, A00, A002, A003, C18U.A00(c06090Tz, userSession, j5), A07);
    }

    public static final C25548BRk A01(UserSession userSession, long j) {
        Integer num;
        C14360o3.A0B(userSession, 0);
        QIn qIn = ((C63129SdZ) userSession.A01(C63129SdZ.class, new C43203J8a(userSession, 10))).A00;
        if (j <= qIn.A00) {
            num = C05F.A00;
        } else if (j <= qIn.A01) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return qIn.A04;
            }
            return qIn.A03;
        }
        return qIn.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String A02(C120985dq c120985dq, UserSession userSession) {
        String str;
        Py1 py1;
        C14360o3.A0B(userSession, 0);
        if (c120985dq != null && !c120985dq.CdW() && !C18U.A06(C06090Tz.A06, userSession, 36317517611406662L)) {
            return null;
        }
        if (C18U.A06(C06090Tz.A06, userSession, 36317517611996491L)) {
            C63333Shk A00 = CLT.A00(userSession);
            synchronized (A00) {
                str = A00.A01;
                py1 = A00;
            }
        } else {
            Py1 A002 = BSJ.A00(userSession);
            synchronized (A002) {
                str = A002.A01;
                py1 = A002;
            }
        }
        return str;
    }

    public static final boolean A03(Context context, C120985dq c120985dq, UserSession userSession) {
        ArrayList A17;
        boolean z;
        ArrayList A172;
        ArrayList A173;
        AbstractC167007dF.A1D(userSession, 0, context);
        BSJ.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36317517611996491L)) {
            CLT.A00(userSession);
        }
        C06090Tz c06090Tz2 = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz2, userSession, 36317517609112895L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36317517611406662L);
        boolean A063 = C18U.A06(c06090Tz2, userSession, 36317517611013444L);
        boolean A064 = C18U.A06(c06090Tz, userSession, 36317517610947907L);
        if (c120985dq != null && (c120985dq.CdW() || A062)) {
            if (C18U.A06(c06090Tz, userSession, 36317517611996491L)) {
                C63333Shk A00 = CLT.A00(userSession);
                synchronized (A00) {
                    UserSession userSession2 = A00.A03;
                    if (Py0.A01(userSession2)) {
                        z = CJV.A00(userSession2).A00();
                        A00.A01 = CJV.A00(userSession2).A02;
                    } else {
                        boolean A02 = Py0.A02(userSession2);
                        ArrayList A002 = C63333Shk.A00(A00);
                        C14360o3.A0B(userSession2, 0);
                        double A003 = C18U.A00(c06090Tz, userSession2, 37161942539829446L);
                        if (A003 > 0.0d) {
                            int A07 = AbstractC25225BEi.A07(c06090Tz, userSession2, 36598992586280309L);
                            int A072 = AbstractC25225BEi.A07(c06090Tz, userSession2, 36598992586214772L);
                            if (A072 > 0) {
                                z = C63333Shk.A03(A00, A002, null, A003, A07, A072);
                                if (A02 && C14360o3.A0K(A00.A01, "not_swiper")) {
                                    z = C63333Shk.A03(A00, A002, C63333Shk.A01(A00), A003, A07, A072);
                                }
                            } else {
                                int A073 = AbstractC25225BEi.A07(c06090Tz, userSession2, 36598992586345846L);
                                if (A073 > 0) {
                                    z = C63333Shk.A02(A00, A002, null, A003, A07, A073);
                                    if (A02 && C14360o3.A0K(A00.A01, "not_swiper")) {
                                        z = C63333Shk.A02(A00, A002, C63333Shk.A01(A00), A003, A07, A073);
                                    }
                                }
                            }
                        }
                        A00.A01 = null;
                        A00.A00 = 0.0d;
                        z = false;
                    }
                }
            } else {
                Py1 A004 = BSJ.A00(userSession);
                synchronized (A004) {
                    UserSession userSession3 = A004.A03;
                    if (Py0.A01(userSession3)) {
                        z = CJV.A00(userSession3).A00();
                        A004.A01 = CJV.A00(userSession3).A02;
                    } else {
                        Type type = new C60777RSm().A00;
                        boolean A022 = Py0.A02(userSession3);
                        C14360o3.A0B(userSession3, 0);
                        boolean A065 = C18U.A06(c06090Tz2, userSession3, 36317517611734346L);
                        InterfaceC19630xq interfaceC19630xq = A004.A04;
                        String string = interfaceC19630xq.getString("KEY_SWIPE_HISTORY_V2", null);
                        if (string != null) {
                            Object A09 = A004.A02.A09(string, type);
                            C14360o3.A07(A09);
                            A17 = (ArrayList) A09;
                        } else {
                            A17 = AbstractC25225BEi.A17(20);
                        }
                        double A005 = C18U.A00(c06090Tz, userSession3, 37161942539829446L);
                        if (A005 > 0.0d) {
                            int A074 = AbstractC25225BEi.A07(c06090Tz, userSession3, 36598992586280309L);
                            int A075 = AbstractC25225BEi.A07(c06090Tz, userSession3, 36598992586214772L);
                            if (A075 > 0) {
                                z = Py1.A01(A004, A17, A005, A074, A075);
                                if (A022 && C14360o3.A0K(A004.A01, "not_swiper")) {
                                    String string2 = interfaceC19630xq.getString("KEY_PROFILE_SWIPE_HISTORY", null);
                                    if (string2 != null) {
                                        Object A092 = A004.A02.A09(string2, type);
                                        C14360o3.A07(A092);
                                        A173 = (ArrayList) A092;
                                    } else {
                                        A173 = AbstractC25225BEi.A17(20);
                                    }
                                    if (A065) {
                                        A173.addAll(A17);
                                    }
                                    z = Py1.A01(A004, A173, A005, A074, A075);
                                }
                            } else {
                                int A076 = AbstractC25225BEi.A07(c06090Tz, userSession3, 36598992586345846L);
                                if (A076 > 0) {
                                    z = Py1.A00(A004, A17, A005, A074, A076);
                                    if (A022 && C14360o3.A0K(A004.A01, "not_swiper")) {
                                        String string3 = interfaceC19630xq.getString("KEY_PROFILE_SWIPE_HISTORY", null);
                                        if (string3 != null) {
                                            Object A093 = A004.A02.A09(string3, type);
                                            C14360o3.A07(A093);
                                            A172 = (ArrayList) A093;
                                        } else {
                                            A172 = AbstractC25225BEi.A17(20);
                                        }
                                        if (A065) {
                                            A172.addAll(A17);
                                        }
                                        z = Py1.A00(A004, A172, A005, A074, A076);
                                    }
                                }
                            }
                        }
                        A004.A01 = null;
                        A004.A00 = 0.0d;
                        z = false;
                    }
                }
            }
            String A023 = A02(c120985dq, userSession);
            if (A06) {
                if (A063) {
                    if (!z && (!C14360o3.A0K(A023, "not_swiper") || !A064)) {
                        return false;
                    }
                    return true;
                }
                return z;
            }
            if (A063) {
                return A064;
            }
        }
        return false;
    }
}
