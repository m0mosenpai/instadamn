package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXI extends C0YY implements InterfaceC16620sF {
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
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXI(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A09 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A06 = obj4;
        this.A0B = z;
        this.A07 = obj5;
        this.A08 = obj6;
        this.A0A = z2;
        this.A03 = obj7;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                Modifier modifier = (Modifier) this.A07;
                LazyListState lazyListState = (LazyListState) this.A08;
                InterfaceC1333460b interfaceC1333460b = (InterfaceC1333460b) this.A04;
                boolean z = this.A0A;
                InterfaceC118305Ws interfaceC118305Ws = (InterfaceC118305Ws) this.A09;
                InterfaceC118245Wl interfaceC118245Wl = (InterfaceC118245Wl) this.A06;
                C6IS.A01((C6MZ) this.A05, interfaceC118305Ws, interfaceC1333460b, lazyListState, A0S, interfaceC118245Wl, modifier, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A02), this.A01, z, this.A0B);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                Modifier modifier2 = (Modifier) this.A07;
                LazyListState lazyListState2 = (LazyListState) this.A08;
                InterfaceC1333460b interfaceC1333460b2 = (InterfaceC1333460b) this.A04;
                boolean z2 = this.A0A;
                InterfaceC118275Wp interfaceC118275Wp = (InterfaceC118275Wp) this.A06;
                InterfaceC118225Wj interfaceC118225Wj = (InterfaceC118225Wj) this.A09;
                C6IS.A00((C6MZ) this.A05, interfaceC118275Wp, interfaceC1333460b2, lazyListState2, A0S2, interfaceC118225Wj, modifier2, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A02), this.A01, z2, this.A0B);
                break;
            default:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC119655bO interfaceC119655bO = (InterfaceC119655bO) this.A09;
                InterfaceC137546La interfaceC137546La = (InterfaceC137546La) this.A04;
                InterfaceC137546La interfaceC137546La2 = (InterfaceC137546La) this.A05;
                C27866CQd c27866CQd = (C27866CQd) this.A06;
                boolean z3 = this.A0B;
                Integer num = (Integer) this.A07;
                CYF.A00(interfaceC119655bO, A0S3, (Modifier) this.A08, interfaceC137546La, interfaceC137546La2, c27866CQd, num, (Integer) this.A03, AbstractC25225BEi.A04(this.A02), this.A01, z3, this.A0A);
                break;
        }
        return C0eB.A00;
    }
}
