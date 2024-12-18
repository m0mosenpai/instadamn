package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;

/* renamed from: X.CJa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27681CJa {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC11380iw interfaceC11380iw, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        c5Tl.Enr(-2019283437);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC11380iw);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, modifier);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1204523491, "com.instagram.opal.impl.ui.OpalFloatingSwitchButton (OpalFloatingSwitchButton.kt:99)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 2019719504);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25230BEn.A0R(!z);
                c5Tl.FBy(A0q);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            c5Tl.Eno(2019721287);
            if (z) {
                C0eB c0eB = C0eB.A00;
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A0q, 2019722709);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == obj) {
                    EEc = new PZG(A0q, (InterfaceC23621Ds) null, 14);
                    c5Tl.FBy(EEc);
                }
                C117505Tk.A0I(A0J);
                C5UX.A04(c5Tl, c0eB, (InterfaceC16620sF) EEc);
            }
            C117505Tk.A0I(A0J);
            Object AJX = c5Tl.AJX(C5VX.A00);
            C14360o3.A0C(AJX, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            UserSession userSession = (UserSession) AJX;
            if (z2) {
                c5Tl.Eno(-1812942213);
                i3 = 2131969046;
            } else {
                c5Tl.Eno(-1812862605);
                i3 = 2131969045;
            }
            String A00 = AbstractC136736Hc.A00(c5Tl, i3);
            C117505Tk.A0I(A0J);
            C0eB c0eB2 = C0eB.A00;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, interfaceC11380iw, AbstractC25227BEk.A1Z(c5Tl, userSession, 2019734622) | AbstractC25231BEo.A1K(i2), AbstractC25233BEq.A1K(i2));
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == obj) {
                EEc2 = new C43169J6n(interfaceC11380iw, userSession, str, (InterfaceC23621Ds) null, z2);
                c5Tl.FBy(EEc2);
            }
            C117505Tk.A0I(A0J);
            C5UX.A04(c5Tl, c0eB2, (InterfaceC16620sF) EEc2);
            if (AbstractC25235BEs.A1Z(c5Tl, new DT6(A0q, modifier, interfaceC16820sZ, A00, 1), 1606641105)) {
                C0fH.A00(-1400435988);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DU4(modifier, interfaceC11380iw, str, interfaceC16820sZ, i, z, z2);
        }
    }
}
