package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ChallengeDetails;

/* loaded from: classes5.dex */
public final class DUT extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUT(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A06 = str;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28473ChR.A01(A0S, (Modifier) this.A03, (C28370CfW) this.A02, this.A06, (InterfaceC16660sJ) this.A04, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                String str = this.A06;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A03;
                AbstractC28390Cft.A01(A0S, (C61) this.A05, (EnumC193878i8) this.A02, str, interfaceC16820sZ, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01));
                break;
            case 2:
                AbstractC28392Cfv.A03(A0S, (ChallengeDetails) this.A02, this.A06, (InterfaceC16660sJ) this.A04, (InterfaceC16600sD) this.A03, (InterfaceC16600sD) this.A05, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                String str2 = this.A06;
                CYT.A00(A0S, (C26080Bg9) this.A05, str2, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A02, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
