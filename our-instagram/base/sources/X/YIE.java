package X;

/* loaded from: classes12.dex */
public final class YIE implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ YAS A01;
    public final /* synthetic */ boolean A02;

    public YIE(YAS yas, long j, boolean z) {
        this.A01 = yas;
        this.A00 = j;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.DkZ(this.A00, this.A02);
    }
}
