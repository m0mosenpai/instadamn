package X;

/* renamed from: X.EOm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32386EOm extends AbstractC193068gm {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C62862tP A01;
    public final /* synthetic */ C3BK A02;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        AbstractC167017dG.A1J(C18950wb.A01, "ig_ndx_show_flows_error", abstractC115105If.A01(), 817895070);
        this.A02.A02.A00(C05F.A05, Long.valueOf(System.currentTimeMillis() - this.A00));
    }

    public C32386EOm(C62862tP c62862tP, C3BK c3bk, long j) {
        this.A01 = c62862tP;
        this.A02 = c3bk;
        this.A00 = j;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        AbstractC33787EwD.A00(this.A01, AbstractC31175DnJ.A0E(obj));
        C3BK c3bk = this.A02;
        InterfaceC19610xo A0c = AbstractC31173DnH.A0c(C1AT.A01(c3bk.A01), C1AV.A2J);
        A0c.E7G("ndx_impression_timestamp", System.currentTimeMillis());
        A0c.apply();
        c3bk.A02.A00(C05F.A03, Long.valueOf(System.currentTimeMillis() - this.A00));
    }
}
