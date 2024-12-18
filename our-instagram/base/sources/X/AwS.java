package X;

/* loaded from: classes4.dex */
public final class AwS implements Runnable {
    public final /* synthetic */ A0Y A00;
    public final /* synthetic */ Exception A01;

    public AwS(A0Y a0y, Exception exc) {
        this.A00 = a0y;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00 != null) {
            String stackTraceString = android.util.Log.getStackTraceString(this.A01);
            C14360o3.A07(stackTraceString);
            C00Q.A03(stackTraceString, 1000);
        }
    }
}
