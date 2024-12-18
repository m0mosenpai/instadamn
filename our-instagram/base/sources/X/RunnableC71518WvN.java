package X;

/* renamed from: X.WvN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71518WvN implements Runnable {
    public final /* synthetic */ UAG A00;
    public final /* synthetic */ boolean A01;

    public RunnableC71518WvN(UAG uag, boolean z) {
        this.A00 = uag;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UAG uag = this.A00;
        XB0 xb0 = uag.A02;
        if (xb0 != null) {
            xb0.Dzt(uag.A01, uag.A00);
        }
        if (this.A01) {
            UAG.A00(uag);
        } else {
            uag.requestLayout();
        }
    }
}
