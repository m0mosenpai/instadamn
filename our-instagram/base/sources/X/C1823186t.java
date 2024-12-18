package X;

/* renamed from: X.86t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1823186t implements InterfaceC12870lZ {
    public final /* synthetic */ C1822986r A00;
    public final /* synthetic */ C1M7 A01;

    public C1823186t(C1822986r c1822986r, C1M7 c1m7) {
        this.A01 = c1m7;
        this.A00 = c1822986r;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1973284109);
        this.A01.A01.A04(C05F.A00).execute(new RunnableC24297Aq2(this));
        C0f9.A0A(-1253873362, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1405426797, C0f9.A03(-2106551067));
    }
}
