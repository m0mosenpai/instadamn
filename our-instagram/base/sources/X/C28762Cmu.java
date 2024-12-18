package X;

import java.util.List;

/* renamed from: X.Cmu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28762Cmu implements InterfaceC137016Ie {
    public final InterfaceC138146Ns A00;
    public final InterfaceC31144Dmj A01;
    public final C27853CPq A02;
    public final boolean A03;
    public final /* synthetic */ CUT A04;

    public C28762Cmu(InterfaceC138146Ns interfaceC138146Ns, InterfaceC31144Dmj interfaceC31144Dmj, CUT cut, C27853CPq c27853CPq, boolean z) {
        this.A04 = cut;
        this.A03 = z;
        this.A01 = interfaceC31144Dmj;
        this.A00 = interfaceC138146Ns;
        this.A02 = c27853CPq;
    }

    public final C28761Cmt A00(int i, long j) {
        int i2;
        long A00;
        InterfaceC31144Dmj interfaceC31144Dmj = this.A01;
        Object BKc = interfaceC31144Dmj.BKc(i);
        Object ArA = interfaceC31144Dmj.ArA(i);
        C27853CPq c27853CPq = this.A02;
        int[] iArr = c27853CPq.A01;
        int length = iArr.length;
        int A06 = AbstractC25225BEi.A06(j);
        int i3 = length - 1;
        int i4 = A06;
        if (A06 > i3) {
            i4 = i3;
        }
        int A02 = AbstractC25228BEl.A02(j) - A06;
        int i5 = length - i4;
        if (A02 > i5) {
            A02 = i5;
        }
        if (A02 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = c27853CPq.A00;
            int i6 = (i4 + A02) - 1;
            i2 = (iArr2[i6] + iArr[i6]) - iArr2[i4];
        }
        if (this.A03) {
            A00 = AbstractC119035aK.A01(i2);
        } else {
            A00 = AbstractC119035aK.A00(i2);
        }
        List CpC = this.A00.CpC(i, A00);
        CUT cut = this.A04;
        return new C28761Cmt(cut.A0C.A09, BKc, ArA, CpC, i, cut.A04, i4, A02, cut.A01, cut.A00, A00, cut.A0G);
    }

    @Override // X.InterfaceC137016Ie
    public final /* bridge */ /* synthetic */ C6Ih Abg(int i, int i2, int i3, long j) {
        InterfaceC31144Dmj interfaceC31144Dmj = this.A01;
        Object BKc = interfaceC31144Dmj.BKc(i);
        Object ArA = interfaceC31144Dmj.ArA(i);
        List CpC = this.A00.CpC(i, j);
        CUT cut = this.A04;
        boolean z = cut.A0G;
        return new C28761Cmt(cut.A0C.A09, BKc, ArA, CpC, i, cut.A04, i2, i3, cut.A01, cut.A00, j, z);
    }
}
