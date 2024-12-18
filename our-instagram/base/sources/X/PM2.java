package X;

/* loaded from: classes9.dex */
public final class PM2 implements Runnable {
    public final /* synthetic */ C51164Mj7 A00;

    public PM2(C51164Mj7 c51164Mj7) {
        this.A00 = c51164Mj7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.notifyDataSetChanged();
    }
}
