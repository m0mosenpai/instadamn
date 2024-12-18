package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.tigon.tigonhuc.HucClient;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CXG {
    public static final void A01(C5Tl c5Tl, InterfaceC31032DkW interfaceC31032DkW, Integer num, String str, List list, Map map, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        int i5;
        int i6;
        String str2;
        boolean z4;
        String A00;
        boolean z5;
        String A002;
        boolean z6;
        String A003;
        boolean z7;
        String str3;
        boolean z8;
        C14360o3.A0B(map, 0);
        C14360o3.A0B(str, 1);
        AbstractC25232BEp.A1P(interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-1842762188);
        if ((i3 & 6) == 0) {
            i5 = AbstractC25232BEp.A0H(c5Tl, map) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i3 & 384) == 0) {
            i5 |= AbstractC25232BEp.A0T(c5Tl, num);
        }
        if ((i3 & 3072) == 0) {
            i5 |= AbstractC25232BEp.A0A(c5Tl, i);
        }
        if ((i3 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i5 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((196608 & i3) == 0) {
            i5 |= AbstractC25232BEp.A0g(c5Tl, z2);
        }
        if ((1572864 & i3) == 0) {
            i5 |= AbstractC25232BEp.A0h(c5Tl, z3);
        }
        if ((i3 & 12582912) == 0) {
            int i7 = 4194304;
            if (c5Tl.AH2(i2)) {
                i7 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
            }
            i5 |= i7;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= AbstractC25232BEp.A0P(c5Tl, list);
        }
        if ((i3 & 805306368) == 0) {
            i5 |= AbstractC25229BEm.A01(AbstractC25233BEq.A1V(c5Tl, interfaceC31032DkW, i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) ? 1 : 0);
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1022215064, "com.instagram.aistudio.editor.AiAudienceSelectionScreen (AiAudienceSelectionScreen.kt:50)");
            }
            boolean A1X = AbstractC167007dF.A1X(AbstractC166997dE.A0Y(AbstractC25228BEl.A0u(c5Tl)).A0M(), C05F.A01);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, A0T);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A004 = AbstractC119595bH.A00(interfaceC118305Ws, c5Tl, interfaceC118245Wl);
            int A005 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A004, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A04;
            C5XJ.A00(c5Tl, A01, interfaceC16620sF3);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A006 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A012, interfaceC16620sF3);
            AbstractC25705BXp.A0S(c5Tl, C5YD.A00(c5Tl, 2131952724));
            Context A0P = AbstractC25230BEn.A0P(c5Tl);
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, list, -891589861);
            while (A0x.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A0x);
                C83 c83 = (C83) map.get(A1B);
                if (c83 != null) {
                    int ordinal = c83.ordinal();
                    if (ordinal != 8) {
                        if (ordinal != 7) {
                            if (ordinal != 2) {
                                if (ordinal == 5) {
                                    c5Tl.Eno(28098605);
                                    c5Tl.Eno(-1661656352);
                                    if ((i5 & 1879048192) == 536870912 || ((i5 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 && c5Tl.AH6(interfaceC31032DkW))) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    Object EEc = c5Tl.EEc();
                                    if (z5 || EEc == C5UI.A00) {
                                        EEc = DRW.A00(c5Tl, interfaceC31032DkW, 20);
                                    }
                                    A00(c5Tl, null, null, A1B, str, null, null, AbstractC25225BEi.A1B(c117505Tk, EEc, false), R.drawable.instagram_user_circle_pano_filled_24, i5 & 112, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                                    C117505Tk.A0L(c117505Tk, false);
                                }
                            } else {
                                c5Tl.Eno(26979784);
                                if (i > 0) {
                                    c5Tl.Eno(27154748);
                                    A002 = AbstractC25228BEl.A17(c5Tl, Integer.valueOf(i), 2131952722);
                                    C117505Tk.A0L(c117505Tk, false);
                                } else {
                                    c5Tl.Eno(27341089);
                                    A002 = C5YD.A00(c5Tl, 2131952721);
                                    C117505Tk.A0L(c117505Tk, false);
                                }
                                C1132359l A0S = AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0U);
                                Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 0.0f, 12.0f, 12.0f, 12.0f), 44.0f);
                                long A0J = AbstractC25226BEj.A0J(c5Tl);
                                C5WI c5wi = C5WF.A00;
                                Modifier A0B = AbstractC118175Wb.A0B(C6L3.A01(C6L7.A03(A0C, c5wi, 1.0f, A0J), c5wi, C5XL.A00(c5Tl).A0L), 0.0f, 0.0f, 0.0f);
                                c5Tl.Eno(-1661667488);
                                if ((i5 & 1879048192) == 536870912 || ((i5 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 && c5Tl.AH6(interfaceC31032DkW))) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Object EEc2 = c5Tl.EEc();
                                if (z6 || EEc2 == C5UI.A00) {
                                    EEc2 = new DRW(interfaceC31032DkW, 19);
                                    c5Tl.FBy(EEc2);
                                }
                                A00(c5Tl, A0B, A0S, A1B, str, A002, interfaceC16820sZ, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), R.drawable.instagram_star_pano_filled_24, (i5 & 112) | (3670016 & (i6 << 18)), 0);
                                C117505Tk.A0L(c117505Tk, false);
                            }
                        } else {
                            c5Tl.Eno(26136615);
                            int i8 = R.drawable.instagram_users_pano_filled_24;
                            if (num != null) {
                                i8 = R.drawable.instagram_user_following_pano_filled_24;
                            }
                            c5Tl.Eno(-1661717931);
                            if (num != null) {
                                Resources resources = A0P.getResources();
                                if (resources != null) {
                                    str3 = resources.getQuantityString(R.plurals.x_people, num.intValue(), num);
                                } else {
                                    str3 = null;
                                }
                                A003 = String.valueOf(str3);
                            } else {
                                A003 = C5YD.A00(c5Tl, 2131952798);
                            }
                            C117505Tk.A0L(c117505Tk, false);
                            c5Tl.Eno(-1661704762);
                            if ((i5 & 1879048192) == 536870912 || ((i5 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 && c5Tl.AH6(interfaceC31032DkW))) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            Object EEc3 = c5Tl.EEc();
                            if (z7 || EEc3 == C5UI.A00) {
                                EEc3 = DRW.A00(c5Tl, interfaceC31032DkW, 18);
                            }
                            A00(c5Tl, null, null, A1B, str, A003, null, AbstractC25225BEi.A1B(c117505Tk, EEc3, false), i8, i5 & 112, 112);
                            C117505Tk.A0L(c117505Tk, false);
                        }
                    } else {
                        c5Tl.Eno(25680264);
                        String A007 = C5YD.A00(c5Tl, 2131952798);
                        c5Tl.Eno(-1661731790);
                        if ((i5 & 1879048192) == 536870912 || ((i5 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 && c5Tl.AH6(interfaceC31032DkW))) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        Object EEc4 = c5Tl.EEc();
                        if (z8 || EEc4 == C5UI.A00) {
                            EEc4 = DRW.A00(c5Tl, interfaceC31032DkW, 17);
                        }
                        A00(c5Tl, null, null, A1B, str, A007, null, AbstractC25225BEi.A1B(c117505Tk, EEc4, false), R.drawable.instagram_users_pano_filled_24, i5 & 112, 112);
                        C117505Tk.A0L(c117505Tk, false);
                    }
                }
                c5Tl.Eno(28401041);
                C117505Tk.A0L(c117505Tk, false);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-891497377);
            if (z || z2) {
                AbstractC28389Cfs.A02(c5Tl, AbstractC118185Wd.A08(AbstractC118175Wb.A0A(A0T, 0.0f, 16.0f), 6.0f), 0.0f, 6, 4, AbstractC25226BEj.A0B(c5Tl));
                AbstractC25705BXp.A0S(c5Tl, C5YD.A00(c5Tl, 2131952726));
                c5Tl.Eno(-891487257);
                if (z) {
                    C2DC A008 = C5Y7.A00(c5Tl, R.drawable.instagram_user_circle_pano_outline_24, 0);
                    String A009 = C5YD.A00(c5Tl, 2131952715);
                    c5Tl.Eno(-891474869);
                    if ((i5 & 1879048192) == 536870912 || ((i5 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 && c5Tl.AH6(interfaceC31032DkW))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object EEc5 = c5Tl.EEc();
                    if (z4 || EEc5 == C5UI.A00) {
                        EEc5 = DRW.A00(c5Tl, interfaceC31032DkW, 21);
                    }
                    AbstractC25705BXp.A0N(c5Tl, A008, C29199Cu4.A00(c117505Tk, EEc5, z3), A009);
                }
                C117505Tk.A0L(c117505Tk, false);
                if (z2) {
                    Resources resources2 = A0P.getResources();
                    if (resources2 != null) {
                        str2 = resources2.getQuantityString(R.plurals.discoverability_selected_apps_text, i2, AbstractC25228BEl.A1Y(i2 - 1));
                    } else {
                        str2 = null;
                    }
                    String valueOf = String.valueOf(str2);
                    boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, -891457906, i6);
                    Object EEc6 = c5Tl.EEc();
                    if (A1Y || EEc6 == C5UI.A00) {
                        EEc6 = DGW.A00(interfaceC16820sZ2, 24);
                        c5Tl.FBy(EEc6);
                    }
                    AbstractC25705BXp.A03(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc6, false), true), C5Y7.A00(c5Tl, R.drawable.instagram_search_pano_outline_24, 0), new BY4(valueOf, true), AbstractC136736Hc.A00(c5Tl, 2131952712));
                }
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            if (A1X) {
                A00 = "public";
            } else {
                A00 = MSV.A00(547);
            }
            C5WR.A0R(c5Tl, AbstractC118175Wb.A0D(A0T, 16.0f, 10.0f, 10.0f), AbstractC25225BEi.A0Y(c5Tl), AbstractC25228BEl.A17(c5Tl, A00, 2131952723), AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(181616709);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXY(interfaceC31032DkW, num, str, list, map, interfaceC16820sZ, interfaceC16820sZ2, i, i2, i3, i4, z, z2, z3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r27, androidx.compose.ui.Modifier r28, X.C1132359l r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, X.InterfaceC16820sZ r33, X.InterfaceC16660sJ r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXG.A00(X.5Tl, androidx.compose.ui.Modifier, X.59l, java.lang.String, java.lang.String, java.lang.String, X.0sZ, X.0sJ, int, int, int):void");
    }
}
