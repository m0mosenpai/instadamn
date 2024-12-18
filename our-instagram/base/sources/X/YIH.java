package X;

/* loaded from: classes12.dex */
public final class YIH implements Runnable {
    public final /* synthetic */ YNq A00;
    public final /* synthetic */ XYR A01;
    public final /* synthetic */ C73428YCx A02;

    public YIH(YNq yNq, XYR xyr, C73428YCx c73428YCx) {
        this.A02 = c73428YCx;
        this.A00 = yNq;
        this.A01 = xyr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.APm(new AbstractC72210XYe(this.A01));
    }
}
