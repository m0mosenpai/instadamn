package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.ChS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28474ChS {
    public static void A01(C5Tl c5Tl, C2DC c2dc, int i) {
        A02(c5Tl, c2dc, new C26177Bi2(AbstractC136736Hc.A00(c5Tl, i), 0));
    }

    public static final void A02(C5Tl c5Tl, C2DC c2dc, InterfaceC30937Dir interfaceC30937Dir) {
        A03(c5Tl, c2dc, interfaceC30937Dir, 0, 4, false);
    }

    public static void A05(C5Tl c5Tl, InterfaceC30937Dir interfaceC30937Dir, int i) {
        A02(c5Tl, C5Y7.A00(c5Tl, i, 0), interfaceC30937Dir);
    }

    public static final void A03(C5Tl c5Tl, C2DC c2dc, InterfaceC30937Dir interfaceC30937Dir, int i, int i2, boolean z) {
        int i3;
        long j;
        boolean z2 = z;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC30937Dir, c2dc);
        c5Tl.Enr(129470589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, interfaceC30937Dir, i) ? 1 : 0) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c2dc);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z2 = AbstractC25226BEj.A1U(i4, z2);
            if (C0fH.A02()) {
                C0fH.A01(-466690461, "com.instagram.compose.igds.components.bulletcell.IgdsBulletCell (IgdsBulletCell.kt:75)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A00 = AnonymousClass598.A00(AbstractC118175Wb.A0A(c1130158n, 24.0f, 0.0f), DMZ.A00, A1R);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0f, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A07(c1130158n), 24.0f);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0C);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            if (AbstractC25227BEk.A1U(c5Tl, -135984304)) {
                C0fH.A01(-360397627, "com.instagram.compose.igds.components.bulletcell.getIconColor (IgdsBulletCell.kt:139)");
            }
            if (z2) {
                j = AbstractC25227BEk.A0g(c5Tl, 1404826904).A0V;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, 1404872536).A0n;
            }
            if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                C0fH.A00(1060267867);
            }
            C117505Tk.A0L(c117505Tk, false);
            int i5 = i3 >> 3;
            C5YS.A01(c5Tl, null, c2dc, (i5 & 14) | 48, 20, j);
            c5Tl.ASW();
            Modifier A0B = AbstractC118175Wb.A0B(c1130158n, 12.0f, 0.0f, 12.0f);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A0B);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            A06(c5Tl, interfaceC30937Dir, (i3 & 14) | (i5 & 112), z2);
            c5Tl.Eno(1436647769);
            if (interfaceC30937Dir instanceof C26178Bi3) {
                String str = ((C26178Bi3) interfaceC30937Dir).A01;
                C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 4.0f, 0.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), str, A00(c5Tl, z2));
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(1436657232);
            if (interfaceC30937Dir instanceof C26176Bi1) {
                C26176Bi1 c26176Bi1 = (C26176Bi1) interfaceC30937Dir;
                C6HC.A01(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 4.0f, 0.0f, 0.0f), c26176Bi1.A00, AbstractC25226BEj.A0c(c5Tl), c26176Bi1.A02, AbstractC133095zb.A04("web_url_span"), 432, 3040, A00(c5Tl, z2));
            }
            if (AbstractC25233BEq.A1S(c5Tl, c117505Tk)) {
                C0fH.A00(1339681169);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 5, c2dc, interfaceC30937Dir, z2);
        }
    }

    public static final long A00(C5Tl c5Tl, boolean z) {
        boolean z2;
        long A0G;
        if (AbstractC25227BEk.A1U(c5Tl, -926970852)) {
            C0fH.A01(-965447358, "com.instagram.compose.igds.components.bulletcell.getTextColor (IgdsBulletCell.kt:148)");
        }
        if (z) {
            c5Tl.Eno(-497369083);
            z2 = false;
            A0G = AbstractC25226BEj.A08(c5Tl);
        } else {
            c5Tl.Eno(-497316724);
            z2 = false;
            A0G = AbstractC25226BEj.A0G(c5Tl);
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        if (AbstractC25227BEk.A1b(c117505Tk, z2)) {
            C0fH.A00(1423586182);
        }
        C117505Tk.A0L(c117505Tk, z2);
        return A0G;
    }

    public static void A04(C5Tl c5Tl, C2DC c2dc, String str, int i) {
        A02(c5Tl, c2dc, new C26178Bi3(str, C5YD.A00(c5Tl, i)));
    }

    public static final void A06(C5Tl c5Tl, InterfaceC30937Dir interfaceC30937Dir, int i, boolean z) {
        int i2;
        C118125Vw A0h;
        C117505Tk c117505Tk;
        c5Tl.Enr(-1301944578);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, interfaceC30937Dir, i) ? 1 : 0) | i;
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
                C0fH.A01(437878331, "com.instagram.compose.igds.components.bulletcell.PrimaryText (IgdsBulletCell.kt:110)");
            }
            if (interfaceC30937Dir instanceof C26175Bi0) {
                c5Tl.Eno(2018607115);
                C26175Bi0 c26175Bi0 = (C26175Bi0) interfaceC30937Dir;
                InterfaceC16660sJ interfaceC16660sJ = c26175Bi0.A01;
                if (interfaceC16660sJ != null) {
                    c5Tl.Eno(2018638115);
                    C6HC.A01(c5Tl, null, c26175Bi0.A00, AbstractC25226BEj.A0c(c5Tl), interfaceC16660sJ, AbstractC133095zb.A04("web_url_span"), 48, 3044, A00(c5Tl, z));
                } else {
                    c5Tl.Eno(2018924121);
                    C5WR.A01(c5Tl, null, c26175Bi0.A00, AbstractC25226BEj.A0c(c5Tl), 24570, A00(c5Tl, z));
                }
                c117505Tk = (C117505Tk) c5Tl;
                C117505Tk.A0I(c117505Tk);
            } else {
                c5Tl.Eno(2019100542);
                String obj = interfaceC30937Dir.BgQ().toString();
                long A00 = A00(c5Tl, z);
                if (C0fH.A02()) {
                    C0fH.A01(-1636931730, "com.instagram.compose.igds.components.bulletcell.getPrimaryTextStyle (IgdsBulletCell.kt:157)");
                }
                if ((interfaceC30937Dir instanceof C26177Bi2) && ((C26177Bi2) interfaceC30937Dir).A00 == 0) {
                    c5Tl.Eno(1613469074);
                    A0h = AbstractC25226BEj.A0c(c5Tl);
                } else {
                    c5Tl.Eno(1613415816);
                    A0h = AbstractC25226BEj.A0h(c5Tl);
                }
                c117505Tk = (C117505Tk) c5Tl;
                if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                    C0fH.A00(1792584781);
                }
                C5WR.A0u(c5Tl, A0h, obj, A00);
            }
            if (AbstractC25227BEk.A1a(c117505Tk)) {
                C0fH.A00(1573151855);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, interfaceC30937Dir, i, 5, z);
        }
    }
}
