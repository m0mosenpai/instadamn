package X;

import androidx.compose.ui.Modifier;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.DWu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30319DWu extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30319DWu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A0A = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
        this.A07 = obj7;
        this.A08 = obj8;
        this.A09 = obj9;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                ((C5TR) this.A0A).A08(AbstractC25226BEj.A0S(obj, obj2), this.A02, this.A03, this.A04, this.A05, this.A06, this.A07, this.A08, this.A09, AbstractC128295qy.A00(this.A01) | 1);
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C5Hc c5Hc = (C5Hc) this.A03;
                Modifier modifier = (Modifier) this.A04;
                C64842wi c64842wi = (C64842wi) this.A09;
                AbstractC28498Chr.A04(A0S, modifier, (CWX) this.A02, (C54781OIv) this.A0A, c64842wi, (InterfaceC16820sZ) this.A07, (InterfaceC16820sZ) this.A08, (InterfaceC16820sZ) this.A05, (InterfaceC16620sF) this.A06, c5Hc, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                C45119Jxo c45119Jxo = (C45119Jxo) this.A0A;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A05;
                InterfaceC30953DjA interfaceC30953DjA = (InterfaceC30953DjA) this.A04;
                InterfaceC30953DjA interfaceC30953DjA2 = (InterfaceC30953DjA) this.A07;
                InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) this.A09;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A06;
                AbstractC25709BXu.A01(A0S2, c45119Jxo, interfaceC30953DjA, interfaceC30953DjA2, (InterfaceC30953DjA) this.A08, (SettingsScreenViewModel) this.A03, interfaceC16660sJ, (InterfaceC16660sJ) this.A02, interfaceC16620sF, interfaceC16620sF2, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
