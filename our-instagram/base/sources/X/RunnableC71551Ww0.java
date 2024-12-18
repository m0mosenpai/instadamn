package X;

/* renamed from: X.Ww0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71551Ww0 implements Runnable {
    public final /* synthetic */ W63 A00;
    public final /* synthetic */ WVJ A01;
    public final /* synthetic */ WGC A02;

    public RunnableC71551Ww0(W63 w63, WVJ wvj, WGC wgc) {
        this.A02 = wgc;
        this.A01 = wvj;
        this.A00 = w63;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WGC wgc = this.A02;
        XE8 xe8 = wgc.A0B;
        if (xe8 != null) {
            Integer num = C05F.A01;
            W62 w62 = this.A01.A02;
            W63 w63 = this.A00;
            C70498WZf c70498WZf = new C70498WZf(new C70499WZg(w63, w62, wgc, num), wgc.A0K);
            C68232VIs c68232VIs = wgc.A00;
            if (c68232VIs != null) {
                xe8.EOA(w63, c68232VIs, c70498WZf, w62);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        WGC.A01(this.A00, this.A01.A02, wgc);
    }
}
