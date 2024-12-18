package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.DXa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30325DXa extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C28370CfW A04;
    public final /* synthetic */ IGAIAgentType A05;
    public final /* synthetic */ EnumC39618HeS A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30325DXa(C28370CfW c28370CfW, IGAIAgentType iGAIAgentType, EnumC39618HeS enumC39618HeS, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4) {
        super(2);
        this.A04 = c28370CfW;
        this.A03 = i;
        this.A0B = str;
        this.A08 = str2;
        this.A0A = str3;
        this.A0C = str4;
        this.A0D = str5;
        this.A07 = num;
        this.A05 = iGAIAgentType;
        this.A09 = str6;
        this.A06 = enumC39618HeS;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C28370CfW c28370CfW = this.A04;
        int i = this.A03;
        String str = this.A0B;
        String str2 = this.A08;
        String str3 = this.A0A;
        String str4 = this.A0C;
        String str5 = this.A0D;
        Integer num = this.A07;
        CD1.A00(A0S, c28370CfW, this.A05, this.A06, num, str, str2, str3, str4, str5, this.A09, i, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), this.A02);
        return C0eB.A00;
    }
}
