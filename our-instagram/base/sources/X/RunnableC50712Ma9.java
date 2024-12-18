package X;

/* renamed from: X.Ma9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50712Ma9 implements Runnable {
    public final /* synthetic */ MXD A00;

    public RunnableC50712Ma9(MXD mxd) {
        this.A00 = mxd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MXD mxd = this.A00;
        C178577wV c178577wV = mxd.A00;
        if (c178577wV != null) {
            c178577wV.A04();
        }
        mxd.A00 = null;
    }
}
