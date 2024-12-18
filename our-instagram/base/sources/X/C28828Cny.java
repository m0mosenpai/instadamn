package X;

import java.util.List;

/* renamed from: X.Cny, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28828Cny implements InterfaceC1127857k {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CWQ A01;
    public final /* synthetic */ InterfaceC31114Dlw A02;
    public final /* synthetic */ C5C3 A03;
    public final /* synthetic */ InterfaceC1128957x A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A00(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A02(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A03(interfaceC1131259a, this, list, i);
    }

    public C28828Cny(CWQ cwq, InterfaceC31114Dlw interfaceC31114Dlw, C5C3 c5c3, InterfaceC1128957x interfaceC1128957x, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A01 = cwq;
        this.A05 = interfaceC16660sJ;
        this.A03 = c5c3;
        this.A02 = interfaceC31114Dlw;
        this.A04 = interfaceC1128957x;
        this.A00 = i;
    }

    @Override // X.InterfaceC1127857k
    public final int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        CWQ cwq = this.A01;
        cwq.A01.A00(interfaceC1131259a.getLayoutDirection());
        C126995od c126995od = cwq.A01.A00;
        if (c126995od != null) {
            return AbstractC122805hG.A00(c126995od.BPq());
        }
        throw AbstractC166987dD.A14("layoutIntrinsics must be called first");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    @Override // X.InterfaceC1127857k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC119205ac CpD(X.C59Z r33, java.util.List r34, long r35) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28828Cny.CpD(X.59Z, java.util.List, long):X.5ac");
    }
}
