package X;

import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.DfI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30720DfI extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ C26780Bs3 A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30720DfI(C26780Bs3 c26780Bs3, List list, boolean z) {
        super(4);
        this.A01 = list;
        this.A00 = c26780Bs3;
        this.A02 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.Dle] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.BI3] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C5TR A01;
        String str;
        Modifier modifier;
        String str2;
        boolean z;
        C26780Bs3 c26780Bs3;
        InterfaceC16820sZ interfaceC16820sZ;
        C117505Tk c117505Tk;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        if ((A0H2 & 6) == 0) {
            i = A0H2 | AbstractC25232BEp.A0R(c5Tl, obj);
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
                AbstractC25225BEi.A1J(-379994991);
            }
            C26079Bg8 c26079Bg8 = (C26079Bg8) this.A01.get(A0H);
            c5Tl.Eno(-639520570);
            AbstractC46437Kgx abstractC46437Kgx = (AbstractC46437Kgx) c26079Bg8.A01;
            if (abstractC46437Kgx instanceof JS9) {
                c5Tl.Eno(-639452588);
                C2DB A00 = AbstractC43541zP.A00(c5Tl, ((JS9) abstractC46437Kgx).A00);
                String str3 = c26079Bg8.A04;
                String str4 = c26079Bg8.A03;
                C5YL c5yl = C5YJ.A00;
                c5Tl.Eno(949210109);
                C26780Bs3 c26780Bs32 = this.A00;
                boolean A1R = AbstractC25231BEo.A1R(c5Tl, c26780Bs32, c26079Bg8);
                Object EEc = c5Tl.EEc();
                if (A1R || EEc == C5UI.A00) {
                    EEc = new MHU(29, c26079Bg8, c26780Bs32);
                    c5Tl.FBy(EEc);
                }
                c117505Tk = (C117505Tk) c5Tl;
                z2 = false;
                C117505Tk.A0L(c117505Tk, false);
                BI4.A04(c5Tl, A00, c5yl, str3, str4, null, (InterfaceC16820sZ) EEc, C5UA.A01(c5Tl, new C30535DcI(9, c26780Bs32, c26079Bg8, this.A02), 1387390241), 0, 196614, 23532, false);
            } else {
                if (abstractC46437Kgx instanceof C43708JUt) {
                    c5Tl.Eno(949223643);
                    c26780Bs3 = this.A00;
                    A01 = C30713DfB.A00(c5Tl, c26780Bs3, abstractC46437Kgx, 2, 1797373566);
                    str = c26079Bg8.A04;
                    modifier = null;
                    str2 = c26079Bg8.A03;
                    z = false;
                    boolean A1W = AbstractC25233BEq.A1W(c5Tl, c26780Bs3, c26079Bg8, 949231005);
                    Object EEc2 = c5Tl.EEc();
                    if (A1W || EEc2 == C5UI.A00) {
                        EEc2 = new MHU(30, c26079Bg8, c26780Bs3);
                        c5Tl.FBy(EEc2);
                    }
                    interfaceC16820sZ = (InterfaceC16820sZ) EEc2;
                    c117505Tk = (C117505Tk) c5Tl;
                    z2 = false;
                    C117505Tk.A0L(c117505Tk, false);
                    i2 = -2049611707;
                    z3 = this.A02;
                    i3 = 10;
                } else if (abstractC46437Kgx instanceof KR5) {
                    c5Tl.Eno(949243159);
                    A01 = C5UA.A01(c5Tl, C30715DfD.A00(abstractC46437Kgx, 20), 1454489757);
                    str = c26079Bg8.A04;
                    modifier = null;
                    str2 = c26079Bg8.A03;
                    z = false;
                    c5Tl.Eno(949255357);
                    c26780Bs3 = this.A00;
                    boolean A1R2 = AbstractC25231BEo.A1R(c5Tl, c26780Bs3, c26079Bg8);
                    Object EEc3 = c5Tl.EEc();
                    if (A1R2 || EEc3 == C5UI.A00) {
                        EEc3 = new MHU(31, c26079Bg8, c26780Bs3);
                        c5Tl.FBy(EEc3);
                    }
                    interfaceC16820sZ = (InterfaceC16820sZ) EEc3;
                    c117505Tk = (C117505Tk) c5Tl;
                    z2 = false;
                    C117505Tk.A0L(c117505Tk, false);
                    i2 = 1902471780;
                    z3 = this.A02;
                    i3 = 11;
                } else {
                    throw AbstractC25233BEq.A0s(c5Tl, 949202652);
                }
                BI4.A02(c5Tl, modifier, modifier, modifier, str, str2, modifier, interfaceC16820sZ, A01, C5UA.A01(c5Tl, new C30535DcI(i3, c26780Bs3, c26079Bg8, z3), i2), 6, 6, 500, z, z);
            }
            C117505Tk.A0L(c117505Tk, z2);
            if (AbstractC25227BEk.A1b(c117505Tk, z2)) {
                C0fH.A00(1151474304);
            }
        }
        return C0eB.A00;
    }
}
