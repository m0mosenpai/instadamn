package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.31q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C672531q {
    public final C65192xH A00;

    public static final int A00(InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, int i) {
        C14360o3.A0B(interfaceC671231d, 1);
        C14360o3.A0B(interfaceC62242sP, 2);
        while (i >= 0) {
            Object BUP = interfaceC671231d.BUP(i);
            if (BUP != null && interfaceC62242sP.CZK(BUP)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public final int A03(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, int i) {
        C38321qM A02;
        C14360o3.A0B(interfaceC671231d, 1);
        C14360o3.A0B(interfaceC62242sP, 2);
        while (i >= 0) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36314983575456706L)) {
                C3XG A04 = this.A00.A04(i);
                if (A04 != null && interfaceC62242sP.CX8(A04)) {
                    if (interfaceC671231d.BUP(i) == null && C18U.A06(c06090Tz, userSession, 36314983575391169L) && (A02 = C3XH.A02(A04.A05)) != null) {
                        C18950wb c18950wb = C18950wb.A01;
                        StringBuilder sb = new StringBuilder();
                        sb.append("ItemModelFromContentInjector is null while itemFromFeedAdapter not null. Item type: ");
                        sb.append(A04.A06);
                        sb.append(", item ad id: ");
                        sb.append(AbstractC41071vF.A07(userSession, A02));
                        sb.append(", ad position: ");
                        sb.append(i);
                        c18950wb.AEp(sb.toString(), 817896304).report();
                    }
                    return i;
                }
            } else {
                Object BUP = interfaceC671231d.BUP(i);
                if (BUP != null && interfaceC62242sP.CdX(BUP)) {
                    return i;
                }
            }
            i--;
        }
        return -1;
    }

    public final C82373m0 A05(InterfaceC671231d interfaceC671231d, int i) {
        C14360o3.A0B(interfaceC671231d, 1);
        List A07 = this.A00.A07();
        if (A07.size() <= i) {
            return null;
        }
        ListIterator listIterator = A07.listIterator(i + 1);
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            C3XG c3xg = (C3XG) listIterator.next();
            if (C3YW.A00(c3xg) || C3YW.A03(c3xg)) {
                return (C82373m0) interfaceC671231d.BUP(nextIndex);
            }
        }
        return null;
    }

    public final void A06(UserSession userSession, InterfaceC671231d interfaceC671231d, C1PZ c1pz, int i, int i2, int i3) {
        List list;
        List list2;
        List list3;
        BrandSafetyContentBlocklistBitmapQLObj AiW;
        BrandSafetyContentBlocklistBitmapQLObj AiW2;
        C14360o3.A0B(interfaceC671231d, 3);
        c1pz.A0C = C05F.A0Y;
        C82373m0 A05 = A05(interfaceC671231d, i3);
        if (A05 != null) {
            int A02 = A02(userSession, A05);
            if (A02 != -1) {
                c1pz.A07 = A02;
            }
            C38321qM A022 = C3XH.A02(A05.A01.A05);
            if (A022 != null) {
                C65192xH c65192xH = this.A00;
                C75113Zb BRZ = c65192xH.A0T.BRZ(A022);
                BRZ.A0F = i2 - i;
                if (C18U.A06(C06090Tz.A05, userSession, 2342158602673982900L)) {
                    List A07 = c65192xH.A07();
                    int i4 = i2 - 1;
                    String str = ((C3XG) A07.get(i4)).A09;
                    String str2 = ((C3XG) A07.get(i2)).A09;
                    BRZ.A1R = str;
                    BRZ.A1N = str2;
                    Integer A023 = ((C3XG) A07.get(i4)).A02();
                    Integer A024 = ((C3XG) A07.get(i2)).A02();
                    BRZ.A17 = A023;
                    BRZ.A16 = A024;
                    C38321qM A025 = C3XH.A02(((C3XG) A07.get(i4)).A05);
                    List list4 = null;
                    if (A025 != null) {
                        list = A025.A0e;
                    } else {
                        list = null;
                    }
                    String A00 = AbstractC77343dK.A00(list);
                    C38321qM A026 = C3XH.A02(((C3XG) A07.get(i2)).A05);
                    if (A026 != null) {
                        list2 = A026.A0e;
                    } else {
                        list2 = null;
                    }
                    String A002 = AbstractC77343dK.A00(list2);
                    BRZ.A1Q = A00;
                    BRZ.A1M = A002;
                    BRZ.A0a(((C3XG) A07.get(i4)).A08, ((C3XG) A07.get(i2)).A08);
                    C38321qM A027 = C3XH.A02(((C3XG) A07.get(i4)).A05);
                    if (A027 != null && (AiW2 = A027.A0C.AiW()) != null) {
                        list3 = AiW2.Ag9();
                    } else {
                        list3 = null;
                    }
                    C38321qM A028 = C3XH.A02(((C3XG) A07.get(i2)).A05);
                    if (A028 != null && (AiW = A028.A0C.AiW()) != null) {
                        list4 = AiW.Ag9();
                    }
                    if (list3 != null) {
                        BRZ.A1h = list3;
                    }
                    if (list4 != null) {
                        BRZ.A1g = list4;
                    }
                }
            }
        }
    }

    public static final int A01(Integer num, int i, int i2, int i3, int i4) {
        if (num != null) {
            int i5 = new int[]{i, i2}[0];
            if (i2 > i5) {
                i5 = i2;
            }
            int i6 = new int[]{i5 + num.intValue() + 1, i3}[0];
            if (i3 < i6) {
                i6 = i3;
            }
            return i6 + i4;
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r7, 36312866155922778L) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02(com.instagram.common.session.UserSession r7, X.C82373m0 r8) {
        /*
            r6 = this;
            X.2xH r4 = r6.A00
            X.3XG r5 = r8.A01
            boolean r0 = X.C3YW.A03(r5)
            java.lang.String r3 = ""
            if (r0 == 0) goto L16
            java.lang.String r0 = r5.A09
        Le:
            if (r0 == 0) goto L11
            r3 = r0
        L11:
            int r0 = r4.BK6(r3)
            return r0
        L16:
            boolean r0 = X.C3YW.A00(r5)
            if (r0 == 0) goto L11
            X.1Ai r0 = X.AbstractC23021Ah.A00(r7)
            boolean r0 = X.AbstractC61652rS.A08(r7, r0)
            if (r0 != 0) goto L34
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36312866155922778(0x81025c0000055a, double:3.0277410049565713E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            r1 = 0
            if (r0 == 0) goto L35
        L34:
            r1 = 1
        L35:
            X.1qS r0 = r5.A05
            X.1qM r0 = X.C3XH.A02(r0)
            if (r1 == 0) goto L44
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.A2W()
            goto Le
        L44:
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.getId()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672531q.A02(com.instagram.common.session.UserSession, X.3m0):int");
    }

    public final C38008Gnu A04(C82373m0 c82373m0, Integer num, int i, int i2, int i3, int i4) {
        this.A00.A07();
        int i5 = 0;
        for (int A01 = A01(num, i, i2, i3, 0); A01 < i3; A01++) {
            if (A01(num, i, i2, i3, i5) > i4) {
                c82373m0.A01.A03 = true;
                return new C38008Gnu(i5, A01, 2, true);
            }
            i5++;
        }
        return new C38008Gnu(i5, i3, 2, false);
    }

    public final boolean A07(int i) {
        Iterator it = this.A00.A08().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((C3XG) it.next()).A06 == C1XV.A0F) {
                if (i2 < 0 || i2 >= i) {
                    break;
                }
                return false;
            }
            i2++;
        }
        return true;
    }

    public C672531q(C65192xH c65192xH) {
        this.A00 = c65192xH;
    }
}
