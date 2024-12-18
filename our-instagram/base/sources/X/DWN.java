package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

/* loaded from: classes5.dex */
public final class DWN extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWN(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A07 = obj2;
        this.A08 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
        this.A06 = obj6;
        this.A09 = z;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                InterfaceC132185xw interfaceC132185xw = (InterfaceC132185xw) this.A04;
                C38641Gyi c38641Gyi = (C38641Gyi) this.A03;
                AbstractC28036CXk.A00(A0S, (Modifier) this.A05, (LineType) this.A07, interfaceC132185xw, c38641Gyi, (C25982BeW) this.A08, (InterfaceC16820sZ) this.A06, AbstractC25225BEi.A04(this.A01), this.A02, this.A09);
                break;
            case 1:
                InterfaceC30813Dgo interfaceC30813Dgo = (InterfaceC30813Dgo) this.A08;
                Modifier modifier = (Modifier) this.A04;
                boolean z = this.A09;
                AbstractC28308Cdu.A00(A0S, modifier, interfaceC30813Dgo, (MagicModPostCaptureTransform) this.A03, (InterfaceC16820sZ) this.A06, (InterfaceC16620sF) this.A07, (InterfaceC16620sF) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, z);
                break;
            default:
                Modifier modifier2 = (Modifier) this.A04;
                C26071Bg0 c26071Bg0 = (C26071Bg0) this.A07;
                C25870BcR c25870BcR = (C25870BcR) this.A08;
                C27829COs c27829COs = (C27829COs) this.A05;
                AbstractC28312Cdy.A00(A0S, modifier2, (C28162Cb9) this.A03, c26071Bg0, c25870BcR, c27829COs, (InterfaceC16820sZ) this.A06, AbstractC25225BEi.A04(this.A01), this.A02, this.A09);
                break;
        }
        return C0eB.A00;
    }
}
