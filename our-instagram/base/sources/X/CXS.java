package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CXS {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC30798DgZ interfaceC30798DgZ, C26009Bex c26009Bex, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, C5Hc c5Hc, int i, int i2, boolean z) {
        int i3;
        int i4;
        C14360o3.A0B(modifier, 0);
        AbstractC25233BEq.A0x(1, interfaceC30798DgZ, interfaceC16620sF, interfaceC16660sJ);
        AbstractC25233BEq.A0y(6, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16620sF2);
        C14360o3.A0B(c5Hc, 10);
        c5Tl.Enr(-1274404686);
        if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC30798DgZ);
        }
        if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, c26009Bex);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ);
        }
        if ((1572864 & i) == 0) {
            i3 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ);
        }
        if ((12582912 & i) == 0) {
            i3 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 100663296) == 0) {
            i3 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 805306368) == 0) {
            i3 |= AbstractC25232BEp.A0Q(c5Tl, interfaceC16620sF2);
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | AbstractC25232BEp.A0H(c5Tl, c5Hc);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(331135205, "com.instagram.archive.updateshub.UpdatesHubHeader (UpdatesHubHeader.kt:47)");
            }
            InterfaceC1127857k A0M = AbstractC25236BEt.A0M(c5Tl, C118195Wf.A00, i3);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28284CdW.A02(c5Tl, null, null, Boolean.valueOf(interfaceC30798DgZ instanceof C29097CsO), "Updates Hub Header", DLH.A00, null, C5UA.A01(c5Tl, new C30740Dfc(interfaceC30798DgZ, c26009Bex, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16620sF, interfaceC16620sF2, c5Hc, z), 1952480619), 1597824, 42);
            AbstractC119685bS.A00(c5Tl, AbstractC25226BEj.A0X(AbstractC118185Wd.A08(AbstractC25228BEl.A0W(), 1.0f), AbstractC25226BEj.A0K(c5Tl)));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-2091222467);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30340DXp(modifier, interfaceC30798DgZ, c26009Bex, interfaceC16620sF, interfaceC16660sJ, interfaceC16820sZ, interfaceC16660sJ2, interfaceC16820sZ2, interfaceC16620sF2, c5Hc, i, i2, 0, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r21, androidx.compose.ui.Modifier r22, X.InterfaceC30798DgZ r23, X.C26009Bex r24, X.InterfaceC16820sZ r25, X.InterfaceC16820sZ r26, X.InterfaceC16660sJ r27, X.InterfaceC16620sF r28, X.C5Hc r29, int r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXS.A01(X.5Tl, androidx.compose.ui.Modifier, X.DgZ, X.Bex, X.0sZ, X.0sZ, X.0sJ, X.0sF, X.5Hc, int, int, boolean):void");
    }
}
