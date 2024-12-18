package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.DWs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30317DWs extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30317DWs(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(2);
        this.A00 = i3;
        this.A09 = obj;
        this.A0A = obj2;
        this.A06 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A08 = obj6;
        this.A07 = obj7;
        this.A03 = obj8;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                BTO bto = (BTO) this.A09;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A0A;
                AbstractC28495Cho.A03((CWS) this.A04, (CWT) this.A05, bto, A0S, (Modifier) this.A06, interfaceC16660sJ, (InterfaceC16620sF) this.A08, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                C5Hc c5Hc = (C5Hc) this.A08;
                Modifier modifier = (Modifier) this.A05;
                InterfaceC65696TsI interfaceC65696TsI = (InterfaceC65696TsI) this.A09;
                AbstractC28434Cgi.A02((LazyListState) this.A04, A0S2, modifier, (EnumC27376C6f) this.A0A, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A07, c5Hc, interfaceC65696TsI, (C19L) this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                AbstractC28476ChU.A06(AbstractC25226BEj.A0S(obj, obj2), (C26067Bfv) this.A0A, (InterfaceC16820sZ) this.A08, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A09, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A07, (InterfaceC16620sF) this.A05, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
