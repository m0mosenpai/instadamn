package X;

/* loaded from: classes6.dex */
public final class GNT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ELV A01;

    public GNT(ELV elv, int i) {
        this.A01 = elv;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.scrollBy(0, this.A00);
    }
}
