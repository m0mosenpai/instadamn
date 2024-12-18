package X;

/* loaded from: classes8.dex */
public final class JY8 implements Runnable {
    public final /* synthetic */ C43766JXf A00;
    public final /* synthetic */ boolean A01;

    public JY8(C43766JXf c43766JXf, boolean z) {
        this.A01 = z;
        this.A00 = c43766JXf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4FT c4ft;
        if (this.A01 && (c4ft = this.A00.A03) != null) {
            c4ft.A00();
        }
    }
}
