package X;

/* loaded from: classes9.dex */
public final class PM4 implements Runnable {
    public final /* synthetic */ C51141Mik A00;

    public PM4(C51141Mik c51141Mik) {
        this.A00 = c51141Mik;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.notifyDataSetChanged();
    }
}
