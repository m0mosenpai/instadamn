package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;

/* renamed from: X.BVd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25641BVd {
    public static final void A00(C5Tl c5Tl, FragmentActivity fragmentActivity, C5yI c5yI, InterfaceC132365yF interfaceC132365yF, UserSession userSession, String str, String str2, String str3, String str4, String str5, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, int i2, int i3) {
        int i4;
        int i5;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, fragmentActivity);
        C14360o3.A0B(str, 2);
        AbstractC25234BEr.A0l(7, c5Hc, interfaceC132365yF, c5yI, interfaceC16660sJ);
        AbstractC25234BEr.A1Q(interfaceC16620sF, interfaceC16820sZ, interfaceC16660sJ2);
        c5Tl.Enr(1219864207);
        if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0H(c5Tl, userSession) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A0I(c5Tl, fragmentActivity);
        }
        int i6 = 256;
        if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i2 & 3072) == 0) {
            i4 |= AbstractC25232BEp.A0U(c5Tl, str2);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i4 |= AbstractC25232BEp.A0V(c5Tl, str3);
        }
        if ((i2 & 196608) == 0) {
            i4 |= AbstractC25232BEp.A0W(c5Tl, str4);
        }
        if ((i2 & 1572864) == 0) {
            i4 |= AbstractC25232BEp.A0X(c5Tl, str5);
        }
        if ((i2 & 12582912) == 0) {
            i4 |= AbstractC25232BEp.A0Y(c5Tl, c5Hc);
        }
        if ((i2 & 100663296) == 0) {
            i4 |= AbstractC25229BEm.A03(c5Tl.AH2(i) ? 1 : 0);
        }
        if ((i2 & 805306368) == 0) {
            i4 |= AbstractC25232BEp.A0a(c5Tl, interfaceC132365yF);
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | AbstractC25232BEp.A0R(c5Tl, c5yI);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= AbstractC25231BEo.A0B(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 384) == 0) {
            if (!c5Tl.AH6(interfaceC16620sF)) {
                i6 = 128;
            }
            i5 |= i6;
        }
        if ((i3 & 3072) == 0) {
            i5 |= AbstractC25231BEo.A0C(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i5 |= AbstractC25231BEo.A0D(c5Tl, interfaceC16660sJ2);
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1567130871, "instagram.features.clips.viewer.feature.threads.ui.ThreadsInReelsUnit (ThreadsInReelsUnit.kt:90)");
            }
            AbstractC25638BVa.A00(c5Tl, userSession, str, C5UA.A01(c5Tl, new C25640BVc(AbstractC25228BEl.A0K(c5Tl), AbstractC25229BEm.A0R(AbstractC25227BEk.A0o()), AbstractC25229BEm.A0R(Float.valueOf(-1.0f)), AbstractC25230BEn.A0U(Long.valueOf(System.currentTimeMillis())), fragmentActivity, c5yI, interfaceC132365yF, userSession, str4, str5, str3, str2, interfaceC16820sZ, interfaceC16660sJ2, interfaceC16660sJ, interfaceC16620sF, c5Hc, i, 2), 232839028), ((i4 >> 6) & 14) | 3456 | ((i4 << 3) & 112), 0, A1R);
            if (C0fH.A02()) {
                C0fH.A00(-149189515);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DYI(fragmentActivity, c5yI, interfaceC132365yF, userSession, str, str2, str3, str4, str5, interfaceC16820sZ, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16620sF, c5Hc, i, i2, i3);
        }
    }
}
