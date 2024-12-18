package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Idd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41707Idd {
    public static final C41019IEo A01(UserSession userSession, C38321qM c38321qM, C65192xH c65192xH, int i) {
        C41019IEo c41019IEo;
        String str;
        C38321qM A0E;
        InterfaceC39541sb A0F;
        if (c65192xH != null) {
            Iterator it = AbstractC001800i.A0p(c65192xH.A08()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C0eP c0eP = (C0eP) next;
                int i3 = c0eP.A00;
                C3XG c3xg = (C3XG) c0eP.A01;
                if (i3 > i && C3YW.A01(c3xg)) {
                    C1XV c1xv = null;
                    C3XG A04 = c65192xH.A04(i2);
                    if (A04 != null) {
                        c1xv = A04.A06;
                    }
                    str = "next_sponsored_item_is_non_ad_item";
                    if (c1xv != C1XV.A0T && !C3YW.A03(A04)) {
                        if (!c38321qM.CdW()) {
                            if (c1xv != C1XV.A0l && ((A04 == null || !A04.A03()) && !C3YW.A03(A04))) {
                                if (C18U.A06(C06090Tz.A06, userSession, 36312874750641557L) && A04 != null && (A0E = AbstractC37300Gc1.A0E(A04)) != null && (A0F = AbstractC37300Gc1.A0F(A0E)) != null && AbstractC166997dE.A1Z(A0F.CYx(), true)) {
                                    c41019IEo = new C41019IEo();
                                    c41019IEo.A00 = -1;
                                    str = "next_sponsored_item_is_multi_ads_eligible";
                                    c41019IEo.A01 = str;
                                    return c41019IEo;
                                }
                            }
                        }
                        C41019IEo c41019IEo2 = new C41019IEo();
                        c41019IEo2.A00 = i2;
                        return c41019IEo2;
                    }
                    c41019IEo = new C41019IEo();
                    c41019IEo.A00 = -1;
                    c41019IEo.A01 = str;
                    return c41019IEo;
                }
                i2++;
            }
        }
        c41019IEo = new C41019IEo();
        c41019IEo.A00 = -1;
        str = "invalid_next_sponsored_item_position";
        c41019IEo.A01 = str;
        return c41019IEo;
    }

    public static final boolean A03(UserSession userSession, Integer num, Map map) {
        long A0K;
        C06090Tz c06090Tz;
        long j;
        boolean A1V = AbstractC167007dF.A1V(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != A1V) {
                A0K = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC669930q.A05, map));
                c06090Tz = C06090Tz.A06;
                j = 36594349726435002L;
            } else {
                A0K = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC669930q.A04, map));
                c06090Tz = C06090Tz.A06;
                j = 36594349728007869L;
            }
        } else {
            A0K = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC669930q.A03, map));
            c06090Tz = C06090Tz.A06;
            j = 36594349726107321L;
        }
        if (A0K >= C18U.A01(c06090Tz, userSession, j)) {
            return true;
        }
        return false;
    }

    public static final int A00(UserSession userSession, EnumC669930q enumC669930q, Map map) {
        if (C18U.A06(C06090Tz.A06, userSession, 36312874750903705L)) {
            return AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC669930q.A03, map)) + AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC669930q.A05, map)) + AbstractC25227BEk.A06(AbstractC37300Gc1.A0Q(EnumC669930q.A04, map), 0);
        }
        return AbstractC25227BEk.A06(AbstractC37300Gc1.A0Q(enumC669930q, map), 0);
    }

    public static final LinkedHashMap A02(C65192xH c65192xH) {
        Integer num;
        EnumC669930q enumC669930q;
        InterfaceC38381qS interfaceC38381qS;
        C38321qM A02;
        C38576Gxf c38576Gxf;
        EnumC669930q[] values = EnumC669930q.values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC669930q enumC669930q2 : values) {
            AbstractC37301Gc2.A1T(enumC669930q2, A18, 0);
        }
        LinkedHashMap A03 = AbstractC06930Yk.A03(A18);
        if (c65192xH != null) {
            Iterator it = c65192xH.A08().iterator();
            while (it.hasNext()) {
                C3XG A0D = AbstractC37300Gc1.A0D(it);
                C1XV c1xv = A0D.A06;
                if (c1xv == C1XV.A0T) {
                    int i = A0D.A01().A00;
                    Integer[] A00 = C05F.A00(20);
                    int length = A00.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            num = A00[i2];
                            if (C5MB.A00(num) != i) {
                                i2++;
                            }
                        } else {
                            num = C05F.A00;
                        }
                    }
                    C14360o3.A0B(num, 0);
                    C71113Gx c71113Gx = C5MB.A00;
                    Integer valueOf = Integer.valueOf(C5MB.A00(num));
                    if (c71113Gx.A02(valueOf)) {
                        enumC669930q = EnumC669930q.A06;
                    } else if (c71113Gx.A01(valueOf)) {
                        enumC669930q = EnumC669930q.A03;
                    } else {
                        switch (num.intValue()) {
                            case 1:
                                enumC669930q = EnumC669930q.A07;
                                break;
                            case 2:
                            case 3:
                            default:
                                enumC669930q = EnumC669930q.A0E;
                                break;
                            case 4:
                                enumC669930q = EnumC669930q.A02;
                                break;
                            case 5:
                                enumC669930q = EnumC669930q.A05;
                                break;
                            case 6:
                                enumC669930q = EnumC669930q.A0B;
                                break;
                            case 7:
                                enumC669930q = EnumC669930q.A08;
                                break;
                            case 8:
                                enumC669930q = EnumC669930q.A0A;
                                break;
                            case 9:
                                enumC669930q = EnumC669930q.A0D;
                                break;
                            case 10:
                                enumC669930q = EnumC669930q.A0C;
                                break;
                            case 11:
                                enumC669930q = EnumC669930q.A09;
                                break;
                        }
                    }
                    AbstractC37301Gc2.A1T(enumC669930q, A03, AbstractC166987dD.A0H(AbstractC06930Yk.A01(enumC669930q, A03)) + 1);
                } else if (c1xv == C1XV.A0Y && (A02 = C3XH.A02((interfaceC38381qS = A0D.A05))) != null && A02.A0B != null) {
                    C38321qM A022 = C3XH.A02(interfaceC38381qS);
                    if (A022 != null && (c38576Gxf = A022.A0B) != null) {
                        if (!c38576Gxf.A04) {
                            enumC669930q = EnumC669930q.A04;
                            AbstractC37301Gc2.A1T(enumC669930q, A03, AbstractC166987dD.A0H(AbstractC06930Yk.A01(enumC669930q, A03)) + 1);
                        }
                        enumC669930q = EnumC669930q.A05;
                        AbstractC37301Gc2.A1T(enumC669930q, A03, AbstractC166987dD.A0H(AbstractC06930Yk.A01(enumC669930q, A03)) + 1);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
        return A03;
    }
}
