package X;

/* loaded from: classes7.dex */
public final class J5T implements Runnable {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ C26191Pa A01;
    public final /* synthetic */ Object A02;

    public J5T(C1P1 c1p1, C26191Pa c26191Pa, Object obj) {
        this.A01 = c26191Pa;
        this.A00 = c1p1;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1P1 c1p1 = this.A00;
        c1p1.onFinish();
        c1p1.onSuccess(this.A02);
    }
}
