package X;

import java.util.List;

/* renamed from: X.LwR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49634LwR implements InterfaceC30956DjD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C26086BgF A02;
    public final /* synthetic */ KCY A03;
    public final /* synthetic */ C211689Zc A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C49634LwR(C26086BgF c26086BgF, KCY kcy, C211689Zc c211689Zc, List list, int i, long j, boolean z, boolean z2) {
        this.A03 = kcy;
        this.A05 = list;
        this.A07 = z;
        this.A00 = i;
        this.A04 = c211689Zc;
        this.A02 = c26086BgF;
        this.A01 = j;
        this.A06 = z2;
    }

    @Override // X.InterfaceC30956DjD
    public final void DRe(List list) {
        KCY kcy = this.A03;
        kcy.A0N = this.A05;
        InterfaceC50455MPj interfaceC50455MPj = kcy.A0D;
        if (interfaceC50455MPj != null) {
            List A00 = AbstractC46669Kkm.A00(list);
            boolean z = this.A07;
            int i = this.A00;
            interfaceC50455MPj.EON(this.A02, this.A04, A00, i, this.A01, z, this.A06);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
