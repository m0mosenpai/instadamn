package X;

/* renamed from: X.JiB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44319JiB implements Runnable {
    public final /* synthetic */ AbstractC43828JZr A00;
    public final /* synthetic */ C44264JhA A01;
    public final /* synthetic */ float[] A02;

    public RunnableC44319JiB(AbstractC43828JZr abstractC43828JZr, C44264JhA c44264JhA, float[] fArr) {
        this.A00 = abstractC43828JZr;
        this.A01 = c44264JhA;
        this.A02 = fArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setImageRotateBitmapResetBase(this.A01, this.A02, null);
    }
}
