package X;

import com.instagram.api.schemas.DayOfTheWeek;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.292, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass292 {
    public static final XG6 A02(UserSession userSession) {
        Integer Bzj;
        C14360o3.A0B(userSession, 0);
        List list = AnonymousClass280.A02;
        List<XG6> A01 = AnonymousClass282.A01(userSession);
        long A00 = A00();
        if (A01 != null) {
            for (XG6 xg6 : A01) {
                if (xg6 != null && (Bzj = xg6.Bzj()) != null) {
                    int intValue = Bzj.intValue();
                    Integer B23 = xg6.B23();
                    if (B23 != null) {
                        int intValue2 = B23.intValue();
                        if (intValue <= A00 && A00 <= intValue2 && A05(xg6)) {
                            return xg6;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.XG6 A03(com.instagram.common.session.UserSession r9) {
        /*
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            java.util.List r0 = X.AnonymousClass280.A02
            java.util.List r0 = X.AnonymousClass282.A01(r9)
            long r8 = A00()
            r7 = 0
            if (r0 == 0) goto L54
            java.util.Iterator r6 = r0.iterator()
        L15:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r5 = r6.next()
            X.XG6 r5 = (X.XG6) r5
            if (r5 == 0) goto L15
            java.lang.Integer r0 = r5.Bzj()
            if (r7 != 0) goto L3c
            if (r0 == 0) goto L15
            int r0 = r0.intValue()
            long r1 = (long) r0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L15
        L34:
            boolean r0 = A05(r5)
            if (r0 == 0) goto L15
            r7 = r5
            goto L15
        L3c:
            java.lang.Integer r4 = r7.Bzj()
            if (r0 == 0) goto L15
            if (r4 == 0) goto L15
            int r3 = r0.intValue()
            long r1 = (long) r3
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L15
            int r0 = r4.intValue()
            if (r3 >= r0) goto L15
            goto L34
        L54:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass292.A03(com.instagram.common.session.UserSession):X.XG6");
    }

    public static final Integer A04(XG6 xg6, UserSession userSession) {
        String BKx;
        Integer B23;
        Integer Bzj;
        List Avr;
        C14360o3.A0B(userSession, 0);
        if (xg6.B23() != null && r0.intValue() == 86399 && (BKx = xg6.BKx()) != null && (B23 = xg6.B23()) != null) {
            int intValue = B23.intValue();
            if (xg6.Bzj() != null && xg6.Avr() != null && intValue == 86399) {
                List list = AnonymousClass280.A02;
                List A01 = AnonymousClass282.A01(userSession);
                if (A01 != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(5, 1);
                    int i = calendar.get(7);
                    Iterator it = A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        XG6 xg62 = (XG6) it.next();
                        String BKx2 = xg62.BKx();
                        if (BKx2 != null && (Bzj = xg62.Bzj()) != null) {
                            int intValue2 = Bzj.intValue();
                            if (xg62.B23() != null && (Avr = xg62.Avr()) != null && BKx2.equals(BKx) && intValue2 == 0 && Avr.contains(A01(i))) {
                                Integer num = xg62.Eyv().A00;
                                if (num != null) {
                                    return num;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean A05(XG6 xg6) {
        List Avr;
        C14360o3.A0B(xg6, 0);
        DayOfTheWeek A01 = A01(Calendar.getInstance().get(7));
        if (A01 == null || (Avr = xg6.Avr()) == null || !Avr.contains(A01)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession) {
        List list = AnonymousClass280.A02;
        List A01 = AnonymousClass282.A01(userSession);
        if (A01 == null) {
            return false;
        }
        if (!(A01 instanceof Collection) || !A01.isEmpty()) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                if (A05((XG6) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, EnumC456327x enumC456327x) {
        C14360o3.A0B(userSession, 1);
        if (enumC456327x != null) {
            int ordinal = enumC456327x.ordinal();
            if (ordinal != 0) {
                if ((ordinal == 5 || ordinal == 4) && A02(userSession) != null) {
                    return true;
                }
                return false;
            }
            return new C29W(userSession).A04();
        }
        return false;
    }

    public static final long A00() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (System.currentTimeMillis() / 1000) - (calendar.getTimeInMillis() / 1000);
    }

    public static final DayOfTheWeek A01(int i) {
        switch (i) {
            case 1:
                return DayOfTheWeek.A07;
            case 2:
                return DayOfTheWeek.A05;
            case 3:
                return DayOfTheWeek.A09;
            case 4:
                return DayOfTheWeek.A0B;
            case 5:
                return DayOfTheWeek.A08;
            case 6:
                return DayOfTheWeek.A04;
            case 7:
                return DayOfTheWeek.A06;
            default:
                return null;
        }
    }
}
