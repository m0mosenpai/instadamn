package X;

/* loaded from: classes11.dex */
public final class Wx8 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C69452Vnb A01;
    public final /* synthetic */ C68114VBx A02;
    public final /* synthetic */ Integer A03;

    public Wx8(C69452Vnb c69452Vnb, C68114VBx c68114VBx, Integer num, long j) {
        this.A02 = c68114VBx;
        this.A01 = c69452Vnb;
        this.A03 = num;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C68114VBx.A00(this.A01, this.A02, this.A03);
    }
}
