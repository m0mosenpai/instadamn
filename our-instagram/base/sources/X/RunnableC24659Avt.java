package X;

/* renamed from: X.Avt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24659Avt implements Runnable {
    public final /* synthetic */ InterfaceC25186BCj A00;
    public final /* synthetic */ Exception A01;

    public RunnableC24659Avt(InterfaceC25186BCj interfaceC25186BCj, Exception exc) {
        this.A00 = interfaceC25186BCj;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25186BCj interfaceC25186BCj = this.A00;
        if (interfaceC25186BCj != null) {
            String stackTraceString = android.util.Log.getStackTraceString(this.A01);
            C14360o3.A07(stackTraceString);
            interfaceC25186BCj.onError(C00Q.A03(stackTraceString, 1000));
        }
    }
}
