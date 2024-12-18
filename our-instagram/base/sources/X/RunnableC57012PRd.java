package X;

/* renamed from: X.PRd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57012PRd implements Runnable {
    public final /* synthetic */ C50982Mfp A00;
    public final /* synthetic */ String A01;

    public RunnableC57012PRd(C50982Mfp c50982Mfp, String str) {
        this.A00 = c50982Mfp;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50982Mfp c50982Mfp = this.A00;
        C2GS c2gs = c50982Mfp.A0B;
        String str = this.A01;
        c2gs.A0B(str);
        NXX nxx = new NXX(str);
        C05A c05a = c50982Mfp.A0H;
        c50982Mfp.A00 = (AbstractC53540Nm7) c05a.getValue();
        c05a.Egh(nxx);
    }
}
