package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CeE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28326CeE {
    public static final void A00(C5Tl c5Tl, InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, int i) {
        int i2;
        c5Tl.Enr(-2125438819);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c4nj) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, interfaceC55362gb);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1320906363, "com.instagram.quickpromotion.ui.megaphone.compose.BloksMegaphoneRowCompat (MegaphoneRow.kt:38)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -172508869);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new Object();
                c5Tl.FBy(A0q);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0T = AbstractC25226BEj.A0T(AbstractC25225BEi.A0O(c117505Tk));
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A0q, -172505209);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = AbstractC25230BEn.A10(c5Tl, A0q, 42);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc, false);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, A0q, -172501960) | AbstractC25231BEo.A1K(i2) | AbstractC25228BEl.A1R(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1Z2 || EEc2 == obj) {
                EEc2 = C30184DRp.A00(c5Tl, c4nj, A0q, interfaceC55362gb, 22);
            }
            AbstractC28450Cgz.A02(c5Tl, A0T, A1B, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), 48, 0);
            if (C0fH.A02()) {
                C0fH.A00(-841244525);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, interfaceC55362gb, c4nj, i, 4);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, int i) {
        int i2;
        AbstractC167017dG.A1N(c4nj, interfaceC55362gb);
        c5Tl.Enr(-1411192912);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c4nj) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, interfaceC55362gb);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1696007234, "com.instagram.quickpromotion.ui.megaphone.compose.MegaphoneRow (MegaphoneRow.kt:26)");
            }
            if (c4nj.A08.A00() != null) {
                c5Tl.Eno(1829816925);
                A00(c5Tl, interfaceC55362gb, c4nj, AbstractC25225BEi.A01(i2));
            } else {
                c5Tl.Eno(1829900098);
                A02(c5Tl, interfaceC55362gb, c4nj, AbstractC25225BEi.A01(i2));
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(-1506563913);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, interfaceC55362gb, c4nj, i, 5);
        }
    }

    public static final void A02(C5Tl c5Tl, InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        InterfaceC31034DkY interfaceC31034DkY;
        InterfaceC16820sZ interfaceC16820sZ;
        ImageUrl imageUrl;
        C2DB A00;
        String str;
        MUD mud;
        MUD mud2;
        c5Tl.Enr(1787854681);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c4nj) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, interfaceC55362gb);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-681503002, "com.instagram.quickpromotion.ui.megaphone.compose.NativeMegaphoneRow (MegaphoneRow.kt:53)");
            }
            C4NM c4nm = c4nj.A08;
            String str2 = c4nm.A09.A00;
            if (str2 == null) {
                str2 = "";
            }
            C117095Rs c117095Rs = c4nm.A03;
            if (c117095Rs != null) {
                String str3 = c117095Rs.A00;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = c4nj.A09.A00;
                if (C14360o3.A0K(str4, MSV.A00(192))) {
                    interfaceC31034DkY = C29184Ctp.A00;
                } else if (C14360o3.A0K(str4, MSV.A00(1615))) {
                    interfaceC31034DkY = C29185Ctq.A00;
                } else {
                    if (C0fH.A02()) {
                        C0fH.A00(-1509278203);
                    }
                    ASZ = c5Tl.ASZ();
                    if (ASZ == null) {
                        return;
                    } else {
                        i3 = 8;
                    }
                }
                InterfaceC31034DkY interfaceC31034DkY2 = interfaceC31034DkY;
                C4NV c4nv = c4nj.A08.A00;
                c5Tl.Eno(1685178539);
                if (c4nv == null) {
                    interfaceC16820sZ = null;
                } else {
                    boolean A1P = AbstractC25233BEq.A1P(c5Tl, 222312276, i2) | AbstractC167007dF.A1P(i2 & 14, 4);
                    Object EEc = c5Tl.EEc();
                    if (A1P || EEc == C5UI.A00) {
                        EEc = AbstractC25229BEm.A0z(c5Tl, c4nj, interfaceC55362gb, 24);
                    }
                    interfaceC16820sZ = (InterfaceC16820sZ) EEc;
                    AbstractC25225BEi.A1T(c5Tl);
                }
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C117505Tk.A0L(c117505Tk, false);
                C5Ry c5Ry = c4nj.A08.A07;
                if (c5Ry != null) {
                    imageUrl = c5Ry.A00;
                } else {
                    imageUrl = null;
                }
                c5Tl.Eno(1685183280);
                if (imageUrl == null) {
                    A00 = null;
                } else {
                    A00 = AbstractC43541zP.A00(c5Tl, imageUrl);
                }
                C117505Tk.A0L(c117505Tk, false);
                C4NM c4nm2 = c4nj.A08;
                C117115Ru c117115Ru = c4nm2.A05;
                if (c117115Ru != null) {
                    str = c117115Ru.A00;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                C4NV c4nv2 = c4nm2.A01;
                c5Tl.Eno(1685188781);
                if (c4nv2 == null) {
                    mud = null;
                } else {
                    String str5 = c4nv2.A00.A00;
                    if (str5 == null) {
                        str5 = "";
                    }
                    boolean A1P2 = AbstractC25233BEq.A1P(c5Tl, 222324377, i2) | AbstractC167007dF.A1P(i2 & 14, 4);
                    Object EEc2 = c5Tl.EEc();
                    if (A1P2 || EEc2 == C5UI.A00) {
                        EEc2 = AbstractC25229BEm.A0z(c5Tl, c4nj, interfaceC55362gb, 25);
                    }
                    C117505Tk.A0I(c117505Tk);
                    mud = new MUD(str5, (InterfaceC16820sZ) EEc2);
                }
                C117505Tk.A0L(c117505Tk, false);
                C4NV c4nv3 = c4nj.A08.A02;
                c5Tl.Eno(1685198415);
                if (c4nv3 == null) {
                    mud2 = null;
                } else {
                    String str6 = c4nv3.A00.A00;
                    if (str6 == null) {
                        str6 = "";
                    }
                    boolean A1P3 = AbstractC25233BEq.A1P(c5Tl, 222334011, i2) | AbstractC167007dF.A1P(i2 & 14, 4);
                    Object EEc3 = c5Tl.EEc();
                    if (A1P3 || EEc3 == C5UI.A00) {
                        EEc3 = AbstractC25229BEm.A0z(c5Tl, c4nj, interfaceC55362gb, 26);
                    }
                    mud2 = new MUD(str6, AbstractC25225BEi.A1A(c117505Tk, EEc3, false));
                }
                C117505Tk.A0L(c117505Tk, false);
                AbstractC28463ChF.A03(c5Tl, A00, mud, mud2, interfaceC31034DkY2, str2, str3, str, interfaceC16820sZ, 0, 0);
                C0eB c0eB = C0eB.A00;
                boolean A1P4 = AbstractC25233BEq.A1P(c5Tl, 1685214386, i2) | AbstractC25228BEl.A1R(i2);
                Object EEc4 = c5Tl.EEc();
                if (A1P4 || EEc4 == C5UI.A00) {
                    EEc4 = new PZI(interfaceC55362gb, c4nj, null, 6);
                    c5Tl.FBy(EEc4);
                }
                if (AbstractC25232BEp.A1V(c5Tl, c117505Tk, EEc4, c0eB, false)) {
                    C0fH.A00(-300172919);
                }
            } else {
                if (C0fH.A02()) {
                    C0fH.A00(-2079121733);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                } else {
                    i3 = 7;
                }
            }
            C30508Dbr.A01(ASZ, interfaceC55362gb, c4nj, i, i3);
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 6;
            C30508Dbr.A01(ASZ, interfaceC55362gb, c4nj, i, i3);
        }
    }
}
