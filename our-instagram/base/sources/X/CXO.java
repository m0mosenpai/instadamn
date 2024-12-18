package X;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public abstract class CXO {
    public static final void A01(C5Tl c5Tl, C26070Bfy c26070Bfy, InterfaceC16620sF interfaceC16620sF, InterfaceC16570sA interfaceC16570sA, int i) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(c26070Bfy, interfaceC16620sF, interfaceC16570sA);
        c5Tl.Enr(-621003040);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26070Bfy) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16570sA);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1568595168, "com.instagram.aistudio.editor.TemplateDetailsScreen (TemplateDetailsScreen.kt:54)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 381601980);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            long A09 = AbstractC25226BEj.A09(c5Tl);
            C5AH c5ah = C5AF.A00;
            Modifier A01 = C6L3.A01(c1130158n, c5ah, A09);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            Modifier A002 = C6GM.A00.A00(AbstractC28285CdX.A02(c5Tl, c1130158n), A1b);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            InterfaceC1127857k A003 = AbstractC119595bH.A00(interfaceC118305Ws, c5Tl, interfaceC118245Wl);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 46.0f, 44.0f, 46.0f, 24.0f);
            InterfaceC1127857k A005 = AbstractC119595bH.A00(interfaceC118305Ws, c5Tl, interfaceC118245Wl);
            int A006 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A014 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A006);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            AbstractC27526CCw.A00(c5Tl, (ImageUrl) c26070Bfy.A01, null, c26070Bfy.A02, c26070Bfy.A04, null, null, 0.6f, 1597488, 288, false, AbstractC25230BEn.A1X(interfaceC74953Yl));
            c5Tl.ASW();
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, 635916278);
            if (A0q3 == obj) {
                A0q3 = AbstractC25232BEp.A0w(c5Tl, 0);
            }
            C117505Tk.A0L(A0K, false);
            AnonymousClass693 A007 = A00(c5Tl);
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, c5Tl.EEc(), obj)).A00;
            Modifier A03 = AbstractC118175Wb.A03(C6L3.A01(AbstractC25231BEo.A0R(c1130158n, 44.0f), c5ah, C5XL.A00(c5Tl).A0f));
            int i3 = i2 & 14;
            boolean A1I = AbstractC25233BEq.A1I(i2) | AbstractC25233BEq.A1W(c5Tl, A007, c19l, 635929174) | AbstractC167007dF.A1P(i3, 4);
            Object EEc = c5Tl.EEc();
            if (A1I || EEc == obj) {
                EEc = new C29722D8s(A1b ? 1 : 0, c19l, A0q3, interfaceC16620sF, interfaceC74953Yl, A007, c26070Bfy);
                c5Tl.FBy(EEc);
            }
            Modifier A05 = C5XR.A05(A03, null, null, AbstractC25225BEi.A1A(A0K, EEc, false), A1b);
            InterfaceC1127857k A008 = AbstractC118375Wz.A00(AbstractC118255Wn.A02, c5Tl, C118195Wf.A04);
            boolean z = false;
            int A009 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(A0K);
            Modifier A015 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A008, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A009)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A009);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            C6LQ.A00(c5Tl, null, null, null, C5Y9.A00(A007, c5Tl), null, C5YD.A00(c5Tl, 2131952714), 0.0f, 0, 124);
            c5Tl.ASW();
            c5Tl.ASW();
            String A0010 = C5YD.A00(c5Tl, 2131952711);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 2135013728, i2);
            if (i3 == 4) {
                z = true;
            }
            boolean z2 = A1Q | z;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == obj) {
                EEc2 = C29897DGl.A00(c5Tl, interfaceC16570sA, c26070Bfy, 10);
            }
            AbstractC28506Chz.A0A(c5Tl, A0010, AbstractC25225BEi.A1A(A0K, EEc2, false), 3072, 24572);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-57493113);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c26070Bfy, interfaceC16570sA, interfaceC16620sF, i, 10);
        }
    }

    public static final AnonymousClass693 A00(C5Tl c5Tl) {
        if (AbstractC25227BEk.A1U(c5Tl, 511279966)) {
            C0fH.A01(-754184838, "com.instagram.aistudio.editor.getDiceDrawable (TemplateDetailsScreen.kt:123)");
        }
        Context A0K = AbstractC25228BEl.A0K(c5Tl);
        int color = A0K.getColor(AbstractC53242c7.A08(A0K));
        AnonymousClass693 A00 = C68U.A00((Context) C5WZ.A00(c5Tl, A0K).getValue(), R.raw.canvas_dice_animation);
        if (A00 != null) {
            C6PK.A00(new C56502ij(Color.red(color), Color.green(color), Color.blue(color), Color.alpha(color)), A00.A01);
        } else {
            A00 = null;
        }
        if (C0fH.A02()) {
            C0fH.A00(-1387006146);
        }
        AbstractC25225BEi.A1T(c5Tl);
        return A00;
    }
}
