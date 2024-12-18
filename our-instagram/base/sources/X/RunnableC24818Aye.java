package X;

/* renamed from: X.Aye, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24818Aye implements Runnable {
    public final /* synthetic */ InterfaceC203698zY A00;
    public final /* synthetic */ SLV A01;
    public final /* synthetic */ C150156pL A02;
    public final /* synthetic */ C1819185b A03;

    public RunnableC24818Aye(InterfaceC203698zY interfaceC203698zY, SLV slv, C150156pL c150156pL, C1819185b c1819185b) {
        this.A02 = c150156pL;
        this.A00 = interfaceC203698zY;
        this.A03 = c1819185b;
        this.A01 = slv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C150156pL c150156pL = this.A02;
        C150156pL.A02(this.A00, this.A01.A00(), c150156pL, this.A03);
    }
}
