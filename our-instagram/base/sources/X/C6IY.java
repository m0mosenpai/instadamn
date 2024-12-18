package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.6IY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IY extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C6MZ A04;
    public final /* synthetic */ InterfaceC118275Wp A05;
    public final /* synthetic */ InterfaceC118305Ws A06;
    public final /* synthetic */ InterfaceC1333460b A07;
    public final /* synthetic */ LazyListState A08;
    public final /* synthetic */ InterfaceC118245Wl A09;
    public final /* synthetic */ InterfaceC118225Wj A0A;
    public final /* synthetic */ Modifier A0B;
    public final /* synthetic */ InterfaceC16660sJ A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6IY(C6MZ c6mz, InterfaceC118275Wp interfaceC118275Wp, InterfaceC118305Ws interfaceC118305Ws, InterfaceC1333460b interfaceC1333460b, LazyListState lazyListState, InterfaceC118245Wl interfaceC118245Wl, InterfaceC118225Wj interfaceC118225Wj, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A0B = modifier;
        this.A08 = lazyListState;
        this.A07 = interfaceC1333460b;
        this.A0E = z;
        this.A0D = z2;
        this.A04 = c6mz;
        this.A0F = z3;
        this.A03 = i;
        this.A09 = interfaceC118245Wl;
        this.A06 = interfaceC118305Ws;
        this.A0A = interfaceC118225Wj;
        this.A05 = interfaceC118275Wp;
        this.A0C = interfaceC16660sJ;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Modifier modifier = this.A0B;
        LazyListState lazyListState = this.A08;
        InterfaceC1333460b interfaceC1333460b = this.A07;
        boolean z = this.A0E;
        boolean z2 = this.A0D;
        C6MZ c6mz = this.A04;
        boolean z3 = this.A0F;
        int i = this.A03;
        InterfaceC118245Wl interfaceC118245Wl = this.A09;
        InterfaceC118305Ws interfaceC118305Ws = this.A06;
        InterfaceC118225Wj interfaceC118225Wj = this.A0A;
        C6IT.A00(c6mz, this.A05, interfaceC118305Ws, interfaceC1333460b, lazyListState, (C5Tl) obj, interfaceC118245Wl, interfaceC118225Wj, modifier, this.A0C, i, AbstractC128295qy.A00(this.A00 | 1), AbstractC128295qy.A00(this.A01), this.A02, z, z2, z3);
        return C0eB.A00;
    }
}
