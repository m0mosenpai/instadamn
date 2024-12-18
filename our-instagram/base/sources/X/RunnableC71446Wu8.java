package X;

/* renamed from: X.Wu8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71446Wu8 implements Runnable {
    public final /* synthetic */ C70504WZl A00;
    public final /* synthetic */ Exception A01;

    public RunnableC71446Wu8(C70504WZl c70504WZl, Exception exc) {
        this.A00 = c70504WZl;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.onFailure(this.A01);
    }
}
