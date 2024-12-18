package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import java.util.List;

/* loaded from: classes5.dex */
public final class CUT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final InterfaceC138146Ns A07;
    public final InterfaceC31144Dmj A08;
    public final C28282CdU A09;
    public final C28762Cmu A0A;
    public final C27853CPq A0B;
    public final LazyStaggeredGridState A0C;
    public final C5BH A0D;
    public final List A0E;
    public final C19L A0F;
    public final boolean A0G;
    public final boolean A0H;

    public CUT(InterfaceC138146Ns interfaceC138146Ns, InterfaceC31144Dmj interfaceC31144Dmj, C27853CPq c27853CPq, LazyStaggeredGridState lazyStaggeredGridState, C5BH c5bh, List list, C19L c19l, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        this.A0C = lazyStaggeredGridState;
        this.A0E = list;
        this.A08 = interfaceC31144Dmj;
        this.A0B = c27853CPq;
        this.A05 = j;
        this.A0G = z;
        this.A07 = interfaceC138146Ns;
        this.A03 = i;
        this.A06 = j2;
        this.A01 = i2;
        this.A00 = i3;
        this.A0H = z2;
        this.A04 = i4;
        this.A0F = c19l;
        this.A0D = c5bh;
        this.A0A = new C28762Cmu(interfaceC138146Ns, interfaceC31144Dmj, this, c27853CPq, z);
        this.A09 = lazyStaggeredGridState.A0C;
        this.A02 = c27853CPq.A01.length;
    }

    public final long A00(InterfaceC31144Dmj interfaceC31144Dmj, int i, int i2) {
        int i3;
        if (((C28768Cn0) interfaceC31144Dmj).A01.A01.A00(i)) {
            i3 = this.A02;
            i2 = 0;
        } else {
            i3 = 1;
        }
        return ((i3 + i2) & 4294967295L) | (i2 << 32);
    }
}
