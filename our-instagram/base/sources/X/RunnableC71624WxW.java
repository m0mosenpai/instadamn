package X;

/* renamed from: X.WxW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71624WxW implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69452Vnb A01;
    public final /* synthetic */ C68114VBx A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public RunnableC71624WxW(C69452Vnb c69452Vnb, C68114VBx c68114VBx, Integer num, String str, String str2, int i) {
        this.A02 = c68114VBx;
        this.A01 = c69452Vnb;
        this.A00 = i;
        this.A03 = num;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C68114VBx c68114VBx = this.A02;
        C68114VBx.A01(this.A01, c68114VBx, this.A03, this.A04, this.A05, c68114VBx.A01.getMarkerId(), this.A00);
    }
}
