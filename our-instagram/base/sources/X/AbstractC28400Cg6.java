package X;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Date;

/* renamed from: X.Cg6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28400Cg6 {
    public static final void A00(C5Tl c5Tl, C97T c97t, C3EZ c3ez, C3EW c3ew, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        String str;
        String str2;
        int i3;
        String formatStrLocaleSafe;
        c5Tl.Enr(-443465898);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c3ew);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c97t);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, c3ez);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1737462334, "com.instagram.release.lockout.ExpiredLockoutScreen (LockoutFragment.kt:195)");
            }
            Context A0P = AbstractC25230BEn.A0P(c5Tl);
            boolean A1Q = AbstractC167007dF.A1Q(c97t.A00, c97t.A02.A01.A01);
            int time = (int) ((new Date().getTime() - AbstractC12880la.A01(A0P)) / 86400000);
            String A00 = AbstractC27702CJv.A00(A0P);
            C14360o3.A0B(A0P, 0);
            PackageManager packageManager = A0P.getPackageManager();
            String packageName = A0P.getPackageName();
            String str3 = AbstractC14490oL.A02;
            try {
                str = packageManager.getInstallerPackageName(packageName);
                if (str == null) {
                    str = "";
                }
            } catch (IllegalArgumentException unused) {
                str = "unknown";
            }
            if (str.length() <= 0 || (formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Installer: %s", str)) == null || (str2 = AnonymousClass001.A0D(formatStrLocaleSafe, '\n')) == null) {
                str2 = "";
            }
            String A0R = AnonymousClass001.A0R(A00, str2);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -476681433);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            c5Tl.Eno(-476679731);
            if (AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -476677170);
                if (A0q2 == obj) {
                    A0q2 = new D8A(interfaceC74953Yl, 8);
                    c5Tl.FBy(A0q2);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, A0q2, false);
                boolean A1H = AbstractC25233BEq.A1H(i2) | AbstractC25226BEj.A1X(c5Tl, c3ez, AbstractC25233BEq.A1W(c5Tl, c3ew, A0P, -476674776));
                Object EEc = c5Tl.EEc();
                if (A1H || EEc == obj) {
                    EEc = C29901DGp.A00(A0P, c3ez, interfaceC16820sZ, c3ew, 20);
                    c5Tl.FBy(EEc);
                }
                A03(c5Tl, A1A, AbstractC25225BEi.A1A(A0K, EEc, false), 6);
            }
            C117505Tk.A0L(A0K, false);
            AbstractC28504Chx.A05(c5Tl, new C26180Bi5(56.0f, R.drawable.instagram), null, AbstractC136736Hc.A01(c5Tl, AbstractC25228BEl.A1Y(time), 2131965692), A0R, AbstractC136736Hc.A00(c5Tl, 2131965701), null, null, 0, 3942);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A06;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A02, 6);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (A1Q) {
                c5Tl.Eno(54376084);
                i3 = 2131965694;
            } else {
                c5Tl.Eno(54378187);
                i3 = 2131965702;
            }
            String A003 = AbstractC136736Hc.A00(c5Tl, i3);
            C117505Tk.A0L(A0K, false);
            int i4 = i2 & 14;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c3ew, AbstractC25233BEq.A1X(c5Tl, A0P, c3ez, AbstractC25227BEk.A1W(c5Tl, 54381149, A1Q), c5Tl.AH6(c97t)), AbstractC167007dF.A1P(i4, 4));
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == obj) {
                EEc2 = new BUN(3, interfaceC74953Yl, c3ew, c97t, interfaceC16820sZ, c3ez, A0P, A1Q);
                c5Tl.FBy(EEc2);
            }
            InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(A0K, EEc2, false);
            String A004 = AbstractC136736Hc.A00(c5Tl, 2131965699);
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, c3ew, c3ez, 54406365) | AbstractC167007dF.A1P(i4, 4);
            Object EEc3 = c5Tl.EEc();
            if (A1W || EEc3 == obj) {
                EEc3 = new C43210J8h(4, interfaceC16820sZ, c3ez, c3ew);
                c5Tl.FBy(EEc3);
            }
            AbstractC28506Chz.A08(c5Tl, A003, A004, A1A2, AbstractC25225BEi.A1A(A0K, EEc3, false));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(314443306);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(interfaceC16820sZ, c3ez, c97t, c3ew, i, 19);
        }
    }

    public static final void A01(C5Tl c5Tl, C3EZ c3ez, C3EW c3ew, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        String A00;
        c5Tl.Enr(1274538446);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c3ew);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c3ez);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(468273424, "com.instagram.release.lockout.LockoutScreen (LockoutFragment.kt:131)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            boolean A03 = c3ew.A03();
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -962689802);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-962688109);
            if (AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -962685474);
                if (A0q2 == obj) {
                    A0q2 = new D8A(interfaceC74953Yl, 9);
                    c5Tl.FBy(A0q2);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, A0q2, false);
                boolean A1X = AbstractC25226BEj.A1X(c5Tl, c3ez, AbstractC25233BEq.A1W(c5Tl, c3ew, A19, -962683061)) | AbstractC167007dF.A1P(i2 & 14, 4);
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == obj) {
                    EEc = C29901DGp.A00(A19, c3ez, interfaceC16820sZ, c3ew, 21);
                    c5Tl.FBy(EEc);
                }
                A02(c5Tl, A1A, AbstractC25225BEi.A1A(c117505Tk, EEc, false), 6);
            }
            C117505Tk.A0L(c117505Tk, false);
            C26180Bi5 c26180Bi5 = new C26180Bi5(56.0f, R.drawable.instagram);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131965700);
            if (A03) {
                c5Tl.Eno(222135645);
                A00 = AnonymousClass001.A0R(AbstractC136736Hc.A00(c5Tl, 2131965691), AbstractC136736Hc.A00(c5Tl, 2131965693));
            } else {
                c5Tl.Eno(-962661927);
                A00 = AbstractC136736Hc.A00(c5Tl, 2131965691);
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC28504Chx.A08(c5Tl, c26180Bi5, A00, A002, 0, 4070);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A06;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A02, 6);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (A03) {
                c5Tl.Eno(1438934872);
                String A004 = AbstractC136736Hc.A00(c5Tl, 2131965695);
                Object A0q3 = AbstractC25227BEk.A0q(c5Tl, 184968764);
                if (A0q3 == obj) {
                    A0q3 = new D8A(interfaceC74953Yl, 10);
                    c5Tl.FBy(A0q3);
                }
                AbstractC28506Chz.A0D(AbstractC25225BEi.A1A(c117505Tk, A0q3, false), A004, c5Tl, 48);
            } else {
                c5Tl.Eno(1439134481);
                String A005 = AbstractC136736Hc.A00(c5Tl, 2131965695);
                Object A0q4 = AbstractC25227BEk.A0q(c5Tl, 184974812);
                if (A0q4 == obj) {
                    A0q4 = new D8A(interfaceC74953Yl, 11);
                    c5Tl.FBy(A0q4);
                }
                InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(c117505Tk, A0q4, false);
                String A006 = AbstractC136736Hc.A00(c5Tl, 2131965699);
                boolean A1W = AbstractC25233BEq.A1W(c5Tl, c3ew, c3ez, 184979884) | AbstractC25228BEl.A1S(i2);
                Object EEc2 = c5Tl.EEc();
                if (A1W || EEc2 == obj) {
                    EEc2 = new C43210J8h(5, interfaceC16820sZ, c3ez, c3ew);
                    c5Tl.FBy(EEc2);
                }
                AbstractC28506Chz.A09(c5Tl, A005, A006, A1A2, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 48);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-352147489);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTY(c3ew, c3ez, interfaceC16820sZ, i, 8, z);
        }
    }

    public static final void A02(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(1838211607);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1692643139, "com.instagram.release.lockout.GooglePlayEnrollmentPrompt (LockoutFragment.kt:180)");
            }
            AbstractC28433Cgh.A04(c5Tl, CGH.A00(c5Tl, null, interfaceC16820sZ2, 2131968948, 14), AbstractC136736Hc.A00(c5Tl, 2131965690), AbstractC136736Hc.A00(c5Tl, 2131965689), interfaceC16820sZ, i2 & 14, 4080);
            if (C0fH.A02()) {
                C0fH.A00(-1625389761);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, interfaceC16820sZ, interfaceC16820sZ2, i, 10);
        }
    }

    public static final void A03(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(-629836337);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2123210219, "com.instagram.release.lockout.GooglePlayUninstallPrompt (LockoutFragment.kt:259)");
            }
            AbstractC28433Cgh.A04(c5Tl, CGH.A00(c5Tl, null, interfaceC16820sZ2, 2131968948, 14), AbstractC136736Hc.A00(c5Tl, 2131965697), AbstractC136736Hc.A00(c5Tl, 2131965696), interfaceC16820sZ, i2 & 14, 4080);
            if (C0fH.A02()) {
                C0fH.A00(1835161915);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, interfaceC16820sZ, interfaceC16820sZ2, i, 11);
        }
    }
}
