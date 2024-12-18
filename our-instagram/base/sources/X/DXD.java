package X;

import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* loaded from: classes5.dex */
public final class DXD extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C28374Cfc A02;
    public final /* synthetic */ MagicModLaunchParams A03;
    public final /* synthetic */ C25813BbU A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16620sF A08;
    public final /* synthetic */ InterfaceC16620sF A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXD(C28374Cfc c28374Cfc, MagicModLaunchParams magicModLaunchParams, C25813BbU c25813BbU, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A02 = c28374Cfc;
        this.A0B = z;
        this.A05 = str;
        this.A0A = z2;
        this.A08 = interfaceC16620sF;
        this.A07 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A09 = interfaceC16620sF2;
        this.A03 = magicModLaunchParams;
        this.A04 = c25813BbU;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C28374Cfc c28374Cfc = this.A02;
        boolean z = this.A0B;
        String str = this.A05;
        boolean z2 = this.A0A;
        InterfaceC16620sF interfaceC16620sF = this.A08;
        AbstractC28125CaY.A00(A0S, c28374Cfc, this.A03, this.A04, str, this.A07, this.A06, interfaceC16620sF, this.A09, AbstractC25225BEi.A04(this.A00), this.A01, z, z2);
        return C0eB.A00;
    }
}
