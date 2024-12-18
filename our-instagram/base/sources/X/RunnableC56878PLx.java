package X;

/* renamed from: X.PLx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56878PLx implements Runnable {
    public final /* synthetic */ C51165Mj8 A00;

    public RunnableC56878PLx(C51165Mj8 c51165Mj8) {
        this.A00 = c51165Mj8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.notifyDataSetChanged();
    }
}
