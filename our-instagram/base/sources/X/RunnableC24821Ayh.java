package X;

/* renamed from: X.Ayh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24821Ayh implements Runnable {
    public final /* synthetic */ InterfaceC203698zY A00;
    public final /* synthetic */ C150156pL A01;
    public final /* synthetic */ C1819185b A02;
    public final /* synthetic */ Throwable A03;

    public RunnableC24821Ayh(InterfaceC203698zY interfaceC203698zY, C150156pL c150156pL, C1819185b c1819185b, Throwable th) {
        this.A01 = c150156pL;
        this.A00 = interfaceC203698zY;
        this.A02 = c1819185b;
        this.A03 = th;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SLV, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C150156pL c150156pL = this.A01;
        InterfaceC203698zY interfaceC203698zY = this.A00;
        C1819185b c1819185b = this.A02;
        ?? obj = new Object();
        obj.A00 = C05F.A05;
        obj.A02 = this.A03;
        C150156pL.A02(interfaceC203698zY, obj.A00(), c150156pL, c1819185b);
    }
}
