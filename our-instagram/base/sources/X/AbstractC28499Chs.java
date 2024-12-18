package X;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.Chs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28499Chs {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C5Tl r27, androidx.compose.ui.Modifier r28, com.instagram.common.typedurl.SimpleImageUrl r29, java.lang.String r30, X.InterfaceC16660sJ r31, X.InterfaceC65696TsI r32, int r33, int r34, int r35, long r36, boolean r38) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28499Chs.A06(X.5Tl, androidx.compose.ui.Modifier, com.instagram.common.typedurl.SimpleImageUrl, java.lang.String, X.0sJ, X.TsI, int, int, int, long, boolean):void");
    }

    public static float A00(InterfaceC74953Yl interfaceC74953Yl, float f) {
        return AbstractC13690mv.A00((Context) interfaceC74953Yl.getValue(), f);
    }

    public static final AnonymousClass583 A01(InterfaceC74963Ym interfaceC74963Ym) {
        int ordinal = ((AnonymousClass583) interfaceC74963Ym.getValue()).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return AnonymousClass583.Ltr;
            }
            throw B4Z.A00();
        }
        return AnonymousClass583.Rtl;
    }

    public static final void A02(InterfaceC118275Wp interfaceC118275Wp, InterfaceC118305Ws interfaceC118305Ws, InterfaceC30904DiH interfaceC30904DiH, LazyGridState lazyGridState, C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(2122283218);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, lazyGridState) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, interfaceC30904DiH);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, interfaceC118305Ws);
        }
        if ((57344 & i) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, interfaceC118275Wp);
        }
        if ((458752 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ);
        }
        if ((374491 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1118511004, "com.instagram.archive.ui.InvertedLazyGrid (ArchiveReelComposeFragment.kt:737)");
            }
            C5UP c5up = C5V2.A07;
            InterfaceC74953Yl A0U = AbstractC25228BEl.A0U(c5Tl, c5up);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1872493512);
            if (A0q == C5UI.A00) {
                A0q = A01(A0U);
                c5Tl.FBy(A0q);
            }
            AbstractC25225BEi.A1T(c5Tl);
            AbstractC25230BEn.A17(c5Tl, c5up.A02(A0q), new DUN(1, modifier, interfaceC118305Ws, interfaceC16660sJ, interfaceC30904DiH, lazyGridState, interfaceC118275Wp), -597693422);
            if (C0fH.A02()) {
                C0fH.A00(-711813137);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV8(lazyGridState, interfaceC118305Ws, modifier, interfaceC16660sJ, interfaceC118275Wp, interfaceC30904DiH, i, 2);
        }
    }

    public static final void A03(C5Tl c5Tl, int i) {
        c5Tl.Enr(1387826154);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(731809018, "com.instagram.archive.ui.LoadingComponent (ArchiveReelComposeFragment.kt:1245)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            BIR.A03(c5Tl, c1130158n, A01);
            if (C0fH.A02()) {
                C0fH.A00(-845247320);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 14);
        }
    }

    public static final void A04(C5Tl c5Tl, int i) {
        c5Tl.Enr(593901808);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-733727034, "com.instagram.archive.ui.PrivacyFooter (ArchiveReelComposeFragment.kt:835)");
            }
            C5WR.A0C(c5Tl, AbstractC118175Wb.A08(Modifier.A00, 15.0f), AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, 2131974552), 3, 2, 48, 6, 15224, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-1782966741);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 15);
        }
    }

    public static final void A05(C5Tl c5Tl, int i, long j) {
        int i2;
        c5Tl.Enr(-547874152);
        if ((i & 14) == 0) {
            i2 = AbstractC25230BEn.A04(c5Tl.AH3(j) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-883072474, "com.instagram.archive.ui.CalendarHeader (ArchiveReelComposeFragment.kt:808)");
            }
            Modifier A0C = AbstractC118175Wb.A0C(AbstractC118185Wd.A0G(Modifier.A00, 44.0f, 44.0f), 8.0f, 0.0f, 0.0f);
            C5XL.A02(c5Tl);
            Modifier A0y = AbstractC25232BEp.A0y(c5Tl, C6L2.A01(A0C, C5WE.A01));
            InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0y);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Date date = new Date(1000 * j);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, date, -684485777);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                TimeZone timeZone = MX0.A03;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d", Locale.getDefault());
                simpleDateFormat.setTimeZone(MX0.A03);
                EEc = simpleDateFormat.format(date);
                c5Tl.FBy(EEc);
            }
            String str = (String) EEc;
            C117505Tk.A0L(c117505Tk, false);
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, date, -684482991);
            Object EEc2 = c5Tl.EEc();
            if (A1Y2 || EEc2 == C5UI.A00) {
                TimeZone timeZone2 = MX0.A03;
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM", Locale.getDefault());
                simpleDateFormat2.setTimeZone(MX0.A03);
                EEc2 = simpleDateFormat2.format(date);
                c5Tl.FBy(EEc2);
            }
            String str2 = (String) EEc2;
            C117505Tk.A0L(c117505Tk, false);
            C14360o3.A0A(str);
            C5WR.A0t(c5Tl, AbstractC25226BEj.A0h(c5Tl), str, AbstractC25226BEj.A0G(c5Tl));
            C14360o3.A0A(str2);
            C5WR.A0t(c5Tl, AbstractC25225BEi.A0Y(c5Tl), str2, AbstractC25226BEj.A0G(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1968722369);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30187DRs(j, i);
        }
    }

    public static final void A08(C5Tl c5Tl, C31230DoD c31230DoD, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, float f, float f2, int i, boolean z) {
        int i2;
        c5Tl.Enr(80251959);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c31230DoD) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A04(c5Tl, f);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A05(c5Tl, f2);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i & 57344) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((458752 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16620sF);
        }
        if ((i & 3670016) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16660sJ2);
        }
        if ((2995931 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-158608625, "com.instagram.archive.ui.OnThisDayMedia (ArchiveReelComposeFragment.kt:854)");
            }
            InterfaceC74953Yl A0U = AbstractC25228BEl.A0U(c5Tl, AndroidCompositionLocals_androidKt.A01);
            interfaceC16620sF.invoke(c31230DoD.A02, Boolean.valueOf(z));
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 16.0f, 0.0f, 0.0f, 16.0f);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A08 = AbstractC118185Wd.A08(A0T, 48.0f);
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A04;
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC1127857k A002 = AbstractC118375Wz.A00(interfaceC118335Wv, c5Tl, interfaceC118225Wj);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A002, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5WR.A0t(c5Tl, AbstractC25226BEj.A0d(c5Tl), C5YD.A00(c5Tl, 2131953169), AbstractC25226BEj.A0G(c5Tl));
            C2DC A004 = C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_filled_24, 0);
            Modifier A082 = AbstractC118175Wb.A08(c1130158n, 16.0f);
            int i3 = i2 & 14;
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A0U, -437567679) | AbstractC25231BEo.A1J(i3) | AbstractC167007dF.A1P(i2 & 3670016, 1048576);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A10(c5Tl, A0U, c31230DoD, interfaceC16660sJ2, 33);
            }
            C5YS.A02(c5Tl, C5XR.A05(A082, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true), A004, 56, AbstractC25226BEj.A0L(c5Tl));
            c5Tl.ASW();
            InterfaceC1127857k A005 = AbstractC118375Wz.A00(AbstractC118255Wn.A01, c5Tl, interfaceC118225Wj);
            int A006 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A006);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            ImageUrl imageUrl = (ImageUrl) c31230DoD.A03;
            c5Tl.Eno(-437550129);
            if (imageUrl != null) {
                C2DB A007 = AbstractC43541zP.A00(c5Tl, new SimpleImageUrl(imageUrl));
                Modifier A008 = AbstractC27468CAo.A00(AbstractC118185Wd.A0D(c1130158n, f2), f, false);
                c5Tl.Eno(-437541219);
                boolean A1P = AbstractC167007dF.A1P(i2 & 57344, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) | AbstractC167007dF.A1P(i3, 4);
                Object EEc2 = c5Tl.EEc();
                if (A1P || EEc2 == C5UI.A00) {
                    EEc2 = new MHV(4, c31230DoD, interfaceC16660sJ);
                    c5Tl.FBy(EEc2);
                }
                C6LQ.A07(c5Tl, C5XR.A05(A008, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), true), A007, 1572920, 56);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier A0E2 = AbstractC118175Wb.A0E(c1130158n, 16.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A009 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, A0E2);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A009)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A009);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            String format = new SimpleDateFormat("yyyy", MX0.A05()).format(Long.valueOf(c31230DoD.A01 * 1000));
            C14360o3.A07(format);
            boolean z2 = true;
            int parseInt = Calendar.getInstance().get(1) - Integer.parseInt(format);
            boolean z3 = true;
            C5WR.A0t(c5Tl, AbstractC25225BEi.A0X(c5Tl), C5YD.A00(c5Tl, 2131968966), AbstractC25226BEj.A0G(c5Tl));
            String A0k = AbstractC167017dG.A0k(((Context) A0U.getValue()).getResources(), parseInt, R.plurals.on_this_day_subtitle);
            C14360o3.A07(A0k);
            C5WR.A0t(c5Tl, AbstractC25226BEj.A0g(c5Tl), A0k, AbstractC25226BEj.A0M(c5Tl));
            c5Tl.Eno(219034930);
            if ((i2 & 57344) != 16384) {
                z2 = false;
            }
            if (i3 != 4) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object EEc3 = c5Tl.EEc();
            if (z4 || EEc3 == C5UI.A00) {
                EEc3 = new MHV(5, c31230DoD, interfaceC16660sJ);
                c5Tl.FBy(EEc3);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc3, false);
            C6GE.A02(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 12.0f, 0.0f, 0.0f), AbstractC25225BEi.A0u(c5Tl), C5YD.A00(c5Tl, 2131973639), A1A);
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-344324634);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30248DUb(c31230DoD, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16620sF, f, f2, i, z);
        }
    }

    public static final void A09(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        String A00;
        int i3;
        int i4;
        c5Tl.Enr(-1951185729);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(377270042, "com.instagram.archive.ui.EmptyArchiveView (ArchiveReelComposeFragment.kt:1213)");
            }
            String str = null;
            C26180Bi5 c26180Bi5 = new C26180Bi5(96.0f, R.drawable.empty_state_private);
            ReelAutoArchiveSettingStr BlR = C17060sy.A01.A01((UserSession) AbstractC25228BEl.A0U(c5Tl, AbstractC117935Vd.A00).getValue()).A03.BlR();
            if (BlR == null) {
                BlR = ReelAutoArchiveSettingStr.A07;
            }
            int ordinal = BlR.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 0) {
                            c5Tl.Eno(821965967);
                            i4 = 6;
                            i3 = 4086;
                            A00 = "";
                        } else {
                            throw AbstractC25233BEq.A0r(c5Tl, 821918386);
                        }
                    } else {
                        c5Tl.Eno(-289137549);
                        A00 = C5YD.A00(c5Tl, 2131974459);
                        str = C5YD.A00(c5Tl, 2131974459);
                        i3 = 4070;
                        i4 = 0;
                    }
                    AbstractC28504Chx.A08(c5Tl, c26180Bi5, str, A00, i4, i3);
                    AbstractC25225BEi.A1V(c5Tl, false);
                } else {
                    c5Tl.Eno(-289767066);
                    String A002 = C5YD.A00(c5Tl, 2131974459);
                    String A003 = C5YD.A00(c5Tl, 2131974457);
                    String A004 = C5YD.A00(c5Tl, 2131974455);
                    c5Tl.Eno(821948013);
                    boolean A1R = AbstractC25228BEl.A1R(i2);
                    Object EEc = c5Tl.EEc();
                    if (A1R || EEc == C5UI.A00) {
                        EEc = new C50162MDp(interfaceC16820sZ, 3);
                        c5Tl.FBy(EEc);
                    }
                    C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                    AbstractC28504Chx.A06(c5Tl, c26180Bi5, null, A003, A002, A004, (InterfaceC16820sZ) EEc, 0, 1510);
                    C117505Tk.A0L(A0K, false);
                }
            } else {
                c5Tl.Eno(-290243505);
                String A005 = C5YD.A00(c5Tl, 2131974460);
                String A006 = C5YD.A00(c5Tl, 2131974458);
                String A007 = C5YD.A00(c5Tl, 2131974456);
                boolean A1X = AbstractC25235BEs.A1X(c5Tl, 821933822, i2);
                Object EEc2 = c5Tl.EEc();
                if (A1X || EEc2 == C5UI.A00) {
                    EEc2 = new C50162MDp(interfaceC16820sZ2, 2);
                    c5Tl.FBy(EEc2);
                }
                C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                AbstractC28504Chx.A06(c5Tl, c26180Bi5, null, A006, A005, A007, (InterfaceC16820sZ) EEc2, 0, 1510);
                C117505Tk.A0L(A0K2, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1528964122);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30507Dbq(interfaceC16820sZ, interfaceC16820sZ2, i, 19);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x04a4, code lost:
    
        if (X.AbstractC25230BEn.A1X(r67) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04aa, code lost:
    
        r1 = 500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04b0, code lost:
    
        if (X.AbstractC25230BEn.A1X(r67) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04b2, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04b3, code lost:
    
        r43 = X.AbstractC28454Ch4.A02(X.C25245BFe.A00(r1, 1200), r122, null, r71, 3072, 20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04cb, code lost:
    
        if (X.AbstractC25231BEo.A05(r43) != 0.0f) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04cd, code lost:
    
        r29 = X.AbstractC119675bQ.A01(r29, X.DLD.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04d9, code lost:
    
        if (X.C0fH.A02() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04db, code lost:
    
        r0 = 1772235304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x059e, code lost:
    
        r15 = X.AbstractC25228BEl.A0U(r122, r13);
        r62 = X.AbstractC25227BEk.A0q(r122, 617107689);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05ab, code lost:
    
        if (r62 != r5) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05ad, code lost:
    
        r62 = X.AbstractC118385Xa.A00(0.0f);
        r122.FBy(r62);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05b6, code lost:
    
        r0 = (X.C5Y1) r62;
        X.C117505Tk.A0L(r4, false);
        r0 = X.AbstractC25227BEk.A0q(r122, 617109322);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05c6, code lost:
    
        if (r0 != r5) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05c8, code lost:
    
        r0 = java.lang.Float.valueOf(r6 - A00(r15, 5.0f + 8.0f));
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05d9, code lost:
    
        r99 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
        r0 = X.AbstractC25227BEk.A0q(r122, 617112941);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05e7, code lost:
    
        if (r0 != r5) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x05e9, code lost:
    
        r0 = X.AbstractC25232BEp.A0w(r122, java.lang.Float.valueOf(0.0f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x05f1, code lost:
    
        r42 = X.AbstractC25225BEi.A0M(r4, r0, false);
        r0 = X.AbstractC25227BEk.A0q(r122, 617116972);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05fc, code lost:
    
        if (r0 != r5) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05fe, code lost:
    
        r0 = X.AbstractC25232BEp.A0w(r122, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0606, code lost:
    
        r41 = X.AbstractC25225BEi.A0M(r4, r0, false);
        r122.Eno(617123174);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0616, code lost:
    
        if (((r14 & 7168) ^ 3072) <= 2048) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x061c, code lost:
    
        if (r122.AH2(r6) != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0623, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0624, code lost:
    
        r0 = r122.EEc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0628, code lost:
    
        if (r7 != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x062a, code lost:
    
        if (r0 != r5) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x063d, code lost:
    
        r61 = X.AbstractC166987dD.A0H(r0);
        X.C117505Tk.A0L(r4, false);
        r6 = java.lang.Long.valueOf(((X.OJ8) X.AbstractC001800i.A0K(r137)).A01);
        r1 = X.AbstractC25231BEo.A0E(r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0654, code lost:
    
        if (r1 < 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0658, code lost:
    
        if (r1 >= r61) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x065a, code lost:
    
        r1 = (X.OJ8) r137.get(X.C17s.A03(X.AbstractC25231BEo.A0E(r41) * 3, 0, r137.size() - 1));
        r0 = r1.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0674, code lost:
    
        if (r0 == null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0678, code lost:
    
        if (r0.A0b == null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x067a, code lost:
    
        r6 = java.lang.Long.valueOf(r1.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0b97, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0680, code lost:
    
        if (r6 == null) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0682, code lost:
    
        r11 = 1000 * r6.longValue();
        r13 = new java.util.Date(r11);
        r0 = X.MX0.A03;
        r7 = new java.text.SimpleDateFormat("MMM", java.util.Locale.getDefault());
        r7.setTimeZone(X.MX0.A03);
        r13 = r7.format(r13);
        r7 = new java.text.SimpleDateFormat("yyyy", X.MX0.A05()).format(java.lang.Long.valueOf(r11));
        X.C14360o3.A07(r7);
        r1 = X.AnonymousClass001.A0T(r13, r7, ' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x06c3, code lost:
    
        r0 = X.AbstractC25227BEk.A1Y(r122, r6, 617141033);
        r46 = r122.EEc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x06ce, code lost:
    
        if (r0 != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x06d2, code lost:
    
        if (r46 != r5) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x06dd, code lost:
    
        r0 = (java.lang.String) r46;
        X.C117505Tk.A0L(r4, false);
        r0 = X.CBX.A00(r122);
        r49 = X.AbstractC25227BEk.A0q(r122, 617145038);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x06f5, code lost:
    
        if (r49 != r5) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x06f7, code lost:
    
        r49 = new X.C118125Vw(null, null, X.C5W5.A01, 0, 1, 4194297, 0, X.AbstractC118155Vz.A01(14), 0, 0);
        r122.FBy(r49);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0718, code lost:
    
        r1 = (X.C118125Vw) r49;
        X.C117505Tk.A0L(r4, false);
        r1 = X.AbstractC25227BEk.A0q(r122, 617149874);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0728, code lost:
    
        if (r1 != r5) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x072a, code lost:
    
        r6 = X.C16930sl.A00;
        r1 = new X.C119055aN(r0.A01(new X.C5C8(r6, r6, r0), r1, r0.A00, r0.A01, r0.A02, r6, X.C5AU.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE)).A02);
        r122.FBy(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x075c, code lost:
    
        r0 = ((X.C119055aN) r1).A00;
        X.C117505Tk.A0L(r4, false);
        r0 = X.AbstractC25227BEk.A0q(r122, 617153752);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x076c, code lost:
    
        if (r0 != r5) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x076e, code lost:
    
        r0 = java.lang.Float.valueOf(X.C5YC.A02(X.AbstractC119215ad.A01(r0)) + (A00(r15, 20.0f) * 2.0f));
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0787, code lost:
    
        r100 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
        r0 = X.AbstractC25227BEk.A0q(r122, 617158173);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0795, code lost:
    
        if (r0 != r5) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0797, code lost:
    
        r0 = java.lang.Float.valueOf((r6 - A00(r15, (8.0f + 5.0f) + 18.0f)) - r100);
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x07ae, code lost:
    
        r59 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x07c1, code lost:
    
        if (X.AbstractC25231BEo.A01(r0) != 0.0f) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x07c3, code lost:
    
        X.AbstractC166987dD.A1Z(new X.PYa(r0, null, r59, 4), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x07d5, code lost:
    
        r0 = X.AbstractC25227BEk.A0q(r122, 617168573);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x07dc, code lost:
    
        if (r0 != r5) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x07de, code lost:
    
        r0 = java.lang.Float.valueOf(r0 - A00(r15, (r19 + 8.0f) + r19));
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x07f1, code lost:
    
        r58 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
        r1 = X.AbstractC25227BEk.A1V(r122, 617173797, r61);
        r0 = r122.EEc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0805, code lost:
    
        if (r1 != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0807, code lost:
    
        if (r0 != r5) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0814, code lost:
    
        r7 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
        r11 = X.AbstractC25227BEk.A1T(r122, r7, 617176524);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0829, code lost:
    
        if (((r14 & 234881024) ^ 100663296) <= 67108864) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0831, code lost:
    
        if (r122.AH1(r64) != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0837, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0838, code lost:
    
        r6 = r6 | r11;
        r0 = r122.EEc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x083d, code lost:
    
        if (r6 != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x083f, code lost:
    
        if (r0 != r5) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x084c, code lost:
    
        r6 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
        r1 = X.AbstractC25227BEk.A1T(r122, r6, 617182886);
        r0 = r122.EEc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x085e, code lost:
    
        if (r1 != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0860, code lost:
    
        if (r0 != r5) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x086e, code lost:
    
        r12 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
        r0 = X.AbstractC25227BEk.A0q(r122, 617187262);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x087c, code lost:
    
        if (r0 != r5) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x087e, code lost:
    
        r0 = java.lang.Float.valueOf(r59 - 200.0f);
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0889, code lost:
    
        r1 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0894, code lost:
    
        if (X.AbstractC25230BEn.A1X(r67) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x089c, code lost:
    
        if (X.AbstractC25231BEo.A01(r0) != r59) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x089e, code lost:
    
        r11 = java.lang.Float.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x08a2, code lost:
    
        X.AbstractC166987dD.A1Z(new X.MCH(r0, r11, (X.InterfaceC23621Ds) null, 41), r0);
        r122.Eno(617206265);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x08bc, code lost:
    
        if (X.AbstractC25230BEn.A1X(r67) == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x08be, code lost:
    
        r14 = (X.AbstractC25231BEo.A03(r42) - A00(r15, 8.0f)) / (r58 - A00(r15, 8.0f));
        r12 = (int) (r12 * r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x08d7, code lost:
    
        if ((r6 * r14) >= r9) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x08d9, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x08da, code lost:
    
        X.AbstractC25227BEk.A19(r41, r1);
        r0 = r12;
        r6 = r61 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x08e6, code lost:
    
        if (r0 < (r6 * r9)) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x08e8, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x08e9, code lost:
    
        r7 = 0;
        r0 = (X.AbstractC167007dF.A1O(r1) ? 1.0f : 0.0f) * r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x08f0, code lost:
    
        if (r1 <= 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x08f2, code lost:
    
        r7 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x08f4, code lost:
    
        r11 = ((int) (r0 + (r7 * r9))) - r12;
        r0 = X.AbstractC25227BEk.A0q(r122, 617245316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0900, code lost:
    
        if (r0 != r5) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0902, code lost:
    
        r0 = java.lang.Integer.valueOf((int) java.lang.Math.floor(r25 / r9));
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0914, code lost:
    
        r7 = X.AbstractC166987dD.A0H(r0);
        X.C117505Tk.A0L(r4, false);
        r6 = r6 - X.C17s.A03(r1 + r7, 0, r6);
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0926, code lost:
    
        if (r14 == 1.0f) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0928, code lost:
    
        r12 = (r6 * 3) + (!r146 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x092d, code lost:
    
        r0 = (r25 - (r11 + r9)) - ((r7 - 1) * r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x093a, code lost:
    
        if (r14 != 1.0f) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x093c, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x093d, code lost:
    
        r40.invoke(java.lang.Integer.valueOf(r12), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x094a, code lost:
    
        X.C117505Tk.A0L(r4, false);
        r40 = X.AbstractC119395aw.A00(X.AbstractC25231BEo.A01(r0), X.AbstractC25231BEo.A03(r42));
        r13 = X.AbstractC25231BEo.A01(r0) + A00(r15, 20.0f);
        r12 = X.AbstractC25231BEo.A03(r42) + X.AbstractC25227BEk.A00(A00(r15, r19), X.C119055aN.A00(r0));
        r11 = (0.0f - A00(r15, 4.0f)) + X.AbstractC25231BEo.A01(r0);
        r16 = (0.0f - X.AbstractC13690mv.A00((android.content.Context) r15.getValue(), 4.0f)) + X.AbstractC25231BEo.A03(r42);
        r7 = (X.AbstractC25231BEo.A01(r0) + r100) + A00(r15, 4.0f);
        r9 = X.AbstractC13690mv.A00((android.content.Context) r15.getValue(), 4.0f + r19) + X.AbstractC25231BEo.A03(r42);
        r0 = X.AbstractC25227BEk.A0q(r122, 617330710);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x09c0, code lost:
    
        if (r0 != r5) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x09c2, code lost:
    
        r0 = java.lang.Float.valueOf(r59 - A00(r15, 50.0f));
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x09d1, code lost:
    
        r70 = X.AbstractC166987dD.A09(r0);
        X.C117505Tk.A0L(r4, false);
        r0 = X.AbstractC25227BEk.A0q(r122, 617333723);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x09df, code lost:
    
        if (r0 != r5) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x09e1, code lost:
    
        r0 = X.AbstractC25232BEp.A0w(r122, java.lang.Float.valueOf(r16 - A00(r15, 50.0f)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x09f1, code lost:
    
        r65 = X.AbstractC25225BEi.A0M(r4, r0, false);
        r0 = X.AbstractC25227BEk.A0q(r122, 617336900);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x09fc, code lost:
    
        if (r0 != r5) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x09fe, code lost:
    
        r0 = X.AbstractC25232BEp.A0w(r122, java.lang.Float.valueOf(A00(r15, 50.0f) + r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0a0d, code lost:
    
        r66 = X.AbstractC25225BEi.A0M(r4, r0, false);
        r122.Eno(617342100);
        r1 = X.AbstractC25235BEs.A1V(r122, r13, r12, X.AbstractC25228BEl.A1V(r122, r0, (X.AbstractC25235BEs.A1V(r122, r7, r9, X.AbstractC25235BEs.A1V(r122, r11, r16, (X.AbstractC25228BEl.A1V(r122, r43, (X.AbstractC25230BEn.A1Q(r122.AH3(r38) ? 1 : 0) | X.AbstractC25232BEp.A1T(r122, 5.0f)) | X.AbstractC25232BEp.A1T(r122, r19), X.AbstractC25232BEp.A1T(r122, 3.0f)) | X.AbstractC25232BEp.A1T(r122, r31)) | X.AbstractC25230BEn.A1Q(r122.AH3(r0) ? 1 : 0))) | X.AbstractC25232BEp.A1T(r122, 15.0f)) | X.AbstractC25230BEn.A1Q(r122.AH3(r36) ? 1 : 0), r122.AH3(r40)));
        r0 = r122.EEc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0a7d, code lost:
    
        if (r1 != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0a7f, code lost:
    
        if (r0 != r5) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0aa7, code lost:
    
        r6 = X.AbstractC25230BEn.A0W(r4, r29, r0, false);
        r1 = X.C0eB.A00;
        r122.Eno(617395444);
        r7 = (X.AbstractC25232BEp.A1T(r122, 8.0f) | X.AbstractC25232BEp.A1T(r122, 50.0f)) | X.AbstractC25232BEp.A1T(r122, r19);
        r0 = r122.EEc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0acd, code lost:
    
        if (r7 != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0acf, code lost:
    
        if (r0 != r5) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0ae7, code lost:
    
        r29 = X.AbstractC25229BEm.A0U(r4, r6, r0, r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0aef, code lost:
    
        if (X.C0fH.A02() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0af1, code lost:
    
        r0 = -1190696513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0ad1, code lost:
    
        r0 = new com.instagram.archive.ui.ArchiveReelComposeFragmentKt$fastScroll$6$1(r65, r66, r67, r42, null, r70, 8.0f, r58, 50.0f, r19);
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0a81, code lost:
    
        r0 = new X.DIZ(r42, r43, r1, r0, r99, r100, r11, r16, r7, r9, r13, r12, r38, r36, r40, r0);
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0af6, code lost:
    
        r0 = (int) (r9 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0afc, code lost:
    
        if (r0 >= r9) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0afe, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0b01, code lost:
    
        r1 = ((int) java.lang.Math.floor((r0 - r9) / r9)) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0b0e, code lost:
    
        r1 = (int) java.lang.Math.floor(r6 / r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0b18, code lost:
    
        r11 = (r61 - 1) - ((int) java.lang.Math.floor(r0.intValue() / 3.0f));
        r6 = r9 - (r25 - r33.intValue());
        r1 = 0;
        r0 = (X.AbstractC167007dF.A1O(r11) ? 1.0f : 0.0f) * r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0b3b, code lost:
    
        if (r11 <= 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0b3d, code lost:
    
        r1 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0b3f, code lost:
    
        X.AbstractC25227BEk.A18(r42, X.C17s.A02(r58 * X.C17s.A01(java.math.BigDecimal.valueOf((((int) (r0 + (r1 * r9))) + r6) / r12).setScale(5, java.math.RoundingMode.HALF_UP).floatValue()), A00(r15, 8.0f), r58));
        X.AbstractC25227BEk.A19(r41, (int) java.lang.Math.floor((r7 * r11) / r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0b81, code lost:
    
        if (X.AbstractC25230BEn.A1X(r67) != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0b89, code lost:
    
        if (X.AbstractC25231BEo.A01(r0) != r1) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0b8b, code lost:
    
        r11 = java.lang.Float.valueOf(r59);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0b91, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0862, code lost:
    
        r0 = java.lang.Float.valueOf(r6 - r25);
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0841, code lost:
    
        r0 = java.lang.Float.valueOf((r7 + r65) + r64);
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0833, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0835, code lost:
    
        if ((r14 & 100663296) != 67108864) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0809, code lost:
    
        r0 = java.lang.Float.valueOf(r61 * r9);
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06d4, code lost:
    
        if (r1 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x06d6, code lost:
    
        r1 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x06d8, code lost:
    
        r122.FBy(r1);
        r46 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0b94, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x062c, code lost:
    
        r0 = java.lang.Integer.valueOf((int) java.lang.Math.ceil(r6 / 3.0f));
        r122.FBy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x061e, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0621, code lost:
    
        if ((r14 & 3072) != 2048) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x04a8, code lost:
    
        if (r11 == false) goto L166;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C5Tl r122, X.C31230DoD r123, java.lang.String r124, X.InterfaceC16820sZ r125, X.InterfaceC16660sJ r126, X.InterfaceC16660sJ r127, X.InterfaceC16660sJ r128, X.InterfaceC16660sJ r129, X.InterfaceC16660sJ r130, X.InterfaceC16660sJ r131, X.InterfaceC16660sJ r132, X.InterfaceC16660sJ r133, X.InterfaceC16620sF r134, X.InterfaceC16620sF r135, X.InterfaceC16600sD r136, X.C5Hc r137, X.InterfaceC65696TsI r138, int r139, int r140, int r141, int r142, boolean r143, boolean r144, boolean r145, boolean r146, boolean r147) {
        /*
            Method dump skipped, instructions count: 3019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28499Chs.A07(X.5Tl, X.DoD, java.lang.String, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sF, X.0sF, X.0sD, X.5Hc, X.TsI, int, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
