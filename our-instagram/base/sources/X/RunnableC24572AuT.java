package X;

/* renamed from: X.AuT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24572AuT implements Runnable {
    public final /* synthetic */ C72816Xnf A00;
    public final /* synthetic */ C210719Tt A01;

    public RunnableC24572AuT(C72816Xnf c72816Xnf, C210719Tt c210719Tt) {
        this.A01 = c210719Tt;
        this.A00 = c72816Xnf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C210719Tt c210719Tt = this.A01;
        C9TT c9tt = c210719Tt.A04;
        if (c9tt == null) {
            C14360o3.A0F("cameraViewWrapper");
            throw C00O.createAndThrow();
        }
        C72816Xnf c72816Xnf = this.A00;
        int i = c72816Xnf.A03;
        int i2 = c72816Xnf.A00;
        c9tt.A02 = i;
        c9tt.A01 = i2;
        c9tt.A00 = c72816Xnf.A02;
        c9tt.requestLayout();
        c210719Tt.A09 = true;
    }
}
