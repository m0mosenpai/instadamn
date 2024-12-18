package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Che, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28486Che {
    public static final void A02(C5Tl c5Tl, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        float f;
        Modifier A0E;
        Object obj;
        c5Tl.Enr(571240490);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, str2);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0h(c5Tl, z3);
        }
        if ((599187 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1744791551, "com.instagram.aistudio.editor.WelcomeMessageSection (AiAdvancedSettingsScreen.kt:143)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -675087347);
            Object obj2 = C5UI.A00;
            if (A0q == obj2) {
                if (AbstractC25225BEi.A1Y(str) && z) {
                    obj = C29181Ctm.A00;
                } else {
                    obj = C29183Cto.A00;
                }
                A0q = AbstractC25232BEp.A0w(c5Tl, obj);
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5UP c5up = AbstractC117935Vd.A00;
            UserSession userSession = (UserSession) c5Tl.AJX(c5up);
            int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573360398L);
            String A00 = C5YD.A00(c5Tl, 2131961928);
            boolean z4 = interfaceC74953Yl.getValue() instanceof C26179Bi4;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            if (z4) {
                f = 0.0f;
                A0E = AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                f = 0.0f;
                A0E = AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 16.0f);
            }
            Object AJX = c5Tl.AJX(c5up);
            int i3 = 2131952681;
            if (z3) {
                i3 = 2131952809;
            }
            A04(c5Tl, null, i3, 2131952680, 0, 28, false, false);
            if (z2) {
                c5Tl.Eno(548116540);
                AbstractC27525CCv.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, f, f, f, 16.0f), C5YD.A00(c5Tl, 2131952859), 6, 0);
            } else {
                c5Tl.Eno(548314661);
                String A002 = C5YD.A00(c5Tl, 2131952859);
                InterfaceC30801Dgc interfaceC30801Dgc = (InterfaceC30801Dgc) interfaceC74953Yl.getValue();
                boolean A1J = AbstractC25233BEq.A1J(i2) | AbstractC25225BEi.A1X(c5Tl, A00, AbstractC25227BEk.A1V(c5Tl, -675042168, A07)) | AbstractC25233BEq.A1I(i2);
                Object EEc = c5Tl.EEc();
                if (A1J || EEc == obj2) {
                    EEc = new DI2(interfaceC74953Yl, A00, interfaceC16660sJ, A07, 0, z);
                    c5Tl.FBy(EEc);
                }
                InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc, false);
                Integer valueOf = Integer.valueOf(A07);
                Integer valueOf2 = Integer.valueOf(R.drawable.instagram_arrow_cw_pano_outline_24);
                int i4 = i2 & 14;
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, AJX, -675020111) | AbstractC25234BEr.A1U(i2) | AbstractC25232BEp.A1R(i2 & 57344) | AbstractC167007dF.A1P(i4, 4);
                Object EEc2 = c5Tl.EEc();
                if (A1Z || EEc2 == obj2) {
                    EEc2 = new C57265Pbn(interfaceC16620sF, AJX, str2, str, 0);
                    c5Tl.FBy(EEc2);
                }
                AbstractC28505Chy.A01(null, null, null, c5Tl, A0E, interfaceC30801Dgc, true, valueOf, valueOf2, str, A002, null, AbstractC25225BEi.A1A(A0K, EEc2, false), A1B, 3, Integer.MAX_VALUE, i4 | 1769472, 48, 10112, false);
            }
            if (AbstractC25227BEk.A1b(A0K, false)) {
                C0fH.A00(-1501369858);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUZ(str, str2, interfaceC16660sJ, interfaceC16620sF, i, z, z2, z3);
        }
    }

    public static final void A03(C5Tl c5Tl, String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, C5Hc c5Hc, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2;
        float f;
        Object obj;
        c5Tl.Enr(-1844181533);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0f(c5Tl, z3);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0g(c5Tl, z4);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16620sF2);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0Y(c5Tl, str);
        }
        if ((4793491 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1080074315, "com.instagram.aistudio.editor.IceBreakersSection (AiAdvancedSettingsScreen.kt:212)");
            }
            C6MK c6mk = new C6MK();
            Iterator it = c5Hc.iterator();
            while (it.hasNext()) {
                if (AbstractC25225BEi.A1Y(AbstractC166987dD.A1B(it)) && z) {
                    obj = C29181Ctm.A00;
                } else {
                    obj = C29183Cto.A00;
                }
                c6mk.add(obj);
            }
            C5UP c5up = AbstractC117935Vd.A00;
            UserSession userSession = (UserSession) c5Tl.AJX(c5up);
            int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573622546L);
            String A00 = C5YD.A00(c5Tl, 2131961928);
            UserSession userSession2 = (UserSession) c5Tl.AJX(c5up);
            A04(c5Tl, null, 2131952674, 2131952735, 0, 28, false, false);
            int i3 = 0;
            for (Object obj2 : c5Hc) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                String str2 = (String) obj2;
                c5Tl.Eno(1072060192);
                Object EEc = c5Tl.EEc();
                Object obj3 = C5UI.A00;
                if (EEc == obj3) {
                    EEc = AbstractC25232BEp.A0w(c5Tl, c6mk.get(i3));
                }
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) EEc;
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                boolean z5 = interfaceC74953Yl.getValue() instanceof C26179Bi4;
                Modifier A0W = AbstractC25228BEl.A0W();
                if (z5) {
                    f = 0.0f;
                } else {
                    f = 16.0f;
                }
                Modifier A0C = AbstractC118175Wb.A0C(A0W, 0.0f, 0.0f, f);
                if (i3 != 0 ? i3 != 1 ? i3 != 2 || !z4 : !z3 : !z2) {
                    c5Tl.Eno(-1125180525);
                    String A002 = C5YD.A00(c5Tl, 2131952772);
                    InterfaceC30801Dgc interfaceC30801Dgc = (InterfaceC30801Dgc) interfaceC74953Yl.getValue();
                    boolean A1X = AbstractC25225BEi.A1X(c5Tl, A00, AbstractC25227BEk.A1V(c5Tl, 1072089583, A07)) | AbstractC25233BEq.A1J(i2) | AbstractC25233BEq.A1I(i2) | c5Tl.AH2(i3);
                    Object EEc2 = c5Tl.EEc();
                    if (A1X || EEc2 == obj3) {
                        EEc2 = new C29927DHp(interfaceC74953Yl, A00, interfaceC16620sF, A07, i3, z);
                        c5Tl.FBy(EEc2);
                    }
                    InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc2, false);
                    Integer valueOf = Integer.valueOf(A07);
                    Integer valueOf2 = Integer.valueOf(R.drawable.instagram_arrow_cw_pano_outline_24);
                    boolean A1V = AbstractC25228BEl.A1V(c5Tl, str2, AbstractC25226BEj.A1X(c5Tl, userSession2, AbstractC25227BEk.A1V(c5Tl, 1072113411, i3)) | AbstractC167007dF.A1P(i2 & 29360128, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE), AbstractC167007dF.A1P(i2 & 3670016, 1048576));
                    Object EEc3 = c5Tl.EEc();
                    if (A1V || EEc3 == obj3) {
                        EEc3 = new D8T(userSession2, str, str2, interfaceC16620sF2, i3);
                        c5Tl.FBy(EEc3);
                    }
                    AbstractC28505Chy.A01(null, null, null, c5Tl, A0C, interfaceC30801Dgc, true, valueOf, valueOf2, str2, A002, null, AbstractC25225BEi.A1A(A0K, EEc3, false), A1B, 1, Integer.MAX_VALUE, 1769472, 48, 10112, false);
                    C117505Tk.A0L(A0K, false);
                } else {
                    c5Tl.Eno(-1125432369);
                    AbstractC27525CCv.A00(c5Tl, AbstractC118175Wb.A0C(A0W, 0.0f, 0.0f, 16.0f), C5YD.A00(c5Tl, 2131952772), 6, 0);
                    C117505Tk.A0L(A0K, false);
                }
                i3 = i4;
            }
            if (C0fH.A02()) {
                C0fH.A00(727594755);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVO(str, interfaceC16620sF, interfaceC16620sF2, c5Hc, i, z, z2, z3, z4);
        }
    }

    public static final void A05(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, boolean z) {
        int i2;
        AbstractC167007dF.A1D(c5Hc, 0, interfaceC16820sZ);
        C14360o3.A0B(interfaceC16620sF, 3);
        c5Tl.Enr(-1773816214);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-758398830, "com.instagram.aistudio.editor.ExampleDialogueSection (AiAdvancedSettingsScreen.kt:312)");
            }
            int i3 = i2 << 6;
            A04(c5Tl, interfaceC16820sZ, 2131952770, 2131952769, (i3 & 7168) | 384 | (i3 & 57344), 0, true, z);
            int i4 = 0;
            for (Object obj : c5Hc) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C50679MYx c50679MYx = (C50679MYx) obj;
                C1130158n c1130158n = Modifier.A00;
                boolean A1U = AbstractC25228BEl.A1U(c5Tl, c50679MYx, AbstractC25234BEr.A1a(c5Tl, 10599533, i2), c5Tl.AH2(i4));
                Object EEc = c5Tl.EEc();
                if (A1U || EEc == C5UI.A00) {
                    EEc = BFI.A00(c5Tl, interfaceC16620sF, c50679MYx, i4, 3);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC25705BXp.A0K(c5Tl, C5XR.A05(c1130158n, null, null, (InterfaceC16820sZ) EEc, true), C29198Cu3.A00, c50679MYx.A00, c50679MYx.A01);
                i4 = i5;
            }
            if (C0fH.A02()) {
                C0fH.A00(-954454925);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTY(c5Hc, interfaceC16820sZ, interfaceC16620sF, i, 0, z);
        }
    }

    public static final void A06(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, boolean z) {
        int i2;
        AbstractC25233BEq.A0v(0, c5Hc, interfaceC16820sZ, interfaceC16620sF);
        c5Tl.Enr(-191825685);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-860436226, "com.instagram.aistudio.editor.InstructionsSection (AiAdvancedSettingsScreen.kt:288)");
            }
            int i3 = i2 << 6;
            A04(c5Tl, interfaceC16820sZ, 2131952675, 2131952676, (i3 & 7168) | 384 | (i3 & 57344), 0, true, z);
            int i4 = 0;
            for (Object obj : c5Hc) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                String str = (String) obj;
                C1130158n c1130158n = Modifier.A00;
                boolean A1V = AbstractC25228BEl.A1V(c5Tl, str, AbstractC25233BEq.A1R(c5Tl, 1185333390, i2), c5Tl.AH2(i4));
                Object EEc = c5Tl.EEc();
                if (A1V || EEc == C5UI.A00) {
                    EEc = new D8Q(interfaceC16620sF, str, i4, 0);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC25705BXp.A00(c5Tl, C5XR.A05(c1130158n, null, null, (InterfaceC16820sZ) EEc, true), null, null, null, null, null, C29198Cu3.A00, str, null, null, null, null, 1, 1, 2, 0, 3504, 116476, 0L, false);
                i4 = i5;
            }
            if (C0fH.A02()) {
                C0fH.A00(216109884);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTY(c5Hc, interfaceC16820sZ, interfaceC16620sF, i, 1, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C5Tl r22, X.InterfaceC16620sF r23, X.C5Hc r24, int r25) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28486Che.A07(X.5Tl, X.0sF, X.5Hc, int):void");
    }

    public static final void A04(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        boolean z3 = z2;
        boolean z4 = z;
        c5Tl.Enr(1039540189);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = AbstractC25232BEp.A08(c5Tl, i) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= AbstractC25232BEp.A09(c5Tl, i2);
        }
        int i6 = i4 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= AbstractC25232BEp.A0d(c5Tl, z4);
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= AbstractC25232BEp.A0e(c5Tl, z3);
        }
        int i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i3 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i5 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ2);
        }
        if ((i5 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z4 = AbstractC25226BEj.A1U(i6, z4);
            z3 = AbstractC25226BEj.A1U(i7, z3);
            if (i8 != 0) {
                interfaceC16820sZ2 = D9w.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-943078116, "com.instagram.aistudio.editor.SectionHeader (AiAdvancedSettingsScreen.kt:375)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A0D = AbstractC118175Wb.A0D(C30711Df9.A00(A0T, C5XU.A00, 0), 16.0f, 14.0f, 14.0f);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0D);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC1127857k A0L = AbstractC25235BEs.A0L(AbstractC118255Wn.A04, c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A0L, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5WR.A0u(c5Tl, AbstractC25225BEi.A0X(c5Tl), C5YD.A00(c5Tl, i), AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(-1882749417);
            if (z4) {
                boolean z5 = false;
                String A003 = C5YD.A00(c5Tl, 2131952265);
                long A0C = AbstractC25226BEj.A0C(c5Tl);
                C118125Vw A0X = AbstractC25225BEi.A0X(c5Tl);
                Modifier A004 = CB8.A00(c1130158n, AbstractC25230BEn.A00(z3 ? 1 : 0));
                boolean A1a = AbstractC25234BEr.A1a(c5Tl, -1882740192, i5);
                if ((57344 & i5) == 16384) {
                    z5 = true;
                }
                boolean z6 = z5 | A1a;
                Object EEc = c5Tl.EEc();
                if (z6 || EEc == C5UI.A00) {
                    EEc = AbstractC25229BEm.A0x(c5Tl, interfaceC16820sZ2, 7, z3);
                }
                C5WR.A0R(c5Tl, AbstractC25229BEm.A0T(c117505Tk, A004, EEc), A0X, A003, A0C);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            AbstractC25236BEt.A0l(c5Tl, C5YD.A00(c5Tl, i2));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1148398734);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30229DTi(interfaceC16820sZ2, i, i2, i3, i4, z4, z3);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-798663606);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1708433150, "com.instagram.aistudio.editor.BackgroundSection (AiAdvancedSettingsScreen.kt:362)");
            }
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC118185Wd.A08(AbstractC25228BEl.A0W(), 6.0f), AbstractC25226BEj.A0B(c5Tl));
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1309587498);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 1);
        }
    }

    public static final void A01(C5Tl c5Tl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3, InterfaceC16620sF interfaceC16620sF4, InterfaceC16620sF interfaceC16620sF5, C5Hc c5Hc, C5Hc c5Hc2, C5Hc c5Hc3, C5Hc c5Hc4, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int A0R;
        int A0H;
        int A0H2;
        InterfaceC16820sZ interfaceC16820sZ4 = interfaceC16820sZ3;
        boolean z7 = z6;
        boolean z8 = z5;
        C14360o3.A0B(interfaceC16660sJ, 1);
        AbstractC167007dF.A1E(c5Hc, 2, interfaceC16620sF);
        AbstractC25234BEr.A0k(4, c5Hc2, interfaceC16820sZ, interfaceC16620sF2, c5Hc3);
        AbstractC167007dF.A1J(interfaceC16820sZ2, 8, interfaceC16620sF3);
        C14360o3.A0B(c5Hc4, 10);
        AbstractC25229BEm.A1P(interfaceC16620sF4, 11, interfaceC16620sF5);
        c5Tl.Enr(1994938927);
        if ((i4 & 1) != 0) {
            A0R = i | 6;
        } else {
            A0R = (i & 6) == 0 ? i | AbstractC25232BEp.A0R(c5Tl, str) : i;
        }
        if ((i4 & 2) != 0) {
            A0R |= 48;
        } else if ((i & 48) == 0) {
            A0R |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i4 & 4) != 0) {
            A0R |= 384;
        } else if ((i & 384) == 0) {
            A0R |= AbstractC25232BEp.A0T(c5Tl, c5Hc);
        }
        int i5 = i4 & 8;
        int i6 = C3OO.FLAG_MOVED;
        if (i5 != 0) {
            A0R |= 3072;
        } else if ((i & 3072) == 0) {
            A0R |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i4 & 16) != 0) {
            A0R |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0R |= AbstractC25232BEp.A0V(c5Tl, c5Hc2);
        }
        if ((i4 & 32) != 0) {
            A0R |= 196608;
        } else if ((i & 196608) == 0) {
            A0R |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ);
        }
        if ((i4 & 64) != 0) {
            A0R |= 1572864;
        } else if ((i & 1572864) == 0) {
            A0R |= AbstractC25232BEp.A0N(c5Tl, interfaceC16620sF2);
        }
        if ((i4 & 128) != 0) {
            A0R |= 12582912;
        } else if ((i & 12582912) == 0) {
            A0R |= AbstractC25232BEp.A0O(c5Tl, c5Hc3);
        }
        if ((i4 & 256) != 0) {
            A0R |= 100663296;
        } else if ((i & 100663296) == 0) {
            A0R |= AbstractC25232BEp.A0P(c5Tl, interfaceC16820sZ2);
        }
        if ((i4 & 512) != 0) {
            A0R |= 805306368;
        } else if ((i & 805306368) == 0) {
            A0R |= AbstractC25232BEp.A0Q(c5Tl, interfaceC16620sF3);
        }
        if ((i4 & 1024) != 0) {
            A0H = i2 | 6;
        } else {
            A0H = (i2 & 6) == 0 ? i2 | AbstractC25232BEp.A0H(c5Tl, c5Hc4) : i2;
        }
        if ((i4 & C3OO.FLAG_MOVED) != 0) {
            A0H |= 48;
        } else if ((i2 & 48) == 0) {
            A0H |= AbstractC25231BEo.A0B(c5Tl, interfaceC16620sF4);
        }
        if ((i4 & 4096) != 0) {
            A0H |= 384;
        } else if ((i2 & 384) == 0) {
            A0H |= c5Tl.AH5(z) ? 256 : 128;
        }
        if ((i4 & 8192) != 0) {
            A0H |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (!c5Tl.AH5(z2)) {
                i6 = 1024;
            }
            A0H |= i6;
        }
        if ((i4 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            A0H |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0H |= AbstractC25232BEp.A0f(c5Tl, z3);
        }
        if ((i4 & Constants.LOAD_RESULT_PGO) != 0) {
            A0H |= 196608;
        } else if ((i2 & 196608) == 0) {
            A0H |= AbstractC25232BEp.A0g(c5Tl, z4);
        }
        if ((i4 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            A0H |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            A0H |= AbstractC25232BEp.A0N(c5Tl, interfaceC16620sF5);
        }
        if ((i4 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            A0H |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            A0H |= AbstractC25232BEp.A0Y(c5Tl, str2);
        }
        int i7 = i4 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        if (i7 != 0) {
            A0H |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            A0H |= AbstractC25232BEp.A0j(c5Tl, z8);
        }
        int i8 = i4 & Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        if (i8 != 0) {
            A0H |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            A0H |= AbstractC25232BEp.A0k(c5Tl, z7);
        }
        int i9 = i4 & 1048576;
        if (i9 != 0) {
            A0H2 = i3 | 6;
        } else {
            A0H2 = (i3 & 6) == 0 ? i3 | AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ4) : i3;
        }
        if ((A0R & 306783379) == 306783378 && (306783379 & A0H) == 306783378 && (A0H2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z8 = AbstractC25226BEj.A1U(i7, z8);
            z7 = AbstractC25226BEj.A1U(i8, z7);
            if (i9 != 0) {
                interfaceC16820sZ4 = D9v.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1310611445, "com.instagram.aistudio.editor.AiAdvancedSettingsScreen (AiAdvancedSettingsScreen.kt:74)");
            }
            UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            int size = c5Hc2.size();
            C06090Tz A0j = AbstractC25225BEi.A0j(A0u, 0);
            boolean A1Q = AbstractC167007dF.A1Q(size, AbstractC25225BEi.A07(A0j, A0u, 36605486574605592L));
            int size2 = c5Hc3.size();
            C14360o3.A0B(A0u, 0);
            boolean A1Q2 = AbstractC167007dF.A1Q(size2, AbstractC25225BEi.A07(A0j, A0u, 36605486574540055L));
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1686191543);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25227BEk.A0j(c5Tl, AbstractC28459ChB.A03(A0u));
            }
            boolean A1a = AbstractC166987dD.A1a(A0q);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0U);
            InterfaceC16820sZ interfaceC16820sZ5 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ5);
            InterfaceC16620sF interfaceC16620sF6 = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF6);
            InterfaceC16620sF interfaceC16620sF7 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF7, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A002 = C30711Df9.A00(AbstractC28285CdX.A02(c5Tl, AbstractC25225BEi.A0Q(C6GM.A00.A00(c1130158n, true))), C5XU.A00, 0);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, AJX, -349215600);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == obj) {
                EEc = DGW.A00(AJX, 11);
                c5Tl.FBy(EEc);
            }
            Modifier A05 = C5XR.A05(A002, null, null, AbstractC25225BEi.A1A(A0K, EEc, false), true);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF6);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF7, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            int i10 = A0H >> 6;
            A02(c5Tl, str, str2, interfaceC16660sJ, interfaceC16620sF5, AbstractC25229BEm.A06((A0R & 14) | 384 | (A0R & 112) | ((A0H << 3) & 7168) | (57344 & i10), 458752 & i10, i10), A1a, z, z8);
            A00(c5Tl, 0);
            int i11 = A0R >> 6;
            A03(c5Tl, str2, interfaceC16620sF, interfaceC16620sF5, c5Hc, AbstractC25234BEr.A00(A0H, (i11 & 112) | (i11 & 14) | 384 | (A0H & 7168)), A1a, z2, z3, z4);
            A00(c5Tl, 0);
            A06(c5Tl, interfaceC16820sZ, interfaceC16620sF2, c5Hc2, AbstractC25229BEm.A05(A0R >> 9, (A0R >> 12) & 14), A1Q);
            A00(c5Tl, 0);
            A05(c5Tl, interfaceC16820sZ2, interfaceC16620sF3, c5Hc3, AbstractC25229BEm.A05(A0R >> 18, (A0R >> 21) & 14), A1Q2);
            A00(c5Tl, 0);
            A07(c5Tl, interfaceC16620sF4, c5Hc4, AbstractC25225BEi.A01(A0H));
            c5Tl.ASW();
            c5Tl.Eno(-349159825);
            if (!AbstractC28287CdZ.A02(c5Tl) && z7) {
                boolean A1Y2 = AbstractC25225BEi.A1Y(str);
                String A004 = C5YD.A00(c5Tl, 2131952706);
                boolean A1O = AbstractC25233BEq.A1O(c5Tl, -349154546, A0H2);
                Object EEc2 = c5Tl.EEc();
                if (A1O || EEc2 == obj) {
                    EEc2 = DGW.A00(interfaceC16820sZ4, 12);
                    c5Tl.FBy(EEc2);
                }
                AbstractC28506Chz.A03(c5Tl, null, null, A004, null, AbstractC25225BEi.A1A(A0K, EEc2, false), null, null, 0, 3072, 24564, A1Y2, false, true);
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-943475577);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30369DYs(str, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ4, interfaceC16660sJ, interfaceC16620sF, interfaceC16620sF2, interfaceC16620sF3, interfaceC16620sF4, interfaceC16620sF5, c5Hc, c5Hc2, c5Hc3, c5Hc4, i, i2, i3, i4, z, z2, z3, z4, z8, z7);
        }
    }
}
