package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public abstract class BG8 {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r2 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if ((r18 & 8) != 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C5Tl r12, androidx.compose.ui.Modifier r13, X.C5AH r14, com.instagram.common.typedurl.ImageUrl r15, X.InterfaceC16660sJ r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BG8.A03(X.5Tl, androidx.compose.ui.Modifier, X.5AH, com.instagram.common.typedurl.ImageUrl, X.0sJ, int, int):void");
    }

    public static final void A07(C5Tl c5Tl, Modifier modifier, AbstractC27441C9j abstractC27441C9j, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        ImageUrl imageUrl;
        InterfaceC16660sJ interfaceC16660sJ2;
        int i3;
        Modifier A0A;
        int i4;
        c5Tl.Enr(219334592);
        if ((i & 6) == 0) {
            int i5 = 2;
            if (c5Tl.AH4(abstractC27441C9j)) {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if (c5Tl.AH6(interfaceC16660sJ)) {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            int i7 = 128;
            if (c5Tl.AH4(modifier)) {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1705962122, "com.instagram.newsfeed.compose.ui.EndAddOn (NewsfeedStoryRow.kt:402)");
            }
            if (abstractC27441C9j instanceof BJE) {
                c5Tl.Eno(553250637);
                A00(c5Tl, modifier, (i2 >> 6) & 14);
            } else if (abstractC27441C9j instanceof C0G) {
                c5Tl.Eno(553252616);
                A01(c5Tl, modifier, (i2 >> 6) & 14);
            } else {
                boolean z = true;
                boolean z2 = false;
                if (abstractC27441C9j instanceof C25266BGe) {
                    c5Tl.Eno(553255059);
                    BJ3 bj3 = ((C25266BGe) abstractC27441C9j).A00;
                    if (bj3 != null) {
                        c5Tl.Eno(553258838);
                        if ((i2 & 112) != 32) {
                            z = false;
                        }
                        Object EEc = c5Tl.EEc();
                        if (z || EEc == C5UI.A00) {
                            EEc = new C57752Pjf(interfaceC16660sJ, 4);
                            c5Tl.FBy(EEc);
                        }
                        C117505Tk.A0L((C117505Tk) c5Tl, false);
                        A06(c5Tl, AbstractC118175Wb.A0E(modifier, 0.0f, 14.0f, 0.0f, 0.0f), bj3, (InterfaceC16660sJ) EEc, 0);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    C28805Cnb c28805Cnb = null;
                    if (abstractC27441C9j instanceof BGZ) {
                        c5Tl.Eno(553263523);
                        imageUrl = ((BGZ) abstractC27441C9j).A00;
                        c5Tl.Eno(553266038);
                        if ((i2 & 112) == 32) {
                            z2 = true;
                        }
                        Object EEc2 = c5Tl.EEc();
                        if (z2 || EEc2 == C5UI.A00) {
                            EEc2 = new C57752Pjf(interfaceC16660sJ, 5);
                            c5Tl.FBy(EEc2);
                        }
                        interfaceC16660sJ2 = (InterfaceC16660sJ) EEc2;
                        i3 = 0;
                        C117505Tk.A0L((C117505Tk) c5Tl, false);
                        A0A = AbstractC118175Wb.A0A(modifier, 0.0f, 8.0f);
                        i4 = 8;
                    } else if (abstractC27441C9j instanceof C0E) {
                        c5Tl.Eno(553270762);
                        imageUrl = ((C0E) abstractC27441C9j).A00;
                        c5Tl.Eno(553273238);
                        if ((i2 & 112) == 32) {
                            z2 = true;
                        }
                        Object EEc3 = c5Tl.EEc();
                        if (z2 || EEc3 == C5UI.A00) {
                            EEc3 = new C57752Pjf(interfaceC16660sJ, 6);
                            c5Tl.FBy(EEc3);
                        }
                        interfaceC16660sJ2 = (InterfaceC16660sJ) EEc3;
                        i3 = 0;
                        C117505Tk.A0L((C117505Tk) c5Tl, false);
                        A0A = AbstractC118175Wb.A0A(modifier, 0.0f, 8.0f);
                        c28805Cnb = new C28805Cnb();
                        i4 = 0;
                    } else if (abstractC27441C9j instanceof C0F) {
                        c5Tl.Eno(553279243);
                        C0F c0f = (C0F) abstractC27441C9j;
                        String str = c0f.A01;
                        c5Tl.Eno(553282102);
                        if ((i2 & 112) != 32) {
                            z = false;
                        }
                        Object EEc4 = c5Tl.EEc();
                        if (z || EEc4 == C5UI.A00) {
                            EEc4 = new C57752Pjf(interfaceC16660sJ, 7);
                            c5Tl.FBy(EEc4);
                        }
                        C117505Tk.A0L((C117505Tk) c5Tl, false);
                        A08(c5Tl, AbstractC118175Wb.A0E(modifier, 0.0f, 14.0f, 0.0f, 0.0f), str, (InterfaceC16660sJ) EEc4, c0f.A00, 0);
                    } else if (abstractC27441C9j instanceof C25286BHd) {
                        c5Tl.Eno(553290213);
                        int i8 = ((C25286BHd) abstractC27441C9j).A00;
                        c5Tl.Eno(553293558);
                        if ((i2 & 112) != 32) {
                            z = false;
                        }
                        Object EEc5 = c5Tl.EEc();
                        if (z || EEc5 == C5UI.A00) {
                            EEc5 = new C57752Pjf(interfaceC16660sJ, 8);
                            c5Tl.FBy(EEc5);
                        }
                        C117505Tk.A0L((C117505Tk) c5Tl, false);
                        A0A(c5Tl, AbstractC118175Wb.A0E(modifier, 0.0f, 14.0f, 0.0f, 0.0f), (InterfaceC16660sJ) EEc5, i8, 0);
                    } else if (abstractC27441C9j instanceof C0H) {
                        c5Tl.Eno(553298115);
                        c5Tl.Eno(553298806);
                        if ((i2 & 112) != 32) {
                            z = false;
                        }
                        Object EEc6 = c5Tl.EEc();
                        if (z || EEc6 == C5UI.A00) {
                            EEc6 = new C57752Pjf(interfaceC16660sJ, 9);
                            c5Tl.FBy(EEc6);
                        }
                        C117505Tk.A0L((C117505Tk) c5Tl, false);
                        A09(c5Tl, modifier, (InterfaceC16660sJ) EEc6, (i2 >> 3) & 112);
                    } else if (abstractC27441C9j instanceof BJ2) {
                        c5Tl.Eno(553301651);
                    } else {
                        c5Tl.Eno(553250412);
                        C117505Tk.A0L((C117505Tk) c5Tl, false);
                        throw new RuntimeException();
                    }
                    A03(c5Tl, A0A, c28805Cnb, imageUrl, interfaceC16660sJ2, i3, i4);
                }
            }
            C117505Tk.A0L((C117505Tk) c5Tl, false);
            if (C0fH.A02()) {
                C0fH.A00(629504133);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 3, modifier, interfaceC16660sJ, abstractC27441C9j);
        }
    }

    public static final void A0C(C5Tl c5Tl, MUG mug, AbstractC27441C9j abstractC27441C9j, InterfaceC31097Dlf interfaceC31097Dlf, String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        A04(c5Tl, null, mug, abstractC27441C9j, null, interfaceC31097Dlf, str, null, null, null, interfaceC16660sJ, null, 0.0d, i, 0, 7656, false);
    }

    public static final void A0E(C5Tl c5Tl, MUG mug, AbstractC27441C9j abstractC27441C9j, InterfaceC31097Dlf interfaceC31097Dlf, InterfaceC16660sJ interfaceC16660sJ, int i) {
        A04(c5Tl, null, mug, abstractC27441C9j, null, interfaceC31097Dlf, null, null, null, null, interfaceC16660sJ, null, 0.0d, i, 0, 7672, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r20, androidx.compose.ui.Modifier r21, int r22, int r23, int r24, long r25, long r27, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BG8.A02(X.5Tl, androidx.compose.ui.Modifier, int, int, int, long, long, boolean, boolean):void");
    }

    public static final void A05(C5Tl c5Tl, Modifier modifier, C31200Dnj c31200Dnj, int i, int i2, boolean z) {
        int i3;
        int i4;
        C117505Tk A0T;
        long j;
        long j2;
        long j3;
        int i5;
        boolean z2 = z;
        c5Tl.Enr(-1526465094);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c31200Dnj, i) ? 1 : 0) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z2 = AbstractC25226BEj.A1U(i6, z2);
            if (C0fH.A02()) {
                C0fH.A01(1676659096, "com.instagram.newsfeed.compose.ui.IndicatorFromConfig (NewsfeedStoryRow.kt:348)");
            }
            EnumC27397C7a enumC27397C7a = (EnumC27397C7a) EnumC27397C7a.A01.get(c31200Dnj.A00);
            if (enumC27397C7a != null) {
                CJS cjs = CJS.$redex_init_class;
                int ordinal = enumC27397C7a.ordinal();
                switch (ordinal) {
                    case 0:
                        i4 = R.drawable.instagram_facebook_circle_pano_filled_24;
                        break;
                    case 1:
                        i4 = R.drawable.instagram_app_horizon_pano_filled_24;
                        break;
                    case 2:
                        i4 = R.drawable.instagram_heart_pano_filled_24;
                        break;
                    case 3:
                        i4 = R.drawable.instagram_meta_logo_pano_outline_24;
                        break;
                    case 4:
                        i4 = R.drawable.instagram_app_threads_pano_outline_24;
                        break;
                    case 5:
                        i4 = R.drawable.instagram_verified_pano_filled_24;
                        break;
                    default:
                        throw B4Z.A00();
                }
                if (AbstractC25227BEk.A1U(c5Tl, -1537755124)) {
                    C0fH.A01(-1749323660, "com.instagram.newsfeed.model.NewsfeedStoryCellIndicator.tintColor (NewsfeedStoryCellIndicator.kt:32)");
                }
                switch (ordinal) {
                    case 0:
                        A0T = AbstractC25230BEn.A0T(c5Tl, 1785411917);
                        j2 = 4278740735L;
                        j = j2 << 32;
                        long j4 = C1132359l.A01;
                        break;
                    case 1:
                        j = AbstractC25227BEk.A0g(c5Tl, 1785413575).A0n;
                        A0T = AbstractC25225BEi.A0K(c5Tl, false);
                        break;
                    case 2:
                        j = AbstractC25227BEk.A0g(c5Tl, 1785414951).A0U;
                        A0T = AbstractC25225BEi.A0K(c5Tl, false);
                        break;
                    case 3:
                        A0T = AbstractC25230BEn.A0T(c5Tl, 1785415851);
                        j2 = 25824;
                        j = j2 << 32;
                        long j42 = C1132359l.A01;
                        break;
                    case 4:
                        A0T = AbstractC25230BEn.A0T(c5Tl, 1785417153);
                        j = C1132359l.A09;
                        break;
                    default:
                        j = AbstractC25227BEk.A0g(c5Tl, 1785418728).A0J;
                        A0T = AbstractC25225BEi.A0K(c5Tl, false);
                        break;
                }
                if (C0fH.A02()) {
                    C0fH.A00(-389363745);
                }
                C117505Tk.A0L(A0T, false);
                if (AbstractC25227BEk.A1U(c5Tl, 1618884793)) {
                    C0fH.A01(2099029226, "com.instagram.newsfeed.model.NewsfeedStoryCellIndicator.backgroundColor (NewsfeedStoryCellIndicator.kt:43)");
                }
                switch (ordinal) {
                    case 0:
                        c5Tl.Eno(725813678);
                        C117505Tk.A0L(A0T, false);
                        j3 = C1132359l.A09;
                        break;
                    case 1:
                        i5 = 725814972;
                        j3 = AbstractC25227BEk.A0g(c5Tl, i5).A0S;
                        C117505Tk.A0L(A0T, false);
                        break;
                    case 2:
                        j3 = AbstractC25227BEk.A0g(c5Tl, 725816596).A0Q;
                        C117505Tk.A0L(A0T, false);
                        break;
                    case 3:
                        i5 = 725817980;
                        j3 = AbstractC25227BEk.A0g(c5Tl, i5).A0S;
                        C117505Tk.A0L(A0T, false);
                        break;
                    case 4:
                        c5Tl.Eno(725819406);
                        C117505Tk.A0L(A0T, false);
                        j3 = C1132359l.A01;
                        break;
                    default:
                        i5 = 725820988;
                        j3 = AbstractC25227BEk.A0g(c5Tl, i5).A0S;
                        C117505Tk.A0L(A0T, false);
                        break;
                }
                if (C0fH.A02()) {
                    C0fH.A00(-2044739195);
                }
                C117505Tk.A0L(A0T, false);
                A02(c5Tl, modifier, i4, (i3 & 112) | ((i3 << 9) & 458752), 0, j, j3, AbstractC25229BEm.A1a(enumC27397C7a, EnumC27397C7a.A04), z2);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1349187050);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 8, c31200Dnj, modifier, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0B(X.C5Tl r32, X.C5YV r33, X.C9C9 r34, com.instagram.common.typedurl.ImageUrl r35, com.instagram.common.typedurl.ImageUrl r36, X.InterfaceC16660sJ r37, int r38, int r39, boolean r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BG8.A0B(X.5Tl, X.5YV, X.9C9, com.instagram.common.typedurl.ImageUrl, com.instagram.common.typedurl.ImageUrl, X.0sJ, int, int, boolean, boolean, boolean):void");
    }

    public static final void A0D(C5Tl c5Tl, MUG mug, AbstractC27441C9j abstractC27441C9j, InterfaceC31097Dlf interfaceC31097Dlf, InterfaceC16660sJ interfaceC16660sJ) {
        A04(c5Tl, null, mug, abstractC27441C9j, null, interfaceC31097Dlf, "Title text", null, null, null, interfaceC16660sJ, null, 0.0d, 25008, 0, 7656, false);
    }

    public static final void A0G(C5Tl c5Tl, InterfaceC31097Dlf interfaceC31097Dlf, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        C5YU c5yu;
        boolean z2 = z;
        c5Tl.Enr(-1813094073);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH4(interfaceC31097Dlf)) {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i5 = 16;
            if (c5Tl.AH6(interfaceC16660sJ)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i7 = 128;
            if (c5Tl.AH5(z2)) {
                i7 = 256;
            }
            i3 |= i7;
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                z2 = false;
            }
            if (C0fH.A02()) {
                C0fH.A01(-704663622, "com.instagram.newsfeed.compose.ui.StartAvatar (NewsfeedStoryRow.kt:173)");
            }
            Modifier A0G = AbstractC118185Wd.A0G(Modifier.A00, 52.0f, 60.0f);
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A09, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0G);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            c5Tl.Ent();
            if (c117505Tk.A0K) {
                c5Tl.AMd(interfaceC16820sZ);
            } else {
                c5Tl.FDO();
            }
            C5XJ.A00(c5Tl, A00, C5X8.A03);
            C5XJ.A00(c5Tl, A04, C5X8.A05);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                Integer valueOf = Integer.valueOf(A002);
                c5Tl.FBy(valueOf);
                c5Tl.ABx(valueOf, interfaceC16620sF);
            }
            C5XJ.A00(c5Tl, A01, C5X8.A04);
            C119645bN c119645bN = C119645bN.A00;
            if (interfaceC31097Dlf instanceof BGC) {
                c5Tl.Eno(35295705);
                BGC bgc = (BGC) interfaceC31097Dlf;
                if (bgc.A01 != null) {
                    c5Tl.Eno(35334889);
                    C5TR A012 = C5UA.A01(c5Tl, new BQ5(5, c119645bN, interfaceC31097Dlf, z2), 1634723159);
                    C5TR A013 = C5UA.A01(c5Tl, new DSA(39, interfaceC16660sJ, interfaceC31097Dlf), 1200759478);
                    C28118CaR c28118CaR = C28118CaR.A00;
                    c5Tl.Eno(2079376493);
                    boolean AH6 = c5Tl.AH6(c28118CaR);
                    Object EEc = c5Tl.EEc();
                    if (AH6 || EEc == C5UI.A00) {
                        EEc = new BV8(c28118CaR, 8);
                        c5Tl.FBy(EEc);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    CGO.A00(c5Tl, null, A012, A013, (InterfaceC16600sD) ((C0YS) EEc), 54, 4);
                } else {
                    c5Tl.Eno(36223659);
                    ImageUrl imageUrl = bgc.A03;
                    ImageUrl imageUrl2 = bgc.A02;
                    Integer num = bgc.A04;
                    c5Tl.Eno(2079383035);
                    if (num == null) {
                        c5yu = null;
                    } else {
                        c5yu = new C5YU(AbstractC119585bG.A00(c5Tl, num.intValue()), 5);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    A0B(c5Tl, c5yu, bgc.A00, imageUrl, imageUrl2, interfaceC16660sJ, (i3 << 15) & 3670016, 0, bgc.A05, bgc.A07, bgc.A06);
                }
                C117505Tk.A0L(c117505Tk, false);
            } else if (interfaceC31097Dlf instanceof BHR) {
                c5Tl.Eno(36686551);
                BHR bhr = (BHR) interfaceC31097Dlf;
                A0H(c5Tl, bhr.A01, interfaceC16660sJ, bhr.A00, (i3 << 3) & 896);
            } else {
                c5Tl.Eno(2079313077);
                C117505Tk.A0L(c117505Tk, false);
                throw new RuntimeException();
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            if (C0fH.A02()) {
                C0fH.A00(-1962660244);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 9, interfaceC16660sJ, interfaceC31097Dlf, z2);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        c5Tl.Enr(-1934662350);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1722792205, "com.instagram.newsfeed.compose.ui.EndAddOnBadgeChevron (NewsfeedStoryRow.kt:446)");
            }
            Modifier Eq3 = modifier.Eq3(AbstractC118185Wd.A00);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.blue_dot_medium, 0);
            C1130158n c1130158n = Modifier.A00;
            C5YS.A04(c5Tl, AbstractC118185Wd.A0C(AbstractC118175Wb.A0B(c1130158n, 0.0f, 0.0f, 0.0f), 8.0f), A002, C5XL.A00(c5Tl).A0b);
            AbstractC25230BEn.A18(c5Tl, AbstractC118185Wd.A03(AbstractC118175Wb.A0E(c1130158n, 8.0f, 0.0f, 0.0f, 0.0f)), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_outline_16, 0));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1901487064);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, modifier, i, 23);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        c5Tl.Enr(-1811414987);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(893925104, "com.instagram.newsfeed.compose.ui.EndAddOnChevron (NewsfeedStoryRow.kt:464)");
            }
            Modifier Eq3 = modifier.Eq3(AbstractC118185Wd.A00);
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0B, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25230BEn.A18(c5Tl, AbstractC118185Wd.A03(AbstractC25227BEk.A0K(Modifier.A00, 8.0f)), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_outline_16, 0));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1112442800);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, modifier, i, 24);
        }
    }

    public static final void A06(C5Tl c5Tl, Modifier modifier, BJ3 bj3, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(-1725996051);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, bj3) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-408744516, "com.instagram.newsfeed.compose.ui.EndAddOnFollowButton (NewsfeedStoryRow.kt:480)");
            }
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 1618126137, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0z(c5Tl, interfaceC16660sJ, 19);
            }
            AbstractC25225BEi.A1T(c5Tl);
            AbstractC25276BGq.A00(c5Tl, modifier, bj3, null, (InterfaceC16820sZ) EEc, (i2 & 14) | ((i2 >> 3) & 112), 4);
            if (C0fH.A02()) {
                C0fH.A00(-1950502378);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 4, modifier, interfaceC16660sJ, bj3);
        }
    }

    public static final void A08(C5Tl c5Tl, Modifier modifier, String str, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        C25267BGf A03;
        c5Tl.Enr(-475570631);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25236BEt.A03(c5Tl, i);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2068874689, "com.instagram.newsfeed.compose.ui.EndAddOnPrimaryButton (NewsfeedStoryRow.kt:527)");
            }
            if (i == R.attr.igds_color_primary_button) {
                c5Tl.Eno(-2059817773);
                A03 = AbstractC25225BEi.A0u(c5Tl);
            } else {
                c5Tl.Eno(-2059816267);
                A03 = C6GA.A00.A03(c5Tl, 3, false, false);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -2059822676, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0z(c5Tl, interfaceC16660sJ, 21);
            }
            C6GE.A06(c5Tl, modifier, A03, str, AbstractC25225BEi.A1A(c117505Tk, EEc, false), ((i3 << 3) & 112) | ((i3 >> 3) & 896));
            if (C0fH.A02()) {
                C0fH.A00(2077262976);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30222DTb(modifier, interfaceC16660sJ, str, i, i2, 4);
        }
    }

    public static final void A09(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(2015866151);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(573300734, "com.instagram.newsfeed.compose.ui.EndAddOnXOut (NewsfeedStoryRow.kt:569)");
            }
            Modifier Eq3 = modifier.Eq3(AbstractC118185Wd.A00);
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0A, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_outline_12, 0);
            String A004 = C5YD.A00(c5Tl, 2131960994);
            C1130158n c1130158n = Modifier.A00;
            c5Tl.Eno(1184016677);
            boolean A1R = AbstractC25228BEl.A1R(i2);
            Object EEc = c5Tl.EEc();
            if (A1R || EEc == C5UI.A00) {
                EEc = new C57245PbT(interfaceC16660sJ, 25);
                c5Tl.FBy(EEc);
            }
            AbstractC25229BEm.A17(c5Tl, AbstractC25229BEm.A0T(c117505Tk, c1130158n, EEc), A003, A004);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1536804378);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, interfaceC16660sJ, modifier, i, 30);
        }
    }

    public static final void A0A(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        c5Tl.Enr(2082662175);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-338497960, "com.instagram.newsfeed.compose.ui.EndAddOnUserActionsButtonGroup (NewsfeedStoryRow.kt:542)");
            }
            boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25229BEm.A0d(c5Tl), 36331334515311866L);
            InterfaceC1127857k A0z = AbstractC25232BEp.A0z(AbstractC118255Wn.A01, c5Tl, C118195Wf.A04, ((i3 >> 6) & 14) | 384);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(1127734800);
            int i4 = i3 & 112;
            boolean A1P = AbstractC167007dF.A1P(i4, 32);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0z(c5Tl, interfaceC16660sJ, 22);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc, false);
            String A002 = C5YD.A00(c5Tl, i);
            C6GA c6ga = C6GA.A00;
            C6GE.A09(c5Tl, c6ga.A02(c5Tl), A002, A1A, 0);
            if (A06) {
                c5Tl.Eno(600225163);
                String A003 = C5YD.A00(c5Tl, 2131957640);
                C25267BGf A03 = c6ga.A03(c5Tl, 3, false, false);
                Modifier A0K = AbstractC25227BEk.A0K(Modifier.A00, 8.0f);
                boolean A1U = AbstractC25232BEp.A1U(c5Tl, 1127741834, i4, 32);
                Object EEc2 = c5Tl.EEc();
                if (A1U || EEc2 == C5UI.A00) {
                    EEc2 = new C57245PbT(interfaceC16660sJ, 23);
                    c5Tl.FBy(EEc2);
                }
                C6GE.A06(c5Tl, A0K, A03, A003, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 384);
            } else {
                c5Tl.Eno(600470807);
                C2DC A004 = C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_outline_12, 0);
                String A005 = C5YD.A00(c5Tl, 2131960994);
                Modifier A0B = AbstractC118175Wb.A0B(Modifier.A00, 0.0f, 0.0f, 0.0f);
                boolean A1U2 = AbstractC25232BEp.A1U(c5Tl, 1127756906, i4, 32);
                Object EEc3 = c5Tl.EEc();
                if (A1U2 || EEc3 == C5UI.A00) {
                    EEc3 = new C57245PbT(interfaceC16660sJ, 24);
                    c5Tl.FBy(EEc3);
                }
                AbstractC25229BEm.A17(c5Tl, AbstractC25229BEm.A0T(c117505Tk, A0B, EEc3), A004, A005);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1353596805);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier, interfaceC16660sJ, i, i2, 38);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
    
        if (r6 != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0F(X.C5Tl r14, X.BHZ r15, X.InterfaceC16660sJ r16, int r17) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BG8.A0F(X.5Tl, X.BHZ, X.0sJ, int):void");
    }

    public static final void A0H(C5Tl c5Tl, Integer num, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        C5YU A0a;
        c5Tl.Enr(-790594180);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, num);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-584795696, "com.instagram.newsfeed.compose.ui.Avatar (NewsfeedStoryRow.kt:250)");
            }
            C2DC A0Y = AbstractC25226BEj.A0Y(c5Tl, i3, i);
            BGE bge = BGE.A00;
            c5Tl.Eno(-204130162);
            if (num == null) {
                A0a = null;
            } else {
                A0a = AbstractC25228BEl.A0a(AbstractC119585bG.A00(c5Tl, num.intValue()));
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-204130596);
            if (A0a == null) {
                A0a = AbstractC25228BEl.A0a(AbstractC25226BEj.A0F(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            BGD.A00(c5Tl, null, A0a, A0Y, C5YJ.A05, bge, interfaceC16660sJ, 805306416, (i3 >> 6) & 14, 484, AbstractC25226BEj.A0K(c5Tl), 0L, false, false, false);
            if (C0fH.A02()) {
                C0fH.A00(332955324);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(num, interfaceC16660sJ, i, i2, 37);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C5Tl r45, androidx.compose.ui.Modifier r46, X.MUG r47, X.AbstractC27441C9j r48, X.BHZ r49, X.InterfaceC31097Dlf r50, java.lang.String r51, java.lang.String r52, X.InterfaceC16660sJ r53, X.InterfaceC16660sJ r54, X.InterfaceC16660sJ r55, X.InterfaceC16660sJ r56, double r57, int r59, int r60, int r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 1185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BG8.A04(X.5Tl, androidx.compose.ui.Modifier, X.MUG, X.C9j, X.BHZ, X.Dlf, java.lang.String, java.lang.String, X.0sJ, X.0sJ, X.0sJ, X.0sJ, double, int, int, int, boolean):void");
    }
}
