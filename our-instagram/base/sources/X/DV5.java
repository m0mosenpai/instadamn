package X;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes5.dex */
public final class DV5 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A07 = obj;
        this.A06 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A04 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28005CWc.A00((C5Y5) this.A03, (BTO) this.A07, A0S, (Modifier) this.A06, (InterfaceC16660sJ) this.A05, (InterfaceC16610sE) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC30915DiS interfaceC30915DiS = (InterfaceC30915DiS) this.A07;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
                AbstractC28453Ch3.A00((CW4) this.A03, A0S2, (Modifier) this.A05, interfaceC30915DiS, interfaceC16820sZ, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 2:
                AbstractC28450Cgz.A03(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A07, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 3:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                Modifier modifier = (Modifier) this.A05;
                Bf4 bf4 = (Bf4) this.A04;
                AbstractC28382Cfl.A02((Drawable) this.A03, A0S3, modifier, bf4, (InterfaceC16660sJ) this.A07, (InterfaceC16620sF) this.A06, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 4:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC166367c5 interfaceC166367c5 = (InterfaceC166367c5) this.A04;
                InterfaceC166407c9 interfaceC166407c9 = (InterfaceC166407c9) this.A03;
                InterfaceC30989Djo interfaceC30989Djo = (InterfaceC30989Djo) this.A07;
                CFw.A00(A0S4, (Modifier) this.A05, interfaceC166407c9, (C25814BbV) this.A06, interfaceC166367c5, interfaceC30989Djo, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 5:
                C5Tl A0S5 = AbstractC25226BEj.A0S(obj, obj2);
                C114205Dh c114205Dh = (C114205Dh) this.A04;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A03;
                InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) this.A06;
                AbstractC28416CgM.A01(A0S5, c114205Dh, (C25997Bel) this.A05, (InterfaceC16660sJ) this.A07, interfaceC16620sF, interfaceC16620sF2, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 6:
                CY5.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC137546La) this.A05, (InterfaceC137546La) this.A06, (C25875Bca) this.A03, (Integer) this.A04, (InterfaceC16660sJ) this.A07, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 7:
                C5Tl A0S6 = AbstractC25226BEj.A0S(obj, obj2);
                C5Hc c5Hc = (C5Hc) this.A04;
                AbstractC28304Cdq.A01(A0S6, (EnumC27404C7h) this.A03, (InterfaceC16820sZ) this.A06, (InterfaceC16820sZ) this.A07, (InterfaceC16660sJ) this.A05, c5Hc, this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 8:
                C5Tl A0S7 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16620sF interfaceC16620sF3 = (InterfaceC16620sF) this.A04;
                InterfaceC16620sF interfaceC16620sF4 = (InterfaceC16620sF) this.A03;
                InterfaceC16620sF interfaceC16620sF5 = (InterfaceC16620sF) this.A06;
                AbstractC27628CGz.A00(A0S7, (InterfaceC118225Wj) this.A07, (Modifier) this.A05, interfaceC16620sF3, interfaceC16620sF4, interfaceC16620sF5, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 9:
                C5Tl A0S8 = AbstractC25226BEj.A0S(obj, obj2);
                C28224CcU c28224CcU = (C28224CcU) this.A03;
                MagicModPostCaptureTransform magicModPostCaptureTransform = (MagicModPostCaptureTransform) this.A06;
                CYG.A01(A0S8, (C9G) this.A04, c28224CcU, magicModPostCaptureTransform, (InterfaceC16660sJ) this.A07, (InterfaceC16610sE) this.A05, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 10:
                C5Tl A0S9 = AbstractC25226BEj.A0S(obj, obj2);
                EnumC193878i8 enumC193878i8 = (EnumC193878i8) this.A06;
                MagicModLaunchParams magicModLaunchParams = (MagicModLaunchParams) this.A04;
                CHR.A00(A0S9, (C28224CcU) this.A03, magicModLaunchParams, enumC193878i8, (C25798BbF) this.A07, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 11:
                C5Tl A0S10 = AbstractC25226BEj.A0S(obj, obj2);
                C28224CcU c28224CcU2 = (C28224CcU) this.A03;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                InterfaceC16620sF interfaceC16620sF6 = (InterfaceC16620sF) this.A06;
                AbstractC28437Cgl.A02(A0S10, c28224CcU2, (MagicModPostCaptureTransform) this.A04, interfaceC16660sJ, (InterfaceC16660sJ) this.A07, interfaceC16620sF6, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C5Tl A0S11 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A05;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A06;
                CYM.A01(A0S11, (C25338BJh) this.A03, (C3I9) this.A04, (C25801BbI) this.A07, interfaceC16820sZ2, interfaceC16660sJ2, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                AbstractC27692CJl.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (ImageUrl) this.A03, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A06, (InterfaceC16660sJ) this.A07, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
