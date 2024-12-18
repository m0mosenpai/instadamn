package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.Caf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28132Caf {
    public static final BI3 A00;

    public static final void A00(C5Tl c5Tl, C27870CQh c27870CQh, Integer num, String str, String str2, String str3, String str4, String str5, InterfaceC16620sF interfaceC16620sF, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        SimpleImageUrl simpleImageUrl;
        C14360o3.A0B(str2, 1);
        AbstractC25233BEq.A0y(2, str3, str5, c27870CQh);
        c5Tl.Enr(1143517220);
        if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, str4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0g(c5Tl, z2);
        }
        if ((i & 1572864) == 0) {
            i3 |= AbstractC25232BEp.A0h(c5Tl, z3);
        }
        if ((i & 12582912) == 0) {
            i3 |= AbstractC25232BEp.A0Y(c5Tl, num);
        }
        if ((i & 100663296) == 0) {
            i3 |= AbstractC25232BEp.A0Z(c5Tl, str5);
        }
        if ((i & 805306368) == 0) {
            i3 |= AbstractC25232BEp.A0a(c5Tl, c27870CQh);
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | AbstractC25231BEo.A0A(c5Tl, interfaceC16620sF);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1405589658, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequest (FollowRequest.kt:32)");
            }
            if (str != null) {
                simpleImageUrl = AbstractC25225BEi.A0t(str);
            } else {
                simpleImageUrl = null;
            }
            C2DB A002 = AbstractC43541zP.A00(c5Tl, simpleImageUrl);
            BI3 bi3 = A00;
            c5Tl.Eno(-1534585919);
            int i5 = i3 & 1879048192;
            boolean z4 = false;
            boolean A1P = AbstractC167007dF.A1P(i5, 536870912);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A0t(c5Tl, c27870CQh, 15);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            int i6 = i3 << 6;
            BI4.A01(c5Tl, null, A002, bi3, str2, str3, str4, (InterfaceC16820sZ) ((C0YS) EEc), null, C5UA.A01(c5Tl, new C30545DcS(3, c27870CQh, interfaceC16620sF, num, z), -1527912765), AbstractC25231BEo.A07(458752, i6, (i3 & 112) | (57344 & i6)) | ((i3 << 12) & 1879048192), 196656, 21708, false, false, z3, z2);
            c5Tl.Eno(-1534566389);
            if (i5 == 536870912) {
                z4 = true;
            }
            Object EEc2 = c5Tl.EEc();
            if (z4 || EEc2 == C5UI.A00) {
                EEc2 = new GSQ(c27870CQh, null, 2);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc2, str5, false)) {
                C0fH.A00(-1210963774);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXN(c27870CQh, num, str, str2, str3, str4, str5, interfaceC16620sF, i, i2, z, z2, z3);
        }
    }

    static {
        BI3 bi3 = BI3.A03;
        InterfaceC31127DmA interfaceC31127DmA = bi3.A02;
        float Aea = interfaceC31127DmA.Aea();
        BI2 bi2 = new BI2(Aea, Aea, interfaceC31127DmA.AeX(), interfaceC31127DmA.AeY());
        InterfaceC1333460b interfaceC1333460b = bi3.A01;
        C14360o3.A0B(interfaceC1333460b, 0);
        A00 = new BI3(interfaceC1333460b, bi2, 72.0f);
    }
}
