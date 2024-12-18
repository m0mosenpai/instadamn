package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.6Id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137006Id implements InterfaceC137016Ie {
    public final long A00;
    public final InterfaceC136996Ic A01;
    public final InterfaceC138146Ns A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ LazyListState A08;
    public final /* synthetic */ InterfaceC138146Ns A09;
    public final /* synthetic */ InterfaceC118245Wl A0A;
    public final /* synthetic */ InterfaceC118225Wj A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public C137006Id(InterfaceC136996Ic interfaceC136996Ic, LazyListState lazyListState, InterfaceC138146Ns interfaceC138146Ns, InterfaceC118245Wl interfaceC118245Wl, InterfaceC118225Wj interfaceC118225Wj, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        int i5;
        int A00;
        this.A0C = z;
        this.A09 = interfaceC138146Ns;
        this.A05 = i;
        this.A06 = i2;
        this.A0A = interfaceC118245Wl;
        this.A0B = interfaceC118225Wj;
        this.A0D = z2;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = j2;
        this.A08 = lazyListState;
        this.A01 = interfaceC136996Ic;
        this.A02 = interfaceC138146Ns;
        if (z) {
            i5 = Constraints.A01(j);
            A00 = Integer.MAX_VALUE;
        } else {
            i5 = Integer.MAX_VALUE;
            A00 = Constraints.A00(j);
        }
        this.A00 = C5AU.A04(0, i5, 0, A00);
    }

    public final C137036Ig A00(int i, long j) {
        int i2;
        InterfaceC136996Ic interfaceC136996Ic = this.A01;
        Object BKc = interfaceC136996Ic.BKc(i);
        Object ArA = interfaceC136996Ic.ArA(i);
        List CpC = this.A02.CpC(i, j);
        if (i == this.A05 - 1) {
            i2 = 0;
        } else {
            i2 = this.A06;
        }
        boolean z = this.A0C;
        return new C137036Ig(this.A08.A0D, this.A0A, this.A0B, this.A09.getLayoutDirection(), BKc, ArA, CpC, i, this.A04, this.A03, i2, this.A07, j, z, this.A0D);
    }

    @Override // X.InterfaceC137016Ie
    public final /* bridge */ /* synthetic */ C6Ih Abg(int i, int i2, int i3, long j) {
        return A00(i, j);
    }
}
