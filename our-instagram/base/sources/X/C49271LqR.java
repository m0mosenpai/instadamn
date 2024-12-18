package X;

/* renamed from: X.LqR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49271LqR implements MQ3 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ L7X A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public C49271LqR(L7X l7x, String str, InterfaceC16660sJ interfaceC16660sJ, long j) {
        this.A01 = l7x;
        this.A02 = str;
        this.A03 = interfaceC16660sJ;
        this.A00 = j;
    }

    @Override // X.MQ3
    public final void DGm(C47621L1g c47621L1g) {
        L7X l7x = this.A01;
        l7x.A01.A00(this.A02, null, 119, 0);
        this.A03.invoke(c47621L1g);
        if (c47621L1g.A01 != null) {
            l7x.A00.A00(this.A00);
        }
    }

    @Override // X.MQ3
    public final void DGo(boolean z) {
        long j;
        L8o l8o = this.A01.A01;
        String str = this.A02;
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        l8o.A00(str, AbstractC43594JPz.A10(j), 118, 0);
    }
}
