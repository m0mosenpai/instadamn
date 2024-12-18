package X;

import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* loaded from: classes5.dex */
public final class DWF extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C28374Cfc A02;
    public final /* synthetic */ MagicModLaunchParams A03;
    public final /* synthetic */ C25810BbR A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ InterfaceC16620sF A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWF(C28374Cfc c28374Cfc, MagicModLaunchParams magicModLaunchParams, C25810BbR c25810BbR, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, int i2, boolean z) {
        super(2);
        this.A02 = c28374Cfc;
        this.A09 = z;
        this.A05 = str;
        this.A07 = interfaceC16620sF;
        this.A06 = interfaceC16820sZ;
        this.A08 = interfaceC16620sF2;
        this.A04 = c25810BbR;
        this.A03 = magicModLaunchParams;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C28374Cfc c28374Cfc = this.A02;
        boolean z = this.A09;
        String str = this.A05;
        InterfaceC16620sF interfaceC16620sF = this.A07;
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        InterfaceC16620sF interfaceC16620sF2 = this.A08;
        AbstractC28126CaZ.A00(A0S, c28374Cfc, this.A03, this.A04, str, interfaceC16820sZ, interfaceC16620sF, interfaceC16620sF2, AbstractC25225BEi.A04(this.A00), this.A01, z);
        return C0eB.A00;
    }
}
