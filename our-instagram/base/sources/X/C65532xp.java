package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65532xp {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final java.util.Set A04 = AbstractC16830sb.A07(EnumC65542xq.A0A, EnumC65542xq.A02, EnumC65542xq.A05, EnumC65542xq.A04, EnumC65542xq.A0B, EnumC65542xq.A07, EnumC65542xq.A08, EnumC65542xq.A03, EnumC65542xq.A06);

    public static final boolean A00(AbstractC65572xt abstractC65572xt, String str) {
        if (C14360o3.A0K(abstractC65572xt, C65582xu.A00)) {
            return true;
        }
        if (C14360o3.A0K(abstractC65572xt, C65562xs.A00)) {
            return str.equals("feed_timeline");
        }
        if (abstractC65572xt instanceof C66762zt) {
            return ((C66762zt) abstractC65572xt).A00.contains(str);
        }
        return false;
    }

    public static final boolean A01(C65532xp c65532xp, String str) {
        Collection values = c65532xp.A00.values();
        if (values == null || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (A00((AbstractC65572xt) it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A02(C65532xp c65532xp, String str) {
        Collection values = c65532xp.A01.values();
        if (values == null || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (A00((AbstractC65572xt) it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x010a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x01cb. Please report as an issue. */
    public C65532xp(C65522xo c65522xo) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        UserSession userSession2;
        C06090Tz c06090Tz2;
        String name;
        AbstractC65572xt A00;
        long j2;
        UserSession userSession3;
        C06090Tz c06090Tz3;
        long j3;
        UserSession userSession4;
        C06090Tz c06090Tz4;
        String name2;
        AbstractC65572xt A002;
        long j4;
        UserSession userSession5;
        C06090Tz c06090Tz5;
        long j5;
        UserSession userSession6;
        C06090Tz c06090Tz6;
        long j6;
        EnumC65552xr[] values = EnumC65552xr.values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC65552xr enumC65552xr : values) {
            C14360o3.A0B(enumC65552xr, 0);
            int ordinal = enumC65552xr.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 0) {
                        userSession6 = c65522xo.A00;
                        c06090Tz6 = C06090Tz.A05;
                        j6 = 36880154031620396L;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    userSession6 = c65522xo.A00;
                    c06090Tz6 = C06090Tz.A05;
                    j6 = 36880154032013616L;
                }
            } else {
                userSession6 = c65522xo.A00;
                c06090Tz6 = C06090Tz.A05;
                j6 = 36880154031358249L;
            }
            linkedHashMap.put(enumC65552xr, C65522xo.A00(c65522xo, C18U.A04(c06090Tz6, userSession6, j6), enumC65552xr.name()));
        }
        this.A00 = linkedHashMap;
        EnumC65552xr[] values2 = EnumC65552xr.values();
        int A0L2 = AbstractC16850sd.A0L(values2.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (EnumC65552xr enumC65552xr2 : values2) {
            C14360o3.A0B(enumC65552xr2, 0);
            int ordinal2 = enumC65552xr2.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 == 0) {
                        userSession5 = c65522xo.A00;
                        c06090Tz5 = C06090Tz.A05;
                        j5 = 36880154035487033L;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    userSession5 = c65522xo.A00;
                    c06090Tz5 = C06090Tz.A05;
                    j5 = 36880154032079153L;
                }
            } else {
                userSession5 = c65522xo.A00;
                c06090Tz5 = C06090Tz.A05;
                j5 = 36886278650004171L;
            }
            linkedHashMap2.put(enumC65552xr2, C65522xo.A00(c65522xo, C18U.A04(c06090Tz5, userSession5, j5), enumC65552xr2.name()));
        }
        this.A01 = linkedHashMap2;
        java.util.Set set = this.A04;
        int A0L3 = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(set, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(A0L3 < 16 ? 16 : A0L3);
        for (Object obj : set) {
            EnumC65542xq enumC65542xq = (EnumC65542xq) obj;
            C14360o3.A0B(enumC65542xq, 0);
            switch (enumC65542xq.ordinal()) {
                case 0:
                    userSession3 = c65522xo.A00;
                    c06090Tz3 = C06090Tz.A05;
                    j3 = 36880154031751470L;
                    A002 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz3, userSession3, j3), enumC65542xq.name());
                    break;
                case 1:
                    userSession3 = c65522xo.A00;
                    c06090Tz3 = C06090Tz.A05;
                    j3 = 36880154032341298L;
                    A002 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz3, userSession3, j3), enumC65542xq.name());
                    break;
                case 2:
                case 8:
                default:
                    A002 = null;
                    break;
                case 3:
                    userSession3 = c65522xo.A00;
                    c06090Tz3 = C06090Tz.A05;
                    j3 = 36886278651118288L;
                    A002 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz3, userSession3, j3), enumC65542xq.name());
                    break;
                case 4:
                    userSession3 = c65522xo.A00;
                    c06090Tz3 = C06090Tz.A05;
                    j3 = 36880154031817007L;
                    A002 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz3, userSession3, j3), enumC65542xq.name());
                    break;
                case 5:
                    userSession4 = c65522xo.A00;
                    c06090Tz4 = C06090Tz.A05;
                    String A04 = C18U.A04(c06090Tz4, userSession4, 36886278650135245L);
                    name2 = enumC65542xq.name();
                    A002 = C65522xo.A00(c65522xo, A04, name2);
                    if (A002 == null) {
                        j4 = 36880154031685933L;
                        A002 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz4, userSession4, j4), name2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    userSession3 = c65522xo.A00;
                    c06090Tz3 = C06090Tz.A05;
                    j3 = 36880154032472372L;
                    A002 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz3, userSession3, j3), enumC65542xq.name());
                    break;
                case 7:
                    userSession4 = c65522xo.A00;
                    c06090Tz4 = C06090Tz.A05;
                    String A042 = C18U.A04(c06090Tz4, userSession4, 36886278650069708L);
                    name2 = enumC65542xq.name();
                    A002 = C65522xo.A00(c65522xo, A042, name2);
                    if (A002 == null) {
                        j4 = 36880154032537909L;
                        A002 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz4, userSession4, j4), name2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    userSession3 = c65522xo.A00;
                    c06090Tz3 = C06090Tz.A05;
                    j3 = 36886278651052751L;
                    A002 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz3, userSession3, j3), enumC65542xq.name());
                    break;
            }
            linkedHashMap3.put(obj, A002);
        }
        this.A02 = linkedHashMap3;
        java.util.Set set2 = this.A04;
        int A0L4 = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(set2, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(A0L4 < 16 ? 16 : A0L4);
        for (Object obj2 : set2) {
            EnumC65542xq enumC65542xq2 = (EnumC65542xq) obj2;
            C14360o3.A0B(enumC65542xq2, 0);
            switch (enumC65542xq2.ordinal()) {
                case 0:
                    userSession = c65522xo.A00;
                    c06090Tz = C06090Tz.A05;
                    j = 36880154032668982L;
                    A00 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz, userSession, j), enumC65542xq2.name());
                    break;
                case 1:
                    userSession2 = c65522xo.A00;
                    c06090Tz2 = C06090Tz.A05;
                    String A043 = C18U.A04(c06090Tz2, userSession2, 36886278649938634L);
                    name = enumC65542xq2.name();
                    A00 = C65522xo.A00(c65522xo, A043, name);
                    if (A00 == null) {
                        j2 = 36880154032406835L;
                        A00 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz2, userSession2, j2), name);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    userSession = c65522xo.A00;
                    c06090Tz = C06090Tz.A05;
                    j = 36886278649676488L;
                    A00 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz, userSession, j), enumC65542xq2.name());
                    break;
                case 3:
                case 6:
                case 7:
                default:
                    A00 = null;
                    break;
                case 4:
                    userSession = c65522xo.A00;
                    c06090Tz = C06090Tz.A05;
                    j = 36880154032734519L;
                    A00 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz, userSession, j), enumC65542xq2.name());
                    break;
                case 5:
                    userSession2 = c65522xo.A00;
                    c06090Tz2 = C06090Tz.A05;
                    String A044 = C18U.A04(c06090Tz2, userSession2, 36886278650921678L);
                    name = enumC65542xq2.name();
                    A00 = C65522xo.A00(c65522xo, A044, name);
                    if (A00 == null) {
                        j2 = 36880154034700600L;
                        A00 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz2, userSession2, j2), name);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    userSession = c65522xo.A00;
                    c06090Tz = C06090Tz.A05;
                    j = 36880154035618106L;
                    A00 = C65522xo.A00(c65522xo, C18U.A04(c06090Tz, userSession, j), enumC65542xq2.name());
                    break;
            }
            linkedHashMap4.put(obj2, A00);
        }
        this.A03 = linkedHashMap4;
    }
}
