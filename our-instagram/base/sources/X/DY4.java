package X;

import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* loaded from: classes5.dex */
public final class DY4 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DY4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, String str, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        super(2);
        this.A00 = i4;
        this.A07 = obj;
        this.A06 = obj2;
        this.A0C = str;
        this.A0D = z;
        this.A04 = obj3;
        this.A09 = obj4;
        this.A08 = obj5;
        this.A0A = obj6;
        this.A05 = obj7;
        this.A0E = z2;
        this.A0B = obj8;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            EnumC193878i8 enumC193878i8 = (EnumC193878i8) this.A07;
            C28374Cfc c28374Cfc = (C28374Cfc) this.A06;
            String str = this.A0C;
            boolean z = this.A0D;
            C3I9 c3i9 = (C3I9) this.A04;
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A09;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A08;
            InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) this.A0A;
            CHQ.A00(A0S, c3i9, c28374Cfc, (MagicModLaunchParams) this.A05, enumC193878i8, (C25803BbK) this.A0B, str, interfaceC16820sZ, interfaceC16620sF, interfaceC16620sF2, AbstractC25225BEi.A04(this.A01), AbstractC128295qy.A00(this.A02), this.A03, z, this.A0E);
        } else {
            String str2 = this.A0C;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A09;
            InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A08;
            EnumC168517fl enumC168517fl = (EnumC168517fl) this.A04;
            C169277h1 c169277h1 = (C169277h1) this.A06;
            C115925Mi c115925Mi = (C115925Mi) this.A05;
            boolean z2 = this.A0E;
            boolean z3 = this.A0D;
            AbstractC27586CFf.A00(A0S, enumC168517fl, c169277h1, (C168497fj) this.A0B, c115925Mi, str2, (InterfaceC16820sZ) this.A07, interfaceC16660sJ, interfaceC16660sJ2, (InterfaceC16660sJ) this.A0A, AbstractC25225BEi.A04(this.A01), AbstractC128295qy.A00(this.A02), this.A03, z2, z3);
        }
        return C0eB.A00;
    }
}
