package X;

/* renamed from: X.GrS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38223GrS implements Runnable {
    public final /* synthetic */ C37729Gj4 A00;
    public final /* synthetic */ InterfaceC43393JFi A01;
    public final /* synthetic */ C38222GrR A02;

    public RunnableC38223GrS(C37729Gj4 c37729Gj4, InterfaceC43393JFi interfaceC43393JFi, C38222GrR c38222GrR) {
        this.A02 = c38222GrR;
        this.A01 = interfaceC43393JFi;
        this.A00 = c37729Gj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A01(this.A01);
    }
}
