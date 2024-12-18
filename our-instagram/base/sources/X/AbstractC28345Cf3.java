package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cf3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28345Cf3 {
    public static final C5UP A00 = new C5UQ(C29747DAr.A00);

    public static final C4E5 A00(C45124Jxt c45124Jxt) {
        Integer num;
        Integer num2;
        Integer num3;
        int A0H = AbstractC166987dD.A0H(c45124Jxt.A03);
        if (A0H != 0) {
            if (A0H == 1) {
                num = C05F.A01;
            } else {
                throw B4Z.A00();
            }
        } else {
            num = C05F.A00;
        }
        boolean z = c45124Jxt.A00;
        boolean z2 = c45124Jxt.A01;
        int A0H2 = AbstractC166987dD.A0H(c45124Jxt.A04);
        if (A0H2 != 0) {
            if (A0H2 == 1) {
                num2 = C05F.A01;
            } else {
                throw B4Z.A00();
            }
        } else {
            num2 = C05F.A00;
        }
        int A0H3 = AbstractC166987dD.A0H(c45124Jxt.A05);
        if (A0H3 != 0) {
            if (A0H3 == 1) {
                num3 = C05F.A01;
            } else {
                throw B4Z.A00();
            }
        } else {
            num3 = C05F.A00;
        }
        return new C4E5(null, num2, num3, num, 432, z, z2, false);
    }

    public static final void A01(C5Tl c5Tl, C45124Jxt c45124Jxt, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        C4E5 c4e5;
        C45124Jxt c45124Jxt2 = c45124Jxt;
        C14360o3.A0B(interfaceC16620sF, 1);
        c5Tl.Enr(1649857331);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c45124Jxt) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                c45124Jxt2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(-2055571512, "com.instagram.compose.core.viewpoint.ProvideMerlinNodeRegistry (LocalMerlinNodeRegistry.kt:100)");
            }
            InterfaceC74953Yl A002 = C5WZ.A00(c5Tl, AbstractC25225BEi.A11(c5Tl));
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A002, -30205859);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                UserSession userSession = (UserSession) A002.getValue();
                if (c45124Jxt2 != null) {
                    c4e5 = A00(c45124Jxt2);
                } else {
                    c4e5 = new C4E5(null, null, C05F.A00, null, 500, false, C18U.A06(C06090Tz.A05, (AbstractC12990ll) A002.getValue(), 36313424503834621L), false);
                }
                EEc = new CQC(userSession, c4e5);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1T(c5Tl);
            AbstractC25230BEn.A17(c5Tl, A00.A02(EEc), new C30192DRx(interfaceC16620sF, 8), 1356473971);
            if (C0fH.A02()) {
                C0fH.A00(578391259);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(c45124Jxt2, interfaceC16620sF, i2, i, 21);
        }
    }
}
