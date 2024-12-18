package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ci3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28509Ci3 {
    public static final Modifier A00(C5Tl c5Tl, Modifier modifier, float f, float f2, float f3, int i, long j, boolean z) {
        Modifier A0X;
        float f4 = f3;
        float f5 = f2;
        float f6 = f;
        long j2 = j;
        C14360o3.A0B(modifier, 0);
        c5Tl.Eno(-2377110);
        if ((i & 2) != 0) {
            j2 = AbstractC25226BEj.A0E(c5Tl);
        }
        if ((i & 4) != 0) {
            f6 = 4.0f;
        }
        if ((i & 8) != 0) {
            f5 = 40.0f;
        }
        if ((i & 16) != 0) {
            f4 = 40.0f;
        }
        if (C0fH.A02()) {
            C0fH.A01(1203975456, "com.instagram.profilecard.ui.shadowOrBorder (ProfileCardContent.kt:474)");
        }
        if (z) {
            A0X = modifier.Eq3(AbstractC119675bQ.A00(modifier, new C30173DRd(f5, C5XL.A00(c5Tl).A0y, f6, f4, 2)));
            if (!C119145aW.A01(f4, 0.0f)) {
                A0X = AbstractC25228BEl.A0X(A0X, f4);
            }
        } else {
            A0X = AbstractC25228BEl.A0X(AbstractC25228BEl.A0Y(modifier, f4, 0.5f, j2), f4);
        }
        if (C0fH.A02()) {
            C0fH.A00(1814805952);
        }
        AbstractC25225BEi.A1V(c5Tl, false);
        return A0X;
    }

    public static final void A04(C5Tl c5Tl, Modifier modifier, C26081BgA c26081BgA, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, float f, int i, boolean z) {
        int i2;
        C14360o3.A0B(modifier, 0);
        c5Tl.Enr(-2011247409);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c26081BgA);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ2);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A07(c5Tl, f);
        }
        if ((599187 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(500342790, "com.instagram.profilecard.ui.ProfileSideContainer (ProfileCardContent.kt:807)");
            }
            Modifier A00 = AbstractC27694CJn.A00(c5Tl, AbstractC25226BEj.A0X(C6L2.A00(A00(c5Tl, modifier, 0.0f, 0.0f, 0.0f, 30, 0L, c26081BgA.A0I)), AbstractC25225BEi.A0C(c5Tl)), f, (i2 >> 15) & 112);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A003 = C6GM.A00.A00(AbstractC25228BEl.A0W(), true);
            InterfaceC1127857k A012 = AbstractC119595bH.A01(AbstractC118255Wn.A03(C118195Wf.A04, 24.0f), c5Tl, C118195Wf.A00);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A003);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A012, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            A06(c5Tl, c26081BgA.A04, c26081BgA, c26081BgA.A0A, (i2 << 3) & 896);
            String str = c26081BgA.A07;
            String str2 = c26081BgA.A09;
            List A0m = AbstractC167007dF.A0m(c26081BgA.A06, "\n", 0);
            StringBuilder A1C = AbstractC166987dD.A1C();
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (AbstractC25228BEl.A1A(A1B).length() > 0) {
                    A1C.append(AbstractC25228BEl.A1A(A1B));
                    A1C.append("\n");
                }
            }
            A0F(c5Tl, str, str2, AbstractC166987dD.A19(A1C), 0);
            c5Tl.ASW();
            int i3 = i2 >> 6;
            A0D(c5Tl, c26081BgA, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, (i3 & 7168) | AbstractC25230BEn.A03(i3) | (57344 & (i2 << 9)), z);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(543643058);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30269DUw(modifier, c26081BgA, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, f, i, z);
        }
    }

    public static final void A06(C5Tl c5Tl, ImageUrl imageUrl, C26081BgA c26081BgA, String str, int i) {
        int i2;
        long A0B;
        AbstractC167007dF.A1K(imageUrl, str);
        C14360o3.A0B(c26081BgA, 2);
        c5Tl.Enr(471193298);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c26081BgA);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1052508515, "com.instagram.profilecard.ui.ProfileSideInfoContainer (ProfileCardContent.kt:843)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0G = AbstractC118185Wd.A0G(c1130158n, 296.0f, 258.0f);
            Alignment alignment = C118195Wf.A09;
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0G);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            A02(c5Tl, c119645bN.AB5(alignment, c1130158n), imageUrl, (i2 << 3) & 112);
            Modifier A08 = AbstractC118185Wd.A08(CBA.A00(c119645bN.AB5(C118195Wf.A06, c1130158n), -2.0f), 36.0f);
            long j = C5XL.A00(c5Tl).A0y;
            C14360o3.A0B(A08, 0);
            Modifier Eq3 = A08.Eq3(AbstractC119675bQ.A00(A08, new C30173DRd(3.0f, j, 1.0f, 8.0f, 2)));
            if (!C119145aW.A01(8.0f, 0.0f)) {
                Eq3 = AbstractC25228BEl.A0X(Eq3, 8.0f);
            }
            c5Tl.Eno(1387220939);
            C28208Cc5 c28208Cc5 = c26081BgA.A05;
            boolean A1P = AbstractC167007dF.A1P(c28208Cc5.A01, -1);
            if (A1P) {
                A0B = AbstractC25225BEi.A0C(c5Tl);
            } else {
                A0B = AbstractC25225BEi.A0B(c28208Cc5.A00());
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier A0X = AbstractC25226BEj.A0X(Eq3, A0B);
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            A0E(c5Tl, str, (i2 >> 3) & 14, A1P);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1688425965);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(c26081BgA, imageUrl, str, i, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
    
        if (r67 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        if (r68 == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C5Tl r57, X.EnumC53163NfI r58, X.C28208Cc5 r59, java.lang.String r60, X.InterfaceC16820sZ r61, X.InterfaceC16660sJ r62, int r63, int r64, long r65, boolean r67, boolean r68) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28509Ci3.A07(X.5Tl, X.NfI, X.Cc5, java.lang.String, X.0sZ, X.0sJ, int, int, long, boolean, boolean):void");
    }

    public static final void A08(C5Tl c5Tl, C28208Cc5 c28208Cc5, String str, int i, boolean z) {
        int i2;
        int A06 = AbstractC167007dF.A06(0, str, c28208Cc5);
        c5Tl.Enr(1582902070);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c28208Cc5);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(609949147, "com.instagram.profilecard.ui.QRCodeView (ProfileCardContent.kt:645)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            Integer num = C05F.A01;
            C44359Jiy c44359Jiy = new C44359Jiy();
            c44359Jiy.invalidateSelf();
            c44359Jiy.A01 = num;
            C44359Jiy.A00(c44359Jiy);
            Paint paint = c44359Jiy.A07;
            paint.setShader(null);
            c44359Jiy.invalidateSelf();
            c44359Jiy.A02 = null;
            C44359Jiy.A00(c44359Jiy);
            c44359Jiy.A02 = str;
            C44359Jiy.A00(c44359Jiy);
            if (c28208Cc5.A01 == -1) {
                if (!z) {
                    float applyDimension = (int) TypedValue.applyDimension(1, 132.0f, A0K.getResources().getDisplayMetrics());
                    paint.setShader(AbstractC25292BHl.A00(AbstractC25232BEp.A1G(AbstractC25227BEk.A0O(4293538672L), 4290187741L << 32), null, 0, AbstractC119395aw.A00(0.0f, applyDimension), AbstractC119395aw.A00(applyDimension, 0.0f)));
                    c44359Jiy.invalidateSelf();
                }
            } else {
                c44359Jiy.setColorFilter(c28208Cc5.A00(), PorterDuff.Mode.SRC_IN);
            }
            C6LQ.A05(c5Tl, AbstractC118185Wd.A0G(Modifier.A00, 132.0f, 132.0f), C5Y9.A00(c44359Jiy, c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-1410588135);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT3(c28208Cc5, str, i, A06, z);
        }
    }

    public static final void A09(C5Tl c5Tl, C28208Cc5 c28208Cc5, String str, int i, boolean z) {
        int i2;
        AbstractC167007dF.A1D(str, 0, c28208Cc5);
        c5Tl.Enr(209628235);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c28208Cc5);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(347510640, "com.instagram.profilecard.ui.QrCodeCard (ProfileCardContent.kt:619)");
            }
            Modifier A01 = C6L3.A01(AbstractC118185Wd.A0G(CBA.A00(Modifier.A00, -6.0f), 180.0f, 180.0f), C5WF.A00(), AbstractC25225BEi.A0C(c5Tl));
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            A08(c5Tl, c28208Cc5, str, AbstractC25230BEn.A03(i2), z);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1400797775);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT3(c28208Cc5, str, i, 3, z);
        }
    }

    public static final void A0A(C5Tl c5Tl, C28208Cc5 c28208Cc5, String str, int i, boolean z) {
        int i2;
        long j;
        C1350369c c1350369c;
        long A0B;
        int A06 = AbstractC167007dF.A06(0, str, c28208Cc5);
        c5Tl.Enr(-1819180734);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c28208Cc5);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-693951647, "com.instagram.profilecard.ui.QrUsernameCard (ProfileCardContent.kt:685)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            Modifier A00 = AbstractC118185Wd.A00(C118195Wf.A00, AbstractC118185Wd.A08(CBA.A00(c1130158n, 6.0f), 32.0f));
            c5Tl.Eno(1951589553);
            if (z) {
                if (c28208Cc5.A01 == -1) {
                    A0B = AbstractC25225BEi.A0C(c5Tl);
                } else {
                    A0B = AbstractC25225BEi.A0B(c28208Cc5.A00());
                }
                A00 = AbstractC25228BEl.A0Z(A00, 8.0f, A0B);
            }
            C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K2);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            AbstractC25233BEq.A11(c5Tl, A0K2);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K2.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Modifier A0M = AbstractC25227BEk.A0M(c1130158n, 8.0f);
            String A0D = AnonymousClass001.A0D(str, '@');
            if (z && c28208Cc5.A01 == -1) {
                j = AbstractC25227BEk.A0g(c5Tl, 1656331437).A14;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, 1656332845).A13;
            }
            C117505Tk.A0L(A0K2, false);
            long A012 = AbstractC118155Vz.A01(26);
            Typeface A02 = AbstractC15960qq.A00(A0K).A02(EnumC15950qp.A0V);
            if (A02 != null) {
                c1350369c = C69Y.A00(A02);
            } else {
                c1350369c = null;
            }
            C5WR.A03(c5Tl, A0M, null, c1350369c, null, null, A0D, null, 0, 0, 1, A06, 3120, 390, 27568, j, A012, 0L, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1336310572);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT3(c28208Cc5, str, i, 4, z);
        }
    }

    public static final void A0B(C5Tl c5Tl, C28208Cc5 c28208Cc5, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        long j;
        C6L5 c6l4;
        boolean A1R = AbstractC167007dF.A1R(0, c28208Cc5, interfaceC16660sJ);
        c5Tl.Enr(1402219460);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c28208Cc5) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1953226987, "com.instagram.profilecard.ui.ColorTray (ProfileCardContent.kt:719)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(740714931);
            List list = c28208Cc5.A02;
            ArrayList<C27873CQk> A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                A0q.add(new C27873CQk(A0B, Color.parseColor(AnonymousClass001.A0D(AbstractC166997dE.A0z("%06x", Arrays.copyOf(AbstractC25228BEl.A1Y(A0B), A1R ? 1 : 0)), '#'))));
            }
            for (C27873CQk c27873CQk : A0q) {
                C14360o3.A0B(c27873CQk, 0);
                int i3 = c28208Cc5.A01;
                int i4 = c27873CQk.A00;
                if (i3 == i4) {
                    j = AbstractC25227BEk.A0g(c5Tl, 474450502).A0n;
                } else {
                    j = AbstractC25227BEk.A0g(c5Tl, 474451521).A0z;
                }
                C117505Tk.A0L(c117505Tk, false);
                if (i4 == -1) {
                    c6l4 = C6L6.A00(AbstractC25232BEp.A1G(AbstractC25227BEk.A0O(4293538672L), 4290187741L << 32), 0L, 9187343241974906880L);
                } else {
                    long j2 = C1132359l.A01;
                    c6l4 = new C6L4(c27873CQk.A01 << 32);
                }
                Modifier A03 = AbstractC118175Wb.A03(AbstractC118185Wd.A0C(c1130158n, 40.0f));
                C5WI c5wi = C5WF.A00;
                Modifier A002 = C6L3.A00(C6L7.A03(C6L2.A01(A03, c5wi), c5wi, 2.0f, j), c6l4, C5AF.A00);
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 474471842);
                Object obj = C5UI.A00;
                C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q2, obj);
                C117505Tk.A0L(c117505Tk, false);
                C5XM c5xm = new C5XM(400.0f, 400.0f);
                boolean AH6 = c5Tl.AH6(c27873CQk) | AbstractC25233BEq.A1P(c5Tl, 474474959, i2);
                Object EEc = c5Tl.EEc();
                if (AH6 || EEc == obj) {
                    EEc = AbstractC25229BEm.A0z(c5Tl, interfaceC16660sJ, c27873CQk, 20);
                }
                C5XX.A02(c5Tl, C5XR.A02(c5xm, c5xo, A002, AbstractC25225BEi.A1A(c117505Tk, EEc, false)), 0);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(107187361);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c28208Cc5, interfaceC16660sJ, i, 49);
        }
    }

    public static final void A0C(C5Tl c5Tl, C26081BgA c26081BgA, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, c26081BgA);
        c5Tl.Enr(1689654857);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c26081BgA);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(798404651, "com.instagram.profilecard.ui.EditProfileTag (ProfileCardContent.kt:1195)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            long j = AbstractC121605fB.A0K;
            float f = c26081BgA.A02;
            C1130158n c1130158n = Modifier.A00;
            Modifier A00 = CBA.A00(c1130158n, 1.0f);
            boolean A1T = AbstractC25227BEk.A1T(c5Tl, f, -814356078);
            Object EEc = c5Tl.EEc();
            if (A1T || EEc == C5UI.A00) {
                EEc = new DHG(f, 11);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25230BEn.A0Y(A00, (InterfaceC16660sJ) EEc), 4.0f);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -814353259, i2);
            Object EEc2 = c5Tl.EEc();
            if (A1O || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25230BEn.A0x(c5Tl, interfaceC16820sZ, 28);
            }
            Modifier A01 = CY3.A01(c5Tl, A08, AbstractC25225BEi.A1A(A0K2, EEc2, false));
            c5Tl.Eno(-814351068);
            boolean AH3 = c5Tl.AH3(j);
            Object EEc3 = c5Tl.EEc();
            if (AH3 || EEc3 == C5UI.A00) {
                EEc3 = new JXD(j, 10);
                c5Tl.FBy(EEc3);
            }
            Modifier A002 = AbstractC119675bQ.A00(A01, AbstractC25225BEi.A1B(A0K2, EEc3, false));
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K2);
            Modifier A012 = C5X3.A01(c5Tl, A002);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K2, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0V, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K2.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A04;
            C5XJ.A00(c5Tl, A012, interfaceC16620sF3);
            Modifier A0N = AbstractC25227BEk.A0N(c1130158n, 10.0f);
            InterfaceC1127857k A004 = AbstractC118375Wz.A00(AbstractC118255Wn.A01(4.0f), c5Tl, interfaceC118225Wj);
            int A005 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K2);
            Modifier A013 = C5X3.A01(c5Tl, A0N);
            AbstractC25233BEq.A12(c5Tl, A0K2, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A004, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K2, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A013, interfaceC16620sF3);
            String A006 = AbstractC136736Hc.A00(c5Tl, 2131970086);
            long A014 = AbstractC118155Vz.A01(12);
            C5WR.A03(c5Tl, null, null, AbstractC25233BEq.A0F(EnumC15950qp.A0Y, AbstractC15960qq.A00(A0K)), null, null, A006, null, 0, 0, A1R ? 1 : 0, 2, 3072, 390, 27570, AbstractC25226BEj.A0I(c5Tl), A014, 0L, false);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1732290800);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, c26081BgA, interfaceC16820sZ, i, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.0pQ, java.lang.Object] */
    public static final void A0D(C5Tl c5Tl, C26081BgA c26081BgA, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        int A06 = AbstractC167007dF.A06(1, interfaceC16820sZ, interfaceC16820sZ2);
        AbstractC167007dF.A1F(interfaceC16660sJ, 3, c26081BgA);
        c5Tl.Enr(304345330);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, c26081BgA);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(638841933, "com.instagram.profilecard.ui.ProfileCardTagsContainer (ProfileCardContent.kt:1025)");
            }
            InterfaceC137486Kt A01 = AbstractC133095zb.A01(c26081BgA.A0B);
            C5Hb A04 = AbstractC133095zb.A04(AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0P), AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0M), AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0O), AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0N));
            ?? obj = new Object();
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 24.0f, 0.0f, 24.0f, 24.0f);
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0e, A042);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            AbstractC28419CgQ.A02(AbstractC118255Wn.A02, null, null, c5Tl, AbstractC25226BEj.A0T(c1130158n), C5UA.A01(c5Tl, new C30553Dca(c26081BgA, interfaceC16820sZ2, interfaceC16660sJ, obj, A04, A01), -881878025), 0, A06, 1597494, 44);
            c5Tl.Eno(586630426);
            if (obj.A00 < 1 && z && !c26081BgA.A0K) {
                A0C(c5Tl, c26081BgA, interfaceC16820sZ, ((i2 >> 3) & 14) | ((i2 >> 9) & 112));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1074468121);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUK(i, 3, c26081BgA, interfaceC16820sZ, interfaceC16660sJ, interfaceC16820sZ2, z);
        }
    }

    public static final void A0E(C5Tl c5Tl, String str, int i, boolean z) {
        int i2;
        C6L5 c6l5;
        C1350369c c1350369c;
        long j;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-837491049);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(821730698, "com.instagram.profilecard.ui.ProfileSideUsernameLabel (ProfileCardContent.kt:883)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            C5Hb A04 = AbstractC133095zb.A04(AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0R), AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0N), AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0O), AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0M), AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0P));
            float applyDimension = (int) TypedValue.applyDimension(1, 4.0f, A0K.getResources().getDisplayMetrics());
            float applyDimension2 = ((int) TypedValue.applyDimension(1, 12.0f, A0K.getResources().getDisplayMetrics())) + applyDimension;
            float applyDimension3 = ((int) TypedValue.applyDimension(1, 20.0f, A0K.getResources().getDisplayMetrics())) + applyDimension;
            c5Tl.Eno(-291612681);
            if (z) {
                Object A0q = AbstractC25227BEk.A0q(c5Tl, -291611767);
                if (A0q == C5UI.A00) {
                    A0q = new C25762Ba1(A04, applyDimension, applyDimension2, applyDimension3);
                    c5Tl.FBy(A0q);
                }
                c6l5 = (C6L5) A0q;
                AbstractC25225BEi.A1V(c5Tl, false);
            } else {
                c6l5 = null;
            }
            C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A06 = AbstractC118175Wb.A06(Modifier.A00);
            C6C7 A0g = AbstractC25228BEl.A0g();
            C122185gE c122185gE = new C122185gE(0.12f);
            long j2 = C118135Vx.A01;
            int A00 = A0g.A00(new C5W3(null, null, null, null, null, null, null, c122185gE, null, C5W2.A00.A01(c6l5, Float.NaN), null, null, j2, j2, C1132359l.A08));
            try {
                A0g.A09("@ ");
                A0g.A04(A00);
                A0g.A09(str);
                C5C8 A02 = A0g.A02();
                long A01 = AbstractC118155Vz.A01(20);
                Typeface A022 = AbstractC15960qq.A00(A0K).A02(EnumC15950qp.A0V);
                if (A022 != null) {
                    c1350369c = C69Y.A00(A022);
                } else {
                    c1350369c = null;
                }
                if (z) {
                    j = AbstractC25227BEk.A0g(c5Tl, -291567323).A14;
                } else {
                    j = AbstractC25227BEk.A0g(c5Tl, -291566299).A13;
                }
                C117505Tk.A0L(A0K2, false);
                C5WR.A02(c5Tl, A06, A02, null, c1350369c, null, null, null, null, 3, 0, 1, 0, 3120, 6, 31536, j, A01, false);
                if (C0fH.A02()) {
                    C0fH.A00(309691365);
                }
            } catch (Throwable th) {
                A0g.A04(A00);
                throw th;
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSX(str, z, i, 3);
        }
    }

    public static final void A0F(C5Tl c5Tl, String str, String str2, String str3, int i) {
        int i2;
        AbstractC167017dG.A1N(str, str2);
        C14360o3.A0B(str3, 2);
        c5Tl.Enr(-337751265);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2113721777, "com.instagram.profilecard.ui.ProfileInfoContainer (ProfileCardContent.kt:944)");
            }
            Modifier A0M = AbstractC25227BEk.A0M(Modifier.A00, 24.0f);
            InterfaceC1127857k A01 = AbstractC119595bH.A01(AbstractC118255Wn.A03(C118195Wf.A04, 4.0f), c5Tl, C118195Wf.A00);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0M);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A01, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            A0J(str, str2, c5Tl, AbstractC25225BEi.A01(i2));
            A0G(str3, c5Tl, (i2 >> 6) & 14);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(346956732);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT7(str, str2, str3, i, 2);
        }
    }

    public static final void A0G(String str, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-928419692);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1094838750, "com.instagram.profilecard.ui.ProfileBioRow (ProfileCardContent.kt:1001)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            int i3 = (i2 & 14) | 3072;
            C5WR.A03(c5Tl, null, null, AbstractC25233BEq.A0F(EnumC15950qp.A0Y, AbstractC15960qq.A00(A0K)), null, null, str, null, 3, 0, 3, 2, i3, 390, 27442, AbstractC25226BEj.A0I(c5Tl), AbstractC118155Vz.A01(16), 0L, false);
            if (C0fH.A02()) {
                C0fH.A00(501769983);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 11);
        }
    }

    public static final void A0H(String str, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(948369372);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2030381229, "com.instagram.profilecard.ui.ProfileFullName (ProfileCardContent.kt:968)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            int i3 = (i2 & 14) | 199680;
            C5WR.A03(c5Tl, null, null, AbstractC25233BEq.A0F(EnumC15950qp.A0T, AbstractC15960qq.A00(A0K)), null, C5W5.A01, str, null, 0, 0, 1, 2, i3, 390, 27538, AbstractC25226BEj.A0I(c5Tl), AbstractC118155Vz.A01(16), 0L, false);
            if (C0fH.A02()) {
                C0fH.A00(901366860);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 12);
        }
    }

    public static final void A0I(String str, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-1562854573);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(828832393, "com.instagram.profilecard.ui.ProfilePronoun (ProfileCardContent.kt:985)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            int i3 = (i2 & 14) | 199680;
            C5WR.A03(c5Tl, null, null, AbstractC25233BEq.A0F(EnumC15950qp.A0Y, AbstractC15960qq.A00(A0K)), null, C5W5.A04, str, null, 0, 0, 1, 0, i3, 6, 31634, AbstractC121605fB.A0M, AbstractC118155Vz.A01(16), 0L, false);
            if (C0fH.A02()) {
                C0fH.A00(1045236186);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.graphics.Bitmap r32, android.view.View r33, X.C5Tl r34, androidx.compose.ui.Modifier r35, X.O7E r36, X.C26081BgA r37, com.instagram.profilecard.domain.ProfileCardViewModel r38, X.C5Hc r39, int r40, int r41, boolean r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28509Ci3.A01(android.graphics.Bitmap, android.view.View, X.5Tl, androidx.compose.ui.Modifier, X.O7E, X.BgA, com.instagram.profilecard.domain.ProfileCardViewModel, X.5Hc, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r5 == 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C5Tl r15, androidx.compose.ui.Modifier r16, X.C26081BgA r17, float r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28509Ci3.A03(X.5Tl, androidx.compose.ui.Modifier, X.BgA, float, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0318  */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.0pO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C5Tl r39, androidx.compose.ui.Modifier r40, X.C26081BgA r41, X.InterfaceC16820sZ r42, X.InterfaceC16820sZ r43, X.InterfaceC16660sJ r44, X.InterfaceC16660sJ r45, X.InterfaceC16660sJ r46, int r47, int r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28509Ci3.A05(X.5Tl, androidx.compose.ui.Modifier, X.BgA, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, int, int, boolean):void");
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, int i) {
        int i2;
        boolean A1a = AbstractC167017dG.A1a(modifier, imageUrl);
        c5Tl.Enr(151656924);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(444846829, "com.instagram.profilecard.ui.ProfilePicture (ProfileCardContent.kt:872)");
            }
            BGD.A02(c5Tl, modifier, AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 3), new BI2(240.0f, 240.0f, 2.0f, 1.0f), ((i2 << 6) & 896) | 48);
            if (C0fH.A02()) {
                C0fH.A00(1677450562);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, imageUrl, modifier, i, A1a ? 1 : 0);
        }
    }

    public static final void A0J(String str, String str2, C5Tl c5Tl, int i) {
        int i2;
        AbstractC167017dG.A1N(str, str2);
        c5Tl.Enr(27503768);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1456540294, "com.instagram.profilecard.ui.ProfileNameAndPronounRow (ProfileCardContent.kt:956)");
            }
            Modifier A08 = AbstractC118185Wd.A08(Modifier.A00, 22.0f);
            InterfaceC1127857k A00 = AbstractC118375Wz.A00(AbstractC118255Wn.A01(4.0f), c5Tl, C118195Wf.A04);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            A0H(str, c5Tl, i2 & 14);
            A0I(str2, c5Tl, (i2 >> 3) & 14);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1017151317);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30195DSa(str, str2, i, 3);
        }
    }
}
