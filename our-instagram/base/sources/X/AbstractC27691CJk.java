package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;

/* renamed from: X.CJk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27691CJk {
    public static final void A00(C5Hc c5Hc, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(c5Hc, 0);
        c5Tl.Enr(-1588544858);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2117787334, "com.instagram.profile.fragment.HighlightCardPreview (HighlightCardPreview.kt:32)");
            }
            long A06 = AbstractC25226BEj.A06(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0D = AbstractC118175Wb.A0D(AbstractC118185Wd.A08(c1130158n, 180.0f), 16.0f, 30.0f, 0.0f);
            InterfaceC1127857k A00 = AbstractC118375Wz.A00(AbstractC118255Wn.A02, c5Tl, C118195Wf.A04);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0D);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, c5Hc, 496949772);
            int i3 = 0;
            while (A0x.hasNext()) {
                Object next = A0x.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C09530e4 c09530e4 = (C09530e4) next;
                if (i3 < 2) {
                    c5Tl.Eno(382475531);
                    Modifier A0X = AbstractC25228BEl.A0X(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 100.0f), 180.0f), 12.0f);
                    InterfaceC1127857k A003 = C5XX.A00(C118195Wf.A06, false);
                    int A004 = C5X2.A00(c5Tl);
                    C59P A042 = C117505Tk.A04(c117505Tk);
                    Modifier A012 = C5X3.A01(c5Tl, A0X);
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A003, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
                    }
                    C5XJ.A00(c5Tl, A012, A1K);
                    C119645bN c119645bN = C119645bN.A00;
                    C6LQ.A09(c5Tl, c119645bN.Cng(c1130158n), AbstractC43541zP.A00(c5Tl, (ImageUrl) c09530e4.A01), C5YJ.A03);
                    C5WR.A0K(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 12.0f), null, (String) c09530e4.A00, 3120, 32624, AbstractC25226BEj.A08(c5Tl), AbstractC118155Vz.A01(14));
                    c5Tl.ASW();
                    if (i3 != AbstractC25226BEj.A05(c5Hc)) {
                        AbstractC25227BEk.A16(c5Tl, c1130158n, 8.0f);
                    }
                } else if (i3 == 2) {
                    c5Tl.Eno(383506374);
                    Modifier A013 = C6L2.A01(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 50.0f), 180.0f), C5WF.A02(12.0f, 0.0f, 0.0f, 12.0f));
                    c5Tl.Eno(-1373095266);
                    boolean AH3 = c5Tl.AH3(A06);
                    Object EEc = c5Tl.EEc();
                    if (AH3 || EEc == C5UI.A00) {
                        EEc = new JXD(A06, 9);
                        c5Tl.FBy(EEc);
                    }
                    Modifier A0A = AbstractC25233BEq.A0A(c117505Tk, A013, EEc);
                    InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                    int A005 = C5X2.A00(c5Tl);
                    C59P A043 = C117505Tk.A04(c117505Tk);
                    Modifier A014 = C5X3.A01(c5Tl, A0A);
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
                    }
                    C5XJ.A00(c5Tl, A014, A1K);
                    C119645bN c119645bN2 = C119645bN.A00;
                    C2DB A006 = AbstractC43541zP.A00(c5Tl, (ImageUrl) ((C09530e4) c5Hc.get(2)).A01);
                    C6LQ.A00(c5Tl, C118195Wf.A0B, C6L2.A00(c119645bN2.Cng(c1130158n)), null, A006, C5YJ.A00, null, 0.0f, 27704, 96);
                    c5Tl.ASW();
                } else {
                    c5Tl.Eno(384530800);
                }
                C117505Tk.A0L(c117505Tk, false);
                i3 = i4;
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-454963904);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c5Hc, i, 35);
        }
    }
}
