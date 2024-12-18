package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ChallengeButtonInfo;

/* loaded from: classes5.dex */
public final class DUR extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUR(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A06 = str;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                InterfaceC30795DgW interfaceC30795DgW = (InterfaceC30795DgW) this.A05;
                int i2 = this.A02;
                AbstractC27513CCj.A00(A0S, interfaceC30795DgW, this.A06, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A03, i2, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                C6HC.A02(A0S, (C127055oj) this.A05, this.A06, (InterfaceC16660sJ) this.A04, (C5Hc) this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 2:
                C29229CuY c29229CuY = (C29229CuY) this.A04;
                AbstractC28305Cdr.A02(A0S, (Modifier) this.A05, (C5YL) this.A03, c29229CuY, this.A06, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 3:
                String str = this.A06;
                AbstractC28392Cfv.A00(A0S, (Modifier) this.A04, (ChallengeButtonInfo) this.A03, str, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 4:
                String str2 = this.A06;
                CJM.A00(A0S, (Modifier) this.A03, (C6GC) this.A05, str2, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                AbstractC28470ChM.A03(A0S, (Modifier) this.A04, (C2DC) this.A03, this.A06, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
