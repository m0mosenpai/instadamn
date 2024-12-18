package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.DfV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30733DfV extends C0YY implements InterfaceC16600sD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30733DfV(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(4);
        this.A00 = i;
        this.A03 = obj;
        this.A06 = z;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj5;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Modifier Eq3;
        Modifier Eq32;
        Modifier Eq33;
        InterfaceC16660sJ interfaceC16660sJ;
        C117505Tk A0K;
        InterfaceC16660sJ interfaceC16660sJ2;
        int i2;
        int i3;
        Modifier Eq34;
        C117505Tk A0K2;
        if (this.A00 != 0) {
            int A0H = AbstractC166987dD.A0H(obj2);
            C5Tl c5Tl = (C5Tl) obj3;
            if (AbstractC25229BEm.A1X(obj4)) {
                C0fH.A01(-921346009, "com.instagram.friendmap.view.compose.FriendMapPagerBottomSheet.<anonymous>.<anonymous>.<anonymous> (FriendMapPagerBottomSheet.kt:97)");
            }
            int ordinal = ((EnumC46249KdQ) AbstractC25225BEi.A13(this.A03, A0H)).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3 && ordinal != 4) {
                            throw AbstractC25233BEq.A0r(c5Tl, -2045311666);
                        }
                        c5Tl.Eno(-2045280091);
                        boolean z = this.A06;
                        c5Tl.Eno(-2045278510);
                        Object obj5 = this.A02;
                        boolean A1Y = AbstractC25226BEj.A1Y(c5Tl, z, c5Tl.AH6(obj5));
                        Object obj6 = this.A01;
                        boolean A1X = AbstractC25225BEi.A1X(c5Tl, obj6, A1Y);
                        Object EEc = c5Tl.EEc();
                        if (A1X || EEc == C5UI.A00) {
                            EEc = new D8O(17, obj6, obj5, z);
                            c5Tl.FBy(EEc);
                        }
                        A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                        AbstractC28058CYm.A01(c5Tl, (InterfaceC16820sZ) EEc, 0, 0, z);
                    } else {
                        c5Tl.Eno(-2045291993);
                        boolean z2 = this.A06;
                        c5Tl.Eno(-2045290350);
                        Object obj7 = this.A02;
                        boolean A1Y2 = AbstractC25226BEj.A1Y(c5Tl, z2, c5Tl.AH6(obj7));
                        Object obj8 = this.A01;
                        boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, obj8, A1Y2);
                        Object EEc2 = c5Tl.EEc();
                        if (A1X2 || EEc2 == C5UI.A00) {
                            EEc2 = new D8O(16, obj8, obj7, z2);
                            c5Tl.FBy(EEc2);
                        }
                        A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                        AbstractC28058CYm.A00(c5Tl, (InterfaceC16820sZ) EEc2, 0, 0, z2);
                    }
                } else {
                    c5Tl.Eno(1020118147);
                    c5Tl.Eno(-2045301473);
                    Object obj9 = this.A02;
                    boolean AH6 = c5Tl.AH6(obj9);
                    Object obj10 = this.A05;
                    boolean A1X3 = AbstractC25226BEj.A1X(c5Tl, obj10, AH6);
                    Object EEc3 = c5Tl.EEc();
                    if (A1X3 || EEc3 == C5UI.A00) {
                        EEc3 = new ME1(26, obj9, obj10);
                        c5Tl.FBy(EEc3);
                    }
                    A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                    CJ5.A00((InterfaceC16820sZ) EEc3, c5Tl, 0);
                }
            } else {
                c5Tl.Eno(-2045309773);
                C5Hc c5Hc = ((C45288K2q) AbstractC25226BEj.A1B(this.A04)).A01;
                c5Tl.Eno(-2045308223);
                Object obj11 = this.A05;
                boolean AH62 = c5Tl.AH6(obj11);
                Object EEc4 = c5Tl.EEc();
                if (AH62 || EEc4 == C5UI.A00) {
                    EEc4 = new C50158MDl(obj11, 25);
                    c5Tl.FBy(EEc4);
                }
                A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                CJ4.A00(c5Tl, (InterfaceC16820sZ) EEc4, c5Hc, 0);
            }
            if (AbstractC25227BEk.A1b(A0K2, false)) {
                i3 = -1399688162;
                C0fH.A00(i3);
            }
            return C0eB.A00;
        }
        int A0H2 = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl2 = (C5Tl) obj3;
        int A0H3 = AbstractC166987dD.A0H(obj4);
        if ((A0H3 & 6) == 0) {
            i = A0H3 | AbstractC25232BEp.A0R(c5Tl2, obj);
        } else {
            i = A0H3;
        }
        int i4 = 48;
        if ((A0H3 & 48) == 0) {
            i |= AbstractC25232BEp.A09(c5Tl2, A0H2);
        }
        if ((i & 147) == 146 && c5Tl2.Bxj()) {
            c5Tl2.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(226798441, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            Object A13 = AbstractC25225BEi.A13(this.A03, A0H2);
            int A02 = AbstractC25225BEi.A02(i);
            c5Tl2.Eno(-1286480116);
            boolean z3 = false;
            if (A13 instanceof C152646tr) {
                C1130158n A0N = AbstractC25225BEi.A0N(c5Tl2, -1286506250);
                if (!this.A06) {
                    i4 = 24;
                }
                Eq34 = AbstractC25226BEj.A0X(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(AbstractC118175Wb.A0A(A0N, 8.0f, i4), 1.0f), 28.0f), AbstractC25226BEj.A0K(c5Tl2)).Eq3(new LazyLayoutAnimateItemElement(AbstractC25236BEt.A0F()));
                AbstractC119685bS.A00(c5Tl2, Eq34);
            } else if (A13 instanceof C152626tp) {
                c5Tl2.Eno(-1285996889);
                if (!this.A06) {
                    Eq33 = AbstractC25225BEi.A0N(c5Tl2, -1285279456).Eq3(new LazyLayoutAnimateItemElement(AbstractC25236BEt.A0F()));
                    c5Tl2.Eno(1759657973);
                    Object obj12 = this.A02;
                    boolean AH63 = c5Tl2.AH6(obj12);
                    Object EEc5 = c5Tl2.EEc();
                    if (AH63 || EEc5 == C5UI.A00) {
                        EEc5 = AbstractC25235BEs.A13(c5Tl2, obj12, 48);
                    }
                    interfaceC16660sJ = (InterfaceC16660sJ) EEc5;
                    A0K = AbstractC25225BEi.A0K(c5Tl2, false);
                    interfaceC16660sJ2 = DL9.A00;
                    i2 = 384;
                } else {
                    c5Tl2.Eno(-1285989263);
                    Eq33 = ((Modifier) this.A01).Eq3(new LazyLayoutAnimateItemElement(AbstractC25236BEt.A0F()));
                    interfaceC16660sJ = DL8.A00;
                    c5Tl2.Eno(1759640376);
                    Object obj13 = this.A05;
                    boolean AH4 = c5Tl2.AH4(obj13);
                    Object obj14 = this.A02;
                    boolean A1X4 = AbstractC25226BEj.A1X(c5Tl2, obj14, AH4);
                    Object EEc6 = c5Tl2.EEc();
                    if (A1X4 || EEc6 == C5UI.A00) {
                        EEc6 = AbstractC25230BEn.A12(c5Tl2, obj14, obj13, 31);
                    }
                    interfaceC16660sJ2 = (InterfaceC16660sJ) EEc6;
                    A0K = AbstractC25225BEi.A0K(c5Tl2, false);
                    i2 = 6;
                }
                AbstractC28450Cgz.A02(c5Tl2, Eq33, interfaceC16660sJ, interfaceC16660sJ2, i2, 0);
                C117505Tk.A0L(A0K, false);
            } else if (A13 instanceof C152796u7) {
                c5Tl2.Eno(-1284387462);
                boolean z4 = this.A06;
                InterfaceC156146zi interfaceC156146zi = (InterfaceC156146zi) this.A02;
                Modifier modifier = Modifier.A00;
                if (z4) {
                    modifier = (Modifier) this.A01;
                }
                Eq32 = modifier.Eq3(new LazyLayoutAnimateItemElement(AbstractC25236BEt.A0F()));
                AbstractC28294Cdg.A01(c5Tl2, Eq32, interfaceC156146zi, 0, z4);
            } else if (A13 instanceof C152676tu) {
                Modifier A0N2 = AbstractC25225BEi.A0N(c5Tl2, -1284052817);
                boolean z5 = this.A06;
                if (z5) {
                    A0N2 = (Modifier) this.A01;
                }
                c5Tl2.Eno(1759705481);
                Object obj15 = this.A04;
                boolean AH42 = c5Tl2.AH4(obj15);
                int i5 = A02 & 112;
                if (((i5 ^ 48) > 32 && c5Tl2.AH2(A0H2)) || (A02 & 48) == 32) {
                    z3 = true;
                }
                boolean z6 = AH42 | z3;
                Object EEc7 = c5Tl2.EEc();
                if (z6 || EEc7 == C5UI.A00) {
                    EEc7 = new DHO(A0H2, 6, obj15);
                    c5Tl2.FBy(EEc7);
                }
                C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl2);
                Modifier A0X = AbstractC25229BEm.A0X(A0N2, (InterfaceC16660sJ) EEc7);
                Eq3 = A0N2.Eq3(new LazyLayoutAnimateItemElement(AbstractC25236BEt.A0F()));
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl2, A13, 1759697378);
                Object EEc8 = c5Tl2.EEc();
                if (A1Z || EEc8 == C5UI.A00) {
                    EEc8 = new C57508Pfi(A13, 32);
                    c5Tl2.FBy(EEc8);
                }
                C117505Tk.A0I(A0J);
                AbstractC28294Cdg.A00(c5Tl2, A0X, Eq3, (InterfaceC156146zi) this.A02, (InterfaceC16820sZ) EEc8, A0H2, i5, z5);
            } else {
                c5Tl2.Eno(1759712884);
            }
            if (AbstractC25227BEk.A1a(AbstractC25225BEi.A0J(c5Tl2))) {
                i3 = -2029317849;
                C0fH.A00(i3);
            }
        }
        return C0eB.A00;
    }
}
