package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.D8n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29717D8n extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29717D8n(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A04 = obj2;
        this.A05 = str;
        this.A03 = obj3;
        this.A01 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        IGAIAgentType iGAIAgentType;
        switch (this.A00) {
            case 0:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                C26021BfA c26021BfA = (C26021BfA) this.A03;
                interfaceC16660sJ.invoke(c26021BfA);
                C28370CfW c28370CfW = (C28370CfW) this.A02;
                int i = this.A01;
                String str = c26021BfA.A07;
                AbstractC27461CAe abstractC27461CAe = c26021BfA.A00;
                String A01 = abstractC27461CAe.A01();
                String str2 = c26021BfA.A06;
                String str3 = this.A05;
                c28370CfW.A02(abstractC27461CAe.A00(), Integer.valueOf(i), str, A01, str2, "home", str3, null, c26021BfA.A03, i);
                break;
            case 1:
            case 2:
            default:
                C28370CfW c28370CfW2 = (C28370CfW) this.A02;
                C26015Bf3 c26015Bf3 = (C26015Bf3) this.A03;
                AbstractC27461CAe abstractC27461CAe2 = c26015Bf3.A00;
                String A03 = abstractC27461CAe2.A03();
                C14360o3.A0B(A03, 0);
                C25531Mh A00 = C28370CfW.A00(c28370CfW2);
                if (AbstractC25226BEj.A1Z(A00)) {
                    A00.A0k("your_ais_row_clicked");
                    A00.A0i(AbstractC166997dE.A0j(A03));
                    C28370CfW.A01(A00, c28370CfW2);
                }
                String str4 = c26015Bf3.A03;
                String A032 = abstractC27461CAe2.A03();
                String str5 = c26015Bf3.A02;
                if (abstractC27461CAe2 instanceof C26682BqP) {
                    iGAIAgentType = IGAIAgentType.A04;
                } else {
                    iGAIAgentType = IGAIAgentType.A08;
                }
                c28370CfW2.A02(iGAIAgentType, null, A032, str5, str4, "seeAll", this.A05, null, null, this.A01);
                AbstractC25225BEi.A1U(this.A04, c26015Bf3);
                break;
            case 3:
                AbstractC25227BEk.A1A((InterfaceC74953Yl) this.A02, false);
                ((InterfaceC74953Yl) this.A04).Egh(this.A05);
                AbstractC25227BEk.A19((InterfaceC74953Yl) this.A03, this.A01);
                break;
        }
        return C0eB.A00;
    }
}
