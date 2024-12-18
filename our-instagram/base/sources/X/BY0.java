package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BY0 {
    public static final C5C8 A00(C5Tl c5Tl, C26227Bir c26227Bir, String str) {
        C14360o3.A0B(str, 0);
        if (AbstractC25227BEk.A1U(c5Tl, -365945157)) {
            C0fH.A01(-1157704106, "com.instagram.settings2.core.view.buildAnnotatedBodyWithLink (Elements.kt:113)");
        }
        String A01 = AbstractC25703BXn.A01(c5Tl, c26227Bir.A00);
        int A0E = AbstractC25230BEn.A0E(str, A01);
        C6C7 A0U = AbstractC25231BEo.A0U(str);
        int A0A = AbstractC167007dF.A0A(A01) + A0E;
        AbstractC25234BEr.A0u(c5Tl, A0U, A0E, A0A);
        C5C8 A0R = AbstractC25227BEk.A0R(A0U, "link", "Clickable link", A0E, A0A);
        if (C0fH.A02()) {
            C0fH.A00(-1905190082);
        }
        AbstractC25225BEi.A1V(c5Tl, false);
        return A0R;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r16, X.C51759Mti r17, X.InterfaceC16660sJ r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BY0.A01(X.5Tl, X.Mti, X.0sJ, int, boolean):void");
    }

    public static final void A02(C5Tl c5Tl, InterfaceC30953DjA interfaceC30953DjA, InterfaceC30953DjA interfaceC30953DjA2, InterfaceC30953DjA interfaceC30953DjA3, InterfaceC30954DjB interfaceC30954DjB, SettingsScreenViewModel settingsScreenViewModel, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i) {
        int i2;
        boolean AH6;
        boolean AH62;
        boolean AH63;
        C14360o3.A0B(interfaceC30954DjB, 0);
        C14360o3.A0B(interfaceC16620sF, 1);
        C14360o3.A0B(interfaceC30953DjA, 2);
        C14360o3.A0B(interfaceC30953DjA2, 3);
        C14360o3.A0B(interfaceC30953DjA3, 4);
        C14360o3.A0B(interfaceC16620sF2, 5);
        C14360o3.A0B(interfaceC16660sJ, 6);
        C14360o3.A0B(settingsScreenViewModel, 7);
        c5Tl.Enr(644190076);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(interfaceC30954DjB)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                AH63 = c5Tl.AH4(interfaceC30953DjA);
            } else {
                AH63 = c5Tl.AH6(interfaceC30953DjA);
            }
            int i5 = 128;
            if (AH63) {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                AH62 = c5Tl.AH4(interfaceC30953DjA2);
            } else {
                AH62 = c5Tl.AH6(interfaceC30953DjA2);
            }
            int i6 = 1024;
            if (AH62) {
                i6 = C3OO.FLAG_MOVED;
            }
            i2 |= i6;
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            if ((32768 & i) == 0) {
                AH6 = c5Tl.AH4(interfaceC30953DjA3);
            } else {
                AH6 = c5Tl.AH6(interfaceC30953DjA3);
            }
            int i7 = 8192;
            if (AH6) {
                i7 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            boolean AH64 = c5Tl.AH6(interfaceC16620sF2);
            int i8 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
            if (AH64) {
                i8 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            i2 |= i8;
        }
        if ((1572864 & i) == 0) {
            boolean AH65 = c5Tl.AH6(interfaceC16660sJ);
            int i9 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (AH65) {
                i9 = 1048576;
            }
            i2 |= i9;
        }
        if ((12582912 & i) == 0) {
            int i10 = 4194304;
            if (c5Tl.AH6(settingsScreenViewModel)) {
                i10 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
            }
            i2 |= i10;
        }
        if ((4793491 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1535620472, "com.instagram.settings2.core.view.Element (Elements.kt:49)");
            }
            if (interfaceC30954DjB.CGh()) {
                if (interfaceC30954DjB instanceof C25714BXz) {
                    c5Tl.Eno(-243374830);
                    AbstractC25704BXo.A00(c5Tl, (C25714BXz) interfaceC30954DjB, settingsScreenViewModel, interfaceC16620sF, ((i2 >> 15) & 896) | (i2 & 112));
                } else if (interfaceC30954DjB instanceof InterfaceC31151Dmv) {
                    c5Tl.Eno(-243371308);
                    A03(c5Tl, interfaceC30953DjA, interfaceC30953DjA2, interfaceC30953DjA3, (InterfaceC31151Dmv) interfaceC30954DjB, settingsScreenViewModel, interfaceC16660sJ, interfaceC16620sF, interfaceC16620sF2, (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128));
                } else {
                    c5Tl.Eno(1045885512);
                }
                C117505Tk.A0L((C117505Tk) c5Tl, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1608787859);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWQ(interfaceC16660sJ, settingsScreenViewModel, interfaceC30954DjB, interfaceC16620sF2, interfaceC30953DjA2, interfaceC30953DjA3, interfaceC16620sF, interfaceC30953DjA, i, 6);
        }
    }

    public static final void A03(C5Tl c5Tl, InterfaceC30953DjA interfaceC30953DjA, InterfaceC30953DjA interfaceC30953DjA2, InterfaceC30953DjA interfaceC30953DjA3, InterfaceC31151Dmv interfaceC31151Dmv, SettingsScreenViewModel settingsScreenViewModel, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i) {
        int i2;
        AbstractC167007dF.A1K(interfaceC31151Dmv, interfaceC16620sF);
        AbstractC25234BEr.A1R(interfaceC30953DjA, interfaceC30953DjA2, interfaceC30953DjA3, interfaceC16620sF2, interfaceC16660sJ);
        C14360o3.A0B(settingsScreenViewModel, 7);
        c5Tl.Enr(-413150252);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC31151Dmv) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            int i3 = 128;
            if (AbstractC25231BEo.A1Q(c5Tl, interfaceC30953DjA, i & 512)) {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            int i4 = 1024;
            if (AbstractC25231BEo.A1Q(c5Tl, interfaceC30953DjA2, i & 4096)) {
                i4 = C3OO.FLAG_MOVED;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16620sF2);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16660sJ);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, settingsScreenViewModel);
        }
        if ((4785283 & i2) == 4785282 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-326596833, "com.instagram.settings2.core.view.Setting (Elements.kt:142)");
            }
            if (interfaceC31151Dmv.CGh()) {
                C38688GzT AfK = interfaceC31151Dmv.AfK();
                c5Tl.Eno(1539144091);
                if (AfK != null) {
                    InterfaceC57989PnZ BF6 = interfaceC31151Dmv.BF6();
                    c5Tl.Eno(604548475);
                    boolean A1b = AbstractC25232BEp.A1b(c5Tl, interfaceC31151Dmv, AfK, AbstractC25231BEo.A1N(458752, i2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP));
                    Object EEc = c5Tl.EEc();
                    if (A1b || EEc == C5UI.A00) {
                        EEc = new C43210J8h(12, interfaceC31151Dmv, interfaceC16620sF2, AfK);
                        c5Tl.FBy(EEc);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    CKJ.A00(c5Tl, AfK, settingsScreenViewModel, BF6, (InterfaceC16820sZ) EEc, (i2 >> 15) & 896, 0);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                if (interfaceC31151Dmv instanceof C26228Bis) {
                    c5Tl.Eno(1539149603);
                    A04(c5Tl, interfaceC30953DjA, (C26228Bis) interfaceC31151Dmv, settingsScreenViewModel, interfaceC16660sJ, AbstractC25229BEm.A05(i2 >> 12, (i2 >> 3) & 112));
                } else if (interfaceC31151Dmv instanceof C26229Bit) {
                    c5Tl.Eno(1539153960);
                    CKK.A00(c5Tl, interfaceC30953DjA2, settingsScreenViewModel, (C26229Bit) interfaceC31151Dmv, interfaceC16660sJ, AbstractC25229BEm.A05(i2 >> 12, (i2 >> 6) & 112));
                } else if (interfaceC31151Dmv instanceof C26230Biu) {
                    c5Tl.Eno(1539159534);
                    int i5 = i2 >> 15;
                    CKL.A00(c5Tl, settingsScreenViewModel, (C26230Biu) interfaceC31151Dmv, interfaceC16660sJ, (i5 & 896) | (i5 & 112));
                } else if (interfaceC31151Dmv instanceof C26231Biv) {
                    c5Tl.Eno(469404934);
                } else {
                    throw AbstractC25231BEo.A0v(c5Tl, A0K, 1539148184, false);
                }
                C117505Tk.A0L(A0K, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(498876270);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWQ(interfaceC30953DjA, interfaceC16660sJ, interfaceC31151Dmv, interfaceC30953DjA3, interfaceC16620sF2, interfaceC30953DjA2, interfaceC16620sF, settingsScreenViewModel, i, 7);
        }
    }

    public static final void A04(C5Tl c5Tl, InterfaceC30953DjA interfaceC30953DjA, C26228Bis c26228Bis, SettingsScreenViewModel settingsScreenViewModel, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        boolean z;
        String A01;
        C14360o3.A0B(c26228Bis, 0);
        AbstractC167027dH.A13(interfaceC30953DjA, interfaceC16660sJ, settingsScreenViewModel);
        c5Tl.Enr(-967800234);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26228Bis) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, interfaceC30953DjA, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, settingsScreenViewModel);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2009350102, "com.instagram.settings2.core.view.BooleanSetting (Elements.kt:169)");
            }
            String A012 = AbstractC25703BXn.A01(c5Tl, c26228Bis.A01);
            boolean z2 = c26228Bis.A05;
            boolean z3 = c26228Bis.A06;
            c5Tl.Eno(812036823);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && c5Tl.AH6(interfaceC30953DjA))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, c26228Bis, z);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C57751Pje(0, interfaceC30953DjA, c26228Bis);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C29199Cu4 c29199Cu4 = new C29199Cu4((InterfaceC16660sJ) EEc, z3, false);
            C51759Mti c51759Mti = c26228Bis.A00;
            c5Tl.Eno(812043019);
            if (c51759Mti == null) {
                A01 = null;
            } else {
                A01 = AbstractC25703BXn.A01(c5Tl, c51759Mti);
            }
            C117505Tk.A0L(A0K, false);
            AbstractC25705BXp.A00(c5Tl, null, null, null, null, null, null, c29199Cu4, A012, null, A01, null, null, 0, 0, 0, 0, 0, 130298, 0L, z2);
            A06(c5Tl, c26228Bis.A04, interfaceC16660sJ, (i2 & 896) | 48, false);
            InterfaceC58302Psu interfaceC58302Psu = c26228Bis.A03;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, settingsScreenViewModel, c26228Bis, 812048301);
            Object EEc2 = c5Tl.EEc();
            if (A1W || EEc2 == C5UI.A00) {
                EEc2 = new C43171J6q(c26228Bis, settingsScreenViewModel, (InterfaceC23621Ds) null, 19);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc2, interfaceC58302Psu, false)) {
                C0fH.A00(-2046273299);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c26228Bis, settingsScreenViewModel, interfaceC30953DjA, interfaceC16660sJ, i, 24);
        }
    }

    public static final void A05(C5Tl c5Tl, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        AbstractC167007dF.A1K(list, interfaceC16660sJ);
        c5Tl.Enr(800996836);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
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
                C0fH.A01(-258747365, "com.instagram.settings2.core.view.SettingHeaders (Elements.kt:68)");
            }
            A06(c5Tl, list, interfaceC16660sJ, ((i2 << 3) & 896) | (i2 & 14) | 48, false);
            if (C0fH.A02()) {
                C0fH.A00(-783299274);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30508Dbr(list, interfaceC16660sJ, i, 17);
        }
    }

    public static final void A06(C5Tl c5Tl, List list, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        AbstractC167017dG.A1O(list, interfaceC16660sJ);
        c5Tl.Enr(-411995826);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1362573974, "com.instagram.settings2.core.view.SettingFooters (Elements.kt:77)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A01(c5Tl, (C51759Mti) it.next(), interfaceC16660sJ, (i2 & 112) | (i2 & 896), z);
            }
            if (C0fH.A02()) {
                C0fH.A00(1856095301);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 18, interfaceC16660sJ, list, z);
        }
    }
}
