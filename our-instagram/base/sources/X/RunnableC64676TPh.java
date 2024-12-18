package X;

/* renamed from: X.TPh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64676TPh implements Runnable {
    public final /* synthetic */ SPI A00;
    public final /* synthetic */ QF6 A01;
    public final /* synthetic */ String A02;

    public RunnableC64676TPh(SPI spi, QF6 qf6, String str) {
        this.A01 = qf6;
        this.A02 = str;
        this.A00 = spi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0F(this.A00.A03, this.A02, false);
    }
}
