package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DYA extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DYA(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        super(2);
        this.A00 = i4;
        this.A0D = str;
        this.A09 = obj;
        this.A0B = obj2;
        this.A05 = obj3;
        this.A0E = z;
        this.A08 = obj4;
        this.A0C = obj5;
        this.A07 = obj6;
        this.A0F = z2;
        this.A06 = obj7;
        this.A0A = obj8;
        this.A04 = obj9;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A0D;
        Modifier modifier = (Modifier) this.A09;
        LazyListState lazyListState = (LazyListState) this.A0B;
        InterfaceC1333460b interfaceC1333460b = (InterfaceC1333460b) this.A05;
        boolean z = this.A0E;
        if (i != 0) {
            InterfaceC118275Wp interfaceC118275Wp = (InterfaceC118275Wp) this.A08;
            InterfaceC118225Wj interfaceC118225Wj = (InterfaceC118225Wj) this.A0C;
            C6MZ c6mz = (C6MZ) this.A07;
            boolean z2 = this.A0F;
            CG9.A00(c6mz, interfaceC118275Wp, interfaceC1333460b, lazyListState, A0S, interfaceC118225Wj, modifier, (C6L) this.A06, str, (InterfaceC16660sJ) this.A04, (InterfaceC16620sF) this.A0A, AbstractC25225BEi.A04(this.A01), AbstractC128295qy.A00(this.A02), this.A03, z, z2);
        } else {
            InterfaceC118305Ws interfaceC118305Ws = (InterfaceC118305Ws) this.A0C;
            InterfaceC118245Wl interfaceC118245Wl = (InterfaceC118245Wl) this.A08;
            C6MZ c6mz2 = (C6MZ) this.A07;
            boolean z3 = this.A0F;
            AbstractC28046CXy.A00(c6mz2, interfaceC118305Ws, interfaceC1333460b, lazyListState, A0S, interfaceC118245Wl, modifier, (C6L) this.A06, str, (InterfaceC16660sJ) this.A04, (InterfaceC16620sF) this.A0A, AbstractC25225BEi.A04(this.A01), AbstractC128295qy.A00(this.A02), this.A03, z, z3);
        }
        return C0eB.A00;
    }
}
