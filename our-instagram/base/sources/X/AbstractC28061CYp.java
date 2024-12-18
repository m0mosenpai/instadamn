package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.user.model.User;

/* renamed from: X.CYp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28061CYp {
    public static final void A01(C5Tl c5Tl, OpalProfileData opalProfileData, OpalProfileData opalProfileData2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z, boolean z2) {
        int i2;
        long A01;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC25233BEq.A0v(1, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16820sZ3);
        AbstractC25233BEq.A0y(4, interfaceC16820sZ4, opalProfileData, opalProfileData2);
        c5Tl.Enr(293931549);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ4);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0g(c5Tl, z);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0h(c5Tl, z2);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0Y(c5Tl, str);
        }
        if ((100663296 & i) == 0) {
            i2 |= AbstractC25232BEp.A0P(c5Tl, opalProfileData);
        }
        if ((805306368 & i) == 0) {
            i2 |= AbstractC25232BEp.A0Q(c5Tl, opalProfileData2);
        }
        if ((306783379 & i2) == 306783378 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-550978233, "com.instagram.opal.impl.ui.OpalNavbar (OpalNavbar.kt:50)");
            }
            UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
            String str2 = opalProfileData2.A05;
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, str2, -93226064);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25227BEk.A0j(c5Tl, C2TN.A05(A0u, str2));
            }
            boolean A1a = AbstractC166987dD.A1a(EEc);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            String str3 = opalProfileData2.A07;
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, str3, -93221624);
            Object EEc2 = c5Tl.EEc();
            if (A1Y2 || EEc2 == C5UI.A00) {
                if (str3.length() == 0 && str != null) {
                    User A02 = AnonymousClass189.A00(A0u).A02(str);
                    if (A02 != null) {
                        EEc2 = A02.getUsername();
                    } else {
                        EEc2 = "";
                    }
                } else {
                    EEc2 = str3;
                }
                c5Tl.FBy(EEc2);
            }
            String str4 = (String) EEc2;
            C1130158n A0O = AbstractC25225BEi.A0O(A0K);
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(A0O), 16.0f, 0.0f, 12.0f, 0.0f), AbstractC25226BEj.A09(c5Tl));
            InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A01;
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A05;
            InterfaceC1127857k A022 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0X);
            InterfaceC16820sZ interfaceC16820sZ5 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ5);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A022, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            C6L0 c6l0 = C6L0.A00;
            Modifier A09 = AbstractC118185Wd.A09(c6l0.A00(A0O), 22.0f);
            InterfaceC118225Wj interfaceC118225Wj2 = C118195Wf.A04;
            Modifier AB7 = c6l0.AB7(interfaceC118225Wj2, A09);
            InterfaceC1127857k A023 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, AB7);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A023, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            A00(c5Tl, c6l0.AB7(interfaceC118225Wj2, A0O), interfaceC16820sZ4, AbstractC25225BEi.A02(i2 >> 12), z);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            if (z2) {
                A01 = AbstractC118155Vz.A00(21.5f, 4294967296L);
            } else {
                A01 = AbstractC118155Vz.A01(20);
            }
            C5WR.A0L(c5Tl, null, AbstractC25226BEj.A0e(c5Tl), str4, 0, 16370, A0G, A01);
            c5Tl.ASW();
            if (A1a) {
                c5Tl.Eno(-991809336);
                boolean z3 = false;
                if (C14360o3.A0K(opalProfileData2.A04, opalProfileData.A04) && C14360o3.A0K(opalProfileData2.A02, opalProfileData.A02) && opalProfileData2.A00 == opalProfileData.A00 && opalProfileData2.A0C == opalProfileData.A0C && C14360o3.A0K(opalProfileData2.A06, opalProfileData.A06)) {
                    z3 = AbstractC25231BEo.A1Z(opalProfileData2.A03, opalProfileData.A03, false);
                }
                boolean z4 = !z3;
                C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_new_post_pano_outline_24, 0);
                String A004 = AbstractC136736Hc.A00(c5Tl, 2131969034);
                Modifier AB72 = c6l0.AB7(interfaceC118225Wj2, AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(A0O, 8.0f, 0.0f, 0.0f, 0.0f), 24.0f));
                boolean A1O = AbstractC25233BEq.A1O(c5Tl, -447623870, i2);
                Object EEc3 = c5Tl.EEc();
                if (A1O || EEc3 == C5UI.A00) {
                    EEc3 = DH3.A01(c5Tl, interfaceC16820sZ, 39);
                }
                C5YS.A09(c5Tl, C5XR.A05(AB72, null, null, AbstractC25225BEi.A1A(A0K, EEc3, false), true), A003, A004, AbstractC25226BEj.A0F(c5Tl));
                if (opalProfileData2.A01 == C74.A06) {
                    c5Tl.Eno(-991268231);
                    BIR.A00(c5Tl, c6l0.AB7(interfaceC118225Wj2, AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(A0O, 24.0f, 0.0f, 0.0f, 0.0f), 24.0f)));
                    C117505Tk.A0L(A0K, false);
                } else if (z4) {
                    c5Tl.Eno(-991065026);
                    C2DC A005 = C5Y7.A00(c5Tl, R.drawable.instagram_check_pano_filled_24, 0);
                    String A006 = AbstractC136736Hc.A00(c5Tl, 2131972699);
                    Modifier AB73 = c6l0.AB7(interfaceC118225Wj2, AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(A0O, 24.0f, 0.0f, 0.0f, 0.0f), 24.0f));
                    boolean A1a2 = AbstractC25234BEr.A1a(c5Tl, -447600686, i2);
                    Object EEc4 = c5Tl.EEc();
                    if (A1a2 || EEc4 == C5UI.A00) {
                        EEc4 = DH3.A01(c5Tl, interfaceC16820sZ3, 40);
                    }
                    C5YS.A09(c5Tl, C5XR.A05(AB73, null, null, AbstractC25225BEi.A1A(A0K, EEc4, false), true), A005, A006, AbstractC25226BEj.A0F(c5Tl));
                    C117505Tk.A0L(A0K, false);
                } else {
                    c5Tl.Eno(-990598910);
                    C2DC A007 = C5Y7.A00(c5Tl, R.drawable.instagram_edit_pano_outline_24, 0);
                    String A008 = AbstractC136736Hc.A00(c5Tl, 2131969037);
                    Modifier AB74 = c6l0.AB7(interfaceC118225Wj2, AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(A0O, 24.0f, 0.0f, 0.0f, 0.0f), 24.0f));
                    boolean A1Y3 = AbstractC25234BEr.A1Y(c5Tl, -447584875, i2);
                    Object EEc5 = c5Tl.EEc();
                    if (A1Y3 || EEc5 == C5UI.A00) {
                        EEc5 = DH3.A01(c5Tl, interfaceC16820sZ2, 41);
                    }
                    C5YS.A09(c5Tl, C5XR.A05(AB74, null, null, AbstractC25225BEi.A1A(A0K, EEc5, false), true), A007, A008, AbstractC25226BEj.A0F(c5Tl));
                    C117505Tk.A0L(A0K, false);
                }
            } else {
                c5Tl.Eno(-990105669);
                C2DC A009 = C5Y7.A00(c5Tl, R.drawable.instagram_more_vertical_pano_outline_24, 0);
                String A0010 = AbstractC136736Hc.A00(c5Tl, 2131966888);
                Modifier AB75 = c6l0.AB7(interfaceC118225Wj2, AbstractC118185Wd.A04(A0O));
                boolean A1X = AbstractC25226BEj.A1X(c5Tl, opalProfileData2, AbstractC25234BEr.A1Z(c5Tl, -447572920, i2));
                Object EEc6 = c5Tl.EEc();
                if (A1X || EEc6 == C5UI.A00) {
                    EEc6 = AbstractC25235BEs.A18(c5Tl, interfaceC16660sJ, opalProfileData2, 18);
                }
                C5YS.A09(c5Tl, C5XR.A05(AB75, null, null, AbstractC25225BEi.A1A(A0K, EEc6, false), true), A009, A0010, AbstractC25226BEj.A0F(c5Tl));
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(311002064);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30309DWk(opalProfileData, opalProfileData2, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, i, z, z2);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        c5Tl.Enr(1760283049);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1834205414, "com.instagram.opal.impl.ui.OpalIcon (OpalNavbar.kt:144)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -329131587);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25230BEn.A0R(!z);
                c5Tl.FBy(A0q);
            }
            C136606Go c136606Go = (C136606Go) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C0eB c0eB = C0eB.A00;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c136606Go, -329129185);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = new PZG(c136606Go, (InterfaceC23621Ds) null, 15);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, c117505Tk, EEc, c0eB, false);
            float A01 = AbstractC25230BEn.A01(AbstractC25231BEo.A1T(c136606Go.A01) ? 1 : 0);
            C25245BFe A00 = C25245BFe.A00(500, 0);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -329117149, i2);
            Object EEc2 = c5Tl.EEc();
            if (A1O || EEc2 == obj) {
                EEc2 = AbstractC25230BEn.A10(c5Tl, interfaceC16820sZ, 0);
            }
            InterfaceC74963Ym A02 = AbstractC28454Ch4.A02(A00, c5Tl, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), A01, 3120, 4);
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(modifier, 0.0f, 0.0f, AbstractC25231BEo.A05(A02) * 6.0f, 0.0f), AbstractC25231BEo.A05(A02) * 22.0f);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0C);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5YS.A06(c5Tl, AbstractC25225BEi.A0P(C119645bN.A00, AbstractC118185Wd.A03(Modifier.A00)), C5Y7.A00(c5Tl, R.drawable.instagram_key_pano_filled_24, 0), AbstractC25226BEj.A0F(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(2074616408);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 15, interfaceC16820sZ, modifier, z);
        }
    }
}
