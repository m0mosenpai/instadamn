package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.ui.OpalTabContentKt$OpalTabEmptyContent$2$1;

/* renamed from: X.CeA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28322CeA {
    public static final void A02(C5Tl c5Tl, Modifier modifier, InterfaceC11380iw interfaceC11380iw, C69 c69, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i, boolean z) {
        int i2;
        int i3;
        c5Tl.Enr(-989964147);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, c69);
        }
        if ((i & 196608) == 0) {
            i2 |= AbstractC25232BEp.A0g(c5Tl, z);
        }
        if ((i & 1572864) == 0) {
            i2 |= AbstractC25232BEp.A0X(c5Tl, str);
        }
        if ((i & 12582912) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC11380iw);
        }
        if ((i & 100663296) == 0) {
            i2 |= AbstractC25232BEp.A0Z(c5Tl, modifier);
        }
        if ((i2 & 38347923) == 38347922 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1321282029, "com.instagram.opal.impl.ui.OpalTabEmptyContent (OpalTabContent.kt:355)");
            }
            UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
            Modifier A0A = AbstractC118175Wb.A0A(modifier, 16.0f, 0.0f);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            C1130158n c1130158n = Modifier.A00;
            int i4 = 100;
            if (z) {
                i4 = 65;
            }
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 0.0f, i4, 0.0f, 0.0f), 80.0f);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            Modifier AB6 = c6gm.AB6(interfaceC118245Wl, A0C);
            int ordinal = c69.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i3 = R.drawable.ig_illustrations_illo_reels;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i3 = R.drawable.ig_illustrations_illo_add_photos_videos_refresh;
            }
            boolean z2 = false;
            C6LQ.A02(c5Tl, AB6, AbstractC25228BEl.A0a(AbstractC25226BEj.A0F(c5Tl)), C5Y7.A00(c5Tl, i3, 0), 48);
            if (z) {
                c5Tl.Eno(-1230556992);
                int i5 = 2131969035;
                if (ordinal != 0) {
                    i5 = 2131969033;
                }
                String A002 = AbstractC136736Hc.A00(c5Tl, i5);
                C25267BGf A0c = AbstractC25235BEs.A0c(c5Tl, false);
                Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
                Modifier AB62 = c6gm.AB6(interfaceC118245Wl, AbstractC118175Wb.A0E(A0T, 0.0f, 24.0f, 0.0f, 16.0f));
                c5Tl.Eno(930135422);
                int i6 = i2 & 57344;
                int i7 = i2 & 458752;
                int i8 = i2 & 3670016;
                boolean A1X = AbstractC25233BEq.A1X(c5Tl, A0u, interfaceC11380iw, AbstractC25232BEp.A1R(i6) | AbstractC25233BEq.A1H(i2) | AbstractC25233BEq.A1I(i2) | AbstractC167007dF.A1P(i7, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP), AbstractC167007dF.A1P(i8, 1048576));
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = new C29723D8t(interfaceC11380iw, A0u, c69, str, interfaceC16820sZ, interfaceC16820sZ2, 0);
                    c5Tl.FBy(EEc);
                }
                C6GE.A03(c5Tl, AB62, A0c, A002, AbstractC25225BEi.A1A(c117505Tk, EEc, false));
                String A003 = AbstractC136736Hc.A00(c5Tl, 2131969007);
                C6GB A012 = C6GA.A01(c5Tl);
                Modifier AB63 = c6gm.AB6(interfaceC118245Wl, AbstractC118175Wb.A0C(A0T, 16.0f, 16.0f, 16.0f));
                c5Tl.Eno(930181292);
                boolean A1X2 = AbstractC25233BEq.A1X(c5Tl, A0u, interfaceC11380iw, AbstractC25233BEq.A1J(i2) | AbstractC25232BEp.A1R(i6) | AbstractC25233BEq.A1K(i2) | AbstractC167007dF.A1P(i7, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP), AbstractC167007dF.A1P(i8, 1048576));
                Object EEc2 = c5Tl.EEc();
                if (A1X2 || EEc2 == C5UI.A00) {
                    EEc2 = new C29723D8t(interfaceC11380iw, A0u, c69, str, interfaceC16820sZ3, interfaceC16820sZ4, 1);
                    c5Tl.FBy(EEc2);
                }
                C6GE.A03(c5Tl, AB63, A012, A003, AbstractC25225BEi.A1A(c117505Tk, EEc2, false));
            } else {
                c5Tl.Eno(-1227995183);
                int i9 = 2131969049;
                if (ordinal != 0) {
                    i9 = 2131969048;
                }
                C5WR.A0Z(c5Tl, c6gm.AB6(interfaceC118245Wl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 16.0f, 0.0f, 0.0f)), AbstractC25225BEi.A0X(c5Tl), AbstractC136736Hc.A00(c5Tl, i9), AbstractC25226BEj.A0G(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            C0eB c0eB = C0eB.A00;
            c5Tl.Eno(-1400493064);
            boolean A1R = AbstractC25232BEp.A1R(i2 & 57344) | AbstractC167007dF.A1P(i2 & 458752, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            if ((i2 & 3670016) == 1048576) {
                z2 = true;
            }
            boolean A1X3 = AbstractC25233BEq.A1X(c5Tl, A0u, interfaceC11380iw, A1R, z2);
            Object EEc3 = c5Tl.EEc();
            if (A1X3 || EEc3 == C5UI.A00) {
                EEc3 = new OpalTabContentKt$OpalTabEmptyContent$2$1(interfaceC11380iw, A0u, c69, str, null, z);
                c5Tl.FBy(EEc3);
            }
            if (AbstractC25232BEp.A1V(c5Tl, c117505Tk, EEc3, c0eB, false)) {
                C0fH.A00(1365672999);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30322DWx(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, c69, interfaceC11380iw, modifier, str, i, 1, z);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x01f9. Please report as an issue. */
    public static final void A00(C5Tl c5Tl, Modifier modifier, C51751Mta c51751Mta, InterfaceC11380iw interfaceC11380iw, C69 c69, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, int i, int i2, boolean z) {
        int i3;
        c5Tl.Enr(-696412087);
        int A0H = (i & 6) == 0 ? AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i : i;
        if ((i & 48) == 0) {
            A0H |= AbstractC25232BEp.A0I(c5Tl, interfaceC16610sE);
        }
        if ((i & 384) == 0) {
            A0H |= AbstractC25232BEp.A0J(c5Tl, interfaceC16610sE2);
        }
        if ((i & 3072) == 0) {
            A0H |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0H |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((i & 196608) == 0) {
            A0H |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 1572864) == 0) {
            A0H |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 12582912) == 0) {
            A0H |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ4);
        }
        if ((i & 100663296) == 0) {
            A0H |= AbstractC25232BEp.A0P(c5Tl, c51751Mta);
        }
        if ((i & 805306368) == 0) {
            A0H |= AbstractC25232BEp.A0a(c5Tl, c69);
        }
        if ((i2 & 6) == 0) {
            i3 = (c5Tl.AH5(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c5Tl.AH4(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c5Tl.AH6(interfaceC11380iw) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier);
        }
        if ((306783379 & A0H) == 306783378 && (i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-365617124, "com.instagram.opal.impl.ui.OpalTabContentGrid (OpalTabContent.kt:139)");
            }
            boolean A1X = AbstractC25228BEl.A1X(c51751Mta.A00);
            c5Tl.AJX(AbstractC117935Vd.A00);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 622178796);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC166997dE.A0b();
                c5Tl.FBy(A0q);
            }
            boolean A1a = AbstractC166987dD.A1a(A0q);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            Object AJX = c5Tl.AJX(C5V2.A05);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 622181632);
            if (A0q2 == obj) {
                A0q2 = AbstractC25236BEt.A0L(AbstractC25232BEp.A1G(AbstractC25225BEi.A0S(C1132359l.A07), AbstractC121605fB.A02));
                c5Tl.FBy(A0q2);
            }
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            InterfaceC16820sZ interfaceC16820sZ5 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q3 = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            AbstractC28495Cho.A07(AbstractC28503Chw.A01(C25245BFe.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0), 0.0f), CWT.A00, c5Tl, null, "opal_grid_visibility", C5UA.A01(c5Tl, new C30581Dd2(c51751Mta, c69, AJX, interfaceC16610sE2, interfaceC16610sE, interfaceC16660sJ2, interfaceC16660sJ, A0q2, 1, A1a), -1972412245), 221568, 2, A1X);
            c5Tl.Eno(-2049507934);
            if (!A1X) {
                switch (((C74) c51751Mta.A01).ordinal()) {
                    case 0:
                    case 3:
                        C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, 890934203);
                        Modifier A02 = AbstractC118175Wb.A02(AbstractC25226BEj.A0U(A0N));
                        Alignment alignment = C118195Wf.A09;
                        InterfaceC1127857k A002 = C5XX.A00(alignment, false);
                        int A003 = C5X2.A00(c5Tl);
                        C59P A042 = C117505Tk.A04(c117505Tk);
                        Modifier A012 = C5X3.A01(c5Tl, A02);
                        AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
                        C5XJ.A00(c5Tl, A002, interfaceC16620sF);
                        if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q3) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
                        }
                        C5XJ.A00(c5Tl, A012, A1K);
                        BIR.A00(c5Tl, C119645bN.A00.AB5(alignment, A0N));
                        c5Tl.ASW();
                        C117505Tk.A0L(c117505Tk, false);
                        break;
                    case 1:
                        C1130158n A0N2 = AbstractC25225BEi.A0N(c5Tl, 889818420);
                        Modifier A022 = AbstractC118175Wb.A02(AbstractC25226BEj.A0U(A0N2));
                        Alignment alignment2 = C118195Wf.A09;
                        InterfaceC1127857k A004 = C5XX.A00(alignment2, false);
                        int A005 = C5X2.A00(c5Tl);
                        C59P A043 = C117505Tk.A04(c117505Tk);
                        Modifier A013 = C5X3.A01(c5Tl, A022);
                        AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
                        C5XJ.A00(c5Tl, A004, interfaceC16620sF);
                        if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q3) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
                        }
                        C5XJ.A00(c5Tl, A013, A1K);
                        C5WR.A0Z(c5Tl, C119645bN.A00.AB5(alignment2, AbstractC118175Wb.A07(A0N2)), AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131974293), AbstractC25226BEj.A0G(c5Tl));
                        c5Tl.ASW();
                        C117505Tk.A0L(c117505Tk, false);
                        break;
                    case 2:
                        c5Tl.Eno(890347931);
                        int i4 = A0H >> 12;
                        int i5 = i3 << 15;
                        A02(c5Tl, AbstractC25228BEl.A0V(), interfaceC11380iw, c69, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, AbstractC25233BEq.A02(AbstractC25229BEm.A05(i4, 100663296 | (i4 & 14) | (i4 & 112)) | (57344 & (A0H >> 15)), 458752 & i5, i5), z);
                        C117505Tk.A0L(c117505Tk, false);
                        break;
                    case 4:
                    case 5:
                        c5Tl.Eno(891231462);
                        C117505Tk.A0L(c117505Tk, false);
                        break;
                    default:
                        throw AbstractC25231BEo.A0v(c5Tl, c117505Tk, -2049507258, false);
                }
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(330044141);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DYJ(interfaceC16660sJ, interfaceC16610sE, interfaceC16610sE2, interfaceC16660sJ2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, c51751Mta, c69, interfaceC11380iw, modifier, str, i, i2, 1, z);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC11380iw interfaceC11380iw, C27872CQj c27872CQj, C26073Bg2 c26073Bg2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, int i, int i2, boolean z) {
        int i3;
        AbstractC167007dF.A1K(interfaceC16660sJ, interfaceC16610sE);
        AbstractC25234BEr.A1R(interfaceC16610sE2, interfaceC16660sJ2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3);
        AbstractC25233BEq.A0y(7, interfaceC16820sZ4, c27872CQj, c26073Bg2);
        C14360o3.A0B(str, 11);
        AbstractC25229BEm.A1M(interfaceC11380iw, 12, modifier);
        c5Tl.Enr(-2012034089);
        int A0H = (i & 6) == 0 ? AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i : i;
        if ((i & 48) == 0) {
            A0H |= AbstractC25232BEp.A0I(c5Tl, interfaceC16610sE);
        }
        if ((i & 384) == 0) {
            A0H |= AbstractC25232BEp.A0J(c5Tl, interfaceC16610sE2);
        }
        if ((i & 3072) == 0) {
            A0H |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0H |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((196608 & i) == 0) {
            A0H |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ2);
        }
        if ((1572864 & i) == 0) {
            A0H |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ3);
        }
        if ((12582912 & i) == 0) {
            A0H |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ4);
        }
        if ((100663296 & i) == 0) {
            A0H |= AbstractC25232BEp.A0Z(c5Tl, c27872CQj);
        }
        if ((805306368 & i) == 0) {
            A0H |= AbstractC25232BEp.A0Q(c5Tl, c26073Bg2);
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (c5Tl.AH5(z) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c5Tl.AH4(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c5Tl.AH6(interfaceC11380iw) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25230BEn.A09(c5Tl, modifier);
        }
        if ((A0H & 306783379) == 306783378 && (i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1529772567, "com.instagram.opal.impl.ui.OpalTabContent (OpalTabContent.kt:97)");
            }
            AbstractC27686CJf.A00(c5Tl, modifier, c27872CQj, C5UA.A01(c5Tl, new C30742Dfe(interfaceC11380iw, c26073Bg2, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16610sE, interfaceC16610sE2, z), 1821913988), ((A0H >> 24) & 14) | 384 | ((i3 >> 6) & 112), 0);
            if (C0fH.A02()) {
                C0fH.A00(229081247);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DYJ(interfaceC16660sJ, interfaceC16610sE, interfaceC16610sE2, interfaceC16660sJ2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, c26073Bg2, c27872CQj, interfaceC11380iw, modifier, str, i, i2, 0, z);
        }
    }
}
