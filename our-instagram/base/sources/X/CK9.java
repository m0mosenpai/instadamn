package X;

/* loaded from: classes5.dex */
public abstract class CK9 {
    public static final void A00(C5Tl c5Tl, CPM cpm, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC167027dH.A13(interfaceC16820sZ2, interfaceC16820sZ3, cpm);
        c5Tl.Enr(1492715429);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, cpm);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1138131070, "com.instagram.schools.management.components.ErrorDialog (ErrorDialog.kt:17)");
            }
            if (AbstractC25230BEn.A1X(cpm.A00)) {
                interfaceC16820sZ2.invoke();
                C26079Bg8 c26079Bg8 = new C26079Bg8(C05F.A01, C5YD.A00(c5Tl, 2131960994), (InterfaceC16820sZ) null, 28);
                C26079Bg8 c26079Bg82 = new C26079Bg8(C05F.A00, C5YD.A00(c5Tl, 2131965052), interfaceC16820sZ, 12);
                c5Tl.Eno(-1434077876);
                boolean A1P = AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED) | AbstractC25231BEo.A1M(i2);
                Object EEc = c5Tl.EEc();
                if (A1P || EEc == C5UI.A00) {
                    EEc = AbstractC25235BEs.A19(c5Tl, interfaceC16820sZ3, cpm, 37);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC28433Cgh.A02(c5Tl, c26079Bg8, c26079Bg82, C5YD.A00(c5Tl, 2131963284), C5YD.A00(c5Tl, 2131963283), (InterfaceC16820sZ) EEc);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1051334337);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(cpm, interfaceC16820sZ, interfaceC16820sZ3, interfaceC16820sZ2, i, 20);
        }
    }
}
