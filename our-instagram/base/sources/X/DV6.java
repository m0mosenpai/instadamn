package X;

import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.List;

/* loaded from: classes5.dex */
public final class DV6 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A07 = z;
        this.A05 = obj5;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 2:
                CQP cqp = (CQP) this.A03;
                C27829COs c27829COs = (C27829COs) this.A04;
                C25870BcR c25870BcR = (C25870BcR) this.A06;
                AbstractC28312Cdy.A02(A0S, (C28162Cb9) this.A02, c25870BcR, cqp, c27829COs, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A07);
                break;
            case 3:
                FPE fpe = (FPE) this.A02;
                File file = (File) this.A03;
                boolean z = this.A07;
                AbstractC28489Chh.A03(A0S, (ImageUrl) this.A06, (L7D) this.A04, fpe, file, (List) this.A05, AbstractC25225BEi.A04(this.A01), z);
                break;
            case 4:
                C27228Bzn c27228Bzn = (C27228Bzn) this.A06;
                LLR llr = (LLR) this.A03;
                AbstractC28417CgO.A03(A0S, (EnumC46298KeU) this.A02, llr, c27228Bzn, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A07);
                break;
            case 5:
                C51740MtP c51740MtP = (C51740MtP) this.A06;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                AbstractC28340CeS.A00(A0S, c51740MtP, (InterfaceC58202Pr8) this.A05, interfaceC16820sZ, (InterfaceC16820sZ) this.A03, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A07);
                break;
            default:
                C168497fj c168497fj = (C168497fj) this.A06;
                C169277h1 c169277h1 = (C169277h1) this.A03;
                C115925Mi c115925Mi = (C115925Mi) this.A02;
                AbstractC27587CFg.A00(A0S, c169277h1, (C166047bW) this.A04, c168497fj, c115925Mi, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A07);
                break;
        }
        return C0eB.A00;
    }
}
