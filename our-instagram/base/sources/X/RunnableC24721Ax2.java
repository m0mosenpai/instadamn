package X;

/* renamed from: X.Ax2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24721Ax2 implements Runnable {
    public final /* synthetic */ InterfaceC203698zY A00;
    public final /* synthetic */ C150156pL A01;
    public final /* synthetic */ C1819185b A02;

    public RunnableC24721Ax2(InterfaceC203698zY interfaceC203698zY, C150156pL c150156pL, C1819185b c1819185b) {
        this.A01 = c150156pL;
        this.A00 = interfaceC203698zY;
        this.A02 = c1819185b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SLV, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? obj = new Object();
        obj.A00 = C05F.A07;
        obj.A01 = "[ARD] invalid arguments to loadEffect call. Please check softerrors.";
        C150156pL.A02(this.A00, obj.A00(), this.A01, this.A02);
    }
}
