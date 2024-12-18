package X;

/* loaded from: classes8.dex */
public final class M48 implements Runnable {
    public final /* synthetic */ C48104LRe A00;
    public final /* synthetic */ C44787Js8 A01;

    public M48(C48104LRe c48104LRe, C44787Js8 c44787Js8) {
        this.A00 = c48104LRe;
        this.A01 = c44787Js8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48104LRe c48104LRe = this.A00;
        c48104LRe.A01.A00(this.A01);
        C0eR c0eR = c48104LRe.A00;
        c0eR.A0B(C07R.ON_CREATE);
        c0eR.A0B(C07R.ON_START);
    }
}
