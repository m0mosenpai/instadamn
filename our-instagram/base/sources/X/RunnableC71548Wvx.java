package X;

/* renamed from: X.Wvx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71548Wvx implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WZF A01;
    public final /* synthetic */ C54386O1s A02;

    public RunnableC71548Wvx(WZF wzf, C54386O1s c54386O1s, long j) {
        this.A01 = wzf;
        this.A02 = c54386O1s;
        this.A00 = j;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.VMu, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        WZF wzf = this.A01;
        wzf.A0R = this.A02;
        wzf.A0I = new C67633Uto(new Object(), this, this.A00);
    }
}
