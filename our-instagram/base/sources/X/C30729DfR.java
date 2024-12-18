package X;

import java.util.List;

/* renamed from: X.DfR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30729DfR extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ C27062Bwl A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30729DfR(C27062Bwl c27062Bwl, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z, boolean z2) {
        super(4);
        this.A01 = list;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A00 = c27062Bwl;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C117505Tk c117505Tk;
        boolean z;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        if ((A0H2 & 6) == 0) {
            i = AbstractC25232BEp.A0R(c5Tl, obj) | A0H2;
        } else {
            i = A0H2;
        }
        if ((A0H2 & 48) == 0) {
            i |= AbstractC25232BEp.A09(c5Tl, A0H);
        }
        if ((i & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                AbstractC25225BEi.A1J(-1361054492);
            }
            int i2 = i & 14;
            AbstractC151906sa abstractC151906sa = (AbstractC151906sa) this.A01.get(A0H);
            c5Tl.Eno(1792692749);
            if (this.A04) {
                c5Tl.Eno(1792716370);
                if (this.A05) {
                    c5Tl.Eno(1792740705);
                    c5Tl.Eno(-219261210);
                    InterfaceC16660sJ interfaceC16660sJ = this.A02;
                    boolean A1V = AbstractC25230BEn.A1V(c5Tl, interfaceC16660sJ, abstractC151906sa);
                    Object EEc = c5Tl.EEc();
                    if (A1V || EEc == C5UI.A00) {
                        EEc = AbstractC25229BEm.A0z(c5Tl, interfaceC16660sJ, abstractC151906sa, 16);
                    }
                    InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
                    c117505Tk = (C117505Tk) c5Tl;
                    z = false;
                    C117505Tk.A0I(c117505Tk);
                    c5Tl.Eno(-219259382);
                    InterfaceC16660sJ interfaceC16660sJ2 = this.A03;
                    boolean A1V2 = AbstractC25230BEn.A1V(c5Tl, interfaceC16660sJ2, abstractC151906sa);
                    Object EEc2 = c5Tl.EEc();
                    if (A1V2 || EEc2 == C5UI.A00) {
                        EEc2 = AbstractC25229BEm.A0z(c5Tl, interfaceC16660sJ2, abstractC151906sa, 17);
                    }
                    C117505Tk.A0I(c117505Tk);
                    AbstractC28324CeC.A01(c5Tl, abstractC151906sa, interfaceC16820sZ, (InterfaceC16820sZ) EEc2, (i2 >> 3) & 14);
                } else {
                    c5Tl.Eno(1792960216);
                    C27062Bwl c27062Bwl = this.A00;
                    c5Tl.Eno(-219252858);
                    InterfaceC16660sJ interfaceC16660sJ3 = this.A02;
                    boolean A1V3 = AbstractC25230BEn.A1V(c5Tl, interfaceC16660sJ3, abstractC151906sa);
                    Object EEc3 = c5Tl.EEc();
                    if (A1V3 || EEc3 == C5UI.A00) {
                        EEc3 = AbstractC25229BEm.A0z(c5Tl, interfaceC16660sJ3, abstractC151906sa, 18);
                    }
                    InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) EEc3;
                    c117505Tk = (C117505Tk) c5Tl;
                    z = false;
                    C117505Tk.A0L(c117505Tk, false);
                    c5Tl.Eno(-219251030);
                    InterfaceC16660sJ interfaceC16660sJ4 = this.A03;
                    boolean A1V4 = AbstractC25230BEn.A1V(c5Tl, interfaceC16660sJ4, abstractC151906sa);
                    Object EEc4 = c5Tl.EEc();
                    if (A1V4 || EEc4 == C5UI.A00) {
                        EEc4 = AbstractC25229BEm.A0z(c5Tl, interfaceC16660sJ4, abstractC151906sa, 19);
                    }
                    AbstractC28324CeC.A00(c5Tl, c27062Bwl, abstractC151906sa, interfaceC16820sZ2, AbstractC25225BEi.A1A(c117505Tk, EEc4, false), i2 & 112, 0);
                }
                C117505Tk.A0L(c117505Tk, z);
            } else {
                c5Tl.Eno(1793223220);
                AbstractC28324CeC.A00(c5Tl, this.A00, abstractC151906sa, null, null, i2 & 112, 12);
            }
            if (AbstractC25227BEk.A1a(AbstractC25225BEi.A0J(c5Tl))) {
                C0fH.A00(1274114711);
            }
        }
        return C0eB.A00;
    }
}
